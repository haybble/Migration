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
@Table(name = "DEVICECONFIG")
@NamedQueries({
    @NamedQuery(name = "Deviceconfig.findAll", query = "SELECT d FROM Deviceconfig d"),
    @NamedQuery(name = "Deviceconfig.findByDeviceconfigId", query = "SELECT d FROM Deviceconfig d WHERE d.deviceconfigId = :deviceconfigId"),
    @NamedQuery(name = "Deviceconfig.findByFacilityId", query = "SELECT d FROM Deviceconfig d WHERE d.facilityId = :facilityId"),
    @NamedQuery(name = "Deviceconfig.findByDeviceId", query = "SELECT d FROM Deviceconfig d WHERE d.deviceId = :deviceId"),
    @NamedQuery(name = "Deviceconfig.findByUsername", query = "SELECT d FROM Deviceconfig d WHERE d.username = :username"),
    @NamedQuery(name = "Deviceconfig.findByPassword", query = "SELECT d FROM Deviceconfig d WHERE d.password = :password")})
public class Deviceconfig implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DEVICECONFIG_ID")
    private Long deviceconfigId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Size(max = 45)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 45)
    @Column(name = "PASSWORD")
    private String password;

    public Deviceconfig() {
    }

    public Deviceconfig(Long deviceconfigId) {
        this.deviceconfigId = deviceconfigId;
    }

    public Deviceconfig(Long deviceconfigId, long facilityId, String deviceId) {
        this.deviceconfigId = deviceconfigId;
        this.facilityId = facilityId;
        this.deviceId = deviceId;
    }

    public Long getDeviceconfigId() {
        return deviceconfigId;
    }

    public void setDeviceconfigId(Long deviceconfigId) {
        this.deviceconfigId = deviceconfigId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deviceconfigId != null ? deviceconfigId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Deviceconfig)) {
            return false;
        }
        Deviceconfig other = (Deviceconfig) object;
        if ((this.deviceconfigId == null && other.deviceconfigId != null) || (this.deviceconfigId != null && !this.deviceconfigId.equals(other.deviceconfigId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Deviceconfig[ deviceconfigId=" + deviceconfigId + " ]";
    }
    
}
