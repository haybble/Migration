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
@Table(name = "ITEM")
@NamedQueries({
    @NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i"),
    @NamedQuery(name = "Item.findByItemId", query = "SELECT i FROM Item i WHERE i.itemId = :itemId"),
    @NamedQuery(name = "Item.findByDescription", query = "SELECT i FROM Item i WHERE i.description = :description"),
    @NamedQuery(name = "Item.findByUnitMeasure", query = "SELECT i FROM Item i WHERE i.unitMeasure = :unitMeasure"),
    @NamedQuery(name = "Item.findByMaxLevel", query = "SELECT i FROM Item i WHERE i.maxLevel = :maxLevel"),
    @NamedQuery(name = "Item.findByMinLevel", query = "SELECT i FROM Item i WHERE i.minLevel = :minLevel"),
    @NamedQuery(name = "Item.findByDateLastReceived", query = "SELECT i FROM Item i WHERE i.dateLastReceived = :dateLastReceived"),
    @NamedQuery(name = "Item.findByDateLastIssued", query = "SELECT i FROM Item i WHERE i.dateLastIssued = :dateLastIssued"),
    @NamedQuery(name = "Item.findByDateLastAudited", query = "SELECT i FROM Item i WHERE i.dateLastAudited = :dateLastAudited"),
    @NamedQuery(name = "Item.findByBalanceType", query = "SELECT i FROM Item i WHERE i.balanceType = :balanceType"),
    @NamedQuery(name = "Item.findByUnitCost", query = "SELECT i FROM Item i WHERE i.unitCost = :unitCost"),
    @NamedQuery(name = "Item.findByBalance", query = "SELECT i FROM Item i WHERE i.balance = :balance"),
    @NamedQuery(name = "Item.findByTimeStamp", query = "SELECT i FROM Item i WHERE i.timeStamp = :timeStamp")})
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ITEM_ID")
    private Long itemId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 45)
    @Column(name = "UNIT_MEASURE")
    private String unitMeasure;
    @Column(name = "MAX_LEVEL")
    private Integer maxLevel;
    @Column(name = "MIN_LEVEL")
    private Integer minLevel;
    @Column(name = "DATE_LAST_RECEIVED")
    @Temporal(TemporalType.DATE)
    private Date dateLastReceived;
    @Column(name = "DATE_LAST_ISSUED")
    @Temporal(TemporalType.DATE)
    private Date dateLastIssued;
    @Column(name = "DATE_LAST_AUDITED")
    @Temporal(TemporalType.DATE)
    private Date dateLastAudited;
    @Size(max = 1)
    @Column(name = "BALANCE_TYPE")
    private String balanceType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UNIT_COST")
    private Double unitCost;
    @Column(name = "BALANCE")
    private Integer balance;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;

    public Item() {
    }

    public Item(Long itemId) {
        this.itemId = itemId;
    }

    public Item(Long itemId, String description) {
        this.itemId = itemId;
        this.description = description;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnitMeasure() {
        return unitMeasure;
    }

    public void setUnitMeasure(String unitMeasure) {
        this.unitMeasure = unitMeasure;
    }

    public Integer getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(Integer maxLevel) {
        this.maxLevel = maxLevel;
    }

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public Date getDateLastReceived() {
        return dateLastReceived;
    }

    public void setDateLastReceived(Date dateLastReceived) {
        this.dateLastReceived = dateLastReceived;
    }

    public Date getDateLastIssued() {
        return dateLastIssued;
    }

    public void setDateLastIssued(Date dateLastIssued) {
        this.dateLastIssued = dateLastIssued;
    }

    public Date getDateLastAudited() {
        return dateLastAudited;
    }

    public void setDateLastAudited(Date dateLastAudited) {
        this.dateLastAudited = dateLastAudited;
    }

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public Double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
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
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Item[ itemId=" + itemId + " ]";
    }
    
}
