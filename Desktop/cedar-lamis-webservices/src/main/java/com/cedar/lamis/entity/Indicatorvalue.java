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

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "INDICATORVALUE")
@NamedQueries({
    @NamedQuery(name = "Indicatorvalue.findAll", query = "SELECT i FROM Indicatorvalue i"),
    @NamedQuery(name = "Indicatorvalue.findByIndicatorvalueId", query = "SELECT i FROM Indicatorvalue i WHERE i.indicatorvalueId = :indicatorvalueId"),
    @NamedQuery(name = "Indicatorvalue.findByDataElementId", query = "SELECT i FROM Indicatorvalue i WHERE i.dataElementId = :dataElementId"),
    @NamedQuery(name = "Indicatorvalue.findByCategoryId", query = "SELECT i FROM Indicatorvalue i WHERE i.categoryId = :categoryId"),
    @NamedQuery(name = "Indicatorvalue.findByStateId", query = "SELECT i FROM Indicatorvalue i WHERE i.stateId = :stateId"),
    @NamedQuery(name = "Indicatorvalue.findByLgaId", query = "SELECT i FROM Indicatorvalue i WHERE i.lgaId = :lgaId"),
    @NamedQuery(name = "Indicatorvalue.findByFacilityId", query = "SELECT i FROM Indicatorvalue i WHERE i.facilityId = :facilityId"),
    @NamedQuery(name = "Indicatorvalue.findByMonth", query = "SELECT i FROM Indicatorvalue i WHERE i.month = :month"),
    @NamedQuery(name = "Indicatorvalue.findByYear", query = "SELECT i FROM Indicatorvalue i WHERE i.year = :year"),
    @NamedQuery(name = "Indicatorvalue.findByValue", query = "SELECT i FROM Indicatorvalue i WHERE i.value = :value"),
    @NamedQuery(name = "Indicatorvalue.findByReportDate", query = "SELECT i FROM Indicatorvalue i WHERE i.reportDate = :reportDate")})
public class Indicatorvalue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "INDICATORVALUE_ID")
    private Long indicatorvalueId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATA_ELEMENT_ID")
    private long dataElementId;
    @Column(name = "CATEGORY_ID")
    private BigInteger categoryId;
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
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Column(name = "MONTH")
    private Integer month;
    @Column(name = "YEAR")
    private Integer year;
    @Column(name = "VALUE")
    private Integer value;
    @Column(name = "REPORT_DATE")
    @Temporal(TemporalType.DATE)
    private Date reportDate;

    public Indicatorvalue() {
    }

    public Indicatorvalue(Long indicatorvalueId) {
        this.indicatorvalueId = indicatorvalueId;
    }

    public Indicatorvalue(Long indicatorvalueId, long dataElementId, long stateId, long lgaId, long facilityId) {
        this.indicatorvalueId = indicatorvalueId;
        this.dataElementId = dataElementId;
        this.stateId = stateId;
        this.lgaId = lgaId;
        this.facilityId = facilityId;
    }

    public Long getIndicatorvalueId() {
        return indicatorvalueId;
    }

    public void setIndicatorvalueId(Long indicatorvalueId) {
        this.indicatorvalueId = indicatorvalueId;
    }

    public long getDataElementId() {
        return dataElementId;
    }

    public void setDataElementId(long dataElementId) {
        this.dataElementId = dataElementId;
    }

    public BigInteger getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(BigInteger categoryId) {
        this.categoryId = categoryId;
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

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (indicatorvalueId != null ? indicatorvalueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Indicatorvalue)) {
            return false;
        }
        Indicatorvalue other = (Indicatorvalue) object;
        if ((this.indicatorvalueId == null && other.indicatorvalueId != null) || (this.indicatorvalueId != null && !this.indicatorvalueId.equals(other.indicatorvalueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Indicatorvalue[ indicatorvalueId=" + indicatorvalueId + " ]";
    }
    
}
