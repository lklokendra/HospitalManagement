package HospitalManagement2.Hospital.Service;

import HospitalManagement2.Hospital.Dto.HospitalDto;
import HospitalManagement2.Hospital.Entity.Patients;
import HospitalManagement2.Hospital.Repository.PatientsRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@Service
public class HospitalService {

    @Autowired
    PatientsRepo patientsRepo;

    @Autowired
    ModelMapper modelMapper;



    public HospitalDto addPatient (HospitalDto hospitalDto){
        Patients patients = modelMapper.map(hospitalDto,Patients.class);
       Patients patient= patientsRepo.save(patients);
       return modelMapper.map(patient,HospitalDto.class);
    }

    public List<HospitalDto> FindAllPatients(){
        List<Patients> patients=patientsRepo.findAll();
        HospitalDto hospitalDto= modelMapper.map(patients,HospitalDto.class);
        return List.of(hospitalDto);
    }

    public HospitalDto FindPatientById (Long id){
        Patients patients = patientsRepo.findById(id) .orElseThrow(() ->
                new RuntimeException("Patient not found"));
        return modelMapper.map(patients,HospitalDto.class);
    }

    public HospitalDto findPatient (String name){
        Patients patients=patientsRepo.findByName(name);
        return modelMapper.map(patients,HospitalDto.class);
    }


    @Transactional
    // no need to explicitly save hibernate will save
    public HospitalDto UpdatePatient(Long id, HospitalDto hospitalDto){
        Patients patients=patientsRepo.findById(id).orElseThrow(() ->
                new RuntimeException("Patient not found"));
        modelMapper.map(hospitalDto,patients);
        return modelMapper.map(patients,HospitalDto.class);
    }
}
