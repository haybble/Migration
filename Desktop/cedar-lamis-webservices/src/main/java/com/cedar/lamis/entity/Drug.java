/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "DRUG")
@NamedQueries({
    @NamedQuery(name = "Drug.findAll", query = "SELECT d FROM Drug d"),
    @NamedQuery(name = "Drug.findByDrugId", query = "SELECT d FROM Drug d WHERE d.drugId = :drugId"),
    @NamedQuery(name = "Drug.findByAbbrev", query = "SELECT d FROM Drug d WHERE d.abbrev = :abbrev"),
    @NamedQuery(name = "Drug.findByName", query = "SELECT d FROM Drug d WHERE d.name = :name"),
    @NamedQuery(name = "Drug.findByStrength", query = "SELECT d FROM Drug d WHERE d.strength = :strength"),
    @NamedQuery(name = "Drug.findByPackSize", query = "SELECT d FROM Drug d WHERE d.packSize = :packSize"),
    @NamedQuery(name = "Drug.findByDoseform", query = "SELECT d FROM Drug d WHERE d.doseform = :doseform"),
    @NamedQuery(name = "Drug.findByMorning", query = "SELECT d FROM Drug d WHERE d.morning = :morning"),
    @NamedQuery(name = "Drug.findByAfternoon", query = "SELECT d FROM Drug d WHERE d.afternoon = :afternoon"),
    @NamedQuery(name = "Drug.findByEvening", query = "SELECT d FROM Drug d WHERE d.evening = :evening"),
    @NamedQuery(name = "Drug.findByItemId", query = "SELECT d FROM Drug d WHERE d.itemId = :itemId")})
public class Drug implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DRUG_ID")
    private Long drugId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "ABBREV")
    private String abbrev;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "STRENGTH")
    private String strength;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PACK_SIZE")
    private int packSize;
    @Size(max = 45)
    @Column(name = "DOSEFORM")
    private String doseform;
    @Column(name = "MORNING")
    private Integer morning;
    @Column(name = "AFTERNOON")
    private Integer afternoon;
    @Column(name = "EVENING")
    private Integer evening;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITEM_ID")
    private long itemId;
//   @OneToMany(cascade = CascadeType.ALL, mappedBy = "drugId")
//    private Collection<Regimendrug> regimendrugCollection;

    public Drug() {
    }

    public Drug(Long drugId) {
        this.drugId = drugId;
    }

    public Drug(Long drugId, String abbrev, String name, String strength, int packSize, long itemId) {
        this.drugId = drugId;
        this.abbrev = abbrev;
        this.name = name;
        this.strength = strength;
        this.packSize = packSize;
        this.itemId = itemId;
    }

    public Long getDrugId() {
        return drugId;
    }

    public void setDrugId(Long drugId) {
        this.drugId = drugId;
    }

    public String getAbbrev() {
        return abbrev;
    }

    public void setAbbrev(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public int getPackSize() {
        return packSize;
    }

    public void setPackSize(int packSize) {
        this.packSize = packSize;
    }

    public String getDoseform() {
        return doseform;
    }

    public void setDoseform(String doseform) {
        this.doseform = doseform;
    }

    public Integer getMorning() {
        return morning;
    }

    public void setMorning(Integer morning) {
        this.morning = morning;
    }

    public Integer getAfternoon() {
        return afternoon;
    }

    public void setAfternoon(Integer afternoon) {
        this.afternoon = afternoon;
    }

    public Integer getEvening() {
        return evening;
    }

    public void setEvening(Integer evening) {
        this.evening = evening;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

//    public Collection<Regimendrug> getRegimendrugCollection() {
//        return regimendrugCollection;
//    }
//
//    public void setRegimendrugCollection(Collection<Regimendrug> regimendrugCollection) {
//        this.regimendrugCollection = regimendrugCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (drugId != null ? drugId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Drug)) {
            return false;
        }
        Drug other = (Drug) object;
        if ((this.drugId == null && other.drugId != null) || (this.drugId != null && !this.drugId.equals(other.drugId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Drug[ drugId=" + drugId + " ]";
    }
    
}
