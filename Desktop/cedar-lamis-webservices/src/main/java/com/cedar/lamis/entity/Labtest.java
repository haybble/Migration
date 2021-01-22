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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "LABTEST")
@NamedQueries({
    @NamedQuery(name = "Labtest.findAll", query = "SELECT l FROM Labtest l"),
    @NamedQuery(name = "Labtest.findByLabtestId", query = "SELECT l FROM Labtest l WHERE l.labtestId = :labtestId"),
    @NamedQuery(name = "Labtest.findByDescription", query = "SELECT l FROM Labtest l WHERE l.description = :description"),
    @NamedQuery(name = "Labtest.findByMeasureab", query = "SELECT l FROM Labtest l WHERE l.measureab = :measureab"),
    @NamedQuery(name = "Labtest.findByMeasurepc", query = "SELECT l FROM Labtest l WHERE l.measurepc = :measurepc")})
public class Labtest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LABTEST_ID")
    private Long labtestId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 10)
    @Column(name = "MEASUREAB")
    private String measureab;
    @Size(max = 10)
    @Column(name = "MEASUREPC")
    private String measurepc;
    @JoinColumn(name = "LABTESTCATEGORY_ID", referencedColumnName = "LABTESTCATEGORY_ID")
    @ManyToOne(optional = false)
    private Labtestcategory labtestcategoryId;

    public Labtest() {
    }

    public Labtest(Long labtestId) {
        this.labtestId = labtestId;
    }

    public Labtest(Long labtestId, String description) {
        this.labtestId = labtestId;
        this.description = description;
    }

    public Long getLabtestId() {
        return labtestId;
    }

    public void setLabtestId(Long labtestId) {
        this.labtestId = labtestId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMeasureab() {
        return measureab;
    }

    public void setMeasureab(String measureab) {
        this.measureab = measureab;
    }

    public String getMeasurepc() {
        return measurepc;
    }

    public void setMeasurepc(String measurepc) {
        this.measurepc = measurepc;
    }

    public Labtestcategory getLabtestcategoryId() {
        return labtestcategoryId;
    }

    public void setLabtestcategoryId(Labtestcategory labtestcategoryId) {
        this.labtestcategoryId = labtestcategoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (labtestId != null ? labtestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Labtest)) {
            return false;
        }
        Labtest other = (Labtest) object;
        if ((this.labtestId == null && other.labtestId != null) || (this.labtestId != null && !this.labtestId.equals(other.labtestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Labtest[ labtestId=" + labtestId + " ]";
    }
    
}
