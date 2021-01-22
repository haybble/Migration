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
@Table(name = "LGA")
@NamedQueries({
    @NamedQuery(name = "Lga.findAll", query = "SELECT l FROM Lga l"),
    @NamedQuery(name = "Lga.findByLgaId", query = "SELECT l FROM Lga l WHERE l.lgaId = :lgaId"),
    @NamedQuery(name = "Lga.findByName", query = "SELECT l FROM Lga l WHERE l.name = :name")})
public class Lga implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LGA_ID")
    private Long lgaId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NAME")
    private String name;
    @JoinColumn(name = "STATE_ID", referencedColumnName = "STATE_ID")
    @ManyToOne(optional = false)
    private State stateId;

    public Lga() {
    }

    public Lga(Long lgaId) {
        this.lgaId = lgaId;
    }

    public Lga(Long lgaId, String name) {
        this.lgaId = lgaId;
        this.name = name;
    }

    public Long getLgaId() {
        return lgaId;
    }

    public void setLgaId(Long lgaId) {
        this.lgaId = lgaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getStateId() {
        return stateId;
    }

    public void setStateId(State stateId) {
        this.stateId = stateId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lgaId != null ? lgaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lga)) {
            return false;
        }
        Lga other = (Lga) object;
        if ((this.lgaId == null && other.lgaId != null) || (this.lgaId != null && !this.lgaId.equals(other.lgaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Lga[ lgaId=" + lgaId + " ]";
    }
    
}
