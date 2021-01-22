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
@Table(name = "USERPRIVILEGE")
@NamedQueries({
    @NamedQuery(name = "Userprivilege.findAll", query = "SELECT u FROM Userprivilege u"),
    @NamedQuery(name = "Userprivilege.findByUserprivilegeId", query = "SELECT u FROM Userprivilege u WHERE u.userprivilegeId = :userprivilegeId")})
public class Userprivilege implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "USERPRIVILEGE_ID")
    private Long userprivilegeId;
    @JoinColumn(name = "PRIVILEGE_ID", referencedColumnName = "PRIVILEGE_ID")
    @ManyToOne(optional = false)
    private Privilege privilegeId;
    @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")
    @ManyToOne(optional = false)
    private User userId;

    public Userprivilege() {
    }

    public Userprivilege(Long userprivilegeId) {
        this.userprivilegeId = userprivilegeId;
    }

    public Long getUserprivilegeId() {
        return userprivilegeId;
    }

    public void setUserprivilegeId(Long userprivilegeId) {
        this.userprivilegeId = userprivilegeId;
    }

    public Privilege getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Privilege privilegeId) {
        this.privilegeId = privilegeId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userprivilegeId != null ? userprivilegeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userprivilege)) {
            return false;
        }
        Userprivilege other = (Userprivilege) object;
        if ((this.userprivilegeId == null && other.userprivilegeId != null) || (this.userprivilegeId != null && !this.userprivilegeId.equals(other.userprivilegeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Userprivilege[ userprivilegeId=" + userprivilegeId + " ]";
    }
    
}
