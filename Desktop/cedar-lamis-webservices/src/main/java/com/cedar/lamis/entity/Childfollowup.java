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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "CHILDFOLLOWUP")
@NamedQueries({
    @NamedQuery(name = "Childfollowup.findAll", query = "SELECT c FROM Childfollowup c"),
    @NamedQuery(name = "Childfollowup.findByChildfollowupId", query = "SELECT c FROM Childfollowup c WHERE c.childfollowupId = :childfollowupId"),
    @NamedQuery(name = "Childfollowup.findByFacilityId", query = "SELECT c FROM Childfollowup c WHERE c.facilityId = :facilityId"),
    @NamedQuery(name = "Childfollowup.findByDateVisit", query = "SELECT c FROM Childfollowup c WHERE c.dateVisit = :dateVisit"),
    @NamedQuery(name = "Childfollowup.findByAgeVisit", query = "SELECT c FROM Childfollowup c WHERE c.ageVisit = :ageVisit"),
    @NamedQuery(name = "Childfollowup.findByDateNvpInitiated", query = "SELECT c FROM Childfollowup c WHERE c.dateNvpInitiated = :dateNvpInitiated"),
    @NamedQuery(name = "Childfollowup.findByAgeNvpInitiated", query = "SELECT c FROM Childfollowup c WHERE c.ageNvpInitiated = :ageNvpInitiated"),
    @NamedQuery(name = "Childfollowup.findByDateCotrimInitiated", query = "SELECT c FROM Childfollowup c WHERE c.dateCotrimInitiated = :dateCotrimInitiated"),
    @NamedQuery(name = "Childfollowup.findByAgeCotrimInitiated", query = "SELECT c FROM Childfollowup c WHERE c.ageCotrimInitiated = :ageCotrimInitiated"),
    @NamedQuery(name = "Childfollowup.findByBodyWeight", query = "SELECT c FROM Childfollowup c WHERE c.bodyWeight = :bodyWeight"),
    @NamedQuery(name = "Childfollowup.findByHeight", query = "SELECT c FROM Childfollowup c WHERE c.height = :height"),
    @NamedQuery(name = "Childfollowup.findByFeeding", query = "SELECT c FROM Childfollowup c WHERE c.feeding = :feeding"),
    @NamedQuery(name = "Childfollowup.findByArv", query = "SELECT c FROM Childfollowup c WHERE c.arv = :arv"),
    @NamedQuery(name = "Childfollowup.findByCotrim", query = "SELECT c FROM Childfollowup c WHERE c.cotrim = :cotrim"),
    @NamedQuery(name = "Childfollowup.findByDateSampleCollected", query = "SELECT c FROM Childfollowup c WHERE c.dateSampleCollected = :dateSampleCollected"),
    @NamedQuery(name = "Childfollowup.findByReasonPcr", query = "SELECT c FROM Childfollowup c WHERE c.reasonPcr = :reasonPcr"),
    @NamedQuery(name = "Childfollowup.findByDateSampleSent", query = "SELECT c FROM Childfollowup c WHERE c.dateSampleSent = :dateSampleSent"),
    @NamedQuery(name = "Childfollowup.findByDatePcrResult", query = "SELECT c FROM Childfollowup c WHERE c.datePcrResult = :datePcrResult"),
    @NamedQuery(name = "Childfollowup.findByPcrResult", query = "SELECT c FROM Childfollowup c WHERE c.pcrResult = :pcrResult"),
    @NamedQuery(name = "Childfollowup.findByRapidTest", query = "SELECT c FROM Childfollowup c WHERE c.rapidTest = :rapidTest"),
    @NamedQuery(name = "Childfollowup.findByRapidTestResult", query = "SELECT c FROM Childfollowup c WHERE c.rapidTestResult = :rapidTestResult"),
    @NamedQuery(name = "Childfollowup.findByCaregiverGivenResult", query = "SELECT c FROM Childfollowup c WHERE c.caregiverGivenResult = :caregiverGivenResult"),
    @NamedQuery(name = "Childfollowup.findByChildOutcome", query = "SELECT c FROM Childfollowup c WHERE c.childOutcome = :childOutcome"),
    @NamedQuery(name = "Childfollowup.findByReferred", query = "SELECT c FROM Childfollowup c WHERE c.referred = :referred"),
    @NamedQuery(name = "Childfollowup.findByDateNextVisit", query = "SELECT c FROM Childfollowup c WHERE c.dateNextVisit = :dateNextVisit"),
    @NamedQuery(name = "Childfollowup.findByTimeStamp", query = "SELECT c FROM Childfollowup c WHERE c.timeStamp = :timeStamp"),
    @NamedQuery(name = "Childfollowup.findByUploaded", query = "SELECT c FROM Childfollowup c WHERE c.uploaded = :uploaded"),
    @NamedQuery(name = "Childfollowup.findByTimeUploaded", query = "SELECT c FROM Childfollowup c WHERE c.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Childfollowup.findByUserId", query = "SELECT c FROM Childfollowup c WHERE c.userId = :userId"),
    @NamedQuery(name = "Childfollowup.findByInfantOutcome", query = "SELECT c FROM Childfollowup c WHERE c.infantOutcome = :infantOutcome"),
    @NamedQuery(name = "Childfollowup.findByDateLinkedToArt", query = "SELECT c FROM Childfollowup c WHERE c.dateLinkedToArt = :dateLinkedToArt"),
    @NamedQuery(name = "Childfollowup.findByArvType", query = "SELECT c FROM Childfollowup c WHERE c.arvType = :arvType"),
    @NamedQuery(name = "Childfollowup.findByDateRapidTest", query = "SELECT c FROM Childfollowup c WHERE c.dateRapidTest = :dateRapidTest"),
    @NamedQuery(name = "Childfollowup.findByArvTiming", query = "SELECT c FROM Childfollowup c WHERE c.arvTiming = :arvTiming"),
    @NamedQuery(name = "Childfollowup.findByIdUuid", query = "SELECT c FROM Childfollowup c WHERE c.idUuid = :idUuid"),
    @NamedQuery(name = "Childfollowup.findByUuid", query = "SELECT c FROM Childfollowup c WHERE c.uuid = :uuid")})
