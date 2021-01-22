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
@Table(name = "HTS")
@NamedQueries({
    @NamedQuery(name = "Hts.findAll", query = "SELECT h FROM Hts h"),
    @NamedQuery(name = "Hts.findByHtsId", query = "SELECT h FROM Hts h WHERE h.htsId = :htsId"),
    @NamedQuery(name = "Hts.findByClientCode", query = "SELECT h FROM Hts h WHERE h.clientCode = :clientCode"),
    @NamedQuery(name = "Hts.findByAssessmentId", query = "SELECT h FROM Hts h WHERE h.assessmentId = :assessmentId"),
    @NamedQuery(name = "Hts.findByHospitalNum", query = "SELECT h FROM Hts h WHERE h.hospitalNum = :hospitalNum"),
    @NamedQuery(name = "Hts.findByStateId", query = "SELECT h FROM Hts h WHERE h.stateId = :stateId"),
    @NamedQuery(name = "Hts.findByLgaId", query = "SELECT h FROM Hts h WHERE h.lgaId = :lgaId"),
    @NamedQuery(name = "Hts.findByFacilityId", query = "SELECT h FROM Hts h WHERE h.facilityId = :facilityId"),
    @NamedQuery(name = "Hts.findByFacilityName", query = "SELECT h FROM Hts h WHERE h.facilityName = :facilityName"),
    @NamedQuery(name = "Hts.findByDateVisit", query = "SELECT h FROM Hts h WHERE h.dateVisit = :dateVisit"),
    @NamedQuery(name = "Hts.findByReferredFrom", query = "SELECT h FROM Hts h WHERE h.referredFrom = :referredFrom"),
    @NamedQuery(name = "Hts.findByTestingSetting", query = "SELECT h FROM Hts h WHERE h.testingSetting = :testingSetting"),
    @NamedQuery(name = "Hts.findBySurname", query = "SELECT h FROM Hts h WHERE h.surname = :surname"),
    @NamedQuery(name = "Hts.findByOtherNames", query = "SELECT h FROM Hts h WHERE h.otherNames = :otherNames"),
    @NamedQuery(name = "Hts.findByDateBirth", query = "SELECT h FROM Hts h WHERE h.dateBirth = :dateBirth"),
    @NamedQuery(name = "Hts.findByAge", query = "SELECT h FROM Hts h WHERE h.age = :age"),
    @NamedQuery(name = "Hts.findByAgeUnit", query = "SELECT h FROM Hts h WHERE h.ageUnit = :ageUnit"),
    @NamedQuery(name = "Hts.findByPhone", query = "SELECT h FROM Hts h WHERE h.phone = :phone"),
    @NamedQuery(name = "Hts.findByAddress", query = "SELECT h FROM Hts h WHERE h.address = :address"),
    @NamedQuery(name = "Hts.findByGender", query = "SELECT h FROM Hts h WHERE h.gender = :gender"),
    @NamedQuery(name = "Hts.findByFirstTimeVisit", query = "SELECT h FROM Hts h WHERE h.firstTimeVisit = :firstTimeVisit"),
    @NamedQuery(name = "Hts.findByState", query = "SELECT h FROM Hts h WHERE h.state = :state"),
    @NamedQuery(name = "Hts.findByLga", query = "SELECT h FROM Hts h WHERE h.lga = :lga"),
    @NamedQuery(name = "Hts.findByMaritalStatus", query = "SELECT h FROM Hts h WHERE h.maritalStatus = :maritalStatus"),
    @NamedQuery(name = "Hts.findByNumChildren", query = "SELECT h FROM Hts h WHERE h.numChildren = :numChildren"),
    @NamedQuery(name = "Hts.findByNumWives", query = "SELECT h FROM Hts h WHERE h.numWives = :numWives"),
    @NamedQuery(name = "Hts.findByTypeCounseling", query = "SELECT h FROM Hts h WHERE h.typeCounseling = :typeCounseling"),
    @NamedQuery(name = "Hts.findByIndexClient", query = "SELECT h FROM Hts h WHERE h.indexClient = :indexClient"),
    @NamedQuery(name = "Hts.findByTypeIndex", query = "SELECT h FROM Hts h WHERE h.typeIndex = :typeIndex"),
    @NamedQuery(name = "Hts.findByIndexClientCode", query = "SELECT h FROM Hts h WHERE h.indexClientCode = :indexClientCode"),
    @NamedQuery(name = "Hts.findByKnowledgeAssessment1", query = "SELECT h FROM Hts h WHERE h.knowledgeAssessment1 = :knowledgeAssessment1"),
    @NamedQuery(name = "Hts.findByKnowledgeAssessment2", query = "SELECT h FROM Hts h WHERE h.knowledgeAssessment2 = :knowledgeAssessment2"),
    @NamedQuery(name = "Hts.findByKnowledgeAssessment3", query = "SELECT h FROM Hts h WHERE h.knowledgeAssessment3 = :knowledgeAssessment3"),
    @NamedQuery(name = "Hts.findByKnowledgeAssessment4", query = "SELECT h FROM Hts h WHERE h.knowledgeAssessment4 = :knowledgeAssessment4"),
    @NamedQuery(name = "Hts.findByKnowledgeAssessment5", query = "SELECT h FROM Hts h WHERE h.knowledgeAssessment5 = :knowledgeAssessment5"),
    @NamedQuery(name = "Hts.findByKnowledgeAssessment6", query = "SELECT h FROM Hts h WHERE h.knowledgeAssessment6 = :knowledgeAssessment6"),
    @NamedQuery(name = "Hts.findByKnowledgeAssessment7", query = "SELECT h FROM Hts h WHERE h.knowledgeAssessment7 = :knowledgeAssessment7"),
    @NamedQuery(name = "Hts.findByRiskAssessment1", query = "SELECT h FROM Hts h WHERE h.riskAssessment1 = :riskAssessment1"),
    @NamedQuery(name = "Hts.findByRiskAssessment2", query = "SELECT h FROM Hts h WHERE h.riskAssessment2 = :riskAssessment2"),
    @NamedQuery(name = "Hts.findByRiskAssessment3", query = "SELECT h FROM Hts h WHERE h.riskAssessment3 = :riskAssessment3"),
    @NamedQuery(name = "Hts.findByRiskAssessment4", query = "SELECT h FROM Hts h WHERE h.riskAssessment4 = :riskAssessment4"),
    @NamedQuery(name = "Hts.findByRiskAssessment5", query = "SELECT h FROM Hts h WHERE h.riskAssessment5 = :riskAssessment5"),
    @NamedQuery(name = "Hts.findByRiskAssessment6", query = "SELECT h FROM Hts h WHERE h.riskAssessment6 = :riskAssessment6"),
    @NamedQuery(name = "Hts.findByTbScreening1", query = "SELECT h FROM Hts h WHERE h.tbScreening1 = :tbScreening1"),
    @NamedQuery(name = "Hts.findByTbScreening2", query = "SELECT h FROM Hts h WHERE h.tbScreening2 = :tbScreening2"),
    @NamedQuery(name = "Hts.findByTbScreening3", query = "SELECT h FROM Hts h WHERE h.tbScreening3 = :tbScreening3"),
    @NamedQuery(name = "Hts.findByTbScreening4", query = "SELECT h FROM Hts h WHERE h.tbScreening4 = :tbScreening4"),
    @NamedQuery(name = "Hts.findByStiScreening1", query = "SELECT h FROM Hts h WHERE h.stiScreening1 = :stiScreening1"),
    @NamedQuery(name = "Hts.findByStiScreening2", query = "SELECT h FROM Hts h WHERE h.stiScreening2 = :stiScreening2"),
    @NamedQuery(name = "Hts.findByStiScreening3", query = "SELECT h FROM Hts h WHERE h.stiScreening3 = :stiScreening3"),
    @NamedQuery(name = "Hts.findByStiScreening4", query = "SELECT h FROM Hts h WHERE h.stiScreening4 = :stiScreening4"),
    @NamedQuery(name = "Hts.findByStiScreening5", query = "SELECT h FROM Hts h WHERE h.stiScreening5 = :stiScreening5"),
    @NamedQuery(name = "Hts.findByHivTestResult", query = "SELECT h FROM Hts h WHERE h.hivTestResult = :hivTestResult"),
    @NamedQuery(name = "Hts.findByTestedHiv", query = "SELECT h FROM Hts h WHERE h.testedHiv = :testedHiv"),
    @NamedQuery(name = "Hts.findByPostTest1", query = "SELECT h FROM Hts h WHERE h.postTest1 = :postTest1"),
    @NamedQuery(name = "Hts.findByPostTest2", query = "SELECT h FROM Hts h WHERE h.postTest2 = :postTest2"),
    @NamedQuery(name = "Hts.findByPostTest3", query = "SELECT h FROM Hts h WHERE h.postTest3 = :postTest3"),
    @NamedQuery(name = "Hts.findByPostTest4", query = "SELECT h FROM Hts h WHERE h.postTest4 = :postTest4"),
    @NamedQuery(name = "Hts.findByPostTest5", query = "SELECT h FROM Hts h WHERE h.postTest5 = :postTest5"),
    @NamedQuery(name = "Hts.findByPostTest6", query = "SELECT h FROM Hts h WHERE h.postTest6 = :postTest6"),
    @NamedQuery(name = "Hts.findByPostTest7", query = "SELECT h FROM Hts h WHERE h.postTest7 = :postTest7"),
    @NamedQuery(name = "Hts.findByPostTest8", query = "SELECT h FROM Hts h WHERE h.postTest8 = :postTest8"),
    @NamedQuery(name = "Hts.findByPostTest9", query = "SELECT h FROM Hts h WHERE h.postTest9 = :postTest9"),
    @NamedQuery(name = "Hts.findByPostTest10", query = "SELECT h FROM Hts h WHERE h.postTest10 = :postTest10"),
    @NamedQuery(name = "Hts.findByPostTest11", query = "SELECT h FROM Hts h WHERE h.postTest11 = :postTest11"),
    @NamedQuery(name = "Hts.findByPostTest12", query = "SELECT h FROM Hts h WHERE h.postTest12 = :postTest12"),
    @NamedQuery(name = "Hts.findByPostTest13", query = "SELECT h FROM Hts h WHERE h.postTest13 = :postTest13"),
    @NamedQuery(name = "Hts.findByPostTest14", query = "SELECT h FROM Hts h WHERE h.postTest14 = :postTest14"),
    @NamedQuery(name = "Hts.findBySyphilisTestResult", query = "SELECT h FROM Hts h WHERE h.syphilisTestResult = :syphilisTestResult"),
    @NamedQuery(name = "Hts.findByHepatitisbTestResult", query = "SELECT h FROM Hts h WHERE h.hepatitisbTestResult = :hepatitisbTestResult"),
    @NamedQuery(name = "Hts.findByHepatitiscTestResult", query = "SELECT h FROM Hts h WHERE h.hepatitiscTestResult = :hepatitiscTestResult"),
    @NamedQuery(name = "Hts.findByStiReferred", query = "SELECT h FROM Hts h WHERE h.stiReferred = :stiReferred"),
    @NamedQuery(name = "Hts.findByTbReferred", query = "SELECT h FROM Hts h WHERE h.tbReferred = :tbReferred"),
    @NamedQuery(name = "Hts.findByArtReferred", query = "SELECT h FROM Hts h WHERE h.artReferred = :artReferred"),
    @NamedQuery(name = "Hts.findByPartnerNotification", query = "SELECT h FROM Hts h WHERE h.partnerNotification = :partnerNotification"),
    @NamedQuery(name = "Hts.findByNotificationCounseling", query = "SELECT h FROM Hts h WHERE h.notificationCounseling = :notificationCounseling"),
    @NamedQuery(name = "Hts.findByNumberPartner", query = "SELECT h FROM Hts h WHERE h.numberPartner = :numberPartner"),
    @NamedQuery(name = "Hts.findByDateRegistration", query = "SELECT h FROM Hts h WHERE h.dateRegistration = :dateRegistration"),
    @NamedQuery(name = "Hts.findByDateStarted", query = "SELECT h FROM Hts h WHERE h.dateStarted = :dateStarted"),
    @NamedQuery(name = "Hts.findByNote", query = "SELECT h FROM Hts h WHERE h.note = :note"),
    @NamedQuery(name = "Hts.findByLongitude", query = "SELECT h FROM Hts h WHERE h.longitude = :longitude"),
    @NamedQuery(name = "Hts.findByLatitude", query = "SELECT h FROM Hts h WHERE h.latitude = :latitude"),
    @NamedQuery(name = "Hts.findByTimeStamp", query = "SELECT h FROM Hts h WHERE h.timeStamp = :timeStamp"),
    @NamedQuery(name = "Hts.findByUserId", query = "SELECT h FROM Hts h WHERE h.userId = :userId"),
    @NamedQuery(name = "Hts.findByDeviceconfigId", query = "SELECT h FROM Hts h WHERE h.deviceconfigId = :deviceconfigId"),
    @NamedQuery(name = "Hts.findByUploaded", query = "SELECT h FROM Hts h WHERE h.uploaded = :uploaded"),
    @NamedQuery(name = "Hts.findByTimeUploaded", query = "SELECT h FROM Hts h WHERE h.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Hts.findByIdUuid", query = "SELECT h FROM Hts h WHERE h.idUuid = :idUuid"),
    @NamedQuery(name = "Hts.findByUuid", query = "SELECT h FROM Hts h WHERE h.uuid = :uuid")})
