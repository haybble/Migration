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
@Table(name = "DEVOLVE")
@NamedQueries({
    @NamedQuery(name = "Devolve.findAll", query = "SELECT d FROM Devolve d"),
    @NamedQuery(name = "Devolve.findByDevolveId", query = "SELECT d FROM Devolve d WHERE d.devolveId = :devolveId"),
    @NamedQuery(name = "Devolve.findByFacilityId", query = "SELECT d FROM Devolve d WHERE d.facilityId = :facilityId"),
    @NamedQuery(name = "Devolve.findByCommunitypharmId", query = "SELECT d FROM Devolve d WHERE d.communitypharmId = :communitypharmId"),
    @NamedQuery(name = "Devolve.findByDateDevolved", query = "SELECT d FROM Devolve d WHERE d.dateDevolved = :dateDevolved"),
    @NamedQuery(name = "Devolve.findByTypeDmoc", query = "SELECT d FROM Devolve d WHERE d.typeDmoc = :typeDmoc"),
    @NamedQuery(name = "Devolve.findByViralLoadAssessed", query = "SELECT d FROM Devolve d WHERE d.viralLoadAssessed = :viralLoadAssessed"),
    @NamedQuery(name = "Devolve.findByLastViralLoad", query = "SELECT d FROM Devolve d WHERE d.lastViralLoad = :lastViralLoad"),
    @NamedQuery(name = "Devolve.findByDateLastViralLoad", query = "SELECT d FROM Devolve d WHERE d.dateLastViralLoad = :dateLastViralLoad"),
    @NamedQuery(name = "Devolve.findByCd4Assessed", query = "SELECT d FROM Devolve d WHERE d.cd4Assessed = :cd4Assessed"),
    @NamedQuery(name = "Devolve.findByLastCd4", query = "SELECT d FROM Devolve d WHERE d.lastCd4 = :lastCd4"),
    @NamedQuery(name = "Devolve.findByDateLastCd4", query = "SELECT d FROM Devolve d WHERE d.dateLastCd4 = :dateLastCd4"),
    @NamedQuery(name = "Devolve.findByLastClinicStage", query = "SELECT d FROM Devolve d WHERE d.lastClinicStage = :lastClinicStage"),
    @NamedQuery(name = "Devolve.findByDateLastClinicStage", query = "SELECT d FROM Devolve d WHERE d.dateLastClinicStage = :dateLastClinicStage"),
    @NamedQuery(name = "Devolve.findByArvDispensed", query = "SELECT d FROM Devolve d WHERE d.arvDispensed = :arvDispensed"),
    @NamedQuery(name = "Devolve.findByRegimentype", query = "SELECT d FROM Devolve d WHERE d.regimentype = :regimentype"),
    @NamedQuery(name = "Devolve.findByRegimen", query = "SELECT d FROM Devolve d WHERE d.regimen = :regimen"),
    @NamedQuery(name = "Devolve.findByDateNextClinic", query = "SELECT d FROM Devolve d WHERE d.dateNextClinic = :dateNextClinic"),
    @NamedQuery(name = "Devolve.findByDateNextRefill", query = "SELECT d FROM Devolve d WHERE d.dateNextRefill = :dateNextRefill"),
    @NamedQuery(name = "Devolve.findByDateLastClinic", query = "SELECT d FROM Devolve d WHERE d.dateLastClinic = :dateLastClinic"),
    @NamedQuery(name = "Devolve.findByDateLastRefill", query = "SELECT d FROM Devolve d WHERE d.dateLastRefill = :dateLastRefill"),
    @NamedQuery(name = "Devolve.findByNotes", query = "SELECT d FROM Devolve d WHERE d.notes = :notes"),
    @NamedQuery(name = "Devolve.findByDateDiscontinued", query = "SELECT d FROM Devolve d WHERE d.dateDiscontinued = :dateDiscontinued"),
    @NamedQuery(name = "Devolve.findByReasonDiscontinued", query = "SELECT d FROM Devolve d WHERE d.reasonDiscontinued = :reasonDiscontinued"),
    @NamedQuery(name = "Devolve.findByTimeStamp", query = "SELECT d FROM Devolve d WHERE d.timeStamp = :timeStamp"),
    @NamedQuery(name = "Devolve.findByUploaded", query = "SELECT d FROM Devolve d WHERE d.uploaded = :uploaded"),
    @NamedQuery(name = "Devolve.findByTimeUploaded", query = "SELECT d FROM Devolve d WHERE d.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Devolve.findByUserId", query = "SELECT d FROM Devolve d WHERE d.userId = :userId"),
    @NamedQuery(name = "Devolve.findByIdUuid", query = "SELECT d FROM Devolve d WHERE d.idUuid = :idUuid"),
    @NamedQuery(name = "Devolve.findByUuid", query = "SELECT d FROM Devolve d WHERE d.uuid = :uuid")})
