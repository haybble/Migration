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
@Table(name = "UNSENT")
@NamedQueries({
    @NamedQuery(name = "Unsent.findAll", query = "SELECT u FROM Unsent u"),
    @NamedQuery(name = "Unsent.findByUnsentId", query = "SELECT u FROM Unsent u WHERE u.unsentId = :unsentId"),
    @NamedQuery(name = "Unsent.findByPhone", query = "SELECT u FROM Unsent u WHERE u.phone = :phone"),
    @NamedQuery(name = "Unsent.findByMessage", query = "SELECT u FROM Unsent u WHERE u.message = :message"),
    @NamedQuery(name = "Unsent.findByExpire", query = "SELECT u FROM Unsent u WHERE u.expire = :expire")})
public class Unsent implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UNSENT_ID")
    private Long unsentId;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "EXPIRE")
    @Temporal(TemporalType.DATE)
    private Date expire;

    public Unsent() {
    }

    public Unsent(Long unsentId) {
        this.unsentId = unsentId;
    }

    public Unsent(Long unsentId, String phone, String message, Date expire) {
        this.unsentId = unsentId;
        this.phone = phone;
        this.message = message;
        this.expire = expire;
    }

    public Long getUnsentId() {
        return unsentId;
    }

    public void setUnsentId(Long unsentId) {
        this.unsentId = unsentId;
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

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unsentId != null ? unsentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unsent)) {
            return false;
        }
        Unsent other = (Unsent) object;
        if ((this.unsentId == null && other.unsentId != null) || (this.unsentId != null && !this.unsentId.equals(other.unsentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Unsent[ unsentId=" + unsentId + " ]";
    }
    
}
