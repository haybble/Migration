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
@Table(name = "CLINIC")
@NamedQueries({
    @NamedQuery(name = "Clinic.findAll", query = "SELECT c FROM Clinic c"),
    @NamedQuery(name = "Clinic.findByClinicId", query = "SELECT c FROM Clinic c WHERE c.clinicId = :clinicId"),
    @NamedQuery(name = "Clinic.findByPatientId", query = "SELECT c FROM Clinic c WHERE c.patientId = :patientId"),
    @NamedQuery(name = "Clinic.findByFacilityId", query = "SELECT c FROM Clinic c WHERE c.facilityId = :facilityId"),
    @NamedQuery(name = "Clinic.findByDateVisit", query = "SELECT c FROM Clinic c WHERE c.dateVisit = :dateVisit"),
    @NamedQuery(name = "Clinic.findByClinicStage", query = "SELECT c FROM Clinic c WHERE c.clinicStage = :clinicStage"),
    @NamedQuery(name = "Clinic.findByFuncStatus", query = "SELECT c FROM Clinic c WHERE c.funcStatus = :funcStatus"),
    @NamedQuery(name = "Clinic.findByTbStatus", query = "SELECT c FROM Clinic c WHERE c.tbStatus = :tbStatus"),
    @NamedQuery(name = "Clinic.findByViralLoad", query = "SELECT c FROM Clinic c WHERE c.viralLoad = :viralLoad"),
    @NamedQuery(name = "Clinic.findByCd4", query = "SELECT c FROM Clinic c WHERE c.cd4 = :cd4"),
    @NamedQuery(name = "Clinic.findByCd4p", query = "SELECT c FROM Clinic c WHERE c.cd4p = :cd4p"),
    @NamedQuery(name = "Clinic.findByRegimentype", query = "SELECT c FROM Clinic c WHERE c.regimentype = :regimentype"),
    @NamedQuery(name = "Clinic.findByRegimen", query = "SELECT c FROM Clinic c WHERE c.regimen = :regimen"),
    @NamedQuery(name = "Clinic.findByBodyWeight", query = "SELECT c FROM Clinic c WHERE c.bodyWeight = :bodyWeight"),
    @NamedQuery(name = "Clinic.findByHeight", query = "SELECT c FROM Clinic c WHERE c.height = :height"),
    @NamedQuery(name = "Clinic.findByWaist", query = "SELECT c FROM Clinic c WHERE c.waist = :waist"),
    @NamedQuery(name = "Clinic.findByBp", query = "SELECT c FROM Clinic c WHERE c.bp = :bp"),
    @NamedQuery(name = "Clinic.findByPregnant", query = "SELECT c FROM Clinic c WHERE c.pregnant = :pregnant"),
    @NamedQuery(name = "Clinic.findByLmp", query = "SELECT c FROM Clinic c WHERE c.lmp = :lmp"),
    @NamedQuery(name = "Clinic.findByBreastfeeding", query = "SELECT c FROM Clinic c WHERE c.breastfeeding = :breastfeeding"),
    @NamedQuery(name = "Clinic.findByOiScreened", query = "SELECT c FROM Clinic c WHERE c.oiScreened = :oiScreened"),
    @NamedQuery(name = "Clinic.findByOiIds", query = "SELECT c FROM Clinic c WHERE c.oiIds = :oiIds"),
    @NamedQuery(name = "Clinic.findByAdrScreened", query = "SELECT c FROM Clinic c WHERE c.adrScreened = :adrScreened"),
    @NamedQuery(name = "Clinic.findByAdrIds", query = "SELECT c FROM Clinic c WHERE c.adrIds = :adrIds"),
    @NamedQuery(name = "Clinic.findByAdherenceLevel", query = "SELECT c FROM Clinic c WHERE c.adherenceLevel = :adherenceLevel"),
    @NamedQuery(name = "Clinic.findByAdhereIds", query = "SELECT c FROM Clinic c WHERE c.adhereIds = :adhereIds"),
    @NamedQuery(name = "Clinic.findByCommence", query = "SELECT c FROM Clinic c WHERE c.commence = :commence"),
    @NamedQuery(name = "Clinic.findByNextAppointment", query = "SELECT c FROM Clinic c WHERE c.nextAppointment = :nextAppointment"),
    @NamedQuery(name = "Clinic.findByNotes", query = "SELECT c FROM Clinic c WHERE c.notes = :notes"),
    @NamedQuery(name = "Clinic.findByTimeStamp", query = "SELECT c FROM Clinic c WHERE c.timeStamp = :timeStamp"),
    @NamedQuery(name = "Clinic.findByUploaded", query = "SELECT c FROM Clinic c WHERE c.uploaded = :uploaded"),
    @NamedQuery(name = "Clinic.findByTimeUploaded", query = "SELECT c FROM Clinic c WHERE c.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Clinic.findByUserId", query = "SELECT c FROM Clinic c WHERE c.userId = :userId"),
    @NamedQuery(name = "Clinic.findByStiTreated", query = "SELECT c FROM Clinic c WHERE c.stiTreated = :stiTreated"),
    @NamedQuery(name = "Clinic.findByGestationalAge", query = "SELECT c FROM Clinic c WHERE c.gestationalAge = :gestationalAge"),
    @NamedQuery(name = "Clinic.findByMaternalStatusArt", query = "SELECT c FROM Clinic c WHERE c.maternalStatusArt = :maternalStatusArt"),
    @NamedQuery(name = "Clinic.findByStiIds", query = "SELECT c FROM Clinic c WHERE c.stiIds = :stiIds"),
    @NamedQuery(name = "Clinic.findByIdUuid", query = "SELECT c FROM Clinic c WHERE c.idUuid = :idUuid"),
    @NamedQuery(name = "Clinic.findByUuid", query = "SELECT c FROM Clinic c WHERE c.uuid = :uuid"),
    @NamedQuery(name = "Clinic.findByDeviceconfigId", query = "SELECT c FROM Clinic c WHERE c.deviceconfigId = :deviceconfigId")})
