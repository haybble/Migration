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
@Table(name = "PATIENTCASEMANAGER")
@NamedQueries({
    @NamedQuery(name = "Patientcasemanager.findAll", query = "SELECT p FROM Patientcasemanager p"),
    @NamedQuery(name = "Patientcasemanager.findByPatientcasemanagerId", query = "SELECT p FROM Patientcasemanager p WHERE p.patientcasemanagerId = :patientcasemanagerId"),
    @NamedQuery(name = "Patientcasemanager.findByFacilityId", query = "SELECT p FROM Patientcasemanager p WHERE p.facilityId = :facilityId"),
    @NamedQuery(name = "Patientcasemanager.findByCasemanagerId", query = "SELECT p FROM Patientcasemanager p WHERE p.casemanagerId = :casemanagerId"),
    @NamedQuery(name = "Patientcasemanager.findByDateAssigned", query = "SELECT p FROM Patientcasemanager p WHERE p.dateAssigned = :dateAssigned"),
    @NamedQuery(name = "Patientcasemanager.findByAction", query = "SELECT p FROM Patientcasemanager p WHERE p.action = :action"),
    @NamedQuery(name = "Patientcasemanager.findByTimeStamp", query = "SELECT p FROM Patientcasemanager p WHERE p.timeStamp = :timeStamp"),
    @NamedQuery(name = "Patientcasemanager.findByUserId", query = "SELECT p FROM Patientcasemanager p WHERE p.userId = :userId"),
    @NamedQuery(name = "Patientcasemanager.findByUploaded", query = "SELECT p FROM Patientcasemanager p WHERE p.uploaded = :uploaded"),
    @NamedQuery(name = "Patientcasemanager.findByTimeUploaded", query = "SELECT p FROM Patientcasemanager p WHERE p.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Patientcasemanager.findByIdUuid", query = "SELECT p FROM Patientcasemanager p WHERE p.idUuid = :idUuid"),
    @NamedQuery(name = "Patientcasemanager.findByUuid", query = "SELECT p FROM Patientcasemanager p WHERE p.uuid = :uuid")})
public class Patientcasemanager implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PATIENTCASEMANAGER_ID")
    private Long patientcasemanagerId;
    @Column(name = "FACILITY_ID")
    private BigInteger facilityId;
    @Column(name = "CASEMANAGER_ID")
    private BigInteger casemanagerId;
    @Column(name = "DATE_ASSIGNED")
    @Temporal(TemporalType.DATE)
    private Date dateAssigned;
    @Size(max = 120)
    @Column(name = "ACTION")
    private String action;
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
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;
    @JoinColumn(name = "PATIENT_ID", referencedColumnName = "PATIENT_ID")
    @ManyToOne
    private Patient patientId;

    public Patientcasemanager() {
    }

    public Patientcasemanager(Long patientcasemanagerId) {
        this.patientcasemanagerId = patientcasemanagerId;
    }

    public Long getPatientcasemanagerId() {
        return patientcasemanagerId;
    }

    public void setPatientcasemanagerId(Long patientcasemanagerId) {
        this.patientcasemanagerId = patientcasemanagerId;
    }

    public BigInteger getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(BigInteger facilityId) {
        this.facilityId = facilityId;
    }

    public BigInteger getCasemanagerId() {
        return casemanagerId;
    }

    public void setCasemanagerId(BigInteger casemanagerId) {
        this.casemanagerId = casemanagerId;
    }

    public Date getDateAssigned() {
        return dateAssigned;
    }

    public void setDateAssigned(Date dateAssigned) {
        this.dateAssigned = dateAssigned;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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

    public String getIdUuid() {
        return idUuid;
    }

    public void setIdUuid(String idUuid) {
        this.idUuid = idUuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
        hash += (patientcasemanagerId != null ? patientcasemanagerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patientcasemanager)) {
            return false;
        }
        Patientcasemanager other = (Patientcasemanager) object;
        if ((this.patientcasemanagerId == null && other.patientcasemanagerId != null) || (this.patientcasemanagerId != null && !this.patientcasemanagerId.equals(other.patientcasemanagerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Patientcasemanager[ patientcasemanagerId=" + patientcasemanagerId + " ]";
    }
    
}
