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

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "REGIMENDRUG")
@NamedQueries({
    @NamedQuery(name = "Regimendrug.findAll", query = "SELECT r FROM Regimendrug r"),
    @NamedQuery(name = "Regimendrug.findByRegimendrugId", query = "SELECT r FROM Regimendrug r WHERE r.regimendrugId = :regimendrugId")})
public class Regimendrug implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "REGIMENDRUG_ID")
    private Long regimendrugId;
    @JoinColumn(name = "DRUG_ID", referencedColumnName = "DRUG_ID")
    @ManyToOne(optional = false)
    private Drug drugId;
    @JoinColumn(name = "REGIMEN_ID", referencedColumnName = "REGIMEN_ID")
    @ManyToOne(optional = false)
    private Regimen regimenId;

    public Regimendrug() {
    }

    public Regimendrug(Long regimendrugId) {
        this.regimendrugId = regimendrugId;
    }

    public Long getRegimendrugId() {
        return regimendrugId;
    }

    public void setRegimendrugId(Long regimendrugId) {
        this.regimendrugId = regimendrugId;
    }

    public Drug getDrugId() {
        return drugId;
    }

    public void setDrugId(Drug drugId) {
        this.drugId = drugId;
    }

    public Regimen getRegimenId() {
        return regimenId;
    }

    public void setRegimenId(Regimen regimenId) {
        this.regimenId = regimenId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regimendrugId != null ? regimendrugId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regimendrug)) {
            return false;
        }
        Regimendrug other = (Regimendrug) object;
        if ((this.regimendrugId == null && other.regimendrugId != null) || (this.regimendrugId != null && !this.regimendrugId.equals(other.regimendrugId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Regimendrug[ regimendrugId=" + regimendrugId + " ]";
    }
    
}
