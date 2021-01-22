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

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "MHTC")
@NamedQueries({
    @NamedQuery(name = "Mhtc.findAll", query = "SELECT m FROM Mhtc m"),
    @NamedQuery(name = "Mhtc.findByMhtcId", query = "SELECT m FROM Mhtc m WHERE m.mhtcId = :mhtcId"),
    @NamedQuery(name = "Mhtc.findByCommunitypharmId", query = "SELECT m FROM Mhtc m WHERE m.communitypharmId = :communitypharmId"),
    @NamedQuery(name = "Mhtc.findByMonth", query = "SELECT m FROM Mhtc m WHERE m.month = :month"),
    @NamedQuery(name = "Mhtc.findByYear", query = "SELECT m FROM Mhtc m WHERE m.year = :year"),
    @NamedQuery(name = "Mhtc.findByNumTested", query = "SELECT m FROM Mhtc m WHERE m.numTested = :numTested"),
    @NamedQuery(name = "Mhtc.findByNumPositive", query = "SELECT m FROM Mhtc m WHERE m.numPositive = :numPositive"),
    @NamedQuery(name = "Mhtc.findByNumReferred", query = "SELECT m FROM Mhtc m WHERE m.numReferred = :numReferred"),
    @NamedQuery(name = "Mhtc.findByNumOnsiteVisit", query = "SELECT m FROM Mhtc m WHERE m.numOnsiteVisit = :numOnsiteVisit"),
    @NamedQuery(name = "Mhtc.findByTimeStamp", query = "SELECT m FROM Mhtc m WHERE m.timeStamp = :timeStamp"),
    @NamedQuery(name = "Mhtc.findByUploaded", query = "SELECT m FROM Mhtc m WHERE m.uploaded = :uploaded"),
    @NamedQuery(name = "Mhtc.findByTimeUploaded", query = "SELECT m FROM Mhtc m WHERE m.timeUploaded = :timeUploaded")})
public class Mhtc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MHTC_ID")
    private Long mhtcId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMMUNITYPHARM_ID")
    private long communitypharmId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MONTH")
    private int month;
    @Basic(optional = false)
    @NotNull
    @Column(name = "YEAR")
    private int year;
    @Column(name = "NUM_TESTED")
    private Integer numTested;
    @Column(name = "NUM_POSITIVE")
    private Integer numPositive;
    @Column(name = "NUM_REFERRED")
    private Integer numReferred;
    @Column(name = "NUM_ONSITE_VISIT")
    private Integer numOnsiteVisit;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;

    public Mhtc() {
    }

    public Mhtc(Long mhtcId) {
        this.mhtcId = mhtcId;
    }

    public Mhtc(Long mhtcId, long communitypharmId, int month, int year) {
        this.mhtcId = mhtcId;
        this.communitypharmId = communitypharmId;
        this.month = month;
        this.year = year;
    }

    public Long getMhtcId() {
        return mhtcId;
    }

    public void setMhtcId(Long mhtcId) {
        this.mhtcId = mhtcId;
    }

    public long getCommunitypharmId() {
        return communitypharmId;
    }

    public void setCommunitypharmId(long communitypharmId) {
        this.communitypharmId = communitypharmId;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getNumTested() {
        return numTested;
    }

    public void setNumTested(Integer numTested) {
        this.numTested = numTested;
    }

    public Integer getNumPositive() {
        return numPositive;
    }

    public void setNumPositive(Integer numPositive) {
        this.numPositive = numPositive;
    }

    public Integer getNumReferred() {
        return numReferred;
    }

    public void setNumReferred(Integer numReferred) {
        this.numReferred = numReferred;
    }

    public Integer getNumOnsiteVisit() {
        return numOnsiteVisit;
    }

    public void setNumOnsiteVisit(Integer numOnsiteVisit) {
        this.numOnsiteVisit = numOnsiteVisit;
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
        hash += (mhtcId != null ? mhtcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mhtc)) {
            return false;
        }
        Mhtc other = (Mhtc) object;
        if ((this.mhtcId == null && other.mhtcId != null) || (this.mhtcId != null && !this.mhtcId.equals(other.mhtcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Mhtc[ mhtcId=" + mhtcId + " ]";
    }
    
}
