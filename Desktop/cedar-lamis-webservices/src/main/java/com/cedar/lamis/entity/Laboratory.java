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
@Table(name = "LABORATORY")
@NamedQueries({
    @NamedQuery(name = "Laboratory.findAll", query = "SELECT l FROM Laboratory l"),
    @NamedQuery(name = "Laboratory.findByLaboratoryId", query = "SELECT l FROM Laboratory l WHERE l.laboratoryId = :laboratoryId"),
    @NamedQuery(name = "Laboratory.findByPatientId", query = "SELECT l FROM Laboratory l WHERE l.patientId = :patientId"),
    @NamedQuery(name = "Laboratory.findByFacilityId", query = "SELECT l FROM Laboratory l WHERE l.facilityId = :facilityId"),
    @NamedQuery(name = "Laboratory.findByDateReported", query = "SELECT l FROM Laboratory l WHERE l.dateReported = :dateReported"),
    @NamedQuery(name = "Laboratory.findByDateCollected", query = "SELECT l FROM Laboratory l WHERE l.dateCollected = :dateCollected"),
    @NamedQuery(name = "Laboratory.findByLabno", query = "SELECT l FROM Laboratory l WHERE l.labno = :labno"),
    @NamedQuery(name = "Laboratory.findByResultab", query = "SELECT l FROM Laboratory l WHERE l.resultab = :resultab"),
    @NamedQuery(name = "Laboratory.findByResultpc", query = "SELECT l FROM Laboratory l WHERE l.resultpc = :resultpc"),
    @NamedQuery(name = "Laboratory.findByComment", query = "SELECT l FROM Laboratory l WHERE l.comment = :comment"),
    @NamedQuery(name = "Laboratory.findByLabtestId", query = "SELECT l FROM Laboratory l WHERE l.labtestId = :labtestId"),
    @NamedQuery(name = "Laboratory.findByTimeStamp", query = "SELECT l FROM Laboratory l WHERE l.timeStamp = :timeStamp"),
    @NamedQuery(name = "Laboratory.findByUploaded", query = "SELECT l FROM Laboratory l WHERE l.uploaded = :uploaded"),
    @NamedQuery(name = "Laboratory.findByTimeUploaded", query = "SELECT l FROM Laboratory l WHERE l.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Laboratory.findByUserId", query = "SELECT l FROM Laboratory l WHERE l.userId = :userId"),
    @NamedQuery(name = "Laboratory.findByIdUuid", query = "SELECT l FROM Laboratory l WHERE l.idUuid = :idUuid"),
    @NamedQuery(name = "Laboratory.findByUuid", query = "SELECT l FROM Laboratory l WHERE l.uuid = :uuid")})
public class Laboratory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LABORATORY_ID")
    private Long laboratoryId;
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
    @Column(name = "DATE_REPORTED")
    @Temporal(TemporalType.DATE)
    private Date dateReported;
    @Column(name = "DATE_COLLECTED")
    @Temporal(TemporalType.DATE)
    private Date dateCollected;
    @Size(max = 15)
    @Column(name = "LABNO")
    private String labno;
    @Size(max = 10)
    @Column(name = "RESULTAB")
    private String resultab;
    @Size(max = 10)
    @Column(name = "RESULTPC")
    private String resultpc;
    @Size(max = 100)
    @Column(name = "COMMENT")
    private String comment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LABTEST_ID")
    private long labtestId;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;

    public Laboratory() {
    }

    public Laboratory(Long laboratoryId) {
        this.laboratoryId = laboratoryId;
    }

    public Laboratory(Long laboratoryId, long patientId, long facilityId, Date dateReported, long labtestId) {
        this.laboratoryId = laboratoryId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateReported = dateReported;
        this.labtestId = labtestId;
    }

    public Long getLaboratoryId() {
        return laboratoryId;
    }

    public void setLaboratoryId(Long laboratoryId) {
        this.laboratoryId = laboratoryId;
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

    public Date getDateReported() {
        return dateReported;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported = dateReported;
    }

    public Date getDateCollected() {
        return dateCollected;
    }

    public void setDateCollected(Date dateCollected) {
        this.dateCollected = dateCollected;
    }

    public String getLabno() {
        return labno;
    }

    public void setLabno(String labno) {
        this.labno = labno;
    }

    public String getResultab() {
        return resultab;
    }

    public void setResultab(String resultab) {
        this.resultab = resultab;
    }

    public String getResultpc() {
        return resultpc;
    }

    public void setResultpc(String resultpc) {
        this.resultpc = resultpc;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public long getLabtestId() {
        return labtestId;
    }

    public void setLabtestId(long labtestId) {
        this.labtestId = labtestId;
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

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
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
        hash += (laboratoryId != null ? laboratoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laboratory)) {
            return false;
        }
        Laboratory other = (Laboratory) object;
        if ((this.laboratoryId == null && other.laboratoryId != null) || (this.laboratoryId != null && !this.laboratoryId.equals(other.laboratoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Laboratory[ laboratoryId=" + laboratoryId + " ]";
    }
    
}
