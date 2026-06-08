package HospitalManagement2.Hospital.Entity;


import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime appointmentTime;

    @Column(nullable = false)
    private String reason;

    //owning side has join column annotation
    @ManyToOne
    @JoinColumn(name="patient_id",nullable=false) //patient is required to make appointment
    private Patients patient;

    @ManyToOne
    @JoinColumn(name="doctor_id",nullable=false) // doctor is required to make appointment
    private Doctor doctor;


}

