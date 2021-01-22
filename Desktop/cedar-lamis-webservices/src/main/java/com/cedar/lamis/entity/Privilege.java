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
@Table(name = "PRIVILEGE")
@NamedQueries({
    @NamedQuery(name = "Privilege.findAll", query = "SELECT p FROM Privilege p"),
    @NamedQuery(name = "Privilege.findByPrivilegeId", query = "SELECT p FROM Privilege p WHERE p.privilegeId = :privilegeId"),
    @NamedQuery(name = "Privilege.findByDescription", query = "SELECT p FROM Privilege p WHERE p.description = :description")})
public class Privilege implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PRIVILEGE_ID")
    private Long privilegeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DESCRIPTION")
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "privilegeId")
    private Collection<Userprivilege> userprivilegeCollection;

    public Privilege() {
    }

    public Privilege(Long privilegeId) {
        this.privilegeId = privilegeId;
    }

    public Privilege(Long privilegeId, String description) {
        this.privilegeId = privilegeId;
        this.description = description;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Collection<Userprivilege> getUserprivilegeCollection() {
        return userprivilegeCollection;
    }

    public void setUserprivilegeCollection(Collection<Userprivilege> userprivilegeCollection) {
        this.userprivilegeCollection = userprivilegeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (privilegeId != null ? privilegeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Privilege)) {
            return false;
        }
        Privilege other = (Privilege) object;
        if ((this.privilegeId == null && other.privilegeId != null) || (this.privilegeId != null && !this.privilegeId.equals(other.privilegeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Privilege[ privilegeId=" + privilegeId + " ]";
    }
    
}
