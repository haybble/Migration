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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "REGIMEN")
@NamedQueries({
    @NamedQuery(name = "Regimen.findAll", query = "SELECT r FROM Regimen r"),
    @NamedQuery(name = "Regimen.findByRegimenId", query = "SELECT r FROM Regimen r WHERE r.regimenId = :regimenId"),
    @NamedQuery(name = "Regimen.findByDescription", query = "SELECT r FROM Regimen r WHERE r.description = :description"),
    @NamedQuery(name = "Regimen.findByComposition", query = "SELECT r FROM Regimen r WHERE r.composition = :composition")})
public class Regimen implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "REGIMEN_ID")
    private Long regimenId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "COMPOSITION")
    private String composition;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regimenId")
    private Collection<Regimendrug> regimendrugCollection;
    @JoinColumn(name = "REGIMENTYPE_ID", referencedColumnName = "REGIMENTYPE_ID")
    @ManyToOne(optional = false)
    private Regimentype regimentypeId;

    public Regimen() {
    }

    public Regimen(Long regimenId) {
        this.regimenId = regimenId;
    }

    public Regimen(Long regimenId, String description, String composition) {
        this.regimenId = regimenId;
        this.description = description;
        this.composition = composition;
    }

    public Long getRegimenId() {
        return regimenId;
    }

    public void setRegimenId(Long regimenId) {
        this.regimenId = regimenId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public Collection<Regimendrug> getRegimendrugCollection() {
        return regimendrugCollection;
    }

    public void setRegimendrugCollection(Collection<Regimendrug> regimendrugCollection) {
        this.regimendrugCollection = regimendrugCollection;
    }

    public Regimentype getRegimentypeId() {
        return regimentypeId;
    }

    public void setRegimentypeId(Regimentype regimentypeId) {
        this.regimentypeId = regimentypeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regimenId != null ? regimenId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Regimen)) {
            return false;
        }
        Regimen other = (Regimen) object;
        if ((this.regimenId == null && other.regimenId != null) || (this.regimenId != null && !this.regimenId.equals(other.regimenId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Regimen[ regimenId=" + regimenId + " ]";
    }
    
}
