package HospitalManagement2.Hospital.Repository;


import HospitalManagement2.Hospital.Entity.Patients;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientsRepo extends JpaRepository<Patients,Long> {

    Patients findByName(String name);
}
