package HospitalManagement2.Hospital.Repository;


import HospitalManagement2.Hospital.Entity.Patients;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientsRepo extends JpaRepository<Patients,Long> {

    Patients findByName(String name);

    //@Query("SELECT p from Patients p LEFT JOIN FETCH p.appointments a LEFT JOIN FETCH a.doctor")
    @Query("SELECT p from Patients p LEFT JOIN FETCH p.appointments")
 List<Patients> findAllPatientWithAppointment();
}
