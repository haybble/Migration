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
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "PARTICIPANT")
@NamedQueries({
    @NamedQuery(name = "Participant.findAll", query = "SELECT p FROM Participant p"),
    @NamedQuery(name = "Participant.findByParticipantId", query = "SELECT p FROM Participant p WHERE p.participantId = :participantId"),
    @NamedQuery(name = "Participant.findByPhone", query = "SELECT p FROM Participant p WHERE p.phone = :phone"),
    @NamedQuery(name = "Participant.findByAge", query = "SELECT p FROM Participant p WHERE p.age = :age"),
    @NamedQuery(name = "Participant.findByGender", query = "SELECT p FROM Participant p WHERE p.gender = :gender"),
    @NamedQuery(name = "Participant.findByLocation", query = "SELECT p FROM Participant p WHERE p.location = :location"),
    @NamedQuery(name = "Participant.findByActive", query = "SELECT p FROM Participant p WHERE p.active = :active")})
public class Participant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PARTICIPANT_ID")
    private Long participantId;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 12)
    @Column(name = "PHONE")
    private String phone;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 7)
    @Column(name = "GENDER")
    private String gender;
    @Size(max = 100)
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "ACTIVE")
    private Integer active;

    public Participant() {
    }

    public Participant(Long participantId) {
        this.participantId = participantId;
    }

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (participantId != null ? participantId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Participant)) {
            return false;
        }
        Participant other = (Participant) object;
        if ((this.participantId == null && other.participantId != null) || (this.participantId != null && !this.participantId.equals(other.participantId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Participant[ participantId=" + participantId + " ]";
    }
    
}
