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
@Table(name = "ANC")
@NamedQueries({
    @NamedQuery(name = "Anc.findAll", query = "SELECT a FROM Anc a"),
    @NamedQuery(name = "Anc.findByAncId", query = "SELECT a FROM Anc a WHERE a.ancId = :ancId"),
    @NamedQuery(name = "Anc.findByPatientId", query = "SELECT a FROM Anc a WHERE a.patientId = :patientId"),
    @NamedQuery(name = "Anc.findByFacilityId", query = "SELECT a FROM Anc a WHERE a.facilityId = :facilityId"),
    @NamedQuery(name = "Anc.findByAncNum", query = "SELECT a FROM Anc a WHERE a.ancNum = :ancNum"),
    @NamedQuery(name = "Anc.findByDateVisit", query = "SELECT a FROM Anc a WHERE a.dateVisit = :dateVisit"),
    @NamedQuery(name = "Anc.findByUniqueId", query = "SELECT a FROM Anc a WHERE a.uniqueId = :uniqueId"),
    @NamedQuery(name = "Anc.findByDateEnrolledPmtct", query = "SELECT a FROM Anc a WHERE a.dateEnrolledPmtct = :dateEnrolledPmtct"),
    @NamedQuery(name = "Anc.findBySourceReferral", query = "SELECT a FROM Anc a WHERE a.sourceReferral = :sourceReferral"),
    @NamedQuery(name = "Anc.findByLmp", query = "SELECT a FROM Anc a WHERE a.lmp = :lmp"),
    @NamedQuery(name = "Anc.findByEdd", query = "SELECT a FROM Anc a WHERE a.edd = :edd"),
    @NamedQuery(name = "Anc.findByGestationalAge", query = "SELECT a FROM Anc a WHERE a.gestationalAge = :gestationalAge"),
    @NamedQuery(name = "Anc.findByGravida", query = "SELECT a FROM Anc a WHERE a.gravida = :gravida"),
    @NamedQuery(name = "Anc.findByParity", query = "SELECT a FROM Anc a WHERE a.parity = :parity"),
    @NamedQuery(name = "Anc.findByTimeHivDiagnosis", query = "SELECT a FROM Anc a WHERE a.timeHivDiagnosis = :timeHivDiagnosis"),
    @NamedQuery(name = "Anc.findByArvRegimenPast", query = "SELECT a FROM Anc a WHERE a.arvRegimenPast = :arvRegimenPast"),
    @NamedQuery(name = "Anc.findByArvRegimenCurrent", query = "SELECT a FROM Anc a WHERE a.arvRegimenCurrent = :arvRegimenCurrent"),
    @NamedQuery(name = "Anc.findByDateArvRegimenCurrent", query = "SELECT a FROM Anc a WHERE a.dateArvRegimenCurrent = :dateArvRegimenCurrent"),
    @NamedQuery(name = "Anc.findByClinicStage", query = "SELECT a FROM Anc a WHERE a.clinicStage = :clinicStage"),
    @NamedQuery(name = "Anc.findByDateConfirmedHiv", query = "SELECT a FROM Anc a WHERE a.dateConfirmedHiv = :dateConfirmedHiv"),
    @NamedQuery(name = "Anc.findByFuncStatus", query = "SELECT a FROM Anc a WHERE a.funcStatus = :funcStatus"),
    @NamedQuery(name = "Anc.findByBodyWeight", query = "SELECT a FROM Anc a WHERE a.bodyWeight = :bodyWeight"),
    @NamedQuery(name = "Anc.findByCd4Ordered", query = "SELECT a FROM Anc a WHERE a.cd4Ordered = :cd4Ordered"),
    @NamedQuery(name = "Anc.findByCd4", query = "SELECT a FROM Anc a WHERE a.cd4 = :cd4"),
    @NamedQuery(name = "Anc.findByNumberAncVisit", query = "SELECT a FROM Anc a WHERE a.numberAncVisit = :numberAncVisit"),
    @NamedQuery(name = "Anc.findByDateCd4", query = "SELECT a FROM Anc a WHERE a.dateCd4 = :dateCd4"),
    @NamedQuery(name = "Anc.findByViralLoadTestDone", query = "SELECT a FROM Anc a WHERE a.viralLoadTestDone = :viralLoadTestDone"),
    @NamedQuery(name = "Anc.findByDateViralLoad", query = "SELECT a FROM Anc a WHERE a.dateViralLoad = :dateViralLoad"),
    @NamedQuery(name = "Anc.findBySyphilisTested", query = "SELECT a FROM Anc a WHERE a.syphilisTested = :syphilisTested"),
    @NamedQuery(name = "Anc.findBySyphilisTestResult", query = "SELECT a FROM Anc a WHERE a.syphilisTestResult = :syphilisTestResult"),
    @NamedQuery(name = "Anc.findBySyphilisTreated", query = "SELECT a FROM Anc a WHERE a.syphilisTreated = :syphilisTreated"),
    @NamedQuery(name = "Anc.findByHepatitisbTested", query = "SELECT a FROM Anc a WHERE a.hepatitisbTested = :hepatitisbTested"),
    @NamedQuery(name = "Anc.findByHepatitisbTestResult", query = "SELECT a FROM Anc a WHERE a.hepatitisbTestResult = :hepatitisbTestResult"),
    @NamedQuery(name = "Anc.findByHepatitiscTested", query = "SELECT a FROM Anc a WHERE a.hepatitiscTested = :hepatitiscTested"),
    @NamedQuery(name = "Anc.findByHepatitiscTestResult", query = "SELECT a FROM Anc a WHERE a.hepatitiscTestResult = :hepatitiscTestResult"),
    @NamedQuery(name = "Anc.findByDateNextAppointment", query = "SELECT a FROM Anc a WHERE a.dateNextAppointment = :dateNextAppointment"),
    @NamedQuery(name = "Anc.findByViralLoadResult", query = "SELECT a FROM Anc a WHERE a.viralLoadResult = :viralLoadResult"),
    @NamedQuery(name = "Anc.findByHeight", query = "SELECT a FROM Anc a WHERE a.height = :height"),
    @NamedQuery(name = "Anc.findByTimeStamp", query = "SELECT a FROM Anc a WHERE a.timeStamp = :timeStamp"),
    @NamedQuery(name = "Anc.findByUploaded", query = "SELECT a FROM Anc a WHERE a.uploaded = :uploaded"),
    @NamedQuery(name = "Anc.findByTimeUploaded", query = "SELECT a FROM Anc a WHERE a.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Anc.findByUserId", query = "SELECT a FROM Anc a WHERE a.userId = :userId"),
    @NamedQuery(name = "Anc.findByIdUuid", query = "SELECT a FROM Anc a WHERE a.idUuid = :idUuid"),
    @NamedQuery(name = "Anc.findByUuid", query = "SELECT a FROM Anc a WHERE a.uuid = :uuid")})
