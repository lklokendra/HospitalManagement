package HospitalManagement2.Hospital.Entity;


import HospitalManagement2.Hospital.Entity.EnumType.BloodGroup;
import HospitalManagement2.Hospital.Entity.EnumType.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
@Table(
        uniqueConstraints={
                @UniqueConstraint(
                        name="unique_Patients_Name_Email_Phone",
                        columnNames = {"Name","Email","Phone"}
                )
        }
)
public class Patients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer age;
    private String address;

    private Long phone;

    private String email;
    private String disease;
    private String room;
    @Enumerated(EnumType.STRING)
    private BloodGroup bloodGroup;

    @OneToOne
    @JoinColumn(name="Patient_insurance_id") // default name insurance_id
    private Insurance insurance;

    @OneToMany(mappedBy = "patient" )
    private List<Appointment> appointments; //as single patient can have many appointments
}
