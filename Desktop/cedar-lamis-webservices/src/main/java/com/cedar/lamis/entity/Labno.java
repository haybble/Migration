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
@Table(name = "LABNO")
@NamedQueries({
    @NamedQuery(name = "Labno.findAll", query = "SELECT l FROM Labno l"),
    @NamedQuery(name = "Labno.findByLabnoId", query = "SELECT l FROM Labno l WHERE l.labnoId = :labnoId"),
    @NamedQuery(name = "Labno.findByFacilityId", query = "SELECT l FROM Labno l WHERE l.facilityId = :facilityId"),
    @NamedQuery(name = "Labno.findByYear", query = "SELECT l FROM Labno l WHERE l.year = :year"),
    @NamedQuery(name = "Labno.findByLastno", query = "SELECT l FROM Labno l WHERE l.lastno = :lastno"),
    @NamedQuery(name = "Labno.findByTimeStamp", query = "SELECT l FROM Labno l WHERE l.timeStamp = :timeStamp"),
    @NamedQuery(name = "Labno.findByUploaded", query = "SELECT l FROM Labno l WHERE l.uploaded = :uploaded"),
    @NamedQuery(name = "Labno.findByTimeUploaded", query = "SELECT l FROM Labno l WHERE l.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Labno.findByIdUuid", query = "SELECT l FROM Labno l WHERE l.idUuid = :idUuid")})
public class Labno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LABNO_ID")
    private Long labnoId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Column(name = "YEAR")
    private Integer year;
    @Column(name = "LASTNO")
    private Integer lastno;
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

    public Labno() {
    }

    public Labno(Long labnoId) {
        this.labnoId = labnoId;
    }

    public Labno(Long labnoId, long facilityId) {
        this.labnoId = labnoId;
        this.facilityId = facilityId;
    }

    public Long getLabnoId() {
        return labnoId;
    }

    public void setLabnoId(Long labnoId) {
        this.labnoId = labnoId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getLastno() {
        return lastno;
    }

    public void setLastno(Integer lastno) {
        this.lastno = lastno;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (labnoId != null ? labnoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Labno)) {
            return false;
        }
        Labno other = (Labno) object;
        if ((this.labnoId == null && other.labnoId != null) || (this.labnoId != null && !this.labnoId.equals(other.labnoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Labno[ labnoId=" + labnoId + " ]";
    }
    
}
