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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "DRUGTHERAPY")
@NamedQueries({
    @NamedQuery(name = "Drugtherapy.findAll", query = "SELECT d FROM Drugtherapy d"),
    @NamedQuery(name = "Drugtherapy.findByDrugtherapyId", query = "SELECT d FROM Drugtherapy d WHERE d.drugtherapyId = :drugtherapyId"),
    @NamedQuery(name = "Drugtherapy.findByFacilityId", query = "SELECT d FROM Drugtherapy d WHERE d.facilityId = :facilityId"),
    @NamedQuery(name = "Drugtherapy.findByCommunitypharmId", query = "SELECT d FROM Drugtherapy d WHERE d.communitypharmId = :communitypharmId"),
    @NamedQuery(name = "Drugtherapy.findByDateVisit", query = "SELECT d FROM Drugtherapy d WHERE d.dateVisit = :dateVisit"),
    @NamedQuery(name = "Drugtherapy.findByOis", query = "SELECT d FROM Drugtherapy d WHERE d.ois = :ois"),
    @NamedQuery(name = "Drugtherapy.findByTherapyProblemScreened", query = "SELECT d FROM Drugtherapy d WHERE d.therapyProblemScreened = :therapyProblemScreened"),
    @NamedQuery(name = "Drugtherapy.findByAdherenceIssues", query = "SELECT d FROM Drugtherapy d WHERE d.adherenceIssues = :adherenceIssues"),
    @NamedQuery(name = "Drugtherapy.findByMedicationError", query = "SELECT d FROM Drugtherapy d WHERE d.medicationError = :medicationError"),
    @NamedQuery(name = "Drugtherapy.findByAdrs", query = "SELECT d FROM Drugtherapy d WHERE d.adrs = :adrs"),
    @NamedQuery(name = "Drugtherapy.findBySeverity", query = "SELECT d FROM Drugtherapy d WHERE d.severity = :severity"),
    @NamedQuery(name = "Drugtherapy.findByIcsrForm", query = "SELECT d FROM Drugtherapy d WHERE d.icsrForm = :icsrForm"),
    @NamedQuery(name = "Drugtherapy.findByAdrReferred", query = "SELECT d FROM Drugtherapy d WHERE d.adrReferred = :adrReferred"),
    @NamedQuery(name = "Drugtherapy.findByTimeStamp", query = "SELECT d FROM Drugtherapy d WHERE d.timeStamp = :timeStamp"),
    @NamedQuery(name = "Drugtherapy.findByUploaded", query = "SELECT d FROM Drugtherapy d WHERE d.uploaded = :uploaded"),
    @NamedQuery(name = "Drugtherapy.findByTimeUploaded", query = "SELECT d FROM Drugtherapy d WHERE d.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Drugtherapy.findByDeviceconfigId", query = "SELECT d FROM Drugtherapy d WHERE d.deviceconfigId = :deviceconfigId")})
public class Drugtherapy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DRUGTHERAPY_ID")
    private Long drugtherapyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMMUNITYPHARM_ID")
    private long communitypharmId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Size(max = 100)
    @Column(name = "OIS")
    private String ois;
    @Size(max = 5)
    @Column(name = "THERAPY_PROBLEM_SCREENED")
    private String therapyProblemScreened;
    @Size(max = 5)
    @Column(name = "ADHERENCE_ISSUES")
    private String adherenceIssues;
    @Size(max = 100)
    @Column(name = "MEDICATION_ERROR")
    private String medicationError;
    @Size(max = 100)
    @Column(name = "ADRS")
    private String adrs;
    @Size(max = 45)
    @Column(name = "SEVERITY")
    private String severity;
    @Size(max = 5)
    @Column(name = "ICSR_FORM")
    private String icsrForm;
    @Size(max = 5)
    @Column(name = "ADR_REFERRED")
    private String adrReferred;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Column(name = "DEVICECONFIG_ID")
    private BigInteger deviceconfigId;
    @JoinColumn(name = "PATIENT_ID", referencedColumnName = "PATIENT_ID")
    @ManyToOne(optional = false)
    private Patient patientId;

    public Drugtherapy() {
    }

    public Drugtherapy(Long drugtherapyId) {
        this.drugtherapyId = drugtherapyId;
    }

    public Drugtherapy(Long drugtherapyId, long facilityId, long communitypharmId, Date dateVisit) {
        this.drugtherapyId = drugtherapyId;
        this.facilityId = facilityId;
        this.communitypharmId = communitypharmId;
        this.dateVisit = dateVisit;
    }

    public Long getDrugtherapyId() {
        return drugtherapyId;
    }

    public void setDrugtherapyId(Long drugtherapyId) {
        this.drugtherapyId = drugtherapyId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public long getCommunitypharmId() {
        return communitypharmId;
    }

    public void setCommunitypharmId(long communitypharmId) {
        this.communitypharmId = communitypharmId;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public String getOis() {
        return ois;
    }

    public void setOis(String ois) {
        this.ois = ois;
    }

    public String getTherapyProblemScreened() {
        return therapyProblemScreened;
    }

    public void setTherapyProblemScreened(String therapyProblemScreened) {
        this.therapyProblemScreened = therapyProblemScreened;
    }

    public String getAdherenceIssues() {
        return adherenceIssues;
    }

    public void setAdherenceIssues(String adherenceIssues) {
        this.adherenceIssues = adherenceIssues;
    }

    public String getMedicationError() {
        return medicationError;
    }

    public void setMedicationError(String medicationError) {
        this.medicationError = medicationError;
    }

    public String getAdrs() {
        return adrs;
    }

    public void setAdrs(String adrs) {
        this.adrs = adrs;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getIcsrForm() {
        return icsrForm;
    }

    public void setIcsrForm(String icsrForm) {
        this.icsrForm = icsrForm;
    }

    public String getAdrReferred() {
        return adrReferred;
    }

    public void setAdrReferred(String adrReferred) {
        this.adrReferred = adrReferred;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
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

    public BigInteger getDeviceconfigId() {
        return deviceconfigId;
    }

    public void setDeviceconfigId(BigInteger deviceconfigId) {
        this.deviceconfigId = deviceconfigId;
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
        hash += (drugtherapyId != null ? drugtherapyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Drugtherapy)) {
            return false;
        }
        Drugtherapy other = (Drugtherapy) object;
        if ((this.drugtherapyId == null && other.drugtherapyId != null) || (this.drugtherapyId != null && !this.drugtherapyId.equals(other.drugtherapyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Drugtherapy[ drugtherapyId=" + drugtherapyId + " ]";
    }
    
}