public class Anc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ANC_ID")
    private Long ancId;
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
    @Size(min = 1, max = 25)
    @Column(name = "ANC_NUM")
    private String ancNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_VISIT")
    //@Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Size(max = 45)
    @Column(name = "UNIQUE_ID")
    private String uniqueId;
    @Column(name = "DATE_ENROLLED_PMTCT")
    //@Temporal(TemporalType.DATE)
    private Date dateEnrolledPmtct;
    @Size(max = 45)
    @Column(name = "SOURCE_REFERRAL")
    private String sourceReferral;
    @Column(name = "LMP")
   // @Temporal(TemporalType.DATE)
    private Date lmp;
    @Column(name = "EDD")
    //@Temporal(TemporalType.DATE)
    private Date edd;
    @Column(name = "GESTATIONAL_AGE")
    private Integer gestationalAge;
    @Column(name = "GRAVIDA")
    private Integer gravida;
    @Column(name = "PARITY")
    private Integer parity;
    @Size(max = 45)
    @Column(name = "TIME_HIV_DIAGNOSIS")
    private String timeHivDiagnosis;
    @Size(max = 100)
    @Column(name = "ARV_REGIMEN_PAST")
    private String arvRegimenPast;
    @Size(max = 100)
    @Column(name = "ARV_REGIMEN_CURRENT")
    private String arvRegimenCurrent;
    @Column(name = "DATE_ARV_REGIMEN_CURRENT")
   // @Temporal(TemporalType.DATE)
    private Date dateArvRegimenCurrent;
    @Size(max = 15)
    @Column(name = "CLINIC_STAGE")
    private String clinicStage;
    @Column(name = "DATE_CONFIRMED_HIV")
   // @Temporal(TemporalType.DATE)
    private Date dateConfirmedHiv;
    @Size(max = 45)
    @Column(name = "FUNC_STATUS")
    private String funcStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BODY_WEIGHT")
    private Double bodyWeight;
    @Size(max = 7)
    @Column(name = "CD4_ORDERED")
    private String cd4Ordered;
    @Column(name = "CD4")
    private Double cd4;
    @Column(name = "NUMBER_ANC_VISIT")
    private Integer numberAncVisit;
    @Column(name = "DATE_CD4")
    //@Temporal(TemporalType.DATE)
    private Date dateCd4;
    @Size(max = 10)
    @Column(name = "VIRAL_LOAD_TEST_DONE")
    private String viralLoadTestDone;
    @Column(name = "DATE_VIRAL_LOAD")
    //@Temporal(TemporalType.DATE)
    private Date dateViralLoad;
    @Size(max = 50)
    @Column(name = "SYPHILIS_TESTED")
    private String syphilisTested;
    @Size(max = 50)
    @Column(name = "SYPHILIS_TEST_RESULT")
    private String syphilisTestResult;
    @Size(max = 50)
    @Column(name = "SYPHILIS_TREATED")
    private String syphilisTreated;
    @Size(max = 50)
    @Column(name = "HEPATITISB_TESTED")
    private String hepatitisbTested;
    @Size(max = 50)
    @Column(name = "HEPATITISB_TEST_RESULT")
    private String hepatitisbTestResult;
    @Size(max = 50)
    @Column(name = "HEPATITISC_TESTED")
    private String hepatitiscTested;
    @Size(max = 50)
    @Column(name = "HEPATITISC_TEST_RESULT")
    private String hepatitiscTestResult;
    @Column(name = "DATE_NEXT_APPOINTMENT")
    //@Temporal(TemporalType.DATE)
    private Date dateNextAppointment;
    @Size(max = 10)
    @Column(name = "VIRAL_LOAD_RESULT")
    private String viralLoadResult;
    @Column(name = "HEIGHT")
    private Double height;
    @Column(name = "TIME_STAMP")
    //@Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    //@Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;

    public Anc() {
    }

    public Anc(Long ancId) {
        this.ancId = ancId;
    }

    public Anc(Long ancId, long patientId, long facilityId, String ancNum, Date dateVisit) {
        this.ancId = ancId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.ancNum = ancNum;
        this.dateVisit = dateVisit;
    }

    public Long getAncId() {
        return ancId;
    }

    public void setAncId(Long ancId) {
        this.ancId = ancId;
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

    public String getAncNum() {
        return ancNum;
    }

    public void setAncNum(String ancNum) {
        this.ancNum = ancNum;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Date getDateEnrolledPmtct() {
        return dateEnrolledPmtct;
    }

    public void setDateEnrolledPmtct(Date dateEnrolledPmtct) {
        this.dateEnrolledPmtct = dateEnrolledPmtct;
    }

    public String getSourceReferral() {
        return sourceReferral;
    }

    public void setSourceReferral(String sourceReferral) {
        this.sourceReferral = sourceReferral;
    }

    public Date getLmp() {
        return lmp;
    }

    public void setLmp(Date lmp) {
        this.lmp = lmp;
    }

    public Date getEdd() {
        return edd;
    }

    public void setEdd(Date edd) {
        this.edd = edd;
    }

    public Integer getGestationalAge() {
        return gestationalAge;
    }

    public void setGestationalAge(Integer gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public Integer getGravida() {
        return gravida;
    }

    public void setGravida(Integer gravida) {
        this.gravida = gravida;
    }

    public Integer getParity() {
        return parity;
    }

    public void setParity(Integer parity) {
        this.parity = parity;
    }

    public String getTimeHivDiagnosis() {
        return timeHivDiagnosis;
    }

    public void setTimeHivDiagnosis(String timeHivDiagnosis) {
        this.timeHivDiagnosis = timeHivDiagnosis;
    }

    public String getArvRegimenPast() {
        return arvRegimenPast;
    }

    public void setArvRegimenPast(String arvRegimenPast) {
        this.arvRegimenPast = arvRegimenPast;
    }

    public String getArvRegimenCurrent() {
        return arvRegimenCurrent;
    }

    public void setArvRegimenCurrent(String arvRegimenCurrent) {
        this.arvRegimenCurrent = arvRegimenCurrent;
    }

    public Date getDateArvRegimenCurrent() {
        return dateArvRegimenCurrent;
    }

    public void setDateArvRegimenCurrent(Date dateArvRegimenCurrent) {
        this.dateArvRegimenCurrent = dateArvRegimenCurrent;
    }

    public String getClinicStage() {
        return clinicStage;
    }

    public void setClinicStage(String clinicStage) {
        this.clinicStage = clinicStage;
    }

    public Date getDateConfirmedHiv() {
        return dateConfirmedHiv;
    }

    public void setDateConfirmedHiv(Date dateConfirmedHiv) {
        this.dateConfirmedHiv = dateConfirmedHiv;
    }

    public String getFuncStatus() {
        return funcStatus;
    }

    public void setFuncStatus(String funcStatus) {
        this.funcStatus = funcStatus;
    }

    public Double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(Double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public String getCd4Ordered() {
        return cd4Ordered;
    }

    public void setCd4Ordered(String cd4Ordered) {
        this.cd4Ordered = cd4Ordered;
    }

    public Double getCd4() {
        return cd4;
    }

    public void setCd4(Double cd4) {
        this.cd4 = cd4;
    }

    public Integer getNumberAncVisit() {
        return numberAncVisit;
    }

    public void setNumberAncVisit(Integer numberAncVisit) {
        this.numberAncVisit = numberAncVisit;
    }

    public Date getDateCd4() {
        return dateCd4;
    }

    public void setDateCd4(Date dateCd4) {
        this.dateCd4 = dateCd4;
    }

    public String getViralLoadTestDone() {
        return viralLoadTestDone;
    }

    public void setViralLoadTestDone(String viralLoadTestDone) {
        this.viralLoadTestDone = viralLoadTestDone;
    }

    public Date getDateViralLoad() {
        return dateViralLoad;
    }

    public void setDateViralLoad(Date dateViralLoad) {
        this.dateViralLoad = dateViralLoad;
    }

    public String getSyphilisTested() {
        return syphilisTested;
    }

    public void setSyphilisTested(String syphilisTested) {
        this.syphilisTested = syphilisTested;
    }

    public String getSyphilisTestResult() {
        return syphilisTestResult;
    }

    public void setSyphilisTestResult(String syphilisTestResult) {
        this.syphilisTestResult = syphilisTestResult;
    }

    public String getSyphilisTreated() {
        return syphilisTreated;
    }

    public void setSyphilisTreated(String syphilisTreated) {
        this.syphilisTreated = syphilisTreated;
    }

    public String getHepatitisbTested() {
        return hepatitisbTested;
    }

    public void setHepatitisbTested(String hepatitisbTested) {
        this.hepatitisbTested = hepatitisbTested;
    }

    public String getHepatitisbTestResult() {
        return hepatitisbTestResult;
    }

    public void setHepatitisbTestResult(String hepatitisbTestResult) {
        this.hepatitisbTestResult = hepatitisbTestResult;
    }

    public String getHepatitiscTested() {
        return hepatitiscTested;
    }

    public void setHepatitiscTested(String hepatitiscTested) {
        this.hepatitiscTested = hepatitiscTested;
    }

    public String getHepatitiscTestResult() {
        return hepatitiscTestResult;
    }

    public void setHepatitiscTestResult(String hepatitiscTestResult) {
        this.hepatitiscTestResult = hepatitiscTestResult;
    }

    public Date getDateNextAppointment() {
        return dateNextAppointment;
    }

    public void setDateNextAppointment(Date dateNextAppointment) {
        this.dateNextAppointment = dateNextAppointment;
    }

    public String getViralLoadResult() {
        return viralLoadResult;
    }

    public void setViralLoadResult(String viralLoadResult) {
        this.viralLoadResult = viralLoadResult;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
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
        hash += (ancId != null ? ancId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anc)) {
            return false;
        }
        Anc other = (Anc) object;
        if ((this.ancId == null && other.ancId != null) || (this.ancId != null && !this.ancId.equals(other.ancId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Anc[ ancId=" + ancId + " ]";
    }
    
}
