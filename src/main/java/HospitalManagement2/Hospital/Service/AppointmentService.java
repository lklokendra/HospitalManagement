package HospitalManagement2.Hospital.Service;


import HospitalManagement2.Hospital.Dto.AppointmentResponseDto;
import HospitalManagement2.Hospital.Dto.CreateAppointmentRequestDto;
import HospitalManagement2.Hospital.Entity.Appointment;
import HospitalManagement2.Hospital.Entity.Doctor;
import HospitalManagement2.Hospital.Entity.Patients;
import HospitalManagement2.Hospital.Repository.AppointmentRepository;
import HospitalManagement2.Hospital.Repository.DoctorRepository;
import HospitalManagement2.Hospital.Repository.PatientsRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final PatientsRepo patientsRepository;
    private final ModelMapper modelMapper;
    @Transactional
    public AppointmentResponseDto createNewAppointment(
            CreateAppointmentRequestDto requestDto) {

        Doctor doctor = doctorRepository.findById(requestDto.getDoctorId())
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        Patients patient = patientsRepository.findById(requestDto.getPatientId())
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        Appointment appointment = new Appointment();

        appointment.setAppointmentTime(requestDto.getAppointmentTime());
        appointment.setReason(requestDto.getReason());

        appointment.setDoctor(doctor);
        appointment.setPatient(patient);

        patient.getAppointments().add(appointment);

        Appointment savedAppointment = appointmentRepository.save(appointment);

        AppointmentResponseDto responseDto = modelMapper.map(
                savedAppointment,
                AppointmentResponseDto.class
        );

        return responseDto;
    }
    @Transactional
    public Appointment reAssignAppointment(Long appointmentId ,Long doctorId) {
        Appointment appointment = appointmentRepository.findById(appointmentId).orElseThrow();
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();
        Doctor oldDoctor = appointment.getDoctor();
        doctor.getAppointments().remove(appointment);
        appointment.setDoctor(doctor); // just for bidirectional consistency
        doctor.getAppointments().add(appointment);
        return appointment;
    }
    public List<AppointmentResponseDto> getAllAppointmentsOfDoctor(Long doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow();

        return doctor.getAppointments()
                .stream()
                .map(appointment -> modelMapper.map(appointment, AppointmentResponseDto.class))
                .collect(Collectors.toList());
    }
}
