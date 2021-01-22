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
@Table(name = "EID")
@NamedQueries({
    @NamedQuery(name = "Eid.findAll", query = "SELECT e FROM Eid e"),
    @NamedQuery(name = "Eid.findByEidId", query = "SELECT e FROM Eid e WHERE e.eidId = :eidId"),
    @NamedQuery(name = "Eid.findByFacilityId", query = "SELECT e FROM Eid e WHERE e.facilityId = :facilityId"),
    @NamedQuery(name = "Eid.findByLabno", query = "SELECT e FROM Eid e WHERE e.labno = :labno"),
    @NamedQuery(name = "Eid.findByMotherName", query = "SELECT e FROM Eid e WHERE e.motherName = :motherName"),
    @NamedQuery(name = "Eid.findByMotherAddress", query = "SELECT e FROM Eid e WHERE e.motherAddress = :motherAddress"),
    @NamedQuery(name = "Eid.findByMotherPhone", query = "SELECT e FROM Eid e WHERE e.motherPhone = :motherPhone"),
    @NamedQuery(name = "Eid.findBySenderName", query = "SELECT e FROM Eid e WHERE e.senderName = :senderName"),
    @NamedQuery(name = "Eid.findBySenderDesignation", query = "SELECT e FROM Eid e WHERE e.senderDesignation = :senderDesignation"),
    @NamedQuery(name = "Eid.findBySenderAddress", query = "SELECT e FROM Eid e WHERE e.senderAddress = :senderAddress"),
    @NamedQuery(name = "Eid.findBySenderPhone", query = "SELECT e FROM Eid e WHERE e.senderPhone = :senderPhone"),
    @NamedQuery(name = "Eid.findByReasonPcr", query = "SELECT e FROM Eid e WHERE e.reasonPcr = :reasonPcr"),
    @NamedQuery(name = "Eid.findByRapidTestDone", query = "SELECT e FROM Eid e WHERE e.rapidTestDone = :rapidTestDone"),
    @NamedQuery(name = "Eid.findByDateRapidTest", query = "SELECT e FROM Eid e WHERE e.dateRapidTest = :dateRapidTest"),
    @NamedQuery(name = "Eid.findByRapidTestResult", query = "SELECT e FROM Eid e WHERE e.rapidTestResult = :rapidTestResult"),
    @NamedQuery(name = "Eid.findByMotherArtReceived", query = "SELECT e FROM Eid e WHERE e.motherArtReceived = :motherArtReceived"),
    @NamedQuery(name = "Eid.findByMotherProphylaxReceived", query = "SELECT e FROM Eid e WHERE e.motherProphylaxReceived = :motherProphylaxReceived"),
    @NamedQuery(name = "Eid.findByChildProphylaxReceived", query = "SELECT e FROM Eid e WHERE e.childProphylaxReceived = :childProphylaxReceived"),
    @NamedQuery(name = "Eid.findByBreastfedEver", query = "SELECT e FROM Eid e WHERE e.breastfedEver = :breastfedEver"),
    @NamedQuery(name = "Eid.findByFeedingMethod", query = "SELECT e FROM Eid e WHERE e.feedingMethod = :feedingMethod"),
    @NamedQuery(name = "Eid.findByBreastfedNow", query = "SELECT e FROM Eid e WHERE e.breastfedNow = :breastfedNow"),
    @NamedQuery(name = "Eid.findByFeedingCessationAge", query = "SELECT e FROM Eid e WHERE e.feedingCessationAge = :feedingCessationAge"),
    @NamedQuery(name = "Eid.findByCotrim", query = "SELECT e FROM Eid e WHERE e.cotrim = :cotrim"),
    @NamedQuery(name = "Eid.findByNextAppointment", query = "SELECT e FROM Eid e WHERE e.nextAppointment = :nextAppointment"),
    @NamedQuery(name = "Eid.findByTimeStamp", query = "SELECT e FROM Eid e WHERE e.timeStamp = :timeStamp"),
    @NamedQuery(name = "Eid.findByUploaded", query = "SELECT e FROM Eid e WHERE e.uploaded = :uploaded"),
    @NamedQuery(name = "Eid.findByTimeUploaded", query = "SELECT e FROM Eid e WHERE e.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Eid.findByIdUuid", query = "SELECT e FROM Eid e WHERE e.idUuid = :idUuid"),
    @NamedQuery(name = "Eid.findByUuid", query = "SELECT e FROM Eid e WHERE e.uuid = :uuid")})
