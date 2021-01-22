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
@Table(name = "ADHEREHISTORY")
@NamedQueries({
    @NamedQuery(name = "Adherehistory.findAll", query = "SELECT a FROM Adherehistory a"),
    @NamedQuery(name = "Adherehistory.findByHistoryId", query = "SELECT a FROM Adherehistory a WHERE a.historyId = :historyId"),
    @NamedQuery(name = "Adherehistory.findByPatientId", query = "SELECT a FROM Adherehistory a WHERE a.patientId = :patientId"),
    @NamedQuery(name = "Adherehistory.findByFacilityId", query = "SELECT a FROM Adherehistory a WHERE a.facilityId = :facilityId"),
    @NamedQuery(name = "Adherehistory.findByDateVisit", query = "SELECT a FROM Adherehistory a WHERE a.dateVisit = :dateVisit"),
    @NamedQuery(name = "Adherehistory.findByReason", query = "SELECT a FROM Adherehistory a WHERE a.reason = :reason"),
    @NamedQuery(name = "Adherehistory.findByTimeStamp", query = "SELECT a FROM Adherehistory a WHERE a.timeStamp = :timeStamp"),
    @NamedQuery(name = "Adherehistory.findByUploaded", query = "SELECT a FROM Adherehistory a WHERE a.uploaded = :uploaded"),
    @NamedQuery(name = "Adherehistory.findByTimeUploaded", query = "SELECT a FROM Adherehistory a WHERE a.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Adherehistory.findByIdUuid", query = "SELECT a FROM Adherehistory a WHERE a.idUuid = :idUuid"),
    @NamedQuery(name = "Adherehistory.findByUuid", query = "SELECT a FROM Adherehistory a WHERE a.uuid = :uuid")})
public class Adherehistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "HISTORY_ID")
    private Long historyId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENT_ID")
    private long patientId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "REASON")
    private String reason;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
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

    public Adherehistory() {
    }

    public Adherehistory(Long historyId) {
        this.historyId = historyId;
    }

    public Adherehistory(Long historyId, long patientId, long facilityId, Date dateVisit, String reason) {
        this.historyId = historyId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateVisit = dateVisit;
        this.reason = reason;
    }

    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historyId != null ? historyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adherehistory)) {
            return false;
        }
        Adherehistory other = (Adherehistory) object;
        if ((this.historyId == null && other.historyId != null) || (this.historyId != null && !this.historyId.equals(other.historyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Adherehistory[ historyId=" + historyId + " ]";
    }
    
}
