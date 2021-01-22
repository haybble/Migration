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
@Table(name = "PHARMACY")
@NamedQueries({
    @NamedQuery(name = "Pharmacy.findAll", query = "SELECT p FROM Pharmacy p"),
    @NamedQuery(name = "Pharmacy.findByPharmacyId", query = "SELECT p FROM Pharmacy p WHERE p.pharmacyId = :pharmacyId"),
    @NamedQuery(name = "Pharmacy.findByPatientId", query = "SELECT p FROM Pharmacy p WHERE p.patientId = :patientId"),
    @NamedQuery(name = "Pharmacy.findByFacilityId", query = "SELECT p FROM Pharmacy p WHERE p.facilityId = :facilityId"),
    @NamedQuery(name = "Pharmacy.findByDateVisit", query = "SELECT p FROM Pharmacy p WHERE p.dateVisit = :dateVisit"),
    @NamedQuery(name = "Pharmacy.findByDuration", query = "SELECT p FROM Pharmacy p WHERE p.duration = :duration"),
    @NamedQuery(name = "Pharmacy.findByMorning", query = "SELECT p FROM Pharmacy p WHERE p.morning = :morning"),
    @NamedQuery(name = "Pharmacy.findByAfternoon", query = "SELECT p FROM Pharmacy p WHERE p.afternoon = :afternoon"),
    @NamedQuery(name = "Pharmacy.findByEvening", query = "SELECT p FROM Pharmacy p WHERE p.evening = :evening"),
    @NamedQuery(name = "Pharmacy.findByAdrScreened", query = "SELECT p FROM Pharmacy p WHERE p.adrScreened = :adrScreened"),
    @NamedQuery(name = "Pharmacy.findByAdrIds", query = "SELECT p FROM Pharmacy p WHERE p.adrIds = :adrIds"),
    @NamedQuery(name = "Pharmacy.findByPrescripError", query = "SELECT p FROM Pharmacy p WHERE p.prescripError = :prescripError"),
    @NamedQuery(name = "Pharmacy.findByAdherence", query = "SELECT p FROM Pharmacy p WHERE p.adherence = :adherence"),
    @NamedQuery(name = "Pharmacy.findByNextAppointment", query = "SELECT p FROM Pharmacy p WHERE p.nextAppointment = :nextAppointment"),
    @NamedQuery(name = "Pharmacy.findByRegimentypeId", query = "SELECT p FROM Pharmacy p WHERE p.regimentypeId = :regimentypeId"),
    @NamedQuery(name = "Pharmacy.findByRegimenId", query = "SELECT p FROM Pharmacy p WHERE p.regimenId = :regimenId"),
    @NamedQuery(name = "Pharmacy.findByRegimendrugId", query = "SELECT p FROM Pharmacy p WHERE p.regimendrugId = :regimendrugId"),
    @NamedQuery(name = "Pharmacy.findByTimeStamp", query = "SELECT p FROM Pharmacy p WHERE p.timeStamp = :timeStamp"),
    @NamedQuery(name = "Pharmacy.findByUploaded", query = "SELECT p FROM Pharmacy p WHERE p.uploaded = :uploaded"),
    @NamedQuery(name = "Pharmacy.findByTimeUploaded", query = "SELECT p FROM Pharmacy p WHERE p.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Pharmacy.findByUserId", query = "SELECT p FROM Pharmacy p WHERE p.userId = :userId"),
    @NamedQuery(name = "Pharmacy.findByIdUuid", query = "SELECT p FROM Pharmacy p WHERE p.idUuid = :idUuid"),
    @NamedQuery(name = "Pharmacy.findByDmocType", query = "SELECT p FROM Pharmacy p WHERE p.dmocType = :dmocType"),
    @NamedQuery(name = "Pharmacy.findByUuid", query = "SELECT p FROM Pharmacy p WHERE p.uuid = :uuid")})
public class Pharmacy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PHARMACY_ID")
    private Long pharmacyId;
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
    //@Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Column(name = "DURATION")
    private Integer duration;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MORNING")
    private Double morning;
    @Column(name = "AFTERNOON")
    private Double afternoon;
    @Column(name = "EVENING")
    private Double evening;
    @Size(max = 5)
    @Column(name = "ADR_SCREENED")
    private String adrScreened;
    @Size(max = 100)
    @Column(name = "ADR_IDS")
    private String adrIds;
    @Column(name = "PRESCRIP_ERROR")
    private Integer prescripError;
    @Column(name = "ADHERENCE")
    private Integer adherence;
    @Column(name = "NEXT_APPOINTMENT")
   // @Temporal(TemporalType.DATE)
    private Date nextAppointment;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REGIMENTYPE_ID")
    private long regimentypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REGIMEN_ID")
    private long regimenId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REGIMENDRUG_ID")
    private long regimendrugId;
    @Column(name = "TIME_STAMP")
   // @Temporal(TemporalType.TIMESTAMP)
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
    @Size(max = 45)
    @Column(name = "DMOC_TYPE")
    private String dmocType;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;

    public Pharmacy() {
    }

    public Pharmacy(Long pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public Pharmacy(Long pharmacyId, long patientId, long facilityId, Date dateVisit, long regimentypeId, long regimenId, long regimendrugId) {
        this.pharmacyId = pharmacyId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateVisit = dateVisit;
        this.regimentypeId = regimentypeId;
        this.regimenId = regimenId;
        this.regimendrugId = regimendrugId;
    }

    public Long getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(Long pharmacyId) {
        this.pharmacyId = pharmacyId;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getMorning() {
        return morning;
    }

    public void setMorning(Double morning) {
        this.morning = morning;
    }

    public Double getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(Double afternoon) {
        this.afternoon = afternoon;
    }

    public Double getEvening() {
        return evening;
    }

    public void setEvening(Double evening) {
        this.evening = evening;
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

    public Integer getPrescripError() {
        return prescripError;
    }

    public void setPrescripError(Integer prescripError) {
        this.prescripError = prescripError;
    }

    public Integer getAdherence() {
        return adherence;
    }

    public void setAdherence(Integer adherence) {
        this.adherence = adherence;
    }

    public Date getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(Date nextAppointment) {
        this.nextAppointment = nextAppointment;
    }

    public long getRegimentypeId() {
        return regimentypeId;
    }

    public void setRegimentypeId(long regimentypeId) {
        this.regimentypeId = regimentypeId;
    }

    public long getRegimenId() {
        return regimenId;
    }

    public void setRegimenId(long regimenId) {
        this.regimenId = regimenId;
    }

    public long getRegimendrugId() {
        return regimendrugId;
    }

    public void setRegimendrugId(long regimendrugId) {
        this.regimendrugId = regimendrugId;
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

    public String getDmocType() {
        return dmocType;
    }

    public void setDmocType(String dmocType) {
        this.dmocType = dmocType;
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
        hash += (pharmacyId != null ? pharmacyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pharmacy)) {
            return false;
        }
        Pharmacy other = (Pharmacy) object;
        if ((this.pharmacyId == null && other.pharmacyId != null) || (this.pharmacyId != null && !this.pharmacyId.equals(other.pharmacyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Pharmacy[ pharmacyId=" + pharmacyId + " ]";
    }
    
}