public class Eid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EID_ID")
    private Long eidId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "LABNO")
    private String labno;
    @Size(max = 75)
    @Column(name = "MOTHER_NAME")
    private String motherName;
    @Size(max = 100)
    @Column(name = "MOTHER_ADDRESS")
    private String motherAddress;
    @Size(max = 15)
    @Column(name = "MOTHER_PHONE")
    private String motherPhone;
    @Size(max = 75)
    @Column(name = "SENDER_NAME")
    private String senderName;
    @Size(max = 75)
    @Column(name = "SENDER_DESIGNATION")
    private String senderDesignation;
    @Size(max = 100)
    @Column(name = "SENDER_ADDRESS")
    private String senderAddress;
    @Size(max = 15)
    @Column(name = "SENDER_PHONE")
    private String senderPhone;
    @Size(max = 100)
    @Column(name = "REASON_PCR")
    private String reasonPcr;
    @Size(max = 7)
    @Column(name = "RAPID_TEST_DONE")
    private String rapidTestDone;
    @Column(name = "DATE_RAPID_TEST")
    @Temporal(TemporalType.DATE)
    private Date dateRapidTest;
    @Size(max = 15)
    @Column(name = "RAPID_TEST_RESULT")
    private String rapidTestResult;
    @Size(max = 45)
    @Column(name = "MOTHER_ART_RECEIVED")
    private String motherArtReceived;
    @Size(max = 45)
    @Column(name = "MOTHER_PROPHYLAX_RECEIVED")
    private String motherProphylaxReceived;
    @Size(max = 45)
    @Column(name = "CHILD_PROPHYLAX_RECEIVED")
    private String childProphylaxReceived;
    @Size(max = 7)
    @Column(name = "BREASTFED_EVER")
    private String breastfedEver;
    @Size(max = 45)
    @Column(name = "FEEDING_METHOD")
    private String feedingMethod;
    @Size(max = 7)
    @Column(name = "BREASTFED_NOW")
    private String breastfedNow;
    @Column(name = "FEEDING_CESSATION_AGE")
    private Integer feedingCessationAge;
    @Size(max = 45)
    @Column(name = "COTRIM")
    private String cotrim;
    @Column(name = "NEXT_APPOINTMENT")
    @Temporal(TemporalType.DATE)
    private Date nextAppointment;
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

    public Eid() {
    }

    public Eid(Long eidId) {
        this.eidId = eidId;
    }

    public Eid(Long eidId, long facilityId, String labno) {
        this.eidId = eidId;
        this.facilityId = facilityId;
        this.labno = labno;
    }

    public Long getEidId() {
        return eidId;
    }

    public void setEidId(Long eidId) {
        this.eidId = eidId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public String getLabno() {
        return labno;
    }

    public void setLabno(String labno) {
        this.labno = labno;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherAddress() {
        return motherAddress;
    }

    public void setMotherAddress(String motherAddress) {
        this.motherAddress = motherAddress;
    }

    public String getMotherPhone() {
        return motherPhone;
    }

    public void setMotherPhone(String motherPhone) {
        this.motherPhone = motherPhone;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderDesignation() {
        return senderDesignation;
    }

    public void setSenderDesignation(String senderDesignation) {
        this.senderDesignation = senderDesignation;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderPhone() {
        return senderPhone;
    }

    public void setSenderPhone(String senderPhone) {
        this.senderPhone = senderPhone;
    }

    public String getReasonPcr() {
        return reasonPcr;
    }

    public void setReasonPcr(String reasonPcr) {
        this.reasonPcr = reasonPcr;
    }

    public String getRapidTestDone() {
        return rapidTestDone;
    }

    public void setRapidTestDone(String rapidTestDone) {
        this.rapidTestDone = rapidTestDone;
    }

    public Date getDateRapidTest() {
        return dateRapidTest;
    }

    public void setDateRapidTest(Date dateRapidTest) {
        this.dateRapidTest = dateRapidTest;
    }

    public String getRapidTestResult() {
        return rapidTestResult;
    }

    public void setRapidTestResult(String rapidTestResult) {
        this.rapidTestResult = rapidTestResult;
    }

    public String getMotherArtReceived() {
        return motherArtReceived;
    }

    public void setMotherArtReceived(String motherArtReceived) {
        this.motherArtReceived = motherArtReceived;
    }

    public String getMotherProphylaxReceived() {
        return motherProphylaxReceived;
    }

    public void setMotherProphylaxReceived(String motherProphylaxReceived) {
        this.motherProphylaxReceived = motherProphylaxReceived;
    }

    public String getChildProphylaxReceived() {
        return childProphylaxReceived;
    }

    public void setChildProphylaxReceived(String childProphylaxReceived) {
        this.childProphylaxReceived = childProphylaxReceived;
    }

    public String getBreastfedEver() {
        return breastfedEver;
    }

    public void setBreastfedEver(String breastfedEver) {
        this.breastfedEver = breastfedEver;
    }

    public String getFeedingMethod() {
        return feedingMethod;
    }

    public void setFeedingMethod(String feedingMethod) {
        this.feedingMethod = feedingMethod;
    }

    public String getBreastfedNow() {
        return breastfedNow;
    }

    public void setBreastfedNow(String breastfedNow) {
        this.breastfedNow = breastfedNow;
    }

    public Integer getFeedingCessationAge() {
        return feedingCessationAge;
    }

    public void setFeedingCessationAge(Integer feedingCessationAge) {
        this.feedingCessationAge = feedingCessationAge;
    }

    public String getCotrim() {
        return cotrim;
    }

    public void setCotrim(String cotrim) {
        this.cotrim = cotrim;
    }

    public Date getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(Date nextAppointment) {
        this.nextAppointment = nextAppointment;
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
        hash += (eidId != null ? eidId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eid)) {
            return false;
        }
        Eid other = (Eid) object;
        if ((this.eidId == null && other.eidId != null) || (this.eidId != null && !this.eidId.equals(other.eidId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Eid[ eidId=" + eidId + " ]";
    }
    
}
