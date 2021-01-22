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
@Table(name = "REGIMENHISTORY")
@NamedQueries({
    @NamedQuery(name = "Regimenhistory.findAll", query = "SELECT r FROM Regimenhistory r"),
    @NamedQuery(name = "Regimenhistory.findByHistoryId", query = "SELECT r FROM Regimenhistory r WHERE r.historyId = :historyId"),
    @NamedQuery(name = "Regimenhistory.findByPatientId", query = "SELECT r FROM Regimenhistory r WHERE r.patientId = :patientId"),
    @NamedQuery(name = "Regimenhistory.findByFacilityId", query = "SELECT r FROM Regimenhistory r WHERE r.facilityId = :facilityId"),
    @NamedQuery(name = "Regimenhistory.findByDateVisit", query = "SELECT r FROM Regimenhistory r WHERE r.dateVisit = :dateVisit"),
    @NamedQuery(name = "Regimenhistory.findByRegimentype", query = "SELECT r FROM Regimenhistory r WHERE r.regimentype = :regimentype"),
    @NamedQuery(name = "Regimenhistory.findByRegimen", query = "SELECT r FROM Regimenhistory r WHERE r.regimen = :regimen"),
    @NamedQuery(name = "Regimenhistory.findByReasonSwitchedSubs", query = "SELECT r FROM Regimenhistory r WHERE r.reasonSwitchedSubs = :reasonSwitchedSubs"),
    @NamedQuery(name = "Regimenhistory.findByTimeStamp", query = "SELECT r FROM Regimenhistory r WHERE r.timeStamp = :timeStamp"),
    @NamedQuery(name = "Regimenhistory.findByUploaded", query = "SELECT r FROM Regimenhistory r WHERE r.uploaded = :uploaded"),
    @NamedQuery(name = "Regimenhistory.findByTimeUploaded", query = "SELECT r FROM Regimenhistory r WHERE r.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Regimenhistory.findByIdUuid", query = "SELECT r FROM Regimenhistory r WHERE r.idUuid = :idUuid"),
    @NamedQuery(name = "Regimenhistory.findByUuid", query = "SELECT r FROM Regimenhistory r WHERE r.uuid = :uuid")})
public class Regimenhistory implements Serializable {

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
    @Column(name = "REGIMENTYPE")
    private String regimentype;
    @Size(max = 100)
    @Column(name = "REGIMEN")
    private String regimen;
    @Size(max = 100)
    @Column(name = "REASON_SWITCHED_SUBS")
    private String reasonSwitchedSubs;
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

    public Regimenhistory() {
    }

    public Regimenhistory(Long historyId) {
        this.historyId = historyId;
    }

    public Regimenhistory(Long historyId, long patientId, long facilityId, Date dateVisit) {
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

    public String getRegimentype() {
        return regimentype;
    }

    public void setRegimentype(String regimentype) {
        this.regimentype = regimentype;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getReasonSwitchedSubs() {
        return reasonSwitchedSubs;
    }

    public void setReasonSwitchedSubs(String reasonSwitchedSubs) {
        this.reasonSwitchedSubs = reasonSwitchedSubs;
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
        if (!(object instanceof Regimenhistory)) {
            return false;
        }
        Regimenhistory other = (Regimenhistory) object;
        if ((this.historyId == null && other.historyId != null) || (this.historyId != null && !this.historyId.equals(other.historyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Regimenhistory[ historyId=" + historyId + " ]";
    }
    
}
