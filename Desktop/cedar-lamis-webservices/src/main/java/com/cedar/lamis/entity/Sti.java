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
@Table(name = "STI")
@NamedQueries({
    @NamedQuery(name = "Sti.findAll", query = "SELECT s FROM Sti s"),
    @NamedQuery(name = "Sti.findByStiId", query = "SELECT s FROM Sti s WHERE s.stiId = :stiId"),
    @NamedQuery(name = "Sti.findByDescription", query = "SELECT s FROM Sti s WHERE s.description = :description")})
public class Sti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "STI_ID")
    private Long stiId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;

    public Sti() {
    }

    public Sti(Long stiId) {
        this.stiId = stiId;
    }

    public Sti(Long stiId, String description) {
        this.stiId = stiId;
        this.description = description;
    }

    public Long getStiId() {
        return stiId;
    }

    public void setStiId(Long stiId) {
        this.stiId = stiId;
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
        hash += (stiId != null ? stiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sti)) {
            return false;
        }
        Sti other = (Sti) object;
        if ((this.stiId == null && other.stiId != null) || (this.stiId != null && !this.stiId.equals(other.stiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Sti[ stiId=" + stiId + " ]";
    }
    
}
