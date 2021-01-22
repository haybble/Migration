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
@Table(name = "CHRONICCARE")
@NamedQueries({
    @NamedQuery(name = "Chroniccare.findAll", query = "SELECT c FROM Chroniccare c"),
    @NamedQuery(name = "Chroniccare.findByChroniccareId", query = "SELECT c FROM Chroniccare c WHERE c.chroniccareId = :chroniccareId"),
    @NamedQuery(name = "Chroniccare.findByPatientId", query = "SELECT c FROM Chroniccare c WHERE c.patientId = :patientId"),
    @NamedQuery(name = "Chroniccare.findByFacilityId", query = "SELECT c FROM Chroniccare c WHERE c.facilityId = :facilityId"),
    @NamedQuery(name = "Chroniccare.findByDateVisit", query = "SELECT c FROM Chroniccare c WHERE c.dateVisit = :dateVisit"),
    @NamedQuery(name = "Chroniccare.findByClientType", query = "SELECT c FROM Chroniccare c WHERE c.clientType = :clientType"),
    @NamedQuery(name = "Chroniccare.findByCurrentStatus", query = "SELECT c FROM Chroniccare c WHERE c.currentStatus = :currentStatus"),
    @NamedQuery(name = "Chroniccare.findByClinicStage", query = "SELECT c FROM Chroniccare c WHERE c.clinicStage = :clinicStage"),
    @NamedQuery(name = "Chroniccare.findByPregnancyStatus", query = "SELECT c FROM Chroniccare c WHERE c.pregnancyStatus = :pregnancyStatus"),
    @NamedQuery(name = "Chroniccare.findByLastCd4", query = "SELECT c FROM Chroniccare c WHERE c.lastCd4 = :lastCd4"),
    @NamedQuery(name = "Chroniccare.findByDateLastCd4", query = "SELECT c FROM Chroniccare c WHERE c.dateLastCd4 = :dateLastCd4"),
    @NamedQuery(name = "Chroniccare.findByLastViralLoad", query = "SELECT c FROM Chroniccare c WHERE c.lastViralLoad = :lastViralLoad"),
    @NamedQuery(name = "Chroniccare.findByDateLastViralLoad", query = "SELECT c FROM Chroniccare c WHERE c.dateLastViralLoad = :dateLastViralLoad"),
    @NamedQuery(name = "Chroniccare.findByEligibleCd4", query = "SELECT c FROM Chroniccare c WHERE c.eligibleCd4 = :eligibleCd4"),
    @NamedQuery(name = "Chroniccare.findByEligibleViralLoad", query = "SELECT c FROM Chroniccare c WHERE c.eligibleViralLoad = :eligibleViralLoad"),
    @NamedQuery(name = "Chroniccare.findByCotrimEligibility1", query = "SELECT c FROM Chroniccare c WHERE c.cotrimEligibility1 = :cotrimEligibility1"),
    @NamedQuery(name = "Chroniccare.findByCotrimEligibility2", query = "SELECT c FROM Chroniccare c WHERE c.cotrimEligibility2 = :cotrimEligibility2"),
    @NamedQuery(name = "Chroniccare.findByCotrimEligibility3", query = "SELECT c FROM Chroniccare c WHERE c.cotrimEligibility3 = :cotrimEligibility3"),
    @NamedQuery(name = "Chroniccare.findByCotrimEligibility4", query = "SELECT c FROM Chroniccare c WHERE c.cotrimEligibility4 = :cotrimEligibility4"),
    @NamedQuery(name = "Chroniccare.findByCotrimEligibility5", query = "SELECT c FROM Chroniccare c WHERE c.cotrimEligibility5 = :cotrimEligibility5"),
    @NamedQuery(name = "Chroniccare.findByIpt", query = "SELECT c FROM Chroniccare c WHERE c.ipt = :ipt"),
    @NamedQuery(name = "Chroniccare.findByInh", query = "SELECT c FROM Chroniccare c WHERE c.inh = :inh"),
    @NamedQuery(name = "Chroniccare.findByTbTreatment", query = "SELECT c FROM Chroniccare c WHERE c.tbTreatment = :tbTreatment"),
    @NamedQuery(name = "Chroniccare.findByDateStartedTbTreatment", query = "SELECT c FROM Chroniccare c WHERE c.dateStartedTbTreatment = :dateStartedTbTreatment"),
    @NamedQuery(name = "Chroniccare.findByTbReferred", query = "SELECT c FROM Chroniccare c WHERE c.tbReferred = :tbReferred"),
    @NamedQuery(name = "Chroniccare.findByEligibleIpt", query = "SELECT c FROM Chroniccare c WHERE c.eligibleIpt = :eligibleIpt"),
    @NamedQuery(name = "Chroniccare.findByTbValues", query = "SELECT c FROM Chroniccare c WHERE c.tbValues = :tbValues"),
    @NamedQuery(name = "Chroniccare.findByBodyWeight", query = "SELECT c FROM Chroniccare c WHERE c.bodyWeight = :bodyWeight"),
    @NamedQuery(name = "Chroniccare.findByHeight", query = "SELECT c FROM Chroniccare c WHERE c.height = :height"),
    @NamedQuery(name = "Chroniccare.findByBmi", query = "SELECT c FROM Chroniccare c WHERE c.bmi = :bmi"),
    @NamedQuery(name = "Chroniccare.findByMuac", query = "SELECT c FROM Chroniccare c WHERE c.muac = :muac"),
    @NamedQuery(name = "Chroniccare.findByMuacPediatrics", query = "SELECT c FROM Chroniccare c WHERE c.muacPediatrics = :muacPediatrics"),
    @NamedQuery(name = "Chroniccare.findByMuacPregnant", query = "SELECT c FROM Chroniccare c WHERE c.muacPregnant = :muacPregnant"),
    @NamedQuery(name = "Chroniccare.findBySupplementaryFood", query = "SELECT c FROM Chroniccare c WHERE c.supplementaryFood = :supplementaryFood"),
    @NamedQuery(name = "Chroniccare.findByNutritionalStatusReferred", query = "SELECT c FROM Chroniccare c WHERE c.nutritionalStatusReferred = :nutritionalStatusReferred"),
    @NamedQuery(name = "Chroniccare.findByGbv1", query = "SELECT c FROM Chroniccare c WHERE c.gbv1 = :gbv1"),
    @NamedQuery(name = "Chroniccare.findByGbv1Referred", query = "SELECT c FROM Chroniccare c WHERE c.gbv1Referred = :gbv1Referred"),
    @NamedQuery(name = "Chroniccare.findByGbv2", query = "SELECT c FROM Chroniccare c WHERE c.gbv2 = :gbv2"),
    @NamedQuery(name = "Chroniccare.findByGbv2Referred", query = "SELECT c FROM Chroniccare c WHERE c.gbv2Referred = :gbv2Referred"),
    @NamedQuery(name = "Chroniccare.findByHypertensive", query = "SELECT c FROM Chroniccare c WHERE c.hypertensive = :hypertensive"),
    @NamedQuery(name = "Chroniccare.findByFirstHypertensive", query = "SELECT c FROM Chroniccare c WHERE c.firstHypertensive = :firstHypertensive"),
    @NamedQuery(name = "Chroniccare.findByBpAbove", query = "SELECT c FROM Chroniccare c WHERE c.bpAbove = :bpAbove"),
    @NamedQuery(name = "Chroniccare.findByBpReferred", query = "SELECT c FROM Chroniccare c WHERE c.bpReferred = :bpReferred"),
    @NamedQuery(name = "Chroniccare.findByDiabetic", query = "SELECT c FROM Chroniccare c WHERE c.diabetic = :diabetic"),
    @NamedQuery(name = "Chroniccare.findByFirstDiabetic", query = "SELECT c FROM Chroniccare c WHERE c.firstDiabetic = :firstDiabetic"),
    @NamedQuery(name = "Chroniccare.findByDmReferred", query = "SELECT c FROM Chroniccare c WHERE c.dmReferred = :dmReferred"),
    @NamedQuery(name = "Chroniccare.findByDmValues", query = "SELECT c FROM Chroniccare c WHERE c.dmValues = :dmValues"),
    @NamedQuery(name = "Chroniccare.findByPhdp1", query = "SELECT c FROM Chroniccare c WHERE c.phdp1 = :phdp1"),
    @NamedQuery(name = "Chroniccare.findByPhdp1ServicesProvided", query = "SELECT c FROM Chroniccare c WHERE c.phdp1ServicesProvided = :phdp1ServicesProvided"),
    @NamedQuery(name = "Chroniccare.findByPhdp2", query = "SELECT c FROM Chroniccare c WHERE c.phdp2 = :phdp2"),
    @NamedQuery(name = "Chroniccare.findByPhdp2ServicesProvided", query = "SELECT c FROM Chroniccare c WHERE c.phdp2ServicesProvided = :phdp2ServicesProvided"),
    @NamedQuery(name = "Chroniccare.findByPhdp3", query = "SELECT c FROM Chroniccare c WHERE c.phdp3 = :phdp3"),
    @NamedQuery(name = "Chroniccare.findByPhdp3ServicesProvided", query = "SELECT c FROM Chroniccare c WHERE c.phdp3ServicesProvided = :phdp3ServicesProvided"),
    @NamedQuery(name = "Chroniccare.findByPhdp4", query = "SELECT c FROM Chroniccare c WHERE c.phdp4 = :phdp4"),
    @NamedQuery(name = "Chroniccare.findByPhdp4ServicesProvided", query = "SELECT c FROM Chroniccare c WHERE c.phdp4ServicesProvided = :phdp4ServicesProvided"),
    @NamedQuery(name = "Chroniccare.findByPhdp5", query = "SELECT c FROM Chroniccare c WHERE c.phdp5 = :phdp5"),
    @NamedQuery(name = "Chroniccare.findByPhdp5ServicesProvided", query = "SELECT c FROM Chroniccare c WHERE c.phdp5ServicesProvided = :phdp5ServicesProvided"),
    @NamedQuery(name = "Chroniccare.findByPhdp6", query = "SELECT c FROM Chroniccare c WHERE c.phdp6 = :phdp6"),
    @NamedQuery(name = "Chroniccare.findByPhdp6ServicesProvided", query = "SELECT c FROM Chroniccare c WHERE c.phdp6ServicesProvided = :phdp6ServicesProvided"),
    @NamedQuery(name = "Chroniccare.findByPhdp7", query = "SELECT c FROM Chroniccare c WHERE c.phdp7 = :phdp7"),
    @NamedQuery(name = "Chroniccare.findByPhdp7ServicesProvided", query = "SELECT c FROM Chroniccare c WHERE c.phdp7ServicesProvided = :phdp7ServicesProvided"),
    @NamedQuery(name = "Chroniccare.findByPhdp8", query = "SELECT c FROM Chroniccare c WHERE c.phdp8 = :phdp8"),
    @NamedQuery(name = "Chroniccare.findByPhdp8ServicesProvided", query = "SELECT c FROM Chroniccare c WHERE c.phdp8ServicesProvided = :phdp8ServicesProvided"),
    @NamedQuery(name = "Chroniccare.findByPhdp9ServicesProvided", query = "SELECT c FROM Chroniccare c WHERE c.phdp9ServicesProvided = :phdp9ServicesProvided"),
    @NamedQuery(name = "Chroniccare.findByReproductiveIntentions1", query = "SELECT c FROM Chroniccare c WHERE c.reproductiveIntentions1 = :reproductiveIntentions1"),
    @NamedQuery(name = "Chroniccare.findByReproductiveIntentions1Referred", query = "SELECT c FROM Chroniccare c WHERE c.reproductiveIntentions1Referred = :reproductiveIntentions1Referred"),
    @NamedQuery(name = "Chroniccare.findByReproductiveIntentions2", query = "SELECT c FROM Chroniccare c WHERE c.reproductiveIntentions2 = :reproductiveIntentions2"),
    @NamedQuery(name = "Chroniccare.findByReproductiveIntentions2Referred", query = "SELECT c FROM Chroniccare c WHERE c.reproductiveIntentions2Referred = :reproductiveIntentions2Referred"),
    @NamedQuery(name = "Chroniccare.findByReproductiveIntentions3", query = "SELECT c FROM Chroniccare c WHERE c.reproductiveIntentions3 = :reproductiveIntentions3"),
    @NamedQuery(name = "Chroniccare.findByReproductiveIntentions3Referred", query = "SELECT c FROM Chroniccare c WHERE c.reproductiveIntentions3Referred = :reproductiveIntentions3Referred"),
    @NamedQuery(name = "Chroniccare.findByMalariaPrevention1", query = "SELECT c FROM Chroniccare c WHERE c.malariaPrevention1 = :malariaPrevention1"),
    @NamedQuery(name = "Chroniccare.findByMalariaPrevention1Referred", query = "SELECT c FROM Chroniccare c WHERE c.malariaPrevention1Referred = :malariaPrevention1Referred"),
    @NamedQuery(name = "Chroniccare.findByMalariaPrevention2", query = "SELECT c FROM Chroniccare c WHERE c.malariaPrevention2 = :malariaPrevention2"),
    @NamedQuery(name = "Chroniccare.findByMalariaPrevention2Referred", query = "SELECT c FROM Chroniccare c WHERE c.malariaPrevention2Referred = :malariaPrevention2Referred"),
    @NamedQuery(name = "Chroniccare.findByCommunitypharmId", query = "SELECT c FROM Chroniccare c WHERE c.communitypharmId = :communitypharmId"),
    @NamedQuery(name = "Chroniccare.findByTimeStamp", query = "SELECT c FROM Chroniccare c WHERE c.timeStamp = :timeStamp"),
    @NamedQuery(name = "Chroniccare.findByUploaded", query = "SELECT c FROM Chroniccare c WHERE c.uploaded = :uploaded"),
    @NamedQuery(name = "Chroniccare.findByTimeUploaded", query = "SELECT c FROM Chroniccare c WHERE c.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Chroniccare.findByUserId", query = "SELECT c FROM Chroniccare c WHERE c.userId = :userId"),
    @NamedQuery(name = "Chroniccare.findByIdUuid", query = "SELECT c FROM Chroniccare c WHERE c.idUuid = :idUuid"),
    @NamedQuery(name = "Chroniccare.findByUuid", query = "SELECT c FROM Chroniccare c WHERE c.uuid = :uuid")})
