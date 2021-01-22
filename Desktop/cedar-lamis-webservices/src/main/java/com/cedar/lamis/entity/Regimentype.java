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
@Table(name = "REGIMENTYPE")
@NamedQueries({
    @NamedQuery(name = "Regimentype.findAll", query = "SELECT r FROM Regimentype r"),
    @NamedQuery(name = "Regimentype.findByRegimentypeId", query = "SELECT r FROM Regimentype r WHERE r.regimentypeId = :regimentypeId"),
    @NamedQuery(name = "Regimentype.findByDescription", query = "SELECT r FROM Regimentype r WHERE r.description = :description")})
public class Regimentype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "REGIMENTYPE_ID")
    private Long regimentypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regimentypeId")
    private Collection<Regimen> regimenCollection;

    public Regimentype() {
    }

    public Regimentype(Long regimentypeId) {
        this.regimentypeId = regimentypeId;
    }

    public Regimentype(Long regimentypeId, String description) {
        this.regimentypeId = regimentypeId;
        this.description = description;
    }

    public Long getRegimentypeId() {
        return regimentypeId;
    }

    public void setRegimentypeId(Long regimentypeId) {
        this.regimentypeId = regimentypeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Regimen> getRegimenCollection() {
        return regimenCollection;
    }

    public void setRegimenCollection(Collection<Regimen> regimenCollection) {
        this.regimenCollection = regimenCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regimentypeId != null ? regimentypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regimentype)) {
            return false;
        }
        Regimentype other = (Regimentype) object;
        if ((this.regimentypeId == null && other.regimentypeId != null) || (this.regimentypeId != null && !this.regimentypeId.equals(other.regimentypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Regimentype[ regimentypeId=" + regimentypeId + " ]";
    }
    
}
