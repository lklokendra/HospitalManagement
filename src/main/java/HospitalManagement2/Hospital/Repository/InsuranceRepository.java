package HospitalManagement2.Hospital.Repository;

import HospitalManagement2.Hospital.Entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}