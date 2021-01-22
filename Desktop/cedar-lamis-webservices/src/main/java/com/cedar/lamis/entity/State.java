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
@Table(name = "STATE")
@NamedQueries({
    @NamedQuery(name = "State.findAll", query = "SELECT s FROM State s"),
    @NamedQuery(name = "State.findByStateId", query = "SELECT s FROM State s WHERE s.hierachyunitid = :hierachyunitid"),
    @NamedQuery(name = "State.findByName", query = "SELECT s FROM State s WHERE s.name = :name")})
public class State implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "STATE_ID")
    private Long hierachyunitid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "NAME")
    private String name;
   // @OneToMany(cascade = CascadeType.ALL, mappedBy = "hierachyunitid")
   // private Collection<Lga> lgaCollection;

    public State() {
    }

    public State(Long stateId) {
        this.hierachyunitid = stateId;
    }

    public State(Long stateId, String name) {
        this.hierachyunitid = stateId;
        this.name = name;
    }

    public Long getHierachyunitid() {
       
        return hierachyunitid;
    }

    public void setHierachyunitid(Long hierachyunitid) {
        this.hierachyunitid = hierachyunitid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Collection<Lga> getLgaCollection() {
//        return lgaCollection;
//    }
//
//    public void setLgaCollection(Collection<Lga> lgaCollection) {
//        this.lgaCollection = lgaCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierachyunitid != null ? hierachyunitid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof State)) {
            return false;
        }
        State other = (State) object;
        if ((this.hierachyunitid == null && other.hierachyunitid != null) || (this.hierachyunitid != null && !this.hierachyunitid.equals(other.hierachyunitid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.State[ stateId=" + hierachyunitid + " ]";
    }
    
}
