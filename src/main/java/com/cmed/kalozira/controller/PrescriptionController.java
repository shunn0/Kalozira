package com.cmed.kalozira.controller;

import com.cmed.kalozira.entity.Gender;
import com.cmed.kalozira.entity.Prescription;
import com.cmed.kalozira.form.PrescriptionForm;
import com.cmed.kalozira.repository.PrescriptionRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.created;
import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/prescriptions")
public class PrescriptionController {

    private PrescriptionRepository prescriptions;

    public PrescriptionController(PrescriptionRepository prescriptions) {
        this.prescriptions = prescriptions;
    }

    @GetMapping("")
    public ResponseEntity<List<Prescription>> all(@RequestParam(name = "patientName", required = false) String name) {
        if (name == null || name.length() == 0) {
            return ok(this.prescriptions.findAll());
        } else {
            return ok(prescriptions.findByPatientName(name));
        }

    }

    @SuppressWarnings("rawtypes")
    @PostMapping("")
    public ResponseEntity save(@RequestBody PrescriptionForm form, HttpServletRequest request) {
        Prescription toSave = new Prescription();
        toSave.setDate(form.getDate());
        toSave.setPatientName(form.getPatientName());
        toSave.setPatientAge(form.getPatientAge());
        toSave.setGender(form.getGender());
        toSave.setDiagnosis(form.getDiagnosis());
        toSave.setMedicines(form.getMedicines());
        Prescription saved = prescriptions.save(toSave);
        return created(
                ServletUriComponentsBuilder
                        .fromContextPath(request)
                        .path("/api/v1/prescriptions/{id}")
                        .buildAndExpand(saved.getId())
                        .toUri())
                .build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prescription> get(@PathVariable("id") Long id) {
        return ok(prescriptions.findById(id).orElseThrow(() -> new PrescriptionNotFoundException()));
    }

    @SuppressWarnings("rawtypes")
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable("id") Long id, @RequestBody PrescriptionForm form) {
        Prescription existed = prescriptions.findById(id).orElseThrow(() -> new PrescriptionNotFoundException());
        existed.setDate(form.getDate());
        existed.setPatientName(form.getPatientName());
        existed.setPatientAge(form.getPatientAge());
        existed.setGender(form.getGender());
        existed.setDiagnosis(form.getDiagnosis());
        existed.setNextVisitDate(form.getNextVisitDate());

        prescriptions.save(existed);
        return noContent().build();
    }

    @SuppressWarnings("rawtypes")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id) {
        Prescription existed = prescriptions.findById(id).orElseThrow(() -> new PrescriptionNotFoundException());
        prescriptions.delete(existed);
        return noContent().build();
    }
}
