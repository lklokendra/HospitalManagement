package HospitalManagement2.Hospital.Repository;

import HospitalManagement2.Hospital.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}