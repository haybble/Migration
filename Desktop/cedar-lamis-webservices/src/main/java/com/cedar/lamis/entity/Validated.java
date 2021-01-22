/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
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
@Table(name = "VALIDATED")
@NamedQueries({
    @NamedQuery(name = "Validated.findAll", query = "SELECT v FROM Validated v"),
    @NamedQuery(name = "Validated.findByValidatedId", query = "SELECT v FROM Validated v WHERE v.validatedId = :validatedId"),
    @NamedQuery(name = "Validated.findByFacilityId", query = "SELECT v FROM Validated v WHERE v.facilityId = :facilityId"),
    @NamedQuery(name = "Validated.findByTableValidated", query = "SELECT v FROM Validated v WHERE v.tableValidated = :tableValidated"),
    @NamedQuery(name = "Validated.findByRecordId", query = "SELECT v FROM Validated v WHERE v.recordId = :recordId"),
    @NamedQuery(name = "Validated.findByCreatedBy", query = "SELECT v FROM Validated v WHERE v.createdBy = :createdBy"),
    @NamedQuery(name = "Validated.findByValidatedBy", query = "SELECT v FROM Validated v WHERE v.validatedBy = :validatedBy"),
    @NamedQuery(name = "Validated.findByDateValidated", query = "SELECT v FROM Validated v WHERE v.dateValidated = :dateValidated"),
    @NamedQuery(name = "Validated.findByUserId", query = "SELECT v FROM Validated v WHERE v.userId = :userId"),
    @NamedQuery(name = "Validated.findByTimeStamp", query = "SELECT v FROM Validated v WHERE v.timeStamp = :timeStamp"),
    @NamedQuery(name = "Validated.findByUploaded", query = "SELECT v FROM Validated v WHERE v.uploaded = :uploaded"),
    @NamedQuery(name = "Validated.findByTimeUploaded", query = "SELECT v FROM Validated v WHERE v.timeUploaded = :timeUploaded")})
public class Validated implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VALIDATED_ID")
    private Long validatedId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Size(max = 90)
    @Column(name = "TABLE_VALIDATED")
    private String tableValidated;
    @Size(max = 100)
    @Column(name = "RECORD_ID")
    private String recordId;
    @Size(max = 100)
    @Column(name = "CREATED_BY")
    private String createdBy;
    @Size(max = 100)
    @Column(name = "VALIDATED_BY")
    private String validatedBy;
    @Column(name = "DATE_VALIDATED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateValidated;
    @Column(name = "USER_ID")
    private Integer userId;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @JoinColumn(name = "PATIENT_ID", referencedColumnName = "PATIENT_ID")
    @ManyToOne(optional = false)
    private Patient patientId;

    public Validated() {
    }

    public Validated(Long validatedId) {
        this.validatedId = validatedId;
    }

    public Validated(Long validatedId, long facilityId) {
        this.validatedId = validatedId;
        this.facilityId = facilityId;
    }

    public Long getValidatedId() {
        return validatedId;
    }

    public void setValidatedId(Long validatedId) {
        this.validatedId = validatedId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public String getTableValidated() {
        return tableValidated;
    }

    public void setTableValidated(String tableValidated) {
        this.tableValidated = tableValidated;
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getValidatedBy() {
        return validatedBy;
    }

    public void setValidatedBy(String validatedBy) {
        this.validatedBy = validatedBy;
    }

    public Date getDateValidated() {
        return dateValidated;
    }

    public void setDateValidated(Date dateValidated) {
        this.dateValidated = dateValidated;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (validatedId != null ? validatedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Validated)) {
            return false;
        }
        Validated other = (Validated) object;
        if ((this.validatedId == null && other.validatedId != null) || (this.validatedId != null && !this.validatedId.equals(other.validatedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Validated[ validatedId=" + validatedId + " ]";
    }
    
}
