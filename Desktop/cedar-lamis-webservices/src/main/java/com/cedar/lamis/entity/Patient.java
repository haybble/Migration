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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;


/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "PATIENT")

@NamedQueries({
    @NamedQuery(name = "Patient.findAll", query = "SELECT o FROM Patient o"),
     @NamedQuery(name = "Patient.findById", query = "SELECT o FROM Patient o where o.patientId=?1")
   })
public class Patient implements Serializable {

//    @Column(name = "DATE_BIRTH")
//    @Temporal(TemporalType.DATE)
//    private Date dateBirth;
//    @Column(name = "DATE_CONFIRMED_HIV")
//    @Temporal(TemporalType.DATE)
//    private Date dateConfirmedHiv;
//    @Column(name = "DATE_ENROLLED_PMTCT")
//    @Temporal(TemporalType.DATE)
//    private Date dateEnrolledPmtct;
//    @Size(max = 35)
//    @Column(name = "TIME_HIV_DIAGNOSIS")
//    private String timeHivDiagnosis;
//    @Column(name = "DATE_REGISTRATION")
//    @Temporal(TemporalType.DATE)
//    private Date dateRegistration;
//    @Column(name = "DATE_STARTED")
//    @Temporal(TemporalType.DATE)
//    private Date dateStarted;
//    @Column(name = "DATE_CURRENT_STATUS")
//    @Temporal(TemporalType.DATE)
//    private Date dateCurrentStatus;
//    @Column(name = "DATE_LAST_CD4")
//    @Temporal(TemporalType.DATE)
//    private Date dateLastCd4;
//    @Column(name = "DATE_LAST_VIRAL_LOAD")
//    @Temporal(TemporalType.DATE)
//    private Date dateLastViralLoad;
//    @Column(name = "VIRAL_LOAD_DUE_DATE")
//    @Temporal(TemporalType.DATE)
//    private Date viralLoadDueDate;
//    @Column(name = "DATE_LAST_REFILL")
//    @Temporal(TemporalType.DATE)
//    private Date dateLastRefill;
//    @Column(name = "DATE_NEXT_REFILL")
//    @Temporal(TemporalType.DATE)
//    private Date dateNextRefill;
//    @Column(name = "DATE_LAST_CLINIC")
//    @Temporal(TemporalType.DATE)
//    private Date dateLastClinic;
//    @Column(name = "DATE_NEXT_CLINIC")
//    @Temporal(TemporalType.DATE)
//    private Date dateNextClinic;
//    @Column(name = "DATE_TRACKED")
//    @Temporal(TemporalType.DATE)
//    private Date dateTracked;
//    @Column(name = "AGREED_DATE")
//    @Temporal(TemporalType.DATE)
//    private Date agreedDate;
//    @Column(name = "TIME_STAMP")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date timeStamp;
//    @Column(name = "TIME_UPLOADED")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date timeUploaded;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientId")
//    private Collection<Devolve> devolveCollection;
//    @OneToMany(mappedBy = "patientId")
//    private Collection<Prescription> prescriptionCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientId")
//    private Collection<Validated> validatedCollection;
//    @OneToMany(mappedBy = "patientId")
//    private Collection<Eac> eacCollection;
//    @OneToMany(mappedBy = "patientId")
//    private Collection<Patientcasemanager> patientcasemanagerCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientId")
//    private Collection<Encounter> encounterCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientId")
//    private Collection<Drugtherapy> drugtherapyCollection;
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientId")
//    private Collection<Nigqual> nigqualCollection;
//
//    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PATIENT_ID")
    private Long patientId;
    @Basic(optional = false)
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @Column(name = "HOSPITAL_NUM")
    private String hospitalNum;
    @Column(name = "UNIQUE_ID")
    private String uniqueId;
    @Column(name = "SURNAME")
    private String surname;
    @Column(name = "OTHER_NAMES")
    private String otherNames;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "DATE_BIRTH")
