/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "CHILD")
@NamedQueries({
    @NamedQuery(name = "Child.findAll", query = "SELECT c FROM Child c"),
    @NamedQuery(name = "Child.findByChildId", query = "SELECT c FROM Child c WHERE c.childId = :childId"),
    @NamedQuery(name = "Child.findByPatientId", query = "SELECT c FROM Child c WHERE c.patientId = :patientId"),
    @NamedQuery(name = "Child.findByFacilityId", query = "SELECT c FROM Child c WHERE c.facilityId = :facilityId"),
    @NamedQuery(name = "Child.findByDeliveryId", query = "SELECT c FROM Child c WHERE c.deliveryId = :deliveryId"),
    @NamedQuery(name = "Child.findByReferenceNum", query = "SELECT c FROM Child c WHERE c.referenceNum = :referenceNum"),
    @NamedQuery(name = "Child.findByAncId", query = "SELECT c FROM Child c WHERE c.ancId = :ancId"),
    @NamedQuery(name = "Child.findByDateBirth", query = "SELECT c FROM Child c WHERE c.dateBirth = :dateBirth"),
    @NamedQuery(name = "Child.findByHospitalNumber", query = "SELECT c FROM Child c WHERE c.hospitalNumber = :hospitalNumber"),
    @NamedQuery(name = "Child.findBySurname", query = "SELECT c FROM Child c WHERE c.surname = :surname"),
    @NamedQuery(name = "Child.findByOtherNames", query = "SELECT c FROM Child c WHERE c.otherNames = :otherNames"),
    @NamedQuery(name = "Child.findByGender", query = "SELECT c FROM Child c WHERE c.gender = :gender"),
    @NamedQuery(name = "Child.findByBodyWeight", query = "SELECT c FROM Child c WHERE c.bodyWeight = :bodyWeight"),
    @NamedQuery(name = "Child.findByApgarScore", query = "SELECT c FROM Child c WHERE c.apgarScore = :apgarScore"),
    @NamedQuery(name = "Child.findByStatus", query = "SELECT c FROM Child c WHERE c.status = :status"),
    @NamedQuery(name = "Child.findByTimeStamp", query = "SELECT c FROM Child c WHERE c.timeStamp = :timeStamp"),
    @NamedQuery(name = "Child.findByUploaded", query = "SELECT c FROM Child c WHERE c.uploaded = :uploaded"),
    @NamedQuery(name = "Child.findByTimeUploaded", query = "SELECT c FROM Child c WHERE c.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Child.findByUserId", query = "SELECT c FROM Child c WHERE c.userId = :userId"),
    @NamedQuery(name = "Child.findByArv", query = "SELECT c FROM Child c WHERE c.arv = :arv"),
    @NamedQuery(name = "Child.findByHepb", query = "SELECT c FROM Child c WHERE c.hepb = :hepb"),
    @NamedQuery(name = "Child.findByRegistrationStatus", query = "SELECT c FROM Child c WHERE c.registrationStatus = :registrationStatus"),
    @NamedQuery(name = "Child.findByArvTiming", query = "SELECT c FROM Child c WHERE c.arvTiming = :arvTiming"),
    @NamedQuery(name = "Child.findByHbv", query = "SELECT c FROM Child c WHERE c.hbv = :hbv"),
    @NamedQuery(name = "Child.findByMotherId", query = "SELECT c FROM Child c WHERE c.motherId = :motherId"),
    @NamedQuery(name = "Child.findByIdUuid", query = "SELECT c FROM Child c WHERE c.idUuid = :idUuid"),
    @NamedQuery(name = "Child.findByUuid", query = "SELECT c FROM Child c WHERE c.uuid = :uuid")})
public class Child implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CHILD_ID")
    private Long childId;
    @Column(name = "PATIENT_ID")
    private BigInteger patientId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Column(name = "DELIVERY_ID")
    private BigInteger deliveryId;
    @Size(max = 36)
    @Column(name = "REFERENCE_NUM")
    private String referenceNum;
    @Column(name = "ANC_ID")
    private BigInteger ancId;
    @Column(name = "DATE_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateBirth;
    @Size(max = 25)
    @Column(name = "HOSPITAL_NUMBER")
    private String hospitalNumber;
    @Size(max = 45)
    @Column(name = "SURNAME")
    private String surname;
    @Size(max = 75)
    @Column(name = "OTHER_NAMES")
    private String otherNames;
    @Size(max = 7)
    @Column(name = "GENDER")
    private String gender;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BODY_WEIGHT")
    private Double bodyWeight;
    @Column(name = "APGAR_SCORE")
    private Integer apgarScore;
    @Size(max = 45)
    @Column(name = "STATUS")
    private String status;
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
    @Size(max = 45)
    @Column(name = "ARV")
    private String arv;
    @Size(max = 45)
    @Column(name = "HEPB")
    private String hepb;
    @Size(max = 70)
    @Column(name = "REGISTRATION_STATUS")
    private String registrationStatus;
    @Size(max = 120)
    @Column(name = "ARV_TIMING")
    private String arvTiming;
    @Size(max = 45)
    @Column(name = "HBV")
    private String hbv;
    @Column(name = "MOTHER_ID")
    private BigInteger motherId;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "childId")
    private Collection<Childfollowup> childfollowupCollection;

    public Child() {
    }

    public Child(Long childId) {
        this.childId = childId;
    }

    public Child(Long childId, long facilityId) {
        this.childId = childId;
        this.facilityId = facilityId;
    }

    public Long getChildId() {
        return childId;
    }

    public void setChildId(Long childId) {
        this.childId = childId;
    }

    public BigInteger getPatientId() {
        return patientId;
    }

    public void setPatientId(BigInteger patientId) {
        this.patientId = patientId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public BigInteger getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(BigInteger deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getReferenceNum() {
        return referenceNum;
    }

    public void setReferenceNum(String referenceNum) {
        this.referenceNum = referenceNum;
    }

    public BigInteger getAncId() {
        return ancId;
    }

    public void setAncId(BigInteger ancId) {
        this.ancId = ancId;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(String hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(String otherNames) {
        this.otherNames = otherNames;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(Double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public Integer getApgarScore() {
        return apgarScore;
    }

    public void setApgarScore(Integer apgarScore) {
        this.apgarScore = apgarScore;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getArv() {
        return arv;
    }

    public void setArv(String arv) {
        this.arv = arv;
    }

    public String getHepb() {
        return hepb;
    }

    public void setHepb(String hepb) {
        this.hepb = hepb;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    public String getArvTiming() {
        return arvTiming;
    }

    public void setArvTiming(String arvTiming) {
        this.arvTiming = arvTiming;
    }

    public String getHbv() {
        return hbv;
    }

    public void setHbv(String hbv) {
        this.hbv = hbv;
    }

    public BigInteger getMotherId() {
        return motherId;
    }

    public void setMotherId(BigInteger motherId) {
        this.motherId = motherId;
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

    public Collection<Childfollowup> getChildfollowupCollection() {
        return childfollowupCollection;
    }

    public void setChildfollowupCollection(Collection<Childfollowup> childfollowupCollection) {
        this.childfollowupCollection = childfollowupCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (childId != null ? childId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Child)) {
            return false;
        }
        Child other = (Child) object;
        if ((this.childId == null && other.childId != null) || (this.childId != null && !this.childId.equals(other.childId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Child[ childId=" + childId + " ]";
    }
    
}
