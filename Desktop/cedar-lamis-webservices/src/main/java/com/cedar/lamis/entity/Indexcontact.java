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
@Table(name = "INDEXCONTACT")
@NamedQueries({
    @NamedQuery(name = "Indexcontact.findAll", query = "SELECT i FROM Indexcontact i"),
    @NamedQuery(name = "Indexcontact.findByIndexcontactId", query = "SELECT i FROM Indexcontact i WHERE i.indexcontactId = :indexcontactId"),
    @NamedQuery(name = "Indexcontact.findByFacilityId", query = "SELECT i FROM Indexcontact i WHERE i.facilityId = :facilityId"),
    @NamedQuery(name = "Indexcontact.findByClientCode", query = "SELECT i FROM Indexcontact i WHERE i.clientCode = :clientCode"),
    @NamedQuery(name = "Indexcontact.findByIndexContactCode", query = "SELECT i FROM Indexcontact i WHERE i.indexContactCode = :indexContactCode"),
    @NamedQuery(name = "Indexcontact.findByContactType", query = "SELECT i FROM Indexcontact i WHERE i.contactType = :contactType"),
    @NamedQuery(name = "Indexcontact.findBySurname", query = "SELECT i FROM Indexcontact i WHERE i.surname = :surname"),
    @NamedQuery(name = "Indexcontact.findByOtherNames", query = "SELECT i FROM Indexcontact i WHERE i.otherNames = :otherNames"),
    @NamedQuery(name = "Indexcontact.findByAge", query = "SELECT i FROM Indexcontact i WHERE i.age = :age"),
    @NamedQuery(name = "Indexcontact.findByGender", query = "SELECT i FROM Indexcontact i WHERE i.gender = :gender"),
    @NamedQuery(name = "Indexcontact.findByPhone", query = "SELECT i FROM Indexcontact i WHERE i.phone = :phone"),
    @NamedQuery(name = "Indexcontact.findByAddress", query = "SELECT i FROM Indexcontact i WHERE i.address = :address"),
    @NamedQuery(name = "Indexcontact.findByRelationship", query = "SELECT i FROM Indexcontact i WHERE i.relationship = :relationship"),
    @NamedQuery(name = "Indexcontact.findByGbv", query = "SELECT i FROM Indexcontact i WHERE i.gbv = :gbv"),
    @NamedQuery(name = "Indexcontact.findByDurationPartner", query = "SELECT i FROM Indexcontact i WHERE i.durationPartner = :durationPartner"),
    @NamedQuery(name = "Indexcontact.findByPhoneTracking", query = "SELECT i FROM Indexcontact i WHERE i.phoneTracking = :phoneTracking"),
    @NamedQuery(name = "Indexcontact.findByHomeTracking", query = "SELECT i FROM Indexcontact i WHERE i.homeTracking = :homeTracking"),
    @NamedQuery(name = "Indexcontact.findByOutcome", query = "SELECT i FROM Indexcontact i WHERE i.outcome = :outcome"),
    @NamedQuery(name = "Indexcontact.findByDateHivTest", query = "SELECT i FROM Indexcontact i WHERE i.dateHivTest = :dateHivTest"),
    @NamedQuery(name = "Indexcontact.findByHivStatus", query = "SELECT i FROM Indexcontact i WHERE i.hivStatus = :hivStatus"),
    @NamedQuery(name = "Indexcontact.findByLinkCare", query = "SELECT i FROM Indexcontact i WHERE i.linkCare = :linkCare"),
    @NamedQuery(name = "Indexcontact.findByPartnerNotification", query = "SELECT i FROM Indexcontact i WHERE i.partnerNotification = :partnerNotification"),
    @NamedQuery(name = "Indexcontact.findByModeNotification", query = "SELECT i FROM Indexcontact i WHERE i.modeNotification = :modeNotification"),
    @NamedQuery(name = "Indexcontact.findByServiceProvided", query = "SELECT i FROM Indexcontact i WHERE i.serviceProvided = :serviceProvided"),
    @NamedQuery(name = "Indexcontact.findByDeviceconfigId", query = "SELECT i FROM Indexcontact i WHERE i.deviceconfigId = :deviceconfigId"),
    @NamedQuery(name = "Indexcontact.findByTimeStamp", query = "SELECT i FROM Indexcontact i WHERE i.timeStamp = :timeStamp"),
    @NamedQuery(name = "Indexcontact.findByUserId", query = "SELECT i FROM Indexcontact i WHERE i.userId = :userId"),
    @NamedQuery(name = "Indexcontact.findByUploaded", query = "SELECT i FROM Indexcontact i WHERE i.uploaded = :uploaded"),
    @NamedQuery(name = "Indexcontact.findByTimeUploaded", query = "SELECT i FROM Indexcontact i WHERE i.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Indexcontact.findByIdUuid", query = "SELECT i FROM Indexcontact i WHERE i.idUuid = :idUuid"),
    @NamedQuery(name = "Indexcontact.findByUuid", query = "SELECT i FROM Indexcontact i WHERE i.uuid = :uuid")})
