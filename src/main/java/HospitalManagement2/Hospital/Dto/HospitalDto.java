package HospitalManagement2.Hospital.Dto;

import HospitalManagement2.Hospital.Entity.EnumType.Gender;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalDto {

    @NotNull(message = "Name is required")
    private String name;
    private Gender gender;
    private Integer age;
    private String address;
    @NotNull(message = "Phone is required")
    private Long phone;
    @Email
    private String email;
    @NotNull
    private String disease;
    private String room;
}
