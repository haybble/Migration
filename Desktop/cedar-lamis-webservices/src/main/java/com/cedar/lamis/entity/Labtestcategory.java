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
@Table(name = "LABTESTCATEGORY")
@NamedQueries({
    @NamedQuery(name = "Labtestcategory.findAll", query = "SELECT l FROM Labtestcategory l"),
    @NamedQuery(name = "Labtestcategory.findByLabtestcategoryId", query = "SELECT l FROM Labtestcategory l WHERE l.labtestcategoryId = :labtestcategoryId"),
    @NamedQuery(name = "Labtestcategory.findByCategory", query = "SELECT l FROM Labtestcategory l WHERE l.category = :category")})
public class Labtestcategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LABTESTCATEGORY_ID")
    private Long labtestcategoryId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "CATEGORY")
    private String category;
   // @OneToMany(cascade = CascadeType.ALL, mappedBy = "labtestcategoryId")
    private Collection<Labtest> labtestCollection;

    public Labtestcategory() {
    }

    public Labtestcategory(Long labtestcategoryId) {
        this.labtestcategoryId = labtestcategoryId;
    }

    public Labtestcategory(Long labtestcategoryId, String category) {
        this.labtestcategoryId = labtestcategoryId;
        this.category = category;
    }

    public Long getLabtestcategoryId() {
        return labtestcategoryId;
    }

    public void setLabtestcategoryId(Long labtestcategoryId) {
        this.labtestcategoryId = labtestcategoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Collection<Labtest> getLabtestCollection() {
        return labtestCollection;
    }

    public void setLabtestCollection(Collection<Labtest> labtestCollection) {
        this.labtestCollection = labtestCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (labtestcategoryId != null ? labtestcategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Labtestcategory)) {
            return false;
        }
        Labtestcategory other = (Labtestcategory) object;
        if ((this.labtestcategoryId == null && other.labtestcategoryId != null) || (this.labtestcategoryId != null && !this.labtestcategoryId.equals(other.labtestcategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Labtestcategory[ labtestcategoryId=" + labtestcategoryId + " ]";
    }
    
}