public class Devolve implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DEVOLVE_ID")
    private Long devolveId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Column(name = "COMMUNITYPHARM_ID")
    private BigInteger communitypharmId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_DEVOLVED")
    @Temporal(TemporalType.DATE)
    private Date dateDevolved;
    @Size(max = 15)
    @Column(name = "TYPE_DMOC")
    private String typeDmoc;
    @Size(max = 5)
    @Column(name = "VIRAL_LOAD_ASSESSED")
    private String viralLoadAssessed;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LAST_VIRAL_LOAD")
    private Double lastViralLoad;
    @Column(name = "DATE_LAST_VIRAL_LOAD")
    @Temporal(TemporalType.DATE)
    private Date dateLastViralLoad;
    @Size(max = 5)
    @Column(name = "CD4_ASSESSED")
    private String cd4Assessed;
    @Column(name = "LAST_CD4")
    private Double lastCd4;
    @Column(name = "DATE_LAST_CD4")
    @Temporal(TemporalType.DATE)
    private Date dateLastCd4;
    @Size(max = 15)
    @Column(name = "LAST_CLINIC_STAGE")
    private String lastClinicStage;
    @Column(name = "DATE_LAST_CLINIC_STAGE")
    @Temporal(TemporalType.DATE)
    private Date dateLastClinicStage;
    @Size(max = 5)
    @Column(name = "ARV_DISPENSED")
    private String arvDispensed;
    @Size(max = 100)
    @Column(name = "REGIMENTYPE")
    private String regimentype;
    @Size(max = 100)
    @Column(name = "REGIMEN")
    private String regimen;
    @Column(name = "DATE_NEXT_CLINIC")
    @Temporal(TemporalType.DATE)
    private Date dateNextClinic;
    @Column(name = "DATE_NEXT_REFILL")
    @Temporal(TemporalType.DATE)
    private Date dateNextRefill;
    @Column(name = "DATE_LAST_CLINIC")
    @Temporal(TemporalType.DATE)
    private Date dateLastClinic;
    @Column(name = "DATE_LAST_REFILL")
    @Temporal(TemporalType.DATE)
    private Date dateLastRefill;
    @Size(max = 500)
    @Column(name = "NOTES")
    private String notes;
    @Column(name = "DATE_DISCONTINUED")
    @Temporal(TemporalType.DATE)
    private Date dateDiscontinued;
    @Size(max = 25)
    @Column(name = "REASON_DISCONTINUED")
    private String reasonDiscontinued;
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
    @JoinColumn(name = "PATIENT_ID", referencedColumnName = "PATIENT_ID")
    @ManyToOne(optional = false)
    private Patient patientId;

    public Devolve() {
    }

    public Devolve(Long devolveId) {
        this.devolveId = devolveId;
    }

    public Devolve(Long devolveId, long facilityId, Date dateDevolved) {
        this.devolveId = devolveId;
        this.facilityId = facilityId;
        this.dateDevolved = dateDevolved;
    }

    public Long getDevolveId() {
        return devolveId;
    }

    public void setDevolveId(Long devolveId) {
        this.devolveId = devolveId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public BigInteger getCommunitypharmId() {
        return communitypharmId;
    }

    public void setCommunitypharmId(BigInteger communitypharmId) {
        this.communitypharmId = communitypharmId;
    }

    public Date getDateDevolved() {
        return dateDevolved;
    }

    public void setDateDevolved(Date dateDevolved) {
        this.dateDevolved = dateDevolved;
    }

    public String getTypeDmoc() {
        return typeDmoc;
    }

    public void setTypeDmoc(String typeDmoc) {
        this.typeDmoc = typeDmoc;
    }

    public String getViralLoadAssessed() {
        return viralLoadAssessed;
    }

    public void setViralLoadAssessed(String viralLoadAssessed) {
        this.viralLoadAssessed = viralLoadAssessed;
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

    public String getCd4Assessed() {
        return cd4Assessed;
    }

    public void setCd4Assessed(String cd4Assessed) {
        this.cd4Assessed = cd4Assessed;
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

    public String getLastClinicStage() {
        return lastClinicStage;
    }

    public void setLastClinicStage(String lastClinicStage) {
        this.lastClinicStage = lastClinicStage;
    }

    public Date getDateLastClinicStage() {
        return dateLastClinicStage;
    }

    public void setDateLastClinicStage(Date dateLastClinicStage) {
        this.dateLastClinicStage = dateLastClinicStage;
    }

    public String getArvDispensed() {
        return arvDispensed;
    }

    public void setArvDispensed(String arvDispensed) {
        this.arvDispensed = arvDispensed;
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

    public Date getDateNextClinic() {
        return dateNextClinic;
    }

    public void setDateNextClinic(Date dateNextClinic) {
        this.dateNextClinic = dateNextClinic;
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

    public Date getDateLastRefill() {
        return dateLastRefill;
    }

    public void setDateLastRefill(Date dateLastRefill) {
        this.dateLastRefill = dateLastRefill;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDateDiscontinued() {
        return dateDiscontinued;
    }

    public void setDateDiscontinued(Date dateDiscontinued) {
        this.dateDiscontinued = dateDiscontinued;
    }

    public String getReasonDiscontinued() {
        return reasonDiscontinued;
    }

    public void setReasonDiscontinued(String reasonDiscontinued) {
        this.reasonDiscontinued = reasonDiscontinued;
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

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (devolveId != null ? devolveId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devolve)) {
            return false;
        }
        Devolve other = (Devolve) object;
        if ((this.devolveId == null && other.devolveId != null) || (this.devolveId != null && !this.devolveId.equals(other.devolveId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Devolve[ devolveId=" + devolveId + " ]";
    }
    
}
