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
@Table(name = "PARTNERINFORMATION")
@NamedQueries({
    @NamedQuery(name = "Partnerinformation.findAll", query = "SELECT p FROM Partnerinformation p"),
    @NamedQuery(name = "Partnerinformation.findByPartnerinformationId", query = "SELECT p FROM Partnerinformation p WHERE p.partnerinformationId = :partnerinformationId"),
    @NamedQuery(name = "Partnerinformation.findByPatientId", query = "SELECT p FROM Partnerinformation p WHERE p.patientId = :patientId"),
    @NamedQuery(name = "Partnerinformation.findByFacilityId", query = "SELECT p FROM Partnerinformation p WHERE p.facilityId = :facilityId"),
    @NamedQuery(name = "Partnerinformation.findByDateVisit", query = "SELECT p FROM Partnerinformation p WHERE p.dateVisit = :dateVisit"),
    @NamedQuery(name = "Partnerinformation.findByPartnerNotification", query = "SELECT p FROM Partnerinformation p WHERE p.partnerNotification = :partnerNotification"),
    @NamedQuery(name = "Partnerinformation.findByPartnerHivStatus", query = "SELECT p FROM Partnerinformation p WHERE p.partnerHivStatus = :partnerHivStatus"),
    @NamedQuery(name = "Partnerinformation.findByPartnerReferred", query = "SELECT p FROM Partnerinformation p WHERE p.partnerReferred = :partnerReferred"),
    @NamedQuery(name = "Partnerinformation.findByTimeStamp", query = "SELECT p FROM Partnerinformation p WHERE p.timeStamp = :timeStamp"),
    @NamedQuery(name = "Partnerinformation.findByUploaded", query = "SELECT p FROM Partnerinformation p WHERE p.uploaded = :uploaded"),
    @NamedQuery(name = "Partnerinformation.findByTimeUploaded", query = "SELECT p FROM Partnerinformation p WHERE p.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Partnerinformation.findByUserId", query = "SELECT p FROM Partnerinformation p WHERE p.userId = :userId"),
    @NamedQuery(name = "Partnerinformation.findByIdUuid", query = "SELECT p FROM Partnerinformation p WHERE p.idUuid = :idUuid"),
    @NamedQuery(name = "Partnerinformation.findByAncId", query = "SELECT p FROM Partnerinformation p WHERE p.ancId = :ancId"),
    @NamedQuery(name = "Partnerinformation.findByUuid", query = "SELECT p FROM Partnerinformation p WHERE p.uuid = :uuid")})
public class Partnerinformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PARTNERINFORMATION_ID")
    private Long partnerinformationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENT_ID")
    private long patientId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Column(name = "DATE_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Size(max = 7)
    @Column(name = "PARTNER_NOTIFICATION")
    private String partnerNotification;
    @Size(max = 25)
    @Column(name = "PARTNER_HIV_STATUS")
    private String partnerHivStatus;
    @Size(max = 45)
    @Column(name = "PARTNER_REFERRED")
    private String partnerReferred;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USER_ID")
    private long userId;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Column(name = "ANC_ID")
    private BigInteger ancId;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;

    public Partnerinformation() {
    }

    public Partnerinformation(Long partnerinformationId) {
        this.partnerinformationId = partnerinformationId;
    }

    public Partnerinformation(Long partnerinformationId, long patientId, long facilityId, long userId) {
        this.partnerinformationId = partnerinformationId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.userId = userId;
    }

    public Long getPartnerinformationId() {
        return partnerinformationId;
    }

    public void setPartnerinformationId(Long partnerinformationId) {
        this.partnerinformationId = partnerinformationId;
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

    public String getPartnerNotification() {
        return partnerNotification;
    }

    public void setPartnerNotification(String partnerNotification) {
        this.partnerNotification = partnerNotification;
    }

    public String getPartnerHivStatus() {
        return partnerHivStatus;
    }

    public void setPartnerHivStatus(String partnerHivStatus) {
        this.partnerHivStatus = partnerHivStatus;
    }

    public String getPartnerReferred() {
        return partnerReferred;
    }

    public void setPartnerReferred(String partnerReferred) {
        this.partnerReferred = partnerReferred;
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

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getIdUuid() {
        return idUuid;
    }

    public void setIdUuid(String idUuid) {
        this.idUuid = idUuid;
    }

    public BigInteger getAncId() {
        return ancId;
    }

    public void setAncId(BigInteger ancId) {
        this.ancId = ancId;
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
        hash += (partnerinformationId != null ? partnerinformationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Partnerinformation)) {
            return false;
        }
        Partnerinformation other = (Partnerinformation) object;
        if ((this.partnerinformationId == null && other.partnerinformationId != null) || (this.partnerinformationId != null && !this.partnerinformationId.equals(other.partnerinformationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Partnerinformation[ partnerinformationId=" + partnerinformationId + " ]";
    }
    
}