public class Childfollowup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CHILDFOLLOWUP_ID")
    private Long childfollowupId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Column(name = "AGE_VISIT")
    private Integer ageVisit;
    @Column(name = "DATE_NVP_INITIATED")
    @Temporal(TemporalType.DATE)
    private Date dateNvpInitiated;
    @Column(name = "AGE_NVP_INITIATED")
    private Integer ageNvpInitiated;
    @Column(name = "DATE_COTRIM_INITIATED")
    @Temporal(TemporalType.DATE)
    private Date dateCotrimInitiated;
    @Column(name = "AGE_COTRIM_INITIATED")
    private Integer ageCotrimInitiated;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BODY_WEIGHT")
    private Double bodyWeight;
    @Column(name = "HEIGHT")
    private Double height;
    @Size(max = 75)
    @Column(name = "FEEDING")
    private String feeding;
    @Size(max = 7)
    @Column(name = "ARV")
    private String arv;
    @Size(max = 7)
    @Column(name = "COTRIM")
    private String cotrim;
    @Column(name = "DATE_SAMPLE_COLLECTED")
    @Temporal(TemporalType.DATE)
    private Date dateSampleCollected;
    @Size(max = 75)
    @Column(name = "REASON_PCR")
    private String reasonPcr;
    @Column(name = "DATE_SAMPLE_SENT")
    @Temporal(TemporalType.DATE)
    private Date dateSampleSent;
    @Column(name = "DATE_PCR_RESULT")
    @Temporal(TemporalType.DATE)
    private Date datePcrResult;
    @Size(max = 45)
    @Column(name = "PCR_RESULT")
    private String pcrResult;
    @Size(max = 45)
    @Column(name = "RAPID_TEST")
    private String rapidTest;
    @Size(max = 45)
    @Column(name = "RAPID_TEST_RESULT")
    private String rapidTestResult;
    @Size(max = 7)
    @Column(name = "CAREGIVER_GIVEN_RESULT")
    private String caregiverGivenResult;
    @Size(max = 45)
    @Column(name = "CHILD_OUTCOME")
    private String childOutcome;
    @Size(max = 45)
    @Column(name = "REFERRED")
    private String referred;
    @Column(name = "DATE_NEXT_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateNextVisit;
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
    @Size(max = 70)
    @Column(name = "INFANT_OUTCOME")
    private String infantOutcome;
    @Column(name = "DATE_LINKED_TO_ART")
    @Temporal(TemporalType.DATE)
    private Date dateLinkedToArt;
    @Size(max = 45)
    @Column(name = "ARV_TYPE")
    private String arvType;
    @Column(name = "DATE_RAPID_TEST")
    @Temporal(TemporalType.DATE)
    private Date dateRapidTest;
    @Size(max = 90)
    @Column(name = "ARV_TIMING")
    private String arvTiming;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;
    @JoinColumn(name = "CHILD_ID", referencedColumnName = "CHILD_ID")
    @ManyToOne(optional = false)
    private Child childId;

    public Childfollowup() {
    }

    public Childfollowup(Long childfollowupId) {
        this.childfollowupId = childfollowupId;
    }

    public Childfollowup(Long childfollowupId, long facilityId, Date dateVisit) {
        this.childfollowupId = childfollowupId;
        this.facilityId = facilityId;
        this.dateVisit = dateVisit;
    }

    public Long getChildfollowupId() {
        return childfollowupId;
    }

    public void setChildfollowupId(Long childfollowupId) {
        this.childfollowupId = childfollowupId;
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

    public Integer getAgeVisit() {
        return ageVisit;
    }

    public void setAgeVisit(Integer ageVisit) {
        this.ageVisit = ageVisit;
    }

    public Date getDateNvpInitiated() {
        return dateNvpInitiated;
    }

    public void setDateNvpInitiated(Date dateNvpInitiated) {
        this.dateNvpInitiated = dateNvpInitiated;
    }

    public Integer getAgeNvpInitiated() {
        return ageNvpInitiated;
    }

    public void setAgeNvpInitiated(Integer ageNvpInitiated) {
        this.ageNvpInitiated = ageNvpInitiated;
    }

    public Date getDateCotrimInitiated() {
        return dateCotrimInitiated;
    }

    public void setDateCotrimInitiated(Date dateCotrimInitiated) {
        this.dateCotrimInitiated = dateCotrimInitiated;
    }

    public Integer getAgeCotrimInitiated() {
        return ageCotrimInitiated;
    }

    public void setAgeCotrimInitiated(Integer ageCotrimInitiated) {
        this.ageCotrimInitiated = ageCotrimInitiated;
    }

    public Double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(Double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getFeeding() {
        return feeding;
    }

    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    public String getArv() {
        return arv;
    }

    public void setArv(String arv) {
        this.arv = arv;
    }

    public String getCotrim() {
        return cotrim;
    }

    public void setCotrim(String cotrim) {
        this.cotrim = cotrim;
    }

    public Date getDateSampleCollected() {
        return dateSampleCollected;
    }

    public void setDateSampleCollected(Date dateSampleCollected) {
        this.dateSampleCollected = dateSampleCollected;
    }

    public String getReasonPcr() {
        return reasonPcr;
    }

    public void setReasonPcr(String reasonPcr) {
        this.reasonPcr = reasonPcr;
    }

    public Date getDateSampleSent() {
        return dateSampleSent;
    }

    public void setDateSampleSent(Date dateSampleSent) {
        this.dateSampleSent = dateSampleSent;
    }

    public Date getDatePcrResult() {
        return datePcrResult;
    }

    public void setDatePcrResult(Date datePcrResult) {
        this.datePcrResult = datePcrResult;
    }

    public String getPcrResult() {
        return pcrResult;
    }

    public void setPcrResult(String pcrResult) {
        this.pcrResult = pcrResult;
    }

    public String getRapidTest() {
        return rapidTest;
    }

    public void setRapidTest(String rapidTest) {
        this.rapidTest = rapidTest;
    }

    public String getRapidTestResult() {
        return rapidTestResult;
    }

    public void setRapidTestResult(String rapidTestResult) {
        this.rapidTestResult = rapidTestResult;
    }

    public String getCaregiverGivenResult() {
        return caregiverGivenResult;
    }

    public void setCaregiverGivenResult(String caregiverGivenResult) {
        this.caregiverGivenResult = caregiverGivenResult;
    }

    public String getChildOutcome() {
        return childOutcome;
    }

    public void setChildOutcome(String childOutcome) {
        this.childOutcome = childOutcome;
    }

    public String getReferred() {
        return referred;
    }

    public void setReferred(String referred) {
        this.referred = referred;
    }

    public Date getDateNextVisit() {
        return dateNextVisit;
    }

    public void setDateNextVisit(Date dateNextVisit) {
        this.dateNextVisit = dateNextVisit;
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

    public String getInfantOutcome() {
        return infantOutcome;
    }

    public void setInfantOutcome(String infantOutcome) {
        this.infantOutcome = infantOutcome;
    }

    public Date getDateLinkedToArt() {
        return dateLinkedToArt;
    }

    public void setDateLinkedToArt(Date dateLinkedToArt) {
        this.dateLinkedToArt = dateLinkedToArt;
    }

    public String getArvType() {
        return arvType;
    }

    public void setArvType(String arvType) {
        this.arvType = arvType;
    }

    public Date getDateRapidTest() {
        return dateRapidTest;
    }

    public void setDateRapidTest(Date dateRapidTest) {
        this.dateRapidTest = dateRapidTest;
    }

    public String getArvTiming() {
        return arvTiming;
    }

    public void setArvTiming(String arvTiming) {
        this.arvTiming = arvTiming;
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

    public Child getChildId() {
        return childId;
    }

    public void setChildId(Child childId) {
        this.childId = childId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (childfollowupId != null ? childfollowupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Childfollowup)) {
            return false;
        }
        Childfollowup other = (Childfollowup) object;
        if ((this.childfollowupId == null && other.childfollowupId != null) || (this.childfollowupId != null && !this.childfollowupId.equals(other.childfollowupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Childfollowup[ childfollowupId=" + childfollowupId + " ]";
    }
    
}
