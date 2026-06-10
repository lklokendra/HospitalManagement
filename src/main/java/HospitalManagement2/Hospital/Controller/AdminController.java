package HospitalManagement2.Hospital.Controller;


import HospitalManagement2.Hospital.Dto.DoctorResponseDto;
import HospitalManagement2.Hospital.Dto.HospitalDto;
import HospitalManagement2.Hospital.Dto.PatientResponseDto;
import HospitalManagement2.Hospital.Service.DoctorService;
import HospitalManagement2.Hospital.Service.HospitalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final HospitalService patientService;
    private final DoctorService doctorService;

    @GetMapping("/patients")
    public ResponseEntity <List<HospitalDto>> getAllPatients(
            @RequestParam(value = "page", defaultValue = "0") Integer pageNumber,
            @RequestParam(value = "size", defaultValue = "10") Integer pageSize
    ) {
        return ResponseEntity.ok(patientService.FindAllPatients(pageNumber, pageSize));
    }


}
