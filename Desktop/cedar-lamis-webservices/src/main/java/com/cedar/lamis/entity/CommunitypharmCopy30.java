/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
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
@Table(name = "COMMUNITYPHARM_COPY_3_0")
@NamedQueries({
    @NamedQuery(name = "CommunitypharmCopy30.findAll", query = "SELECT c FROM CommunitypharmCopy30 c"),
    @NamedQuery(name = "CommunitypharmCopy30.findByCommunitypharmId", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.communitypharmId = :communitypharmId"),
    @NamedQuery(name = "CommunitypharmCopy30.findByStateId", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.stateId = :stateId"),
    @NamedQuery(name = "CommunitypharmCopy30.findByLgaId", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.lgaId = :lgaId"),
    @NamedQuery(name = "CommunitypharmCopy30.findByPharmacy", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.pharmacy = :pharmacy"),
    @NamedQuery(name = "CommunitypharmCopy30.findByAddress", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.address = :address"),
    @NamedQuery(name = "CommunitypharmCopy30.findByPhone", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.phone = :phone"),
    @NamedQuery(name = "CommunitypharmCopy30.findByPhone1", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.phone1 = :phone1"),
    @NamedQuery(name = "CommunitypharmCopy30.findByEmail", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.email = :email"),
    @NamedQuery(name = "CommunitypharmCopy30.findByPin", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.pin = :pin"),
    @NamedQuery(name = "CommunitypharmCopy30.findByTimeStamp", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.timeStamp = :timeStamp"),
    @NamedQuery(name = "CommunitypharmCopy30.findByUploaded", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.uploaded = :uploaded"),
    @NamedQuery(name = "CommunitypharmCopy30.findByTimeUploaded", query = "SELECT c FROM CommunitypharmCopy30 c WHERE c.timeUploaded = :timeUploaded")})
public class CommunitypharmCopy30 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COMMUNITYPHARM_ID")
    private Long communitypharmId;
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
    @Size(min = 1, max = 200)
    @Column(name = "PHARMACY")
    private String pharmacy;
    @Size(max = 300)
    @Column(name = "ADDRESS")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 25)
    @Column(name = "PHONE")
    private String phone;
    @Size(max = 25)
    @Column(name = "PHONE1")
    private String phone1;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "EMAIL")
    private String email;
    @Size(max = 13)
    @Column(name = "PIN")
    private String pin;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;

    public CommunitypharmCopy30() {
    }

    public CommunitypharmCopy30(Long communitypharmId) {
        this.communitypharmId = communitypharmId;
    }

    public CommunitypharmCopy30(Long communitypharmId, long stateId, long lgaId, String pharmacy) {
        this.communitypharmId = communitypharmId;
        this.stateId = stateId;
        this.lgaId = lgaId;
        this.pharmacy = pharmacy;
    }

    public Long getCommunitypharmId() {
        return communitypharmId;
    }

    public void setCommunitypharmId(Long communitypharmId) {
        this.communitypharmId = communitypharmId;
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

    public String getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(String pharmacy) {
        this.pharmacy = pharmacy;
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

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (communitypharmId != null ? communitypharmId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CommunitypharmCopy30)) {
            return false;
        }
        CommunitypharmCopy30 other = (CommunitypharmCopy30) object;
        if ((this.communitypharmId == null && other.communitypharmId != null) || (this.communitypharmId != null && !this.communitypharmId.equals(other.communitypharmId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.CommunitypharmCopy30[ communitypharmId=" + communitypharmId + " ]";
    }
    
}
