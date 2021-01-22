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
@Table(name = "ADRHISTORY")
@NamedQueries({
    @NamedQuery(name = "Adrhistory.findAll", query = "SELECT a FROM Adrhistory a"),
    @NamedQuery(name = "Adrhistory.findByHistoryId", query = "SELECT a FROM Adrhistory a WHERE a.historyId = :historyId"),
    @NamedQuery(name = "Adrhistory.findByPatientId", query = "SELECT a FROM Adrhistory a WHERE a.patientId = :patientId"),
    @NamedQuery(name = "Adrhistory.findByFacilityId", query = "SELECT a FROM Adrhistory a WHERE a.facilityId = :facilityId"),
    @NamedQuery(name = "Adrhistory.findByDateVisit", query = "SELECT a FROM Adrhistory a WHERE a.dateVisit = :dateVisit"),
    @NamedQuery(name = "Adrhistory.findByAdr", query = "SELECT a FROM Adrhistory a WHERE a.adr = :adr"),
    @NamedQuery(name = "Adrhistory.findBySeverity", query = "SELECT a FROM Adrhistory a WHERE a.severity = :severity"),
    @NamedQuery(name = "Adrhistory.findByScreener", query = "SELECT a FROM Adrhistory a WHERE a.screener = :screener"),
    @NamedQuery(name = "Adrhistory.findByTimeStamp", query = "SELECT a FROM Adrhistory a WHERE a.timeStamp = :timeStamp"),
    @NamedQuery(name = "Adrhistory.findByUploaded", query = "SELECT a FROM Adrhistory a WHERE a.uploaded = :uploaded"),
    @NamedQuery(name = "Adrhistory.findByTimeUploaded", query = "SELECT a FROM Adrhistory a WHERE a.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Adrhistory.findByIdUuid", query = "SELECT a FROM Adrhistory a WHERE a.idUuid = :idUuid"),
    @NamedQuery(name = "Adrhistory.findByUuid", query = "SELECT a FROM Adrhistory a WHERE a.uuid = :uuid")})
public class Adrhistory implements Serializable {

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
    @Column(name = "ADR")
    private String adr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SEVERITY")
    private int severity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SCREENER")
    private int screener;
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

    public Adrhistory() {
    }

    public Adrhistory(Long historyId) {
        this.historyId = historyId;
    }

    public Adrhistory(Long historyId, long patientId, long facilityId, Date dateVisit, String adr, int severity, int screener) {
        this.historyId = historyId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateVisit = dateVisit;
        this.adr = adr;
        this.severity = severity;
        this.screener = screener;
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

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public int getScreener() {
        return screener;
    }

    public void setScreener(int screener) {
        this.screener = screener;
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
        if (!(object instanceof Adrhistory)) {
            return false;
        }
        Adrhistory other = (Adrhistory) object;
        if ((this.historyId == null && other.historyId != null) || (this.historyId != null && !this.historyId.equals(other.historyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Adrhistory[ historyId=" + historyId + " ]";
    }
    
}