//    @Temporal(TemporalType.DATE)
    private Date dateBirth;

    @Column(name = "AGE")
    private Integer age;
    @Column(name = "AGE_UNIT")
    private String ageUnit;
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @Column(name = "EDUCATION")
    private String education;
    @Column(name = "OCCUPATION")
    private String occupation;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "STATE")
    private String state;
    @Column(name = "LGA")
    private String lga;
    @Column(name = "NEXT_KIN")
    private String nextKin;
    @Column(name = "ADDRESS_KIN")
    private String addressKin;
    @Column(name = "PHONE_KIN")
    private String phoneKin;
    @Column(name = "RELATION_KIN")
    private String relationKin;
    @Column(name = "ENTRY_POINT")
    private String entryPoint;
    @Column(name = "TARGET_GROUP")
    private String targetGroup;
    @Column(name = "DATE_CONFIRMED_HIV")
//    @Temporal(TemporalType.DATE)
    private Date dateConfirmedHiv;
    @Column(name = "DATE_ENROLLED_PMTCT")
//    @Temporal(TemporalType.DATE)
    private Date dateEnrolledPmtct;
    @Column(name = "SOURCE_REFERRAL")
    private String sourceReferral;
//    @Column(name = "TIME_HIV_DIAGNOSIS")
//    private String timeHivDiagnosis;
    @Column(name = "TB_STATUS")
    private String tbStatus;
    @Column(name = "PREGNANT")
    private Integer pregnant;
    @Column(name = "BREASTFEEDING")
    private Integer breastfeeding;
    @Column(name = "DATE_REGISTRATION")
//    @Temporal(TemporalType.DATE)
    private Date dateRegistration;
    @Column(name = "STATUS_REGISTRATION")
    private String statusRegistration;
    @Column(name = "ENROLLMENT_SETTING")
    private String enrollmentSetting;
    @Column(name = "CASEMANAGER_ID")
    private BigInteger casemanagerId;
    @Column(name = "COMMUNITYPHARM_ID")
    private BigInteger communitypharmId;
    @Column(name = "DATE_STARTED")
//    @Temporal(TemporalType.DATE)
    private Date dateStarted;
    @Column(name = "CURRENT_STATUS")
    private String currentStatus;
    @Column(name = "DATE_CURRENT_STATUS")
//    @Temporal(TemporalType.DATE)
    private Date dateCurrentStatus;
    @Column(name = "REGIMENTYPE")
    private String regimentype;
    @Column(name = "REGIMEN")
    private String regimen;
    @Column(name = "LAST_CLINIC_STAGE")
    private String lastClinicStage;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LAST_VIRAL_LOAD")
    private Double lastViralLoad;
    @Column(name = "LAST_CD4")
    private Double lastCd4;
    @Column(name = "LAST_CD4P")
    private Double lastCd4p;
    @Column(name = "DATE_LAST_CD4")
//    @Temporal(TemporalType.DATE)
    private Date dateLastCd4;
    @Column(name = "DATE_LAST_VIRAL_LOAD")
 //   @Temporal(TemporalType.DATE)
    private Date dateLastViralLoad;
    @Column(name = "VIRAL_LOAD_DUE_DATE")
//    @Temporal(TemporalType.DATE)
    private Date viralLoadDueDate;
    @Column(name = "VIRAL_LOAD_TYPE")
    private String viralLoadType;
   @Column(name = "DATE_LAST_REFILL")
//    @Temporal(TemporalType.DATE)
    private Date dateLastRefill;
    @Column(name = "DATE_NEXT_REFILL")
//    @Temporal(TemporalType.DATE)
    private Date dateNextRefill;
    @Column(name = "LAST_REFILL_DURATION")
    private Integer lastRefillDuration;
    @Column(name = "LAST_REFILL_SETTING")
    private String lastRefillSetting;
    @Column(name = "DATE_LAST_CLINIC")
//    @Temporal(TemporalType.DATE)
    private Date dateLastClinic;
    @Column(name = "DATE_NEXT_CLINIC")
//    @Temporal(TemporalType.DATE)
    private Date dateNextClinic;
    @Column(name = "DATE_TRACKED")
//    @Temporal(TemporalType.DATE)
    private Date dateTracked;
    @Column(name = "OUTCOME")
    private String outcome;
    @Column(name = "AGREED_DATE")
