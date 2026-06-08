package HospitalManagement2.Hospital.Entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length = 100)
    private String name;

    @OneToOne
    private Doctor headDoctor;

    // a doctoe can be in multiple department and a department can have multiple doctor
    // hibernate will automatically create join table for us containing dep_id and doc_id cause it is required for many to many relationship
    @ManyToMany
      @JoinTable(
            name="my_dpt_doctors",
            joinColumns = @JoinColumn(name="dpt_id"),
            inverseJoinColumns = @JoinColumn(name = "doctor_id")
    )
    private Set<Doctor> doctors= new HashSet<>();  //initailzing with new hashset is very imp so that when hibernate try to enter value it won't be null



}
