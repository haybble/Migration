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
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "CASEMANAGER")
@NamedQueries({
    @NamedQuery(name = "Casemanager.findAll", query = "SELECT c FROM Casemanager c"),
    @NamedQuery(name = "Casemanager.findByCasemanagerId", query = "SELECT c FROM Casemanager c WHERE c.casemanagerId = :casemanagerId"),
    @NamedQuery(name = "Casemanager.findByFacilityId", query = "SELECT c FROM Casemanager c WHERE c.facilityId = :facilityId"),
    @NamedQuery(name = "Casemanager.findByFullname", query = "SELECT c FROM Casemanager c WHERE c.fullname = :fullname"),
    @NamedQuery(name = "Casemanager.findBySex", query = "SELECT c FROM Casemanager c WHERE c.sex = :sex"),
    @NamedQuery(name = "Casemanager.findByAge", query = "SELECT c FROM Casemanager c WHERE c.age = :age"),
    @NamedQuery(name = "Casemanager.findByPhoneNumber", query = "SELECT c FROM Casemanager c WHERE c.phoneNumber = :phoneNumber"),
    @NamedQuery(name = "Casemanager.findByReligion", query = "SELECT c FROM Casemanager c WHERE c.religion = :religion"),
    @NamedQuery(name = "Casemanager.findByAddress", query = "SELECT c FROM Casemanager c WHERE c.address = :address"),
    @NamedQuery(name = "Casemanager.findByTimeStamp", query = "SELECT c FROM Casemanager c WHERE c.timeStamp = :timeStamp"),
    @NamedQuery(name = "Casemanager.findByUserId", query = "SELECT c FROM Casemanager c WHERE c.userId = :userId"),
    @NamedQuery(name = "Casemanager.findByUploaded", query = "SELECT c FROM Casemanager c WHERE c.uploaded = :uploaded"),
    @NamedQuery(name = "Casemanager.findByTimeUploaded", query = "SELECT c FROM Casemanager c WHERE c.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Casemanager.findByLocalId", query = "SELECT c FROM Casemanager c WHERE c.localId = :localId"),
    @NamedQuery(name = "Casemanager.findByIdUuid", query = "SELECT c FROM Casemanager c WHERE c.idUuid = :idUuid"),
    @NamedQuery(name = "Casemanager.findByUuid", query = "SELECT c FROM Casemanager c WHERE c.uuid = :uuid")})
public class Casemanager implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CASEMANAGER_ID")
    private Long casemanagerId;
    @Column(name = "FACILITY_ID")
    private BigInteger facilityId;
    @Size(max = 100)
    @Column(name = "FULLNAME")
    private String fullname;
    @Size(max = 50)
    @Column(name = "SEX")
    private String sex;
    @Size(max = 30)
    @Column(name = "AGE")
    private String age;
    @Size(max = 80)
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Size(max = 50)
    @Column(name = "RELIGION")
    private String religion;
    @Size(max = 300)
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Column(name = "LOCAL_ID")
    private BigInteger localId;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;

    public Casemanager() {
    }

    public Casemanager(Long casemanagerId) {
        this.casemanagerId = casemanagerId;
    }

    public Long getCasemanagerId() {
        return casemanagerId;
    }

    public void setCasemanagerId(Long casemanagerId) {
        this.casemanagerId = casemanagerId;
    }

    public BigInteger getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(BigInteger facilityId) {
        this.facilityId = facilityId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
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

    public BigInteger getLocalId() {
        return localId;
    }

    public void setLocalId(BigInteger localId) {
        this.localId = localId;
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
        hash += (casemanagerId != null ? casemanagerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casemanager)) {
            return false;
        }
        Casemanager other = (Casemanager) object;
        if ((this.casemanagerId == null && other.casemanagerId != null) || (this.casemanagerId != null && !this.casemanagerId.equals(other.casemanagerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Casemanager[ casemanagerId=" + casemanagerId + " ]";
    }
    
}