public class Chroniccare implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CHRONICCARE_ID")
    private Long chroniccareId;
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
    @Size(max = 75)
    @Column(name = "CLIENT_TYPE")
    private String clientType;
    @Size(max = 75)
    @Column(name = "CURRENT_STATUS")
    private String currentStatus;
    @Size(max = 15)
    @Column(name = "CLINIC_STAGE")
    private String clinicStage;
    @Size(max = 75)
    @Column(name = "PREGNANCY_STATUS")
    private String pregnancyStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LAST_CD4")
    private Double lastCd4;
    @Column(name = "DATE_LAST_CD4")
    @Temporal(TemporalType.DATE)
    private Date dateLastCd4;
    @Column(name = "LAST_VIRAL_LOAD")
    private Double lastViralLoad;
    @Column(name = "DATE_LAST_VIRAL_LOAD")
    @Temporal(TemporalType.DATE)
    private Date dateLastViralLoad;
    @Size(max = 7)
    @Column(name = "ELIGIBLE_CD4")
    private String eligibleCd4;
    @Size(max = 7)
    @Column(name = "ELIGIBLE_VIRAL_LOAD")
    private String eligibleViralLoad;
    @Column(name = "COTRIM_ELIGIBILITY1")
    private Integer cotrimEligibility1;
    @Column(name = "COTRIM_ELIGIBILITY2")
    private Integer cotrimEligibility2;
    @Column(name = "COTRIM_ELIGIBILITY3")
    private Integer cotrimEligibility3;
    @Column(name = "COTRIM_ELIGIBILITY4")
    private Integer cotrimEligibility4;
    @Column(name = "COTRIM_ELIGIBILITY5")
    private Integer cotrimEligibility5;
    @Size(max = 7)
    @Column(name = "IPT")
    private String ipt;
    @Size(max = 7)
    @Column(name = "INH")
    private String inh;
    @Size(max = 7)
    @Column(name = "TB_TREATMENT")
    private String tbTreatment;
    @Column(name = "DATE_STARTED_TB_TREATMENT")
    @Temporal(TemporalType.DATE)
    private Date dateStartedTbTreatment;
    @Size(max = 7)
    @Column(name = "TB_REFERRED")
    private String tbReferred;
    @Size(max = 7)
    @Column(name = "ELIGIBLE_IPT")
    private String eligibleIpt;
    @Size(max = 75)
    @Column(name = "TB_VALUES")
    private String tbValues;
    @Column(name = "BODY_WEIGHT")
    private Double bodyWeight;
    @Column(name = "HEIGHT")
    private Double height;
    @Size(max = 45)
    @Column(name = "BMI")
    private String bmi;
    @Column(name = "MUAC")
    private Double muac;
    @Size(max = 45)
    @Column(name = "MUAC_PEDIATRICS")
    private String muacPediatrics;
    @Size(max = 45)
    @Column(name = "MUAC_PREGNANT")
    private String muacPregnant;
    @Size(max = 7)
    @Column(name = "SUPPLEMENTARY_FOOD")
    private String supplementaryFood;
    @Size(max = 7)
    @Column(name = "NUTRITIONAL_STATUS_REFERRED")
    private String nutritionalStatusReferred;
    @Size(max = 7)
    @Column(name = "GBV1")
    private String gbv1;
    @Size(max = 7)
    @Column(name = "GBV1_REFERRED")
    private String gbv1Referred;
    @Size(max = 7)
    @Column(name = "GBV2")
    private String gbv2;
    @Size(max = 7)
    @Column(name = "GBV2_REFERRED")
    private String gbv2Referred;
    @Size(max = 7)
    @Column(name = "HYPERTENSIVE")
    private String hypertensive;
    @Size(max = 7)
    @Column(name = "FIRST_HYPERTENSIVE")
    private String firstHypertensive;
    @Size(max = 7)
    @Column(name = "BP_ABOVE")
    private String bpAbove;
    @Size(max = 7)
    @Column(name = "BP_REFERRED")
    private String bpReferred;
    @Size(max = 7)
    @Column(name = "DIABETIC")
    private String diabetic;
    @Size(max = 7)
    @Column(name = "FIRST_DIABETIC")
    private String firstDiabetic;
    @Size(max = 7)
    @Column(name = "DM_REFERRED")
    private String dmReferred;
    @Size(max = 50)
    @Column(name = "DM_VALUES")
    private String dmValues;
    @Size(max = 7)
    @Column(name = "PHDP1")
    private String phdp1;
    @Size(max = 7)
    @Column(name = "PHDP1_SERVICES_PROVIDED")
    private String phdp1ServicesProvided;
    @Size(max = 7)
    @Column(name = "PHDP2")
    private String phdp2;
    @Size(max = 7)
    @Column(name = "PHDP2_SERVICES_PROVIDED")
    private String phdp2ServicesProvided;
    @Size(max = 7)
    @Column(name = "PHDP3")
    private String phdp3;
    @Size(max = 7)
    @Column(name = "PHDP3_SERVICES_PROVIDED")
    private String phdp3ServicesProvided;
    @Size(max = 7)
    @Column(name = "PHDP4")
    private String phdp4;
    @Size(max = 7)
    @Column(name = "PHDP4_SERVICES_PROVIDED")
    private String phdp4ServicesProvided;
    @Size(max = 7)
    @Column(name = "PHDP5")
    private String phdp5;
    @Size(max = 7)
    @Column(name = "PHDP5_SERVICES_PROVIDED")
    private String phdp5ServicesProvided;
    @Column(name = "PHDP6")
    private Integer phdp6;
    @Size(max = 7)
    @Column(name = "PHDP6_SERVICES_PROVIDED")
    private String phdp6ServicesProvided;
    @Column(name = "PHDP7")
    private Integer phdp7;
    @Size(max = 7)
    @Column(name = "PHDP7_SERVICES_PROVIDED")
    private String phdp7ServicesProvided;
    @Size(max = 7)
    @Column(name = "PHDP8")
    private String phdp8;
    @Size(max = 7)
    @Column(name = "PHDP8_SERVICES_PROVIDED")
    private String phdp8ServicesProvided;
    @Size(max = 255)
    @Column(name = "PHDP9_SERVICES_PROVIDED")
    private String phdp9ServicesProvided;
    @Size(max = 7)
    @Column(name = "REPRODUCTIVE_INTENTIONS1")
    private String reproductiveIntentions1;
    @Size(max = 7)
    @Column(name = "REPRODUCTIVE_INTENTIONS1_REFERRED")
    private String reproductiveIntentions1Referred;
    @Size(max = 7)
    @Column(name = "REPRODUCTIVE_INTENTIONS2")
    private String reproductiveIntentions2;
    @Size(max = 7)
    @Column(name = "REPRODUCTIVE_INTENTIONS2_REFERRED")
    private String reproductiveIntentions2Referred;
    @Size(max = 7)
    @Column(name = "REPRODUCTIVE_INTENTIONS3")
    private String reproductiveIntentions3;
    @Size(max = 7)
    @Column(name = "REPRODUCTIVE_INTENTIONS3_REFERRED")
    private String reproductiveIntentions3Referred;
    @Size(max = 7)
    @Column(name = "MALARIA_PREVENTION1")
    private String malariaPrevention1;
    @Size(max = 7)
    @Column(name = "MALARIA_PREVENTION1_REFERRED")
    private String malariaPrevention1Referred;
    @Size(max = 7)
    @Column(name = "MALARIA_PREVENTION2")
    private String malariaPrevention2;
    @Size(max = 7)
    @Column(name = "MALARIA_PREVENTION2_REFERRED")
    private String malariaPrevention2Referred;
    @Column(name = "COMMUNITYPHARM_ID")
    private BigInteger communitypharmId;
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

    public Chroniccare() {
    }

    public Chroniccare(Long chroniccareId) {
        this.chroniccareId = chroniccareId;
    }

    public Chroniccare(Long chroniccareId, long patientId, long facilityId, Date dateVisit) {
        this.chroniccareId = chroniccareId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateVisit = dateVisit;
    }

    public Long getChroniccareId() {
        return chroniccareId;
    }

    public void setChroniccareId(Long chroniccareId) {
        this.chroniccareId = chroniccareId;
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

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getClinicStage() {
        return clinicStage;
    }

    public void setClinicStage(String clinicStage) {
        this.clinicStage = clinicStage;
    }

    public String getPregnancyStatus() {
        return pregnancyStatus;
    }

    public void setPregnancyStatus(String pregnancyStatus) {
        this.pregnancyStatus = pregnancyStatus;
    }

    public Double getLastCd4() {
        return lastCd4;
    }

    public void setLastCd4(Double lastCd4) {
        this.lastCd4 = lastCd4;
    }

    public Date getDateLastCd4() {
        return dateLastCd4;
    }

    public void setDateLastCd4(Date dateLastCd4) {
        this.dateLastCd4 = dateLastCd4;
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

    public String getEligibleCd4() {
        return eligibleCd4;
    }

    public void setEligibleCd4(String eligibleCd4) {
        this.eligibleCd4 = eligibleCd4;
    }

    public String getEligibleViralLoad() {
        return eligibleViralLoad;
    }

    public void setEligibleViralLoad(String eligibleViralLoad) {
        this.eligibleViralLoad = eligibleViralLoad;
    }

    public Integer getCotrimEligibility1() {
        return cotrimEligibility1;
    }

    public void setCotrimEligibility1(Integer cotrimEligibility1) {
        this.cotrimEligibility1 = cotrimEligibility1;
    }

    public Integer getCotrimEligibility2() {
        return cotrimEligibility2;
    }

    public void setCotrimEligibility2(Integer cotrimEligibility2) {
        this.cotrimEligibility2 = cotrimEligibility2;
    }

    public Integer getCotrimEligibility3() {
        return cotrimEligibility3;
    }

    public void setCotrimEligibility3(Integer cotrimEligibility3) {
        this.cotrimEligibility3 = cotrimEligibility3;
    }

    public Integer getCotrimEligibility4() {
        return cotrimEligibility4;
    }

    public void setCotrimEligibility4(Integer cotrimEligibility4) {
        this.cotrimEligibility4 = cotrimEligibility4;
    }

    public Integer getCotrimEligibility5() {
        return cotrimEligibility5;
    }

    public void setCotrimEligibility5(Integer cotrimEligibility5) {
        this.cotrimEligibility5 = cotrimEligibility5;
    }

    public String getIpt() {
        return ipt;
    }

    public void setIpt(String ipt) {
        this.ipt = ipt;
    }

    public String getInh() {
        return inh;
    }

    public void setInh(String inh) {
        this.inh = inh;
    }

    public String getTbTreatment() {
        return tbTreatment;
    }

    public void setTbTreatment(String tbTreatment) {
        this.tbTreatment = tbTreatment;
    }

    public Date getDateStartedTbTreatment() {
        return dateStartedTbTreatment;
    }

    public void setDateStartedTbTreatment(Date dateStartedTbTreatment) {
        this.dateStartedTbTreatment = dateStartedTbTreatment;
    }

    public String getTbReferred() {
        return tbReferred;
    }

    public void setTbReferred(String tbReferred) {
        this.tbReferred = tbReferred;
    }

    public String getEligibleIpt() {
        return eligibleIpt;
    }

    public void setEligibleIpt(String eligibleIpt) {
        this.eligibleIpt = eligibleIpt;
    }

    public String getTbValues() {
        return tbValues;
    }

    public void setTbValues(String tbValues) {
        this.tbValues = tbValues;
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

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public Double getMuac() {
        return muac;
    }

    public void setMuac(Double muac) {
        this.muac = muac;
    }

    public String getMuacPediatrics() {
        return muacPediatrics;
    }

    public void setMuacPediatrics(String muacPediatrics) {
        this.muacPediatrics = muacPediatrics;
    }

    public String getMuacPregnant() {
        return muacPregnant;
    }

    public void setMuacPregnant(String muacPregnant) {
        this.muacPregnant = muacPregnant;
    }

    public String getSupplementaryFood() {
        return supplementaryFood;
    }

    public void setSupplementaryFood(String supplementaryFood) {
        this.supplementaryFood = supplementaryFood;
    }

    public String getNutritionalStatusReferred() {
        return nutritionalStatusReferred;
    }

    public void setNutritionalStatusReferred(String nutritionalStatusReferred) {
        this.nutritionalStatusReferred = nutritionalStatusReferred;
    }

    public String getGbv1() {
        return gbv1;
    }

    public void setGbv1(String gbv1) {
        this.gbv1 = gbv1;
    }

    public String getGbv1Referred() {
        return gbv1Referred;
    }

    public void setGbv1Referred(String gbv1Referred) {
        this.gbv1Referred = gbv1Referred;
    }

    public String getGbv2() {
        return gbv2;
    }

    public void setGbv2(String gbv2) {
        this.gbv2 = gbv2;
    }

    public String getGbv2Referred() {
        return gbv2Referred;
    }

    public void setGbv2Referred(String gbv2Referred) {
        this.gbv2Referred = gbv2Referred;
    }

    public String getHypertensive() {
        return hypertensive;
    }

    public void setHypertensive(String hypertensive) {
        this.hypertensive = hypertensive;
    }

    public String getFirstHypertensive() {
        return firstHypertensive;
    }

    public void setFirstHypertensive(String firstHypertensive) {
        this.firstHypertensive = firstHypertensive;
    }

    public String getBpAbove() {
        return bpAbove;
    }

    public void setBpAbove(String bpAbove) {
        this.bpAbove = bpAbove;
    }

    public String getBpReferred() {
        return bpReferred;
    }

    public void setBpReferred(String bpReferred) {
        this.bpReferred = bpReferred;
    }

    public String getDiabetic() {
        return diabetic;
    }

    public void setDiabetic(String diabetic) {
        this.diabetic = diabetic;
    }

    public String getFirstDiabetic() {
        return firstDiabetic;
    }

    public void setFirstDiabetic(String firstDiabetic) {
        this.firstDiabetic = firstDiabetic;
    }

    public String getDmReferred() {
        return dmReferred;
    }

    public void setDmReferred(String dmReferred) {
        this.dmReferred = dmReferred;
    }

    public String getDmValues() {
        return dmValues;
    }

    public void setDmValues(String dmValues) {
        this.dmValues = dmValues;
    }

    public String getPhdp1() {
        return phdp1;
    }

    public void setPhdp1(String phdp1) {
        this.phdp1 = phdp1;
    }

    public String getPhdp1ServicesProvided() {
        return phdp1ServicesProvided;
    }

    public void setPhdp1ServicesProvided(String phdp1ServicesProvided) {
        this.phdp1ServicesProvided = phdp1ServicesProvided;
    }

    public String getPhdp2() {
        return phdp2;
    }

    public void setPhdp2(String phdp2) {
        this.phdp2 = phdp2;
    }

    public String getPhdp2ServicesProvided() {
        return phdp2ServicesProvided;
    }

    public void setPhdp2ServicesProvided(String phdp2ServicesProvided) {
        this.phdp2ServicesProvided = phdp2ServicesProvided;
    }

    public String getPhdp3() {
        return phdp3;
    }

    public void setPhdp3(String phdp3) {
        this.phdp3 = phdp3;
    }

    public String getPhdp3ServicesProvided() {
        return phdp3ServicesProvided;
    }

    public void setPhdp3ServicesProvided(String phdp3ServicesProvided) {
        this.phdp3ServicesProvided = phdp3ServicesProvided;
    }

    public String getPhdp4() {
        return phdp4;
    }

    public void setPhdp4(String phdp4) {
        this.phdp4 = phdp4;
    }

    public String getPhdp4ServicesProvided() {
        return phdp4ServicesProvided;
    }

    public void setPhdp4ServicesProvided(String phdp4ServicesProvided) {
        this.phdp4ServicesProvided = phdp4ServicesProvided;
    }

    public String getPhdp5() {
        return phdp5;
    }

    public void setPhdp5(String phdp5) {
        this.phdp5 = phdp5;
    }

    public String getPhdp5ServicesProvided() {
        return phdp5ServicesProvided;
    }

    public void setPhdp5ServicesProvided(String phdp5ServicesProvided) {
        this.phdp5ServicesProvided = phdp5ServicesProvided;
    }

    public Integer getPhdp6() {
        return phdp6;
    }

    public void setPhdp6(Integer phdp6) {
        this.phdp6 = phdp6;
    }

    public String getPhdp6ServicesProvided() {
        return phdp6ServicesProvided;
    }

    public void setPhdp6ServicesProvided(String phdp6ServicesProvided) {
        this.phdp6ServicesProvided = phdp6ServicesProvided;
    }

    public Integer getPhdp7() {
        return phdp7;
    }

    public void setPhdp7(Integer phdp7) {
        this.phdp7 = phdp7;
    }

    public String getPhdp7ServicesProvided() {
        return phdp7ServicesProvided;
    }

    public void setPhdp7ServicesProvided(String phdp7ServicesProvided) {
        this.phdp7ServicesProvided = phdp7ServicesProvided;
    }

    public String getPhdp8() {
        return phdp8;
    }

    public void setPhdp8(String phdp8) {
        this.phdp8 = phdp8;
    }

    public String getPhdp8ServicesProvided() {
        return phdp8ServicesProvided;
    }

    public void setPhdp8ServicesProvided(String phdp8ServicesProvided) {
        this.phdp8ServicesProvided = phdp8ServicesProvided;
    }

    public String getPhdp9ServicesProvided() {
        return phdp9ServicesProvided;
    }

    public void setPhdp9ServicesProvided(String phdp9ServicesProvided) {
        this.phdp9ServicesProvided = phdp9ServicesProvided;
    }

    public String getReproductiveIntentions1() {
        return reproductiveIntentions1;
    }

    public void setReproductiveIntentions1(String reproductiveIntentions1) {
        this.reproductiveIntentions1 = reproductiveIntentions1;
    }

    public String getReproductiveIntentions1Referred() {
        return reproductiveIntentions1Referred;
    }

    public void setReproductiveIntentions1Referred(String reproductiveIntentions1Referred) {
        this.reproductiveIntentions1Referred = reproductiveIntentions1Referred;
    }

    public String getReproductiveIntentions2() {
        return reproductiveIntentions2;
    }

    public void setReproductiveIntentions2(String reproductiveIntentions2) {
        this.reproductiveIntentions2 = reproductiveIntentions2;
    }

    public String getReproductiveIntentions2Referred() {
        return reproductiveIntentions2Referred;
    }

    public void setReproductiveIntentions2Referred(String reproductiveIntentions2Referred) {
        this.reproductiveIntentions2Referred = reproductiveIntentions2Referred;
    }

    public String getReproductiveIntentions3() {
        return reproductiveIntentions3;
    }

    public void setReproductiveIntentions3(String reproductiveIntentions3) {
        this.reproductiveIntentions3 = reproductiveIntentions3;
    }

    public String getReproductiveIntentions3Referred() {
        return reproductiveIntentions3Referred;
    }

    public void setReproductiveIntentions3Referred(String reproductiveIntentions3Referred) {
        this.reproductiveIntentions3Referred = reproductiveIntentions3Referred;
    }

    public String getMalariaPrevention1() {
        return malariaPrevention1;
    }

    public void setMalariaPrevention1(String malariaPrevention1) {
        this.malariaPrevention1 = malariaPrevention1;
    }

    public String getMalariaPrevention1Referred() {
        return malariaPrevention1Referred;
    }

    public void setMalariaPrevention1Referred(String malariaPrevention1Referred) {
        this.malariaPrevention1Referred = malariaPrevention1Referred;
    }

    public String getMalariaPrevention2() {
        return malariaPrevention2;
    }

    public void setMalariaPrevention2(String malariaPrevention2) {
        this.malariaPrevention2 = malariaPrevention2;
    }

    public String getMalariaPrevention2Referred() {
        return malariaPrevention2Referred;
    }

    public void setMalariaPrevention2Referred(String malariaPrevention2Referred) {
        this.malariaPrevention2Referred = malariaPrevention2Referred;
    }

    public BigInteger getCommunitypharmId() {
        return communitypharmId;
    }

    public void setCommunitypharmId(BigInteger communitypharmId) {
        this.communitypharmId = communitypharmId;
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
        hash += (chroniccareId != null ? chroniccareId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chroniccare)) {
            return false;
        }
        Chroniccare other = (Chroniccare) object;
        if ((this.chroniccareId == null && other.chroniccareId != null) || (this.chroniccareId != null && !this.chroniccareId.equals(other.chroniccareId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Chroniccare[ chroniccareId=" + chroniccareId + " ]";
    }
    
}
