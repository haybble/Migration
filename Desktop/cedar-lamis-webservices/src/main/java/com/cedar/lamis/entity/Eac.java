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
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "EAC")
@NamedQueries({
    @NamedQuery(name = "Eac.findAll", query = "SELECT e FROM Eac e"),
    @NamedQuery(name = "Eac.findByEacId", query = "SELECT e FROM Eac e WHERE e.eacId = :eacId"),
    @NamedQuery(name = "Eac.findByFacilityId", query = "SELECT e FROM Eac e WHERE e.facilityId = :facilityId"),
    @NamedQuery(name = "Eac.findByDateEac1", query = "SELECT e FROM Eac e WHERE e.dateEac1 = :dateEac1"),
    @NamedQuery(name = "Eac.findByDateEac2", query = "SELECT e FROM Eac e WHERE e.dateEac2 = :dateEac2"),
    @NamedQuery(name = "Eac.findByDateEac3", query = "SELECT e FROM Eac e WHERE e.dateEac3 = :dateEac3"),
    @NamedQuery(name = "Eac.findByDateSampleCollected", query = "SELECT e FROM Eac e WHERE e.dateSampleCollected = :dateSampleCollected"),
    @NamedQuery(name = "Eac.findByNotes", query = "SELECT e FROM Eac e WHERE e.notes = :notes"),
    @NamedQuery(name = "Eac.findByLastViralLoad", query = "SELECT e FROM Eac e WHERE e.lastViralLoad = :lastViralLoad"),
    @NamedQuery(name = "Eac.findByDateLastViralLoad", query = "SELECT e FROM Eac e WHERE e.dateLastViralLoad = :dateLastViralLoad"),
    @NamedQuery(name = "Eac.findByTimeStamp", query = "SELECT e FROM Eac e WHERE e.timeStamp = :timeStamp"),
    @NamedQuery(name = "Eac.findByUserId", query = "SELECT e FROM Eac e WHERE e.userId = :userId"),
    @NamedQuery(name = "Eac.findByUploaded", query = "SELECT e FROM Eac e WHERE e.uploaded = :uploaded"),
    @NamedQuery(name = "Eac.findByTimeUploaded", query = "SELECT e FROM Eac e WHERE e.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Eac.findByIdUuid", query = "SELECT e FROM Eac e WHERE e.idUuid = :idUuid"),
    @NamedQuery(name = "Eac.findByUuid", query = "SELECT e FROM Eac e WHERE e.uuid = :uuid")})
public class Eac implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EAC_ID")
    private Long eacId;
    @Column(name = "FACILITY_ID")
    private Integer facilityId;
    @Column(name = "DATE_EAC1")
    @Temporal(TemporalType.DATE)
    private Date dateEac1;
    @Column(name = "DATE_EAC2")
    @Temporal(TemporalType.DATE)
    private Date dateEac2;
    @Column(name = "DATE_EAC3")
    @Temporal(TemporalType.DATE)
    private Date dateEac3;
    @Column(name = "DATE_SAMPLE_COLLECTED")
    @Temporal(TemporalType.DATE)
    private Date dateSampleCollected;
    @Size(max = 500)
    @Column(name = "NOTES")
    private String notes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LAST_VIRAL_LOAD")
    private Double lastViralLoad;
    @Column(name = "DATE_LAST_VIRAL_LOAD")
    @Temporal(TemporalType.DATE)
    private Date dateLastViralLoad;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "USER_ID")
    private Integer userId;
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

    public Eac() {
    }

    public Eac(Long eacId) {
        this.eacId = eacId;
    }

    public Long getEacId() {
        return eacId;
    }

    public void setEacId(Long eacId) {
        this.eacId = eacId;
    }

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public Date getDateEac1() {
        return dateEac1;
    }

    public void setDateEac1(Date dateEac1) {
        this.dateEac1 = dateEac1;
    }

    public Date getDateEac2() {
        return dateEac2;
    }

    public void setDateEac2(Date dateEac2) {
        this.dateEac2 = dateEac2;
    }

    public Date getDateEac3() {
        return dateEac3;
    }

    public void setDateEac3(Date dateEac3) {
        this.dateEac3 = dateEac3;
    }

    public Date getDateSampleCollected() {
        return dateSampleCollected;
    }

    public void setDateSampleCollected(Date dateSampleCollected) {
        this.dateSampleCollected = dateSampleCollected;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Double getLastViralLoad() {
        return lastViralLoad;
    }

    public void setLastViralLoad(Double lastViralLoad) {
        this.lastViralLoad = lastViralLoad;
    }

    public Date getDateLastViralLoad() {
        return dateLastViralLoad;
    }

    public void setDateLastViralLoad(Date dateLastViralLoad) {
        this.dateLastViralLoad = dateLastViralLoad;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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
        hash += (eacId != null ? eacId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eac)) {
            return false;
        }
        Eac other = (Eac) object;
        if ((this.eacId == null && other.eacId != null) || (this.eacId != null && !this.eacId.equals(other.eacId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Eac[ eacId=" + eacId + " ]";
    }
    
}
