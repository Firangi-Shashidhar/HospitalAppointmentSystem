package com.teame.hospital_appointment_backend.controller;

import com.teame.hospital_appointment_backend.models.entities.Patient;
import com.teame.hospital_appointment_backend.models.entities.Appointment;
import com.teame.hospital_appointment_backend.services.PatientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    // GET /patients/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Patient> getPatient(@PathVariable Long id) {
        return patientService.getPatientById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // PUT /patients/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        try {
            Patient savedPatient = patientService.updatePatient(id, updatedPatient);
            return ResponseEntity.ok(savedPatient);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // GET /patients/{id}/appointments
    @GetMapping("/{id}/appointments")
    public ResponseEntity<List<Appointment>> getPatientAppointments(@PathVariable Long id) {
        List<Appointment> appointments = patientService.getAppointmentsByPatient(id);
        return ResponseEntity.ok(appointments);
    }
}
