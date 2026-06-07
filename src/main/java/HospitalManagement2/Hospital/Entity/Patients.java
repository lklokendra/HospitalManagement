package HospitalManagement2.Hospital.Entity;


import HospitalManagement2.Hospital.Entity.EnumType.Gender;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

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
    @GeneratedValue()
    private Long id;

    @NotNull
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Integer age;
    private String address;

    private Long phone;

    private String email;
    private String disease;
    private String room;
}
