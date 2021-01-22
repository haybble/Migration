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
@Table(name = "ADHERE")
@NamedQueries({
    @NamedQuery(name = "Adhere.findAll", query = "SELECT a FROM Adhere a"),
    @NamedQuery(name = "Adhere.findByAdhereId", query = "SELECT a FROM Adhere a WHERE a.adhereId = :adhereId"),
    @NamedQuery(name = "Adhere.findByDescription", query = "SELECT a FROM Adhere a WHERE a.description = :description")})
public class Adhere implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ADHERE_ID")
    private Long adhereId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;

    public Adhere() {
    }

    public Adhere(Long adhereId) {
        this.adhereId = adhereId;
    }

    public Adhere(Long adhereId, String description) {
        this.adhereId = adhereId;
        this.description = description;
    }

    public Long getAdhereId() {
        return adhereId;
    }

    public void setAdhereId(Long adhereId) {
        this.adhereId = adhereId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adhereId != null ? adhereId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adhere)) {
            return false;
        }
        Adhere other = (Adhere) object;
        if ((this.adhereId == null && other.adhereId != null) || (this.adhereId != null && !this.adhereId.equals(other.adhereId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Adhere[ adhereId=" + adhereId + " ]";
    }
    
}
