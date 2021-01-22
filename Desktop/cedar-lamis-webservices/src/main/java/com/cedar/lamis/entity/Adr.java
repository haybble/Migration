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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "ADR")
@NamedQueries({
    @NamedQuery(name = "Adr.findAll", query = "SELECT a FROM Adr a"),
    @NamedQuery(name = "Adr.findByAdrId", query = "SELECT a FROM Adr a WHERE a.adrId = :adrId"),
    @NamedQuery(name = "Adr.findByDescription", query = "SELECT a FROM Adr a WHERE a.description = :description"),
    @NamedQuery(name = "Adr.findByOrgan", query = "SELECT a FROM Adr a WHERE a.organ = :organ")})
public class Adr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ADR_ID")
    private Long adrId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 75)
    @Column(name = "ORGAN")
    private String organ;

    public Adr() {
    }

    public Adr(Long adrId) {
        this.adrId = adrId;
    }

    public Adr(Long adrId, String description) {
        this.adrId = adrId;
        this.description = description;
    }

    public Long getAdrId() {
        return adrId;
    }

    public void setAdrId(Long adrId) {
        this.adrId = adrId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adrId != null ? adrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adr)) {
            return false;
        }
        Adr other = (Adr) object;
        if ((this.adrId == null && other.adrId != null) || (this.adrId != null && !this.adrId.equals(other.adrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Adr[ adrId=" + adrId + " ]";
    }
    
}
