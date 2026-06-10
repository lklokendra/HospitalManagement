package HospitalManagement2.Hospital.Controller;


import HospitalManagement2.Hospital.Dto.AppointmentResponseDto;
import HospitalManagement2.Hospital.Dto.CreateAppointmentRequestDto;
import HospitalManagement2.Hospital.Dto.HospitalDto;
import HospitalManagement2.Hospital.Service.AppointmentService;
import HospitalManagement2.Hospital.Service.HospitalService;
import jakarta.validation.Valid;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/hospital")
public class PatientController {

    private final HospitalService hospitalService;
    private final AppointmentService appointmentService;
    @PostMapping("/Add")
    public ResponseEntity<HospitalDto> CreatePatient(@RequestBody @Valid HospitalDto hospitalDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(hospitalService.addPatient(hospitalDto));
    }

    @GetMapping("/Patients/{id}")
    public ResponseEntity<HospitalDto> GetPatientById(@PathVariable Long id){
    HospitalDto hospitalDto = hospitalService.FindPatientById(id);
        return ResponseEntity.status(HttpStatus.OK).body(hospitalDto);
    }
    @GetMapping("/patients")
    public ResponseEntity<List<HospitalDto>> GetAllPatients(
            @RequestParam(value="page",defaultValue = "0") Integer pageNumber,
            @RequestParam(value="size",defaultValue = "10") Integer pageSize
    ){
        List<HospitalDto> hospitalDtos= hospitalService.FindAllPatients(pageNumber,pageSize);
        return ResponseEntity.status(HttpStatus.OK).body(hospitalDtos);
    }



    @PostMapping("/appointments")
    public ResponseEntity<AppointmentResponseDto> createNewAppointment(@RequestBody CreateAppointmentRequestDto createAppointmentRequestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(appointmentService.createNewAppointment(createAppointmentRequestDto));
    }


}