public class Clinic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CLINIC_ID")
    private Long clinicId;
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
    @Size(max = 15)
    @Column(name = "CLINIC_STAGE")
    private String clinicStage;
    @Size(max = 15)
    @Column(name = "FUNC_STATUS")
    private String funcStatus;
    @Size(max = 75)
    @Column(name = "TB_STATUS")
    private String tbStatus;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VIRAL_LOAD")
    private Double viralLoad;
    @Column(name = "CD4")
    private Double cd4;
    @Column(name = "CD4P")
    private Double cd4p;
    @Size(max = 100)
    @Column(name = "REGIMENTYPE")
    private String regimentype;
    @Size(max = 100)
    @Column(name = "REGIMEN")
    private String regimen;
    @Column(name = "BODY_WEIGHT")
    private Double bodyWeight;
    @Column(name = "HEIGHT")
    private Double height;
    @Column(name = "WAIST")
    private Double waist;
    @Size(max = 7)
    @Column(name = "BP")
    private String bp;
    @Column(name = "PREGNANT")
    private Integer pregnant;
    @Column(name = "LMP")
    @Temporal(TemporalType.DATE)
    private Date lmp;
    @Column(name = "BREASTFEEDING")
    private Integer breastfeeding;
    @Size(max = 5)
    @Column(name = "OI_SCREENED")
    private String oiScreened;
    @Size(max = 50)
    @Column(name = "OI_IDS")
    private String oiIds;
    @Size(max = 5)
    @Column(name = "ADR_SCREENED")
    private String adrScreened;
    @Size(max = 100)
    @Column(name = "ADR_IDS")
    private String adrIds;
    @Size(max = 15)
    @Column(name = "ADHERENCE_LEVEL")
    private String adherenceLevel;
    @Size(max = 50)
    @Column(name = "ADHERE_IDS")
    private String adhereIds;
    @Column(name = "COMMENCE")
    private Integer commence;
    @Column(name = "NEXT_APPOINTMENT")
    @Temporal(TemporalType.DATE)
    private Date nextAppointment;
    @Size(max = 500)
    @Column(name = "NOTES")
    private String notes;
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
    @Size(max = 10)
    @Column(name = "STI_TREATED")
    private String stiTreated;
    @Size(max = 90)
    @Column(name = "GESTATIONAL_AGE")
    private String gestationalAge;
    @Size(max = 90)
    @Column(name = "MATERNAL_STATUS_ART")
    private String maternalStatusArt;
    @Size(max = 50)
    @Column(name = "STI_IDS")
    private String stiIds;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;
    @Column(name = "DEVICECONFIG_ID")
    private BigInteger deviceconfigId;

    public Clinic() {
    }

    public Clinic(Long clinicId) {
        this.clinicId = clinicId;
    }

    public Clinic(Long clinicId, long patientId, long facilityId, Date dateVisit) {
        this.clinicId = clinicId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateVisit = dateVisit;
    }

    public Long getClinicId() {
        return clinicId;
    }

    public void setClinicId(Long clinicId) {
        this.clinicId = clinicId;
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

    public String getClinicStage() {
        return clinicStage;
    }

    public void setClinicStage(String clinicStage) {
        this.clinicStage = clinicStage;
    }

    public String getFuncStatus() {
        return funcStatus;
    }

    public void setFuncStatus(String funcStatus) {
        this.funcStatus = funcStatus;
    }

    public String getTbStatus() {
        return tbStatus;
    }

    public void setTbStatus(String tbStatus) {
        this.tbStatus = tbStatus;
    }

    public Double getViralLoad() {
        return viralLoad;
    }

    public void setViralLoad(Double viralLoad) {
        this.viralLoad = viralLoad;
    }

    public Double getCd4() {
        return cd4;
    }

    public void setCd4(Double cd4) {
        this.cd4 = cd4;
    }

    public Double getCd4p() {
        return cd4p;
    }

    public void setCd4p(Double cd4p) {
        this.cd4p = cd4p;
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

    public Double getWaist() {
        return waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public String getBp() {
        return bp;
    }

    public void setBp(String bp) {
        this.bp = bp;
    }

    public Integer getPregnant() {
        return pregnant;
    }

    public void setPregnant(Integer pregnant) {
        this.pregnant = pregnant;
    }

    public Date getLmp() {
        return lmp;
    }

    public void setLmp(Date lmp) {
        this.lmp = lmp;
    }

    public Integer getBreastfeeding() {
        return breastfeeding;
    }

    public void setBreastfeeding(Integer breastfeeding) {
        this.breastfeeding = breastfeeding;
    }

    public String getOiScreened() {
        return oiScreened;
    }

    public void setOiScreened(String oiScreened) {
        this.oiScreened = oiScreened;
    }

    public String getOiIds() {
        return oiIds;
    }

    public void setOiIds(String oiIds) {
        this.oiIds = oiIds;
    }

    public String getAdrScreened() {
        return adrScreened;
    }

    public void setAdrScreened(String adrScreened) {
        this.adrScreened = adrScreened;
    }

    public String getAdrIds() {
        return adrIds;
    }

    public void setAdrIds(String adrIds) {
        this.adrIds = adrIds;
    }

    public String getAdherenceLevel() {
        return adherenceLevel;
    }

    public void setAdherenceLevel(String adherenceLevel) {
        this.adherenceLevel = adherenceLevel;
    }

    public String getAdhereIds() {
        return adhereIds;
    }

    public void setAdhereIds(String adhereIds) {
        this.adhereIds = adhereIds;
    }

    public Integer getCommence() {
        return commence;
    }

    public void setCommence(Integer commence) {
        this.commence = commence;
    }

    public Date getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(Date nextAppointment) {
        this.nextAppointment = nextAppointment;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public String getStiTreated() {
        return stiTreated;
    }

    public void setStiTreated(String stiTreated) {
        this.stiTreated = stiTreated;
    }

    public String getGestationalAge() {
        return gestationalAge;
    }

    public void setGestationalAge(String gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public String getMaternalStatusArt() {
        return maternalStatusArt;
    }

    public void setMaternalStatusArt(String maternalStatusArt) {
        this.maternalStatusArt = maternalStatusArt;
    }

    public String getStiIds() {
        return stiIds;
    }

    public void setStiIds(String stiIds) {
        this.stiIds = stiIds;
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

    public BigInteger getDeviceconfigId() {
        return deviceconfigId;
    }

    public void setDeviceconfigId(BigInteger deviceconfigId) {
        this.deviceconfigId = deviceconfigId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clinicId != null ? clinicId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clinic)) {
            return false;
        }
        Clinic other = (Clinic) object;
        if ((this.clinicId == null && other.clinicId != null) || (this.clinicId != null && !this.clinicId.equals(other.clinicId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Clinic[ clinicId=" + clinicId + " ]";
    }
    
}
