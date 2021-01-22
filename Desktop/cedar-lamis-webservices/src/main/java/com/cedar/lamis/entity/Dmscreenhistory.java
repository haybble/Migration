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
@Table(name = "DMSCREENHISTORY")
@NamedQueries({
    @NamedQuery(name = "Dmscreenhistory.findAll", query = "SELECT d FROM Dmscreenhistory d"),
    @NamedQuery(name = "Dmscreenhistory.findByHistoryId", query = "SELECT d FROM Dmscreenhistory d WHERE d.historyId = :historyId"),
    @NamedQuery(name = "Dmscreenhistory.findByPatientId", query = "SELECT d FROM Dmscreenhistory d WHERE d.patientId = :patientId"),
    @NamedQuery(name = "Dmscreenhistory.findByFacilityId", query = "SELECT d FROM Dmscreenhistory d WHERE d.facilityId = :facilityId"),
    @NamedQuery(name = "Dmscreenhistory.findByDateVisit", query = "SELECT d FROM Dmscreenhistory d WHERE d.dateVisit = :dateVisit"),
    @NamedQuery(name = "Dmscreenhistory.findByDescription", query = "SELECT d FROM Dmscreenhistory d WHERE d.description = :description"),
    @NamedQuery(name = "Dmscreenhistory.findByValue", query = "SELECT d FROM Dmscreenhistory d WHERE d.value = :value"),
    @NamedQuery(name = "Dmscreenhistory.findByTimeStamp", query = "SELECT d FROM Dmscreenhistory d WHERE d.timeStamp = :timeStamp"),
    @NamedQuery(name = "Dmscreenhistory.findByUploaded", query = "SELECT d FROM Dmscreenhistory d WHERE d.uploaded = :uploaded"),
    @NamedQuery(name = "Dmscreenhistory.findByTimeUploaded", query = "SELECT d FROM Dmscreenhistory d WHERE d.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Dmscreenhistory.findByIdUuid", query = "SELECT d FROM Dmscreenhistory d WHERE d.idUuid = :idUuid"),
    @NamedQuery(name = "Dmscreenhistory.findByUuid", query = "SELECT d FROM Dmscreenhistory d WHERE d.uuid = :uuid")})
public class Dmscreenhistory implements Serializable {

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
    @Size(max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 7)
    @Column(name = "VALUE")
    private String value;
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

    public Dmscreenhistory() {
    }

    public Dmscreenhistory(Long historyId) {
        this.historyId = historyId;
    }

    public Dmscreenhistory(Long historyId, long patientId, long facilityId, Date dateVisit) {
        this.historyId = historyId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateVisit = dateVisit;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
        if (!(object instanceof Dmscreenhistory)) {
            return false;
        }
        Dmscreenhistory other = (Dmscreenhistory) object;
        if ((this.historyId == null && other.historyId != null) || (this.historyId != null && !this.historyId.equals(other.historyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Dmscreenhistory[ historyId=" + historyId + " ]";
    }
    
}
