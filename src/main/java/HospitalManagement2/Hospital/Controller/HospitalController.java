package HospitalManagement2.Hospital.Controller;


import HospitalManagement2.Hospital.Dto.HospitalDto;
import HospitalManagement2.Hospital.Repository.PatientsRepo;
import HospitalManagement2.Hospital.Service.HospitalService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

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
    public ResponseEntity<List<HospitalDto>> GetAllPatients(){
        List<HospitalDto> hospitalDtos= hospitalService.FindAllPatients();
        return ResponseEntity.status(HttpStatus.OK).body(hospitalDtos);
    }


}