public class Indexcontact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "INDEXCONTACT_ID")
    private Long indexcontactId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CLIENT_CODE")
    private String clientCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "INDEX_CONTACT_CODE")
    private String indexContactCode;
    @Size(max = 100)
    @Column(name = "CONTACT_TYPE")
    private String contactType;
    @Size(max = 100)
    @Column(name = "SURNAME")
    private String surname;
    @Size(max = 100)
    @Column(name = "OTHER_NAMES")
    private String otherNames;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 25)
    @Column(name = "GENDER")
    private String gender;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 50)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 200)
    @Column(name = "ADDRESS")
    private String address;
    @Size(max = 100)
    @Column(name = "RELATIONSHIP")
    private String relationship;
    @Size(max = 5)
    @Column(name = "GBV")
    private String gbv;
    @Column(name = "DURATION_PARTNER")
    private Integer durationPartner;
    @Size(max = 5)
    @Column(name = "PHONE_TRACKING")
    private String phoneTracking;
    @Size(max = 5)
    @Column(name = "HOME_TRACKING")
    private String homeTracking;
    @Size(max = 100)
    @Column(name = "OUTCOME")
    private String outcome;
    @Column(name = "DATE_HIV_TEST")
    @Temporal(TemporalType.DATE)
    private Date dateHivTest;
    @Size(max = 100)
    @Column(name = "HIV_STATUS")
    private String hivStatus;
    @Size(max = 5)
    @Column(name = "LINK_CARE")
    private String linkCare;
    @Size(max = 5)
    @Column(name = "PARTNER_NOTIFICATION")
    private String partnerNotification;
    @Size(max = 100)
    @Column(name = "MODE_NOTIFICATION")
    private String modeNotification;
    @Size(max = 300)
    @Column(name = "SERVICE_PROVIDED")
    private String serviceProvided;
    @Column(name = "DEVICECONFIG_ID")
    private BigInteger deviceconfigId;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "USER_ID")
    private Integer userId;
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
//    @JoinColumn(name = "HTS_ID", referencedColumnName = "HTS_ID")
//    @ManyToOne(optional = false)
//    private Hts htsId;

    public Indexcontact() {
    }

    public Indexcontact(Long indexcontactId) {
        this.indexcontactId = indexcontactId;
    }

    public Indexcontact(Long indexcontactId, long facilityId, String clientCode, String indexContactCode) {
        this.indexcontactId = indexcontactId;
        this.facilityId = facilityId;
        this.clientCode = clientCode;
        this.indexContactCode = indexContactCode;
    }

    public Long getIndexcontactId() {
        return indexcontactId;
    }

    public void setIndexcontactId(Long indexcontactId) {
        this.indexcontactId = indexcontactId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    public String getIndexContactCode() {
        return indexContactCode;
    }

    public void setIndexContactCode(String indexContactCode) {
        this.indexContactCode = indexContactCode;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getGbv() {
        return gbv;
    }

    public void setGbv(String gbv) {
        this.gbv = gbv;
    }

    public Integer getDurationPartner() {
        return durationPartner;
    }

    public void setDurationPartner(Integer durationPartner) {
        this.durationPartner = durationPartner;
    }

    public String getPhoneTracking() {
        return phoneTracking;
    }

    public void setPhoneTracking(String phoneTracking) {
        this.phoneTracking = phoneTracking;
    }

    public String getHomeTracking() {
        return homeTracking;
    }

    public void setHomeTracking(String homeTracking) {
        this.homeTracking = homeTracking;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Date getDateHivTest() {
        return dateHivTest;
    }

    public void setDateHivTest(Date dateHivTest) {
        this.dateHivTest = dateHivTest;
    }

    public String getHivStatus() {
        return hivStatus;
    }

    public void setHivStatus(String hivStatus) {
        this.hivStatus = hivStatus;
    }

    public String getLinkCare() {
        return linkCare;
    }

    public void setLinkCare(String linkCare) {
        this.linkCare = linkCare;
    }

    public String getPartnerNotification() {
        return partnerNotification;
    }

    public void setPartnerNotification(String partnerNotification) {
        this.partnerNotification = partnerNotification;
    }

    public String getModeNotification() {
        return modeNotification;
    }

    public void setModeNotification(String modeNotification) {
        this.modeNotification = modeNotification;
    }

    public String getServiceProvided() {
        return serviceProvided;
    }

    public void setServiceProvided(String serviceProvided) {
        this.serviceProvided = serviceProvided;
    }

    public BigInteger getDeviceconfigId() {
        return deviceconfigId;
    }

    public void setDeviceconfigId(BigInteger deviceconfigId) {
        this.deviceconfigId = deviceconfigId;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

//    public Hts getHtsId() {
//        return htsId;
//    }
//
//    public void setHtsId(Hts htsId) {
//        this.htsId = htsId;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (indexcontactId != null ? indexcontactId.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Indexcontact)) {
//            return false;
//        }
//        Indexcontact other = (Indexcontact) object;
//        if ((this.indexcontactId == null && other.indexcontactId != null) || (this.indexcontactId != null && !this.indexcontactId.equals(other.indexcontactId))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "com.cedar.lamis.entity.Indexcontact[ indexcontactId=" + indexcontactId + " ]";
//    }
    
}
