package HospitalManagement2.Hospital.Dto;

import HospitalManagement2.Hospital.Entity.EnumType.BloodGroup;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PatientResponseDto {
    private Long id;
    private String name;
    private String gender;
    private LocalDate birthDate;
    private BloodGroup bloodGroup;
}
