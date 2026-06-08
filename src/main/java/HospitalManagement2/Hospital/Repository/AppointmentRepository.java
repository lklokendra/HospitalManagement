package HospitalManagement2.Hospital.Repository;

import HospitalManagement2.Hospital.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}