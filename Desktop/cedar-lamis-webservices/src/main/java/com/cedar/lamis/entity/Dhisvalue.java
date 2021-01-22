/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "DHISVALUE")
@NamedQueries({
    @NamedQuery(name = "Dhisvalue.findAll", query = "SELECT d FROM Dhisvalue d"),
    @NamedQuery(name = "Dhisvalue.findByDhisvalueId", query = "SELECT d FROM Dhisvalue d WHERE d.dhisvalueId = :dhisvalueId"),
    @NamedQuery(name = "Dhisvalue.findByDataElementId", query = "SELECT d FROM Dhisvalue d WHERE d.dataElementId = :dataElementId"),
    @NamedQuery(name = "Dhisvalue.findByCategoryId", query = "SELECT d FROM Dhisvalue d WHERE d.categoryId = :categoryId"),
    @NamedQuery(name = "Dhisvalue.findByStateId", query = "SELECT d FROM Dhisvalue d WHERE d.stateId = :stateId"),
    @NamedQuery(name = "Dhisvalue.findByLgaId", query = "SELECT d FROM Dhisvalue d WHERE d.lgaId = :lgaId"),
    @NamedQuery(name = "Dhisvalue.findByFacilityId", query = "SELECT d FROM Dhisvalue d WHERE d.facilityId = :facilityId"),
    @NamedQuery(name = "Dhisvalue.findByDataElementIdDhis", query = "SELECT d FROM Dhisvalue d WHERE d.dataElementIdDhis = :dataElementIdDhis"),
    @NamedQuery(name = "Dhisvalue.findByCategoryIdDhis", query = "SELECT d FROM Dhisvalue d WHERE d.categoryIdDhis = :categoryIdDhis"),
    @NamedQuery(name = "Dhisvalue.findByFacilityIdDhis", query = "SELECT d FROM Dhisvalue d WHERE d.facilityIdDhis = :facilityIdDhis"),
    @NamedQuery(name = "Dhisvalue.findByPeriod", query = "SELECT d FROM Dhisvalue d WHERE d.period = :period"),
    @NamedQuery(name = "Dhisvalue.findByValue", query = "SELECT d FROM Dhisvalue d WHERE d.value = :value")})
public class Dhisvalue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DHISVALUE_ID")
    private Long dhisvalueId;
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
    @Size(max = 36)
    @Column(name = "DATA_ELEMENT_ID_DHIS")
    private String dataElementIdDhis;
    @Size(max = 36)
    @Column(name = "CATEGORY_ID_DHIS")
    private String categoryIdDhis;
    @Size(max = 36)
    @Column(name = "FACILITY_ID_DHIS")
    private String facilityIdDhis;
    @Size(max = 255)
    @Column(name = "PERIOD")
    private String period;
    @Column(name = "VALUE")
    private Integer value;

    public Dhisvalue() {
    }

    public Dhisvalue(Long dhisvalueId) {
        this.dhisvalueId = dhisvalueId;
    }

    public Dhisvalue(Long dhisvalueId, long dataElementId, long stateId, long lgaId, long facilityId) {
        this.dhisvalueId = dhisvalueId;
        this.dataElementId = dataElementId;
        this.stateId = stateId;
        this.lgaId = lgaId;
        this.facilityId = facilityId;
    }

    public Long getDhisvalueId() {
        return dhisvalueId;
    }

    public void setDhisvalueId(Long dhisvalueId) {
        this.dhisvalueId = dhisvalueId;
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

    public String getDataElementIdDhis() {
        return dataElementIdDhis;
    }

    public void setDataElementIdDhis(String dataElementIdDhis) {
        this.dataElementIdDhis = dataElementIdDhis;
    }

    public String getCategoryIdDhis() {
        return categoryIdDhis;
    }

    public void setCategoryIdDhis(String categoryIdDhis) {
        this.categoryIdDhis = categoryIdDhis;
    }

    public String getFacilityIdDhis() {
        return facilityIdDhis;
    }

    public void setFacilityIdDhis(String facilityIdDhis) {
        this.facilityIdDhis = facilityIdDhis;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dhisvalueId != null ? dhisvalueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dhisvalue)) {
            return false;
        }
        Dhisvalue other = (Dhisvalue) object;
        if ((this.dhisvalueId == null && other.dhisvalueId != null) || (this.dhisvalueId != null && !this.dhisvalueId.equals(other.dhisvalueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Dhisvalue[ dhisvalueId=" + dhisvalueId + " ]";
    }
    
}
