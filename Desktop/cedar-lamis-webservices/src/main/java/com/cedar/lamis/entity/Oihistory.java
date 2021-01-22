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
@Table(name = "OIHISTORY")
@NamedQueries({
    @NamedQuery(name = "Oihistory.findAll", query = "SELECT o FROM Oihistory o"),
    @NamedQuery(name = "Oihistory.findByHistoryId", query = "SELECT o FROM Oihistory o WHERE o.historyId = :historyId"),
    @NamedQuery(name = "Oihistory.findByPatientId", query = "SELECT o FROM Oihistory o WHERE o.patientId = :patientId"),
    @NamedQuery(name = "Oihistory.findByFacilityId", query = "SELECT o FROM Oihistory o WHERE o.facilityId = :facilityId"),
    @NamedQuery(name = "Oihistory.findByDateVisit", query = "SELECT o FROM Oihistory o WHERE o.dateVisit = :dateVisit"),
    @NamedQuery(name = "Oihistory.findByOi", query = "SELECT o FROM Oihistory o WHERE o.oi = :oi"),
    @NamedQuery(name = "Oihistory.findByTimeStamp", query = "SELECT o FROM Oihistory o WHERE o.timeStamp = :timeStamp"),
    @NamedQuery(name = "Oihistory.findByUploaded", query = "SELECT o FROM Oihistory o WHERE o.uploaded = :uploaded"),
    @NamedQuery(name = "Oihistory.findByTimeUploaded", query = "SELECT o FROM Oihistory o WHERE o.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Oihistory.findByIdUuid", query = "SELECT o FROM Oihistory o WHERE o.idUuid = :idUuid"),
    @NamedQuery(name = "Oihistory.findByUuid", query = "SELECT o FROM Oihistory o WHERE o.uuid = :uuid")})
public class Oihistory implements Serializable {

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
    @Column(name = "OI")
    private String oi;
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

    public Oihistory() {
    }

    public Oihistory(Long historyId) {
        this.historyId = historyId;
    }

    public Oihistory(Long historyId, long patientId, long facilityId, Date dateVisit, String oi) {
        this.historyId = historyId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateVisit = dateVisit;
        this.oi = oi;
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

    public String getOi() {
        return oi;
    }

    public void setOi(String oi) {
        this.oi = oi;
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
        if (!(object instanceof Oihistory)) {
            return false;
        }
        Oihistory other = (Oihistory) object;
        if ((this.historyId == null && other.historyId != null) || (this.historyId != null && !this.historyId.equals(other.historyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Oihistory[ historyId=" + historyId + " ]";
    }
    
}
