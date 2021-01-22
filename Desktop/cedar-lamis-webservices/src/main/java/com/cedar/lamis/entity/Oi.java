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
@Table(name = "OI")
@NamedQueries({
    @NamedQuery(name = "Oi.findAll", query = "SELECT o FROM Oi o"),
    @NamedQuery(name = "Oi.findByOiId", query = "SELECT o FROM Oi o WHERE o.oiId = :oiId"),
    @NamedQuery(name = "Oi.findByDescription", query = "SELECT o FROM Oi o WHERE o.description = :description"),
    @NamedQuery(name = "Oi.findByClinicStage", query = "SELECT o FROM Oi o WHERE o.clinicStage = :clinicStage")})
public class Oi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "OI_ID")
    private Long oiId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 15)
    @Column(name = "CLINIC_STAGE")
    private String clinicStage;

    public Oi() {
    }

    public Oi(Long oiId) {
        this.oiId = oiId;
    }

    public Oi(Long oiId, String description) {
        this.oiId = oiId;
        this.description = description;
    }

    public Long getOiId() {
        return oiId;
    }

    public void setOiId(Long oiId) {
        this.oiId = oiId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClinicStage() {
        return clinicStage;
    }

    public void setClinicStage(String clinicStage) {
        this.clinicStage = clinicStage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (oiId != null ? oiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oi)) {
            return false;
        }
        Oi other = (Oi) object;
        if ((this.oiId == null && other.oiId != null) || (this.oiId != null && !this.oiId.equals(other.oiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Oi[ oiId=" + oiId + " ]";
    }
    
}
