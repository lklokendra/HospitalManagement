package HospitalManagement2.Hospital.Controller;



import HospitalManagement2.Hospital.Dto.AppointmentResponseDto;
import HospitalManagement2.Hospital.Service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctors")
@RequiredArgsConstructor
public class DoctorController {

    private final AppointmentService appointmentService;

    @GetMapping("/{id}/appointments")
    public ResponseEntity<List<AppointmentResponseDto>> getAllAppointmentsOfDoctor(@PathVariable Long id) {
        return ResponseEntity.ok(
                appointmentService.getAllAppointmentsOfDoctor(id)
        );
    }
}