/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "PRESCRIPTION")
@NamedQueries({
    @NamedQuery(name = "Prescription.findAll", query = "SELECT p FROM Prescription p"),
    @NamedQuery(name = "Prescription.findByPrescriptionId", query = "SELECT p FROM Prescription p WHERE p.prescriptionId = :prescriptionId"),
    @NamedQuery(name = "Prescription.findByFacilityId", query = "SELECT p FROM Prescription p WHERE p.facilityId = :facilityId"),
    @NamedQuery(name = "Prescription.findByDateVisit", query = "SELECT p FROM Prescription p WHERE p.dateVisit = :dateVisit"),
    @NamedQuery(name = "Prescription.findByPrescriptionType", query = "SELECT p FROM Prescription p WHERE p.prescriptionType = :prescriptionType"),
    @NamedQuery(name = "Prescription.findByLabtestId", query = "SELECT p FROM Prescription p WHERE p.labtestId = :labtestId"),
    @NamedQuery(name = "Prescription.findByRegimenId", query = "SELECT p FROM Prescription p WHERE p.regimenId = :regimenId"),
    @NamedQuery(name = "Prescription.findByRegimentypeId", query = "SELECT p FROM Prescription p WHERE p.regimentypeId = :regimentypeId"),
    @NamedQuery(name = "Prescription.findByDuration", query = "SELECT p FROM Prescription p WHERE p.duration = :duration"),
    @NamedQuery(name = "Prescription.findByTimeStamp", query = "SELECT p FROM Prescription p WHERE p.timeStamp = :timeStamp"),
    @NamedQuery(name = "Prescription.findByUserId", query = "SELECT p FROM Prescription p WHERE p.userId = :userId"),
    @NamedQuery(name = "Prescription.findByUploaded", query = "SELECT p FROM Prescription p WHERE p.uploaded = :uploaded"),
    @NamedQuery(name = "Prescription.findByTimeUploaded", query = "SELECT p FROM Prescription p WHERE p.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Prescription.findByStatus", query = "SELECT p FROM Prescription p WHERE p.status = :status")})
public class Prescription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PRESCRIPTION_ID")
    private Long prescriptionId;
    @Column(name = "FACILITY_ID")
    private BigInteger facilityId;
    @Column(name = "DATE_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Size(max = 100)
    @Column(name = "PRESCRIPTION_TYPE")
    private String prescriptionType;
    @Column(name = "LABTEST_ID")
    private BigInteger labtestId;
    @Column(name = "REGIMEN_ID")
    private BigInteger regimenId;
    @Column(name = "REGIMENTYPE_ID")
    private BigInteger regimentypeId;
    @Column(name = "DURATION")
    private Integer duration;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Column(name = "STATUS")
    private Integer status;
    @JoinColumn(name = "PATIENT_ID", referencedColumnName = "PATIENT_ID")
    @ManyToOne
    private Patient patientId;

    public Prescription() {
    }

    public Prescription(Long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Long getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public BigInteger getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(BigInteger facilityId) {
        this.facilityId = facilityId;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public String getPrescriptionType() {
        return prescriptionType;
    }

    public void setPrescriptionType(String prescriptionType) {
        this.prescriptionType = prescriptionType;
    }

    public BigInteger getLabtestId() {
        return labtestId;
    }

    public void setLabtestId(BigInteger labtestId) {
        this.labtestId = labtestId;
    }

    public BigInteger getRegimenId() {
        return regimenId;
    }

    public void setRegimenId(BigInteger regimenId) {
        this.regimenId = regimenId;
    }

    public BigInteger getRegimentypeId() {
        return regimentypeId;
    }

    public void setRegimentypeId(BigInteger regimentypeId) {
        this.regimentypeId = regimentypeId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public Integer getUploaded() {
        return uploaded;
    }

    public void setUploaded(Integer uploaded) {
        this.uploaded = uploaded;
    }

    public Date getTimeUploaded() {
        return timeUploaded;
    }

    public void setTimeUploaded(Date timeUploaded) {
        this.timeUploaded = timeUploaded;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prescriptionId != null ? prescriptionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prescription)) {
            return false;
        }
        Prescription other = (Prescription) object;
        if ((this.prescriptionId == null && other.prescriptionId != null) || (this.prescriptionId != null && !this.prescriptionId.equals(other.prescriptionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Prescription[ prescriptionId=" + prescriptionId + " ]";
    }
    
}
