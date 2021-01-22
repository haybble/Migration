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
@Table(name = "MATERNALFOLLOWUP")
@NamedQueries({
    @NamedQuery(name = "Maternalfollowup.findAll", query = "SELECT m FROM Maternalfollowup m"),
    @NamedQuery(name = "Maternalfollowup.findByMaternalfollowupId", query = "SELECT m FROM Maternalfollowup m WHERE m.maternalfollowupId = :maternalfollowupId"),
    @NamedQuery(name = "Maternalfollowup.findByPatientId", query = "SELECT m FROM Maternalfollowup m WHERE m.patientId = :patientId"),
    @NamedQuery(name = "Maternalfollowup.findByFacilityId", query = "SELECT m FROM Maternalfollowup m WHERE m.facilityId = :facilityId"),
    @NamedQuery(name = "Maternalfollowup.findByDateVisit", query = "SELECT m FROM Maternalfollowup m WHERE m.dateVisit = :dateVisit"),
    @NamedQuery(name = "Maternalfollowup.findByAncId", query = "SELECT m FROM Maternalfollowup m WHERE m.ancId = :ancId"),
    @NamedQuery(name = "Maternalfollowup.findByBodyWeight", query = "SELECT m FROM Maternalfollowup m WHERE m.bodyWeight = :bodyWeight"),
    @NamedQuery(name = "Maternalfollowup.findByBp", query = "SELECT m FROM Maternalfollowup m WHERE m.bp = :bp"),
    @NamedQuery(name = "Maternalfollowup.findByFundalHeight", query = "SELECT m FROM Maternalfollowup m WHERE m.fundalHeight = :fundalHeight"),
    @NamedQuery(name = "Maternalfollowup.findByFetalPresentation", query = "SELECT m FROM Maternalfollowup m WHERE m.fetalPresentation = :fetalPresentation"),
    @NamedQuery(name = "Maternalfollowup.findByDateConfirmedHiv", query = "SELECT m FROM Maternalfollowup m WHERE m.dateConfirmedHiv = :dateConfirmedHiv"),
    @NamedQuery(name = "Maternalfollowup.findByTimeHivDiagnosis", query = "SELECT m FROM Maternalfollowup m WHERE m.timeHivDiagnosis = :timeHivDiagnosis"),
    @NamedQuery(name = "Maternalfollowup.findByArvRegimenPast", query = "SELECT m FROM Maternalfollowup m WHERE m.arvRegimenPast = :arvRegimenPast"),
    @NamedQuery(name = "Maternalfollowup.findByArvRegimenCurrent", query = "SELECT m FROM Maternalfollowup m WHERE m.arvRegimenCurrent = :arvRegimenCurrent"),
    @NamedQuery(name = "Maternalfollowup.findByDateArvRegimenCurrent", query = "SELECT m FROM Maternalfollowup m WHERE m.dateArvRegimenCurrent = :dateArvRegimenCurrent"),
    @NamedQuery(name = "Maternalfollowup.findByScreenPostPartum", query = "SELECT m FROM Maternalfollowup m WHERE m.screenPostPartum = :screenPostPartum"),
    @NamedQuery(name = "Maternalfollowup.findBySyphilisTested", query = "SELECT m FROM Maternalfollowup m WHERE m.syphilisTested = :syphilisTested"),
    @NamedQuery(name = "Maternalfollowup.findBySyphilisTestResult", query = "SELECT m FROM Maternalfollowup m WHERE m.syphilisTestResult = :syphilisTestResult"),
    @NamedQuery(name = "Maternalfollowup.findBySyphilisTreated", query = "SELECT m FROM Maternalfollowup m WHERE m.syphilisTreated = :syphilisTreated"),
    @NamedQuery(name = "Maternalfollowup.findByCd4Ordered", query = "SELECT m FROM Maternalfollowup m WHERE m.cd4Ordered = :cd4Ordered"),
    @NamedQuery(name = "Maternalfollowup.findByCd4", query = "SELECT m FROM Maternalfollowup m WHERE m.cd4 = :cd4"),
    @NamedQuery(name = "Maternalfollowup.findByGestationalAge", query = "SELECT m FROM Maternalfollowup m WHERE m.gestationalAge = :gestationalAge"),
    @NamedQuery(name = "Maternalfollowup.findByViralLoadCollected", query = "SELECT m FROM Maternalfollowup m WHERE m.viralLoadCollected = :viralLoadCollected"),
    @NamedQuery(name = "Maternalfollowup.findByVisitStatus", query = "SELECT m FROM Maternalfollowup m WHERE m.visitStatus = :visitStatus"),
    @NamedQuery(name = "Maternalfollowup.findByDateSampleCollected", query = "SELECT m FROM Maternalfollowup m WHERE m.dateSampleCollected = :dateSampleCollected"),
    @NamedQuery(name = "Maternalfollowup.findByTbStatus", query = "SELECT m FROM Maternalfollowup m WHERE m.tbStatus = :tbStatus"),
    @NamedQuery(name = "Maternalfollowup.findByTypeOfVisit", query = "SELECT m FROM Maternalfollowup m WHERE m.typeOfVisit = :typeOfVisit"),
    @NamedQuery(name = "Maternalfollowup.findByCounselNutrition", query = "SELECT m FROM Maternalfollowup m WHERE m.counselNutrition = :counselNutrition"),
    @NamedQuery(name = "Maternalfollowup.findByCounselFeeding", query = "SELECT m FROM Maternalfollowup m WHERE m.counselFeeding = :counselFeeding"),
    @NamedQuery(name = "Maternalfollowup.findByCounselFamilyPlanning", query = "SELECT m FROM Maternalfollowup m WHERE m.counselFamilyPlanning = :counselFamilyPlanning"),
    @NamedQuery(name = "Maternalfollowup.findByFamilyPlanningMethod", query = "SELECT m FROM Maternalfollowup m WHERE m.familyPlanningMethod = :familyPlanningMethod"),
    @NamedQuery(name = "Maternalfollowup.findByReferred", query = "SELECT m FROM Maternalfollowup m WHERE m.referred = :referred"),
    @NamedQuery(name = "Maternalfollowup.findByDateNextVisit", query = "SELECT m FROM Maternalfollowup m WHERE m.dateNextVisit = :dateNextVisit"),
    @NamedQuery(name = "Maternalfollowup.findByTimeStamp", query = "SELECT m FROM Maternalfollowup m WHERE m.timeStamp = :timeStamp"),
    @NamedQuery(name = "Maternalfollowup.findByUploaded", query = "SELECT m FROM Maternalfollowup m WHERE m.uploaded = :uploaded"),
    @NamedQuery(name = "Maternalfollowup.findByTimeUploaded", query = "SELECT m FROM Maternalfollowup m WHERE m.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Maternalfollowup.findByUserId", query = "SELECT m FROM Maternalfollowup m WHERE m.userId = :userId"),
    @NamedQuery(name = "Maternalfollowup.findByIdUuid", query = "SELECT m FROM Maternalfollowup m WHERE m.idUuid = :idUuid"),
    @NamedQuery(name = "Maternalfollowup.findByUuid", query = "SELECT m FROM Maternalfollowup m WHERE m.uuid = :uuid")})
