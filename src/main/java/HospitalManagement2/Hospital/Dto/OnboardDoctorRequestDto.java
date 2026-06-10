package HospitalManagement2.Hospital.Dto;

import lombok.Data;

@Data
public class OnboardDoctorRequestDto {
   private Long id;
    private String specialization;
    private String name;
}