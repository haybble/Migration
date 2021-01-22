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
@Table(name = "SPECIMEN")
@NamedQueries({
    @NamedQuery(name = "Specimen.findAll", query = "SELECT s FROM Specimen s"),
    @NamedQuery(name = "Specimen.findBySpecimenId", query = "SELECT s FROM Specimen s WHERE s.specimenId = :specimenId"),
    @NamedQuery(name = "Specimen.findByFacilityId", query = "SELECT s FROM Specimen s WHERE s.facilityId = :facilityId"),
    @NamedQuery(name = "Specimen.findByStateId", query = "SELECT s FROM Specimen s WHERE s.stateId = :stateId"),
    @NamedQuery(name = "Specimen.findByLgaId", query = "SELECT s FROM Specimen s WHERE s.lgaId = :lgaId"),
    @NamedQuery(name = "Specimen.findByTreatmentUnitId", query = "SELECT s FROM Specimen s WHERE s.treatmentUnitId = :treatmentUnitId"),
    @NamedQuery(name = "Specimen.findBySpecimenType", query = "SELECT s FROM Specimen s WHERE s.specimenType = :specimenType"),
    @NamedQuery(name = "Specimen.findByLabno", query = "SELECT s FROM Specimen s WHERE s.labno = :labno"),
    @NamedQuery(name = "Specimen.findByBarcode", query = "SELECT s FROM Specimen s WHERE s.barcode = :barcode"),
    @NamedQuery(name = "Specimen.findByDateReceived", query = "SELECT s FROM Specimen s WHERE s.dateReceived = :dateReceived"),
    @NamedQuery(name = "Specimen.findByDateCollected", query = "SELECT s FROM Specimen s WHERE s.dateCollected = :dateCollected"),
    @NamedQuery(name = "Specimen.findByDateAssay", query = "SELECT s FROM Specimen s WHERE s.dateAssay = :dateAssay"),
    @NamedQuery(name = "Specimen.findByDateReported", query = "SELECT s FROM Specimen s WHERE s.dateReported = :dateReported"),
    @NamedQuery(name = "Specimen.findByDateDispatched", query = "SELECT s FROM Specimen s WHERE s.dateDispatched = :dateDispatched"),
    @NamedQuery(name = "Specimen.findByQualityCntrl", query = "SELECT s FROM Specimen s WHERE s.qualityCntrl = :qualityCntrl"),
    @NamedQuery(name = "Specimen.findByResult", query = "SELECT s FROM Specimen s WHERE s.result = :result"),
    @NamedQuery(name = "Specimen.findByReasonNoTest", query = "SELECT s FROM Specimen s WHERE s.reasonNoTest = :reasonNoTest"),
    @NamedQuery(name = "Specimen.findByHospitalNum", query = "SELECT s FROM Specimen s WHERE s.hospitalNum = :hospitalNum"),
    @NamedQuery(name = "Specimen.findBySurname", query = "SELECT s FROM Specimen s WHERE s.surname = :surname"),
    @NamedQuery(name = "Specimen.findByOtherNames", query = "SELECT s FROM Specimen s WHERE s.otherNames = :otherNames"),
    @NamedQuery(name = "Specimen.findByGender", query = "SELECT s FROM Specimen s WHERE s.gender = :gender"),
    @NamedQuery(name = "Specimen.findByDateBirth", query = "SELECT s FROM Specimen s WHERE s.dateBirth = :dateBirth"),
    @NamedQuery(name = "Specimen.findByAge", query = "SELECT s FROM Specimen s WHERE s.age = :age"),
    @NamedQuery(name = "Specimen.findByAgeUnit", query = "SELECT s FROM Specimen s WHERE s.ageUnit = :ageUnit"),
    @NamedQuery(name = "Specimen.findByAddress", query = "SELECT s FROM Specimen s WHERE s.address = :address"),
    @NamedQuery(name = "Specimen.findByPhone", query = "SELECT s FROM Specimen s WHERE s.phone = :phone"),
    @NamedQuery(name = "Specimen.findByUserId", query = "SELECT s FROM Specimen s WHERE s.userId = :userId"),
    @NamedQuery(name = "Specimen.findByTimeStamp", query = "SELECT s FROM Specimen s WHERE s.timeStamp = :timeStamp"),
    @NamedQuery(name = "Specimen.findByUploaded", query = "SELECT s FROM Specimen s WHERE s.uploaded = :uploaded"),
    @NamedQuery(name = "Specimen.findByTimeUploaded", query = "SELECT s FROM Specimen s WHERE s.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Specimen.findByIdUuid", query = "SELECT s FROM Specimen s WHERE s.idUuid = :idUuid"),
    @NamedQuery(name = "Specimen.findByUuid", query = "SELECT s FROM Specimen s WHERE s.uuid = :uuid")})
