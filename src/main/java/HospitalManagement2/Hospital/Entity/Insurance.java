package HospitalManagement2.Hospital.Entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length=50)
    private String policyNumber;

    @Column(nullable = false,length = 100)
    private String provider;

    @Column(nullable = false,length=100)
    private String insuranceName;

    @Column(nullable = false)
    private LocalDate validUntil;

    @CreationTimestamp
    @Column(nullable = false,updatable = false)
    private LocalDateTime createdAt;

    //to make table bidirectional we do this ,but we need to avoid ambiguity so hibernate
    //will be confused which one is real so here we give power to patient table (owning side) here this insurance is referring to insurance id in patients
    @OneToOne(mappedBy = "insurance") //inverse side
    private Patients patient;

}