public class Maternalfollowup implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MATERNALFOLLOWUP_ID")
    private Long maternalfollowupId;
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
    @Column(name = "ANC_ID")
    private BigInteger ancId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "BODY_WEIGHT")
    private Double bodyWeight;
    @Size(max = 7)
    @Column(name = "BP")
    private String bp;
    @Column(name = "FUNDAL_HEIGHT")
    private Double fundalHeight;
    @Size(max = 25)
    @Column(name = "FETAL_PRESENTATION")
    private String fetalPresentation;
    @Column(name = "DATE_CONFIRMED_HIV")
    @Temporal(TemporalType.DATE)
    private Date dateConfirmedHiv;
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
    @Temporal(TemporalType.DATE)
    private Date dateArvRegimenCurrent;
    @Column(name = "SCREEN_POST_PARTUM")
    private Integer screenPostPartum;
    @Size(max = 7)
    @Column(name = "SYPHILIS_TESTED")
    private String syphilisTested;
    @Size(max = 45)
    @Column(name = "SYPHILIS_TEST_RESULT")
    private String syphilisTestResult;
    @Size(max = 7)
    @Column(name = "SYPHILIS_TREATED")
    private String syphilisTreated;
    @Size(max = 45)
    @Column(name = "CD4_ORDERED")
    private String cd4Ordered;
    @Column(name = "CD4")
    private Double cd4;
    @Size(max = 120)
    @Column(name = "GESTATIONAL_AGE")
    private String gestationalAge;
    @Size(max = 10)
    @Column(name = "VIRAL_LOAD_COLLECTED")
    private String viralLoadCollected;
    @Size(max = 120)
    @Column(name = "VISIT_STATUS")
    private String visitStatus;
    @Column(name = "DATE_SAMPLE_COLLECTED")
    @Temporal(TemporalType.DATE)
    private Date dateSampleCollected;
    @Size(max = 120)
    @Column(name = "TB_STATUS")
    private String tbStatus;
    @Size(max = 10)
    @Column(name = "TYPE_OF_VISIT")
    private String typeOfVisit;
    @Column(name = "COUNSEL_NUTRITION")
    private Integer counselNutrition;
    @Column(name = "COUNSEL_FEEDING")
    private Integer counselFeeding;
    @Column(name = "COUNSEL_FAMILY_PLANNING")
    private Integer counselFamilyPlanning;
    @Size(max = 45)
    @Column(name = "FAMILY_PLANNING_METHOD")
    private String familyPlanningMethod;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "USER_ID")
    private long userId;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;

    public Maternalfollowup() {
    }

    public Maternalfollowup(Long maternalfollowupId) {
        this.maternalfollowupId = maternalfollowupId;
    }

    public Maternalfollowup(Long maternalfollowupId, long patientId, long facilityId, Date dateVisit, long userId) {
        this.maternalfollowupId = maternalfollowupId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateVisit = dateVisit;
        this.userId = userId;
    }

    public Long getMaternalfollowupId() {
        return maternalfollowupId;
    }

    public void setMaternalfollowupId(Long maternalfollowupId) {
        this.maternalfollowupId = maternalfollowupId;
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

    public BigInteger getAncId() {
        return ancId;
    }

    public void setAncId(BigInteger ancId) {
        this.ancId = ancId;
    }

    public Double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyWeight(Double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public Double getFundalHeight() {
        return fundalHeight;
    }

    public void setFundalHeight(Double fundalHeight) {
        this.fundalHeight = fundalHeight;
    }

    public String getFetalPresentation() {
        return fetalPresentation;
    }

    public void setFetalPresentation(String fetalPresentation) {
        this.fetalPresentation = fetalPresentation;
    }

    public Date getDateConfirmedHiv() {
        return dateConfirmedHiv;
    }

    public void setDateConfirmedHiv(Date dateConfirmedHiv) {
        this.dateConfirmedHiv = dateConfirmedHiv;
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

    public Integer getScreenPostPartum() {
        return screenPostPartum;
    }

    public void setScreenPostPartum(Integer screenPostPartum) {
        this.screenPostPartum = screenPostPartum;
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

    public String getGestationalAge() {
        return gestationalAge;
    }

    public void setGestationalAge(String gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public String getViralLoadCollected() {
        return viralLoadCollected;
    }

    public void setViralLoadCollected(String viralLoadCollected) {
        this.viralLoadCollected = viralLoadCollected;
    }

    public String getVisitStatus() {
        return visitStatus;
    }

    public void setVisitStatus(String visitStatus) {
        this.visitStatus = visitStatus;
    }

    public Date getDateSampleCollected() {
        return dateSampleCollected;
    }

    public void setDateSampleCollected(Date dateSampleCollected) {
        this.dateSampleCollected = dateSampleCollected;
    }

    public String getTbStatus() {
        return tbStatus;
    }

    public void setTbStatus(String tbStatus) {
        this.tbStatus = tbStatus;
    }

    public String getTypeOfVisit() {
        return typeOfVisit;
    }

    public void setTypeOfVisit(String typeOfVisit) {
        this.typeOfVisit = typeOfVisit;
    }

    public Integer getCounselNutrition() {
        return counselNutrition;
    }

    public void setCounselNutrition(Integer counselNutrition) {
        this.counselNutrition = counselNutrition;
    }

    public Integer getCounselFeeding() {
        return counselFeeding;
    }

    public void setCounselFeeding(Integer counselFeeding) {
        this.counselFeeding = counselFeeding;
    }

    public Integer getCounselFamilyPlanning() {
        return counselFamilyPlanning;
    }

    public void setCounselFamilyPlanning(Integer counselFamilyPlanning) {
        this.counselFamilyPlanning = counselFamilyPlanning;
    }

    public String getFamilyPlanningMethod() {
        return familyPlanningMethod;
    }

    public void setFamilyPlanningMethod(String familyPlanningMethod) {
        this.familyPlanningMethod = familyPlanningMethod;
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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maternalfollowupId != null ? maternalfollowupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maternalfollowup)) {
            return false;
        }
        Maternalfollowup other = (Maternalfollowup) object;
        if ((this.maternalfollowupId == null && other.maternalfollowupId != null) || (this.maternalfollowupId != null && !this.maternalfollowupId.equals(other.maternalfollowupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Maternalfollowup[ maternalfollowupId=" + maternalfollowupId + " ]";
    }
    
}
