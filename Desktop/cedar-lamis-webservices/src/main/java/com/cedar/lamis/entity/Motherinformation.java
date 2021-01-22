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
@Table(name = "MOTHERINFORMATION")
@NamedQueries({
    @NamedQuery(name = "Motherinformation.findAll", query = "SELECT m FROM Motherinformation m"),
    @NamedQuery(name = "Motherinformation.findByMotherinformationId", query = "SELECT m FROM Motherinformation m WHERE m.motherinformationId = :motherinformationId"),
    @NamedQuery(name = "Motherinformation.findByPatientId", query = "SELECT m FROM Motherinformation m WHERE m.patientId = :patientId"),
    @NamedQuery(name = "Motherinformation.findByFacilityId", query = "SELECT m FROM Motherinformation m WHERE m.facilityId = :facilityId"),
    @NamedQuery(name = "Motherinformation.findByHospitalNum", query = "SELECT m FROM Motherinformation m WHERE m.hospitalNum = :hospitalNum"),
    @NamedQuery(name = "Motherinformation.findByUniqueId", query = "SELECT m FROM Motherinformation m WHERE m.uniqueId = :uniqueId"),
    @NamedQuery(name = "Motherinformation.findBySurname", query = "SELECT m FROM Motherinformation m WHERE m.surname = :surname"),
    @NamedQuery(name = "Motherinformation.findByOtherNames", query = "SELECT m FROM Motherinformation m WHERE m.otherNames = :otherNames"),
    @NamedQuery(name = "Motherinformation.findByAddress", query = "SELECT m FROM Motherinformation m WHERE m.address = :address"),
    @NamedQuery(name = "Motherinformation.findByPhone", query = "SELECT m FROM Motherinformation m WHERE m.phone = :phone"),
    @NamedQuery(name = "Motherinformation.findByArtStatus", query = "SELECT m FROM Motherinformation m WHERE m.artStatus = :artStatus"),
    @NamedQuery(name = "Motherinformation.findByEntryPoint", query = "SELECT m FROM Motherinformation m WHERE m.entryPoint = :entryPoint"),
    @NamedQuery(name = "Motherinformation.findByAncNumber", query = "SELECT m FROM Motherinformation m WHERE m.ancNumber = :ancNumber"),
    @NamedQuery(name = "Motherinformation.findByInFacility", query = "SELECT m FROM Motherinformation m WHERE m.inFacility = :inFacility"),
    @NamedQuery(name = "Motherinformation.findByDateStarted", query = "SELECT m FROM Motherinformation m WHERE m.dateStarted = :dateStarted"),
    @NamedQuery(name = "Motherinformation.findByDateConfirmedHiv", query = "SELECT m FROM Motherinformation m WHERE m.dateConfirmedHiv = :dateConfirmedHiv"),
    @NamedQuery(name = "Motherinformation.findByTimeHivDiagnosis", query = "SELECT m FROM Motherinformation m WHERE m.timeHivDiagnosis = :timeHivDiagnosis"),
    @NamedQuery(name = "Motherinformation.findByDateEnrolledPmtct", query = "SELECT m FROM Motherinformation m WHERE m.dateEnrolledPmtct = :dateEnrolledPmtct"),
    @NamedQuery(name = "Motherinformation.findByRegimen", query = "SELECT m FROM Motherinformation m WHERE m.regimen = :regimen"),
    @NamedQuery(name = "Motherinformation.findByTimeStamp", query = "SELECT m FROM Motherinformation m WHERE m.timeStamp = :timeStamp"),
    @NamedQuery(name = "Motherinformation.findByUploaded", query = "SELECT m FROM Motherinformation m WHERE m.uploaded = :uploaded"),
    @NamedQuery(name = "Motherinformation.findByTimeUploaded", query = "SELECT m FROM Motherinformation m WHERE m.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Motherinformation.findByUserId", query = "SELECT m FROM Motherinformation m WHERE m.userId = :userId"),
    @NamedQuery(name = "Motherinformation.findByIdUuid", query = "SELECT m FROM Motherinformation m WHERE m.idUuid = :idUuid"),
    @NamedQuery(name = "Motherinformation.findByUuid", query = "SELECT m FROM Motherinformation m WHERE m.uuid = :uuid")})
public class Motherinformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MOTHERINFORMATION_ID")
    private Long motherinformationId;
    @Column(name = "PATIENT_ID")
    private BigInteger patientId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Size(max = 25)
    @Column(name = "HOSPITAL_NUM")
    private String hospitalNum;
    @Size(max = 36)
    @Column(name = "UNIQUE_ID")
    private String uniqueId;
    @Size(max = 45)
    @Column(name = "SURNAME")
    private String surname;
    @Size(max = 75)
    @Column(name = "OTHER_NAMES")
    private String otherNames;
    @Size(max = 255)
    @Column(name = "ADDRESS")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 120)
    @Column(name = "ART_STATUS")
    private String artStatus;
    @Size(max = 120)
    @Column(name = "ENTRY_POINT")
    private String entryPoint;
    @Size(max = 120)
    @Column(name = "ANC_NUMBER")
    private String ancNumber;
    @Size(max = 40)
    @Column(name = "IN_FACILITY")
    private String inFacility;
    @Column(name = "DATE_STARTED")
    @Temporal(TemporalType.DATE)
    private Date dateStarted;
    @Column(name = "DATE_CONFIRMED_HIV")
    @Temporal(TemporalType.DATE)
    private Date dateConfirmedHiv;
    @Size(max = 35)
    @Column(name = "TIME_HIV_DIAGNOSIS")
    private String timeHivDiagnosis;
    @Column(name = "DATE_ENROLLED_PMTCT")
    @Temporal(TemporalType.DATE)
    private Date dateEnrolledPmtct;
    @Size(max = 100)
    @Column(name = "REGIMEN")
    private String regimen;
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

    public Motherinformation() {
    }

    public Motherinformation(Long motherinformationId) {
        this.motherinformationId = motherinformationId;
    }

    public Motherinformation(Long motherinformationId, long facilityId) {
        this.motherinformationId = motherinformationId;
        this.facilityId = facilityId;
    }

    public Long getMotherinformationId() {
        return motherinformationId;
    }

    public void setMotherinformationId(Long motherinformationId) {
        this.motherinformationId = motherinformationId;
    }

    public BigInteger getPatientId() {
        return patientId;
    }

    public void setPatientId(BigInteger patientId) {
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

    public String getArtStatus() {
        return artStatus;
    }

    public void setArtStatus(String artStatus) {
        this.artStatus = artStatus;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getAncNumber() {
        return ancNumber;
    }

    public void setAncNumber(String ancNumber) {
        this.ancNumber = ancNumber;
    }

    public String getInFacility() {
        return inFacility;
    }

    public void setInFacility(String inFacility) {
        this.inFacility = inFacility;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
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

    public Date getDateEnrolledPmtct() {
        return dateEnrolledPmtct;
    }

    public void setDateEnrolledPmtct(Date dateEnrolledPmtct) {
        this.dateEnrolledPmtct = dateEnrolledPmtct;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
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
        hash += (motherinformationId != null ? motherinformationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motherinformation)) {
            return false;
        }
        Motherinformation other = (Motherinformation) object;
        if ((this.motherinformationId == null && other.motherinformationId != null) || (this.motherinformationId != null && !this.motherinformationId.equals(other.motherinformationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Motherinformation[ motherinformationId=" + motherinformationId + " ]";
    }
    
}