public class Specimen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SPECIMEN_ID")
    private Long specimenId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
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
    @Column(name = "TREATMENT_UNIT_ID")
    private long treatmentUnitId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "SPECIMEN_TYPE")
    private String specimenType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "LABNO")
    private String labno;
    @Size(max = 15)
    @Column(name = "BARCODE")
    private String barcode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_RECEIVED")
    @Temporal(TemporalType.DATE)
    private Date dateReceived;
    @Column(name = "DATE_COLLECTED")
    @Temporal(TemporalType.DATE)
    private Date dateCollected;
    @Column(name = "DATE_ASSAY")
    @Temporal(TemporalType.DATE)
    private Date dateAssay;
    @Column(name = "DATE_REPORTED")
    @Temporal(TemporalType.DATE)
    private Date dateReported;
    @Column(name = "DATE_DISPATCHED")
    @Temporal(TemporalType.DATE)
    private Date dateDispatched;
    @Column(name = "QUALITY_CNTRL")
    private Integer qualityCntrl;
    @Size(max = 25)
    @Column(name = "RESULT")
    private String result;
    @Size(max = 100)
    @Column(name = "REASON_NO_TEST")
    private String reasonNoTest;
    @Size(max = 25)
    @Column(name = "HOSPITAL_NUM")
    private String hospitalNum;
    @Size(max = 45)
    @Column(name = "SURNAME")
    private String surname;
    @Size(max = 75)
    @Column(name = "OTHER_NAMES")
    private String otherNames;
    @Size(max = 7)
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "DATE_BIRTH")
    @Temporal(TemporalType.DATE)
    private Date dateBirth;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 15)
    @Column(name = "AGE_UNIT")
    private String ageUnit;
    @Size(max = 100)
    @Column(name = "ADDRESS")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 25)
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
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

    public Specimen() {
    }

    public Specimen(Long specimenId) {
        this.specimenId = specimenId;
    }

    public Specimen(Long specimenId, long facilityId, long stateId, long lgaId, long treatmentUnitId, String specimenType, String labno, Date dateReceived) {
        this.specimenId = specimenId;
        this.facilityId = facilityId;
        this.stateId = stateId;
        this.lgaId = lgaId;
        this.treatmentUnitId = treatmentUnitId;
        this.specimenType = specimenType;
        this.labno = labno;
        this.dateReceived = dateReceived;
    }

    public Long getSpecimenId() {
        return specimenId;
    }

    public void setSpecimenId(Long specimenId) {
        this.specimenId = specimenId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
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

    public long getTreatmentUnitId() {
        return treatmentUnitId;
    }

    public void setTreatmentUnitId(long treatmentUnitId) {
        this.treatmentUnitId = treatmentUnitId;
    }

    public String getSpecimenType() {
        return specimenType;
    }

    public void setSpecimenType(String specimenType) {
        this.specimenType = specimenType;
    }

    public String getLabno() {
        return labno;
    }

    public void setLabno(String labno) {
        this.labno = labno;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    public Date getDateCollected() {
        return dateCollected;
    }

    public void setDateCollected(Date dateCollected) {
        this.dateCollected = dateCollected;
    }

    public Date getDateAssay() {
        return dateAssay;
    }

    public void setDateAssay(Date dateAssay) {
        this.dateAssay = dateAssay;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported = dateReported;
    }

    public Date getDateDispatched() {
        return dateDispatched;
    }

    public void setDateDispatched(Date dateDispatched) {
        this.dateDispatched = dateDispatched;
    }

    public Integer getQualityCntrl() {
        return qualityCntrl;
    }

    public void setQualityCntrl(Integer qualityCntrl) {
        this.qualityCntrl = qualityCntrl;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getReasonNoTest() {
        return reasonNoTest;
    }

    public void setReasonNoTest(String reasonNoTest) {
        this.reasonNoTest = reasonNoTest;
    }

    public String getHospitalNum() {
        return hospitalNum;
    }

    public void setHospitalNum(String hospitalNum) {
        this.hospitalNum = hospitalNum;
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

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
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
        hash += (specimenId != null ? specimenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Specimen)) {
            return false;
        }
        Specimen other = (Specimen) object;
        if ((this.specimenId == null && other.specimenId != null) || (this.specimenId != null && !this.specimenId.equals(other.specimenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Specimen[ specimenId=" + specimenId + " ]";
    }
    
}
