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
@Table(name = "SENT")
@NamedQueries({
    @NamedQuery(name = "Sent.findAll", query = "SELECT s FROM Sent s"),
    @NamedQuery(name = "Sent.findBySentId", query = "SELECT s FROM Sent s WHERE s.sentId = :sentId"),
    @NamedQuery(name = "Sent.findByPhone", query = "SELECT s FROM Sent s WHERE s.phone = :phone"),
    @NamedQuery(name = "Sent.findByMessage", query = "SELECT s FROM Sent s WHERE s.message = :message"),
    @NamedQuery(name = "Sent.findByTimeStamp", query = "SELECT s FROM Sent s WHERE s.timeStamp = :timeStamp")})
public class Sent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SENT_ID")
    private Long sentId;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "PHONE")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;

    public Sent() {
    }

    public Sent(Long sentId) {
        this.sentId = sentId;
    }

    public Sent(Long sentId, String phone, String message) {
        this.sentId = sentId;
        this.phone = phone;
        this.message = message;
    }

    public Long getSentId() {
        return sentId;
    }

    public void setSentId(Long sentId) {
        this.sentId = sentId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sentId != null ? sentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sent)) {
            return false;
        }
        Sent other = (Sent) object;
        if ((this.sentId == null && other.sentId != null) || (this.sentId != null && !this.sentId.equals(other.sentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Sent[ sentId=" + sentId + " ]";
    }
    
}
