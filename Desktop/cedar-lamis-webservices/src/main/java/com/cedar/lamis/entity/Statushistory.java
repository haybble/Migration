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
@Table(name = "STATUSHISTORY")
@NamedQueries({
    @NamedQuery(name = "Statushistory.findAll", query = "SELECT s FROM Statushistory s"),
    @NamedQuery(name = "Statushistory.findByHistoryId", query = "SELECT s FROM Statushistory s WHERE s.historyId = :historyId"),
    @NamedQuery(name = "Statushistory.findByPatientId", query = "SELECT s FROM Statushistory s WHERE s.patientId = :patientId"),
    @NamedQuery(name = "Statushistory.findByFacilityId", query = "SELECT s FROM Statushistory s WHERE s.facilityId = :facilityId"),
    @NamedQuery(name = "Statushistory.findByCurrentStatus", query = "SELECT s FROM Statushistory s WHERE s.currentStatus = :currentStatus"),
    @NamedQuery(name = "Statushistory.findByDateCurrentStatus", query = "SELECT s FROM Statushistory s WHERE s.dateCurrentStatus = :dateCurrentStatus"),
    @NamedQuery(name = "Statushistory.findByReasonInterrupt", query = "SELECT s FROM Statushistory s WHERE s.reasonInterrupt = :reasonInterrupt"),
    @NamedQuery(name = "Statushistory.findByDateTracked", query = "SELECT s FROM Statushistory s WHERE s.dateTracked = :dateTracked"),
    @NamedQuery(name = "Statushistory.findByCauseDeath", query = "SELECT s FROM Statushistory s WHERE s.causeDeath = :causeDeath"),
    @NamedQuery(name = "Statushistory.findByTimeStamp", query = "SELECT s FROM Statushistory s WHERE s.timeStamp = :timeStamp"),
    @NamedQuery(name = "Statushistory.findByUploaded", query = "SELECT s FROM Statushistory s WHERE s.uploaded = :uploaded"),
    @NamedQuery(name = "Statushistory.findByTimeUploaded", query = "SELECT s FROM Statushistory s WHERE s.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Statushistory.findByOutcome", query = "SELECT s FROM Statushistory s WHERE s.outcome = :outcome"),
    @NamedQuery(name = "Statushistory.findByAgreedDate", query = "SELECT s FROM Statushistory s WHERE s.agreedDate = :agreedDate"),
    @NamedQuery(name = "Statushistory.findByIdUuid", query = "SELECT s FROM Statushistory s WHERE s.idUuid = :idUuid"),
    @NamedQuery(name = "Statushistory.findByUuid", query = "SELECT s FROM Statushistory s WHERE s.uuid = :uuid")})
public class Statushistory implements Serializable {

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
    @Size(max = 75)
    @Column(name = "CURRENT_STATUS")
    private String currentStatus;
    @Column(name = "DATE_CURRENT_STATUS")
    @Temporal(TemporalType.DATE)
    private Date dateCurrentStatus;
    @Size(max = 100)
    @Column(name = "REASON_INTERRUPT")
    private String reasonInterrupt;
    @Column(name = "DATE_TRACKED")
    @Temporal(TemporalType.DATE)
    private Date dateTracked;
    @Size(max = 100)
    @Column(name = "CAUSE_DEATH")
    private String causeDeath;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Size(max = 100)
    @Column(name = "OUTCOME")
    private String outcome;
    @Column(name = "AGREED_DATE")
    @Temporal(TemporalType.DATE)
    private Date agreedDate;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;

    public Statushistory() {
    }

    public Statushistory(Long historyId) {
        this.historyId = historyId;
    }

    public Statushistory(Long historyId, long patientId, long facilityId) {
        this.historyId = historyId;
        this.patientId = patientId;
        this.facilityId = facilityId;
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

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public Date getDateCurrentStatus() {
        return dateCurrentStatus;
    }

    public void setDateCurrentStatus(Date dateCurrentStatus) {
        this.dateCurrentStatus = dateCurrentStatus;
    }

    public String getReasonInterrupt() {
        return reasonInterrupt;
    }

    public void setReasonInterrupt(String reasonInterrupt) {
        this.reasonInterrupt = reasonInterrupt;
    }

    public Date getDateTracked() {
        return dateTracked;
    }

    public void setDateTracked(Date dateTracked) {
        this.dateTracked = dateTracked;
    }

    public String getCauseDeath() {
        return causeDeath;
    }

    public void setCauseDeath(String causeDeath) {
        this.causeDeath = causeDeath;
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

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Date getAgreedDate() {
        return agreedDate;
    }

    public void setAgreedDate(Date agreedDate) {
        this.agreedDate = agreedDate;
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
        if (!(object instanceof Statushistory)) {
            return false;
        }
        Statushistory other = (Statushistory) object;
        if ((this.historyId == null && other.historyId != null) || (this.historyId != null && !this.historyId.equals(other.historyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Statushistory[ historyId=" + historyId + " ]";
    }
    
}
