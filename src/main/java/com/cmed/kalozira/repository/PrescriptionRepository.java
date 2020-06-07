package com.cmed.kalozira.repository;
import com.cmed.kalozira.entity.Gender;
import com.cmed.kalozira.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "prescription", collectionResourceRel = "prescription", itemResourceRel = "prescription")
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
    List<Prescription> findByPatientName(String patientName);
}
