package HospitalManagement2.Hospital.Service;


import HospitalManagement2.Hospital.Entity.Insurance;
import HospitalManagement2.Hospital.Entity.Patients;
import HospitalManagement2.Hospital.Repository.InsuranceRepository;
import HospitalManagement2.Hospital.Repository.PatientsRepo;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InsuranceService {

    private InsuranceRepository  insuranceRepository;
    private PatientsRepo patientsRepo;

    @Transactional
    public Patients assignInsuranceToPatient(Insurance insurance,Long patientId){
        Patients p = patientsRepo.findById(patientId).orElseThrow(()->new EntityNotFoundException("Patient not found"));
        p.setInsurance(insurance); // first assign to owning side
        insurance.setPatient(p); // assigned to maintain bidrirectional consistency
        return p;

    }
    @Transactional
 public Patients RemovePatientFromInsurance(Long patientId){
        Patients patients=patientsRepo.findById(patientId).orElseThrow(()->new EntityNotFoundException("Patient not found"));
        patients.setInsurance(null);
        return patients;
 }

}
