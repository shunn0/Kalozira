package com.cmed.kalozira.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "prescriptions")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Prescription implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Timestamp date;

    @Column(nullable = false)
    private String patientName;

    @Column
    private Integer patientAge;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column
    private String diagnosis;

    @Column
    private String medicines;

    @Column
    private Date nextVisitDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(Integer patientAge) {
        this.patientAge = patientAge;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicines() {
        return medicines;
    }

    public void setMedicines(String medicines) {
        this.medicines = medicines;
    }

    public Date getNextVisitDate() {
        return nextVisitDate;
    }

    public void setNextVisitDate(Date nextVisitDate) {
        this.nextVisitDate = nextVisitDate;
    }
}