public class Hts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "HTS_ID")
    private Long htsId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CLIENT_CODE")
    private String clientCode;
    @Column(name = "ASSESSMENT_ID")
    private BigInteger assessmentId;
    @Size(max = 25)
    @Column(name = "HOSPITAL_NUM")
    private String hospitalNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STATE_ID")
    private long stateId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "LGA_ID")
    private long lgaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Size(max = 200)
    @Column(name = "FACILITY_NAME")
    private String facilityName;
    @Column(name = "DATE_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Size(max = 100)
    @Column(name = "REFERRED_FROM")
    private String referredFrom;
    @Size(max = 100)
    @Column(name = "TESTING_SETTING")
    private String testingSetting;
    @Size(max = 100)
    @Column(name = "SURNAME")
    private String surname;
    @Size(max = 100)
    @Column(name = "OTHER_NAMES")
    private String otherNames;
    @Column(name = "DATE_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateBirth;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 15)
    @Column(name = "AGE_UNIT")
    private String ageUnit;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 200)
    @Column(name = "ADDRESS")
    private String address;
    @Size(max = 25)
    @Column(name = "GENDER")
    private String gender;
    @Size(max = 10)
    @Column(name = "FIRST_TIME_VISIT")
    private String firstTimeVisit;
    @Size(max = 100)
    @Column(name = "STATE")
    private String state;
    @Size(max = 200)
    @Column(name = "LGA")
    private String lga;
    @Size(max = 20)
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @Column(name = "NUM_CHILDREN")
    private Integer numChildren;
    @Column(name = "NUM_WIVES")
    private Integer numWives;
    @Size(max = 100)
    @Column(name = "TYPE_COUNSELING")
    private String typeCounseling;
    @Size(max = 50)
    @Column(name = "INDEX_CLIENT")
    private String indexClient;
    @Size(max = 50)
    @Column(name = "TYPE_INDEX")
    private String typeIndex;
    @Size(max = 100)
    @Column(name = "INDEX_CLIENT_CODE")
    private String indexClientCode;
    @Column(name = "KNOWLEDGE_ASSESSMENT1")
    private Integer knowledgeAssessment1;
    @Column(name = "KNOWLEDGE_ASSESSMENT2")
    private Integer knowledgeAssessment2;
    @Column(name = "KNOWLEDGE_ASSESSMENT3")
    private Integer knowledgeAssessment3;
    @Column(name = "KNOWLEDGE_ASSESSMENT4")
    private Integer knowledgeAssessment4;
    @Column(name = "KNOWLEDGE_ASSESSMENT5")
    private Integer knowledgeAssessment5;
    @Column(name = "KNOWLEDGE_ASSESSMENT6")
    private Integer knowledgeAssessment6;
    @Column(name = "KNOWLEDGE_ASSESSMENT7")
    private Integer knowledgeAssessment7;
    @Column(name = "RISK_ASSESSMENT1")
    private Integer riskAssessment1;
    @Column(name = "RISK_ASSESSMENT2")
    private Integer riskAssessment2;
    @Column(name = "RISK_ASSESSMENT3")
    private Integer riskAssessment3;
    @Column(name = "RISK_ASSESSMENT4")
    private Integer riskAssessment4;
    @Column(name = "RISK_ASSESSMENT5")
    private Integer riskAssessment5;
    @Column(name = "RISK_ASSESSMENT6")
    private Integer riskAssessment6;
    @Column(name = "TB_SCREENING1")
    private Integer tbScreening1;
    @Column(name = "TB_SCREENING2")
    private Integer tbScreening2;
    @Column(name = "TB_SCREENING3")
    private Integer tbScreening3;
    @Column(name = "TB_SCREENING4")
    private Integer tbScreening4;
    @Column(name = "STI_SCREENING1")
    private Integer stiScreening1;
    @Column(name = "STI_SCREENING2")
    private Integer stiScreening2;
    @Column(name = "STI_SCREENING3")
    private Integer stiScreening3;
    @Column(name = "STI_SCREENING4")
    private Integer stiScreening4;
    @Column(name = "STI_SCREENING5")
    private Integer stiScreening5;
    @Size(max = 100)
    @Column(name = "HIV_TEST_RESULT")
    private String hivTestResult;
    @Size(max = 100)
    @Column(name = "TESTED_HIV")
    private String testedHiv;
    @Column(name = "POST_TEST1")
    private Integer postTest1;
    @Column(name = "POST_TEST2")
    private Integer postTest2;
    @Column(name = "POST_TEST3")
    private Integer postTest3;
    @Column(name = "POST_TEST4")
    private Integer postTest4;
    @Column(name = "POST_TEST5")
    private Integer postTest5;
    @Column(name = "POST_TEST6")
    private Integer postTest6;
    @Column(name = "POST_TEST7")
    private Integer postTest7;
    @Column(name = "POST_TEST8")
    private Integer postTest8;
    @Column(name = "POST_TEST9")
    private Integer postTest9;
    @Column(name = "POST_TEST10")
    private Integer postTest10;
    @Column(name = "POST_TEST11")
    private Integer postTest11;
    @Column(name = "POST_TEST12")
    private Integer postTest12;
    @Column(name = "POST_TEST13")
    private Integer postTest13;
    @Column(name = "POST_TEST14")
    private Integer postTest14;
    @Size(max = 100)
    @Column(name = "SYPHILIS_TEST_RESULT")
    private String syphilisTestResult;
    @Size(max = 100)
    @Column(name = "HEPATITISB_TEST_RESULT")
    private String hepatitisbTestResult;
    @Size(max = 100)
    @Column(name = "HEPATITISC_TEST_RESULT")
    private String hepatitiscTestResult;
    @Size(max = 100)
    @Column(name = "STI_REFERRED")
    private String stiReferred;
    @Size(max = 100)
    @Column(name = "TB_REFERRED")
    private String tbReferred;
    @Size(max = 100)
    @Column(name = "ART_REFERRED")
    private String artReferred;
    @Size(max = 8)
    @Column(name = "PARTNER_NOTIFICATION")
    private String partnerNotification;
    @Size(max = 100)
    @Column(name = "NOTIFICATION_COUNSELING")
    private String notificationCounseling;
    @Column(name = "NUMBER_PARTNER")
    private Integer numberPartner;
    @Column(name = "DATE_REGISTRATION")
    @Temporal(TemporalType.DATE)
    private Date dateRegistration;
    @Column(name = "DATE_STARTED")
    @Temporal(TemporalType.DATE)
    private Date dateStarted;
    @Size(max = 300)
    @Column(name = "NOTE")
    private String note;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LONGITUDE")
    private Double longitude;
    @Column(name = "LATITUDE")
    private Double latitude;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "USER_ID")
    private Integer userId;
    @Column(name = "DEVICECONFIG_ID")
    private BigInteger deviceconfigId;
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
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "htsId")
//    private Collection<Indexcontact> indexcontactCollection;

    public Hts() {
    }

    public Hts(Long htsId) {
        this.htsId = htsId;
    }

    public Hts(Long htsId, String clientCode, long stateId, long lgaId, long facilityId) {
        this.htsId = htsId;
        this.clientCode = clientCode;
        this.stateId = stateId;
        this.lgaId = lgaId;
        this.facilityId = facilityId;
    }

    public Long getHtsId() {
        return htsId;
    }

    public void setHtsId(Long htsId) {
        this.htsId = htsId;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public BigInteger getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(BigInteger assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getHospitalNum() {
        return hospitalNum;
    }

    public void setHospitalNum(String hospitalNum) {
        this.hospitalNum = hospitalNum;
    }

    public long getStateId() {
        return stateId;
    }

    public void setStateId(long stateId) {
        this.stateId = stateId;
    }

    public long getLgaId() {
        return lgaId;
    }

    public void setLgaId(long lgaId) {
        this.lgaId = lgaId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public String getReferredFrom() {
        return referredFrom;
    }

    public void setReferredFrom(String referredFrom) {
        this.referredFrom = referredFrom;
    }

    public String getTestingSetting() {
        return testingSetting;
    }

    public void setTestingSetting(String testingSetting) {
        this.testingSetting = testingSetting;
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

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstTimeVisit() {
        return firstTimeVisit;
    }

    public void setFirstTimeVisit(String firstTimeVisit) {
        this.firstTimeVisit = firstTimeVisit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLga() {
        return lga;
    }

    public void setLga(String lga) {
        this.lga = lga;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(Integer numChildren) {
        this.numChildren = numChildren;
    }

    public Integer getNumWives() {
        return numWives;
    }

    public void setNumWives(Integer numWives) {
        this.numWives = numWives;
    }

    public String getTypeCounseling() {
        return typeCounseling;
    }

    public void setTypeCounseling(String typeCounseling) {
        this.typeCounseling = typeCounseling;
    }

    public String getIndexClient() {
        return indexClient;
    }

    public void setIndexClient(String indexClient) {
        this.indexClient = indexClient;
    }

    public String getTypeIndex() {
        return typeIndex;
    }

    public void setTypeIndex(String typeIndex) {
        this.typeIndex = typeIndex;
    }

    public String getIndexClientCode() {
        return indexClientCode;
    }

    public void setIndexClientCode(String indexClientCode) {
        this.indexClientCode = indexClientCode;
    }

    public Integer getKnowledgeAssessment1() {
        return knowledgeAssessment1;
    }

    public void setKnowledgeAssessment1(Integer knowledgeAssessment1) {
        this.knowledgeAssessment1 = knowledgeAssessment1;
    }

    public Integer getKnowledgeAssessment2() {
        return knowledgeAssessment2;
    }

    public void setKnowledgeAssessment2(Integer knowledgeAssessment2) {
        this.knowledgeAssessment2 = knowledgeAssessment2;
    }

    public Integer getKnowledgeAssessment3() {
        return knowledgeAssessment3;
    }

    public void setKnowledgeAssessment3(Integer knowledgeAssessment3) {
        this.knowledgeAssessment3 = knowledgeAssessment3;
    }

    public Integer getKnowledgeAssessment4() {
        return knowledgeAssessment4;
    }

    public void setKnowledgeAssessment4(Integer knowledgeAssessment4) {
        this.knowledgeAssessment4 = knowledgeAssessment4;
    }

    public Integer getKnowledgeAssessment5() {
        return knowledgeAssessment5;
    }

    public void setKnowledgeAssessment5(Integer knowledgeAssessment5) {
        this.knowledgeAssessment5 = knowledgeAssessment5;
    }

    public Integer getKnowledgeAssessment6() {
        return knowledgeAssessment6;
    }

    public void setKnowledgeAssessment6(Integer knowledgeAssessment6) {
        this.knowledgeAssessment6 = knowledgeAssessment6;
    }

    public Integer getKnowledgeAssessment7() {
        return knowledgeAssessment7;
    }

    public void setKnowledgeAssessment7(Integer knowledgeAssessment7) {
        this.knowledgeAssessment7 = knowledgeAssessment7;
    }

    public Integer getRiskAssessment1() {
        return riskAssessment1;
    }

    public void setRiskAssessment1(Integer riskAssessment1) {
        this.riskAssessment1 = riskAssessment1;
    }

    public Integer getRiskAssessment2() {
        return riskAssessment2;
    }

    public void setRiskAssessment2(Integer riskAssessment2) {
        this.riskAssessment2 = riskAssessment2;
    }

    public Integer getRiskAssessment3() {
        return riskAssessment3;
    }

    public void setRiskAssessment3(Integer riskAssessment3) {
        this.riskAssessment3 = riskAssessment3;
    }

    public Integer getRiskAssessment4() {
        return riskAssessment4;
    }

    public void setRiskAssessment4(Integer riskAssessment4) {
        this.riskAssessment4 = riskAssessment4;
    }

    public Integer getRiskAssessment5() {
        return riskAssessment5;
    }

    public void setRiskAssessment5(Integer riskAssessment5) {
        this.riskAssessment5 = riskAssessment5;
    }

    public Integer getRiskAssessment6() {
        return riskAssessment6;
    }

    public void setRiskAssessment6(Integer riskAssessment6) {
        this.riskAssessment6 = riskAssessment6;
    }

    public Integer getTbScreening1() {
        return tbScreening1;
    }

    public void setTbScreening1(Integer tbScreening1) {
        this.tbScreening1 = tbScreening1;
    }

    public Integer getTbScreening2() {
        return tbScreening2;
    }

    public void setTbScreening2(Integer tbScreening2) {
        this.tbScreening2 = tbScreening2;
    }

    public Integer getTbScreening3() {
        return tbScreening3;
    }

    public void setTbScreening3(Integer tbScreening3) {
        this.tbScreening3 = tbScreening3;
    }

    public Integer getTbScreening4() {
        return tbScreening4;
    }

    public void setTbScreening4(Integer tbScreening4) {
        this.tbScreening4 = tbScreening4;
    }

    public Integer getStiScreening1() {
        return stiScreening1;
    }

    public void setStiScreening1(Integer stiScreening1) {
        this.stiScreening1 = stiScreening1;
    }

    public Integer getStiScreening2() {
        return stiScreening2;
    }

    public void setStiScreening2(Integer stiScreening2) {
        this.stiScreening2 = stiScreening2;
    }

    public Integer getStiScreening3() {
        return stiScreening3;
    }

    public void setStiScreening3(Integer stiScreening3) {
        this.stiScreening3 = stiScreening3;
    }

    public Integer getStiScreening4() {
        return stiScreening4;
    }

    public void setStiScreening4(Integer stiScreening4) {
        this.stiScreening4 = stiScreening4;
    }

    public Integer getStiScreening5() {
        return stiScreening5;
    }

    public void setStiScreening5(Integer stiScreening5) {
        this.stiScreening5 = stiScreening5;
    }

    public String getHivTestResult() {
        return hivTestResult;
    }

    public void setHivTestResult(String hivTestResult) {
        this.hivTestResult = hivTestResult;
    }

    public String getTestedHiv() {
        return testedHiv;
    }

    public void setTestedHiv(String testedHiv) {
        this.testedHiv = testedHiv;
    }

    public Integer getPostTest1() {
        return postTest1;
    }

    public void setPostTest1(Integer postTest1) {
        this.postTest1 = postTest1;
    }

    public Integer getPostTest2() {
        return postTest2;
    }

    public void setPostTest2(Integer postTest2) {
        this.postTest2 = postTest2;
    }

    public Integer getPostTest3() {
        return postTest3;
    }

    public void setPostTest3(Integer postTest3) {
        this.postTest3 = postTest3;
    }

    public Integer getPostTest4() {
        return postTest4;
    }

    public void setPostTest4(Integer postTest4) {
        this.postTest4 = postTest4;
    }

    public Integer getPostTest5() {
        return postTest5;
    }

    public void setPostTest5(Integer postTest5) {
        this.postTest5 = postTest5;
    }

    public Integer getPostTest6() {
        return postTest6;
    }

    public void setPostTest6(Integer postTest6) {
        this.postTest6 = postTest6;
    }

    public Integer getPostTest7() {
        return postTest7;
    }

    public void setPostTest7(Integer postTest7) {
        this.postTest7 = postTest7;
    }

    public Integer getPostTest8() {
        return postTest8;
    }

    public void setPostTest8(Integer postTest8) {
        this.postTest8 = postTest8;
    }

    public Integer getPostTest9() {
        return postTest9;
    }

    public void setPostTest9(Integer postTest9) {
        this.postTest9 = postTest9;
    }

    public Integer getPostTest10() {
        return postTest10;
    }

    public void setPostTest10(Integer postTest10) {
        this.postTest10 = postTest10;
    }

    public Integer getPostTest11() {
        return postTest11;
    }

    public void setPostTest11(Integer postTest11) {
        this.postTest11 = postTest11;
    }

    public Integer getPostTest12() {
        return postTest12;
    }

    public void setPostTest12(Integer postTest12) {
        this.postTest12 = postTest12;
    }

    public Integer getPostTest13() {
        return postTest13;
    }

    public void setPostTest13(Integer postTest13) {
        this.postTest13 = postTest13;
    }

    public Integer getPostTest14() {
        return postTest14;
    }

    public void setPostTest14(Integer postTest14) {
        this.postTest14 = postTest14;
    }

    public String getSyphilisTestResult() {
        return syphilisTestResult;
    }

    public void setSyphilisTestResult(String syphilisTestResult) {
        this.syphilisTestResult = syphilisTestResult;
    }

    public String getHepatitisbTestResult() {
        return hepatitisbTestResult;
    }

    public void setHepatitisbTestResult(String hepatitisbTestResult) {
        this.hepatitisbTestResult = hepatitisbTestResult;
    }

    public String getHepatitiscTestResult() {
        return hepatitiscTestResult;
    }

    public void setHepatitiscTestResult(String hepatitiscTestResult) {
        this.hepatitiscTestResult = hepatitiscTestResult;
    }

    public String getStiReferred() {
        return stiReferred;
    }

    public void setStiReferred(String stiReferred) {
        this.stiReferred = stiReferred;
    }

    public String getTbReferred() {
        return tbReferred;
    }

    public void setTbReferred(String tbReferred) {
        this.tbReferred = tbReferred;
    }

    public String getArtReferred() {
        return artReferred;
    }

    public void setArtReferred(String artReferred) {
        this.artReferred = artReferred;
    }

    public String getPartnerNotification() {
        return partnerNotification;
    }

    public void setPartnerNotification(String partnerNotification) {
        this.partnerNotification = partnerNotification;
    }

    public String getNotificationCounseling() {
        return notificationCounseling;
    }

    public void setNotificationCounseling(String notificationCounseling) {
        this.notificationCounseling = notificationCounseling;
    }

    public Integer getNumberPartner() {
        return numberPartner;
    }

    public void setNumberPartner(Integer numberPartner) {
        this.numberPartner = numberPartner;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
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

    public BigInteger getDeviceconfigId() {
        return deviceconfigId;
    }

    public void setDeviceconfigId(BigInteger deviceconfigId) {
        this.deviceconfigId = deviceconfigId;
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

//    public Collection<Indexcontact> getIndexcontactCollection() {
//        return indexcontactCollection;
//    }
//
//    public void setIndexcontactCollection(Collection<Indexcontact> indexcontactCollection) {
//        this.indexcontactCollection = indexcontactCollection;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (htsId != null ? htsId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Hts)) {
//            return false;
//        }
//        Hts other = (Hts) object;
//        if ((this.htsId == null && other.htsId != null) || (this.htsId != null && !this.htsId.equals(other.htsId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.cedar.lamis.entity.Hts[ htsId=" + htsId + " ]";
//    }
    
}