//    @Temporal(TemporalType.DATE)
    private Date agreedDate;
   @Column(name = "SEND_MESSAGE")
    private Integer sendMessage;
    @Column(name = "TIME_STAMP")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Column(name = "CAUSE_DEATH")
    private String causeDeath;
    @Column(name = "ID_UUID")
    private String idUuid;
    @Basic(optional = false)
    @Column(name = "PARTNERINFORMATION_ID")
    private long partnerinformationId;
    @Column(name = "HTS_ID")
    private BigInteger htsId;
    @Column(name = "UUID")
    private String uuid;
    

    public Patient() {
    }

    public Patient(Long patientId) {
        this.patientId = patientId;
    }

    public Patient(Long patientId, long facilityId, String hospitalNum, long partnerinformationId) {
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.hospitalNum = hospitalNum;
        this.partnerinformationId = partnerinformationId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public String getHospitalNum() {
        return hospitalNum;
    }

    public void setHospitalNum(String hospitalNum) {
        this.hospitalNum = hospitalNum;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
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

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getNextKin() {
        return nextKin;
    }

    public void setNextKin(String nextKin) {
        this.nextKin = nextKin;
    }

    public String getAddressKin() {
        return addressKin;
    }

    public void setAddressKin(String addressKin) {
        this.addressKin = addressKin;
    }

    public String getPhoneKin() {
        return phoneKin;
    }

    public void setPhoneKin(String phoneKin) {
        this.phoneKin = phoneKin;
    }

    public String getRelationKin() {
        return relationKin;
    }

    public void setRelationKin(String relationKin) {
        this.relationKin = relationKin;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getTargetGroup() {
        return targetGroup;
    }

    public void setTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
    }

    

    public String getSourceReferral() {
        return sourceReferral;
    }

    public void setSourceReferral(String sourceReferral) {
        this.sourceReferral = sourceReferral;
    }

    

    public String getTbStatus() {
        return tbStatus;
    }

    public void setTbStatus(String tbStatus) {
        this.tbStatus = tbStatus;
    }

    public Integer getPregnant() {
        return pregnant;
    }

    public void setPregnant(Integer pregnant) {
        this.pregnant = pregnant;
    }

    public Integer getBreastfeeding() {
        return breastfeeding;
    }

    public void setBreastfeeding(Integer breastfeeding) {
        this.breastfeeding = breastfeeding;
    }

    
    public String getStatusRegistration() {
        return statusRegistration;
    }

    public void setStatusRegistration(String statusRegistration) {
        this.statusRegistration = statusRegistration;
    }

    public String getEnrollmentSetting() {
        return enrollmentSetting;
    }

    public void setEnrollmentSetting(String enrollmentSetting) {
        this.enrollmentSetting = enrollmentSetting;
    }

    public BigInteger getCasemanagerId() {
        return casemanagerId;
    }

    public void setCasemanagerId(BigInteger casemanagerId) {
        this.casemanagerId = casemanagerId;
    }

    public BigInteger getCommunitypharmId() {
        return communitypharmId;
    }

    public void setCommunitypharmId(BigInteger communitypharmId) {
        this.communitypharmId = communitypharmId;
    }

    

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

   

    public String getRegimentype() {
        return regimentype;
    }

    public void setRegimentype(String regimentype) {
        this.regimentype = regimentype;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }

    public String getLastClinicStage() {
        return lastClinicStage;
    }

    public void setLastClinicStage(String lastClinicStage) {
        this.lastClinicStage = lastClinicStage;
    }

    public Double getLastViralLoad() {
        return lastViralLoad;
    }

    public void setLastViralLoad(Double lastViralLoad) {
        this.lastViralLoad = lastViralLoad;
    }

    public Double getLastCd4() {
        return lastCd4;
    }

    public void setLastCd4(Double lastCd4) {
        this.lastCd4 = lastCd4;
    }

    public Double getLastCd4p() {
        return lastCd4p;
    }

    public void setLastCd4p(Double lastCd4p) {
        this.lastCd4p = lastCd4p;
    }

   

    public String getViralLoadType() {
        return viralLoadType;
    }

    public void setViralLoadType(String viralLoadType) {
        this.viralLoadType = viralLoadType;
    }

    
    public Integer getLastRefillDuration() {
        return lastRefillDuration;
    }

    public void setLastRefillDuration(Integer lastRefillDuration) {
        this.lastRefillDuration = lastRefillDuration;
    }

    public String getLastRefillSetting() {
        return lastRefillSetting;
    }

    public void setLastRefillSetting(String lastRefillSetting) {
        this.lastRefillSetting = lastRefillSetting;
    }

   
    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    

    public Integer getSendMessage() {
        return sendMessage;
    }

    public void setSendMessage(Integer sendMessage) {
        this.sendMessage = sendMessage;
    }

    

    public Integer getUploaded() {
        return uploaded;
    }

    public void setUploaded(Integer uploaded) {
        this.uploaded = uploaded;
    }

   
    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
    }

    public String getCauseDeath() {
        return causeDeath;
    }

    public void setCauseDeath(String causeDeath) {
        this.causeDeath = causeDeath;
    }

    public String getIdUuid() {
        return idUuid;
    }

    public void setIdUuid(String idUuid) {
        this.idUuid = idUuid;
    }

    public long getPartnerinformationId() {
        return partnerinformationId;
    }

    public void setPartnerinformationId(long partnerinformationId) {
        this.partnerinformationId = partnerinformationId;
    }

    public BigInteger getHtsId() {
        return htsId;
    }

    public void setHtsId(BigInteger htsId) {
        this.htsId = htsId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

   
    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getDateConfirmedHiv() {
        return dateConfirmedHiv;
    }

    public void setDateConfirmedHiv(Date dateConfirmedHiv) {
        this.dateConfirmedHiv = dateConfirmedHiv;
    }

    public Date getDateEnrolledPmtct() {
        return dateEnrolledPmtct;
    }

    public void setDateEnrolledPmtct(Date dateEnrolledPmtct) {
        this.dateEnrolledPmtct = dateEnrolledPmtct;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    public Date getDateCurrentStatus() {
        return dateCurrentStatus;
    }

    public void setDateCurrentStatus(Date dateCurrentStatus) {
        this.dateCurrentStatus = dateCurrentStatus;
    }

    public Date getDateLastCd4() {
        return dateLastCd4;
    }

    public void setDateLastCd4(Date dateLastCd4) {
        this.dateLastCd4 = dateLastCd4;
    }

    public Date getDateLastViralLoad() {
        return dateLastViralLoad;
    }

    public void setDateLastViralLoad(Date dateLastViralLoad) {
        this.dateLastViralLoad = dateLastViralLoad;
    }

    public Date getViralLoadDueDate() {
        return viralLoadDueDate;
    }

    public void setViralLoadDueDate(Date viralLoadDueDate) {
        this.viralLoadDueDate = viralLoadDueDate;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration(Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public Date getDateLastRefill() {
        return dateLastRefill;
    }

    public void setDateLastRefill(Date dateLastRefill) {
        this.dateLastRefill = dateLastRefill;
    }

    public Date getDateNextRefill() {
        return dateNextRefill;
    }

    public void setDateNextRefill(Date dateNextRefill) {
        this.dateNextRefill = dateNextRefill;
    }

    public Date getDateLastClinic() {
        return dateLastClinic;
    }

    public void setDateLastClinic(Date dateLastClinic) {
        this.dateLastClinic = dateLastClinic;
    }

    public Date getDateNextClinic() {
        return dateNextClinic;
    }

    public void setDateNextClinic(Date dateNextClinic) {
        this.dateNextClinic = dateNextClinic;
    }

    public Date getDateTracked() {
        return dateTracked;
    }

    public void setDateTracked(Date dateTracked) {
        this.dateTracked = dateTracked;
    }

    public Date getAgreedDate() {
        return agreedDate;
    }

    public void setAgreedDate(Date agreedDate) {
        this.agreedDate = agreedDate;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Date getTimeUploaded() {
        return timeUploaded;
    }

    public void setTimeUploaded(Date timeUploaded) {
        this.timeUploaded = timeUploaded;
    }
    
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (patientId != null ? patientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Patient)) {
            return false;
        }
        Patient other = (Patient) object;
        if ((this.patientId == null && other.patientId != null) || (this.patientId != null && !this.patientId.equals(other.patientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[ patientId=" + patientId + " ]";
    }

   
    
}
