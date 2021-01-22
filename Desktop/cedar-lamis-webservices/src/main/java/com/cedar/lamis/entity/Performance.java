/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "PERFORMANCE")
@NamedQueries({
    @NamedQuery(name = "Performance.findAll", query = "SELECT p FROM Performance p"),
    @NamedQuery(name = "Performance.findByPerformanceId", query = "SELECT p FROM Performance p WHERE p.performanceId = :performanceId"),
    @NamedQuery(name = "Performance.findByYear", query = "SELECT p FROM Performance p WHERE p.year = :year"),
    @NamedQuery(name = "Performance.findByMonth", query = "SELECT p FROM Performance p WHERE p.month = :month"),
    @NamedQuery(name = "Performance.findByDenominator", query = "SELECT p FROM Performance p WHERE p.denominator = :denominator"),
    @NamedQuery(name = "Performance.findByNumerator", query = "SELECT p FROM Performance p WHERE p.numerator = :numerator"),
    @NamedQuery(name = "Performance.findByIndicatorId", query = "SELECT p FROM Performance p WHERE p.indicatorId = :indicatorId"),
    @NamedQuery(name = "Performance.findByFacilityId", query = "SELECT p FROM Performance p WHERE p.facilityId = :facilityId")})
public class Performance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PERFORMANCE_ID")
    private Long performanceId;
    @Column(name = "YEAR")
    private Integer year;
    @Column(name = "MONTH")
    private Integer month;
    @Column(name = "DENOMINATOR")
    private Integer denominator;
    @Column(name = "NUMERATOR")
    private Integer numerator;
    @Column(name = "INDICATOR_ID")
    private Integer indicatorId;
    @Column(name = "FACILITY_ID")
    private Integer facilityId;

    public Performance() {
    }

    public Performance(Long performanceId) {
        this.performanceId = performanceId;
    }

    public Long getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    public Integer getNumerator() {
        return numerator;
    }

    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }

    public Integer getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(Integer indicatorId) {
        this.indicatorId = indicatorId;
    }

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (performanceId != null ? performanceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Performance)) {
            return false;
        }
        Performance other = (Performance) object;
        if ((this.performanceId == null && other.performanceId != null) || (this.performanceId != null && !this.performanceId.equals(other.performanceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Performance[ performanceId=" + performanceId + " ]";
    }
    
}
