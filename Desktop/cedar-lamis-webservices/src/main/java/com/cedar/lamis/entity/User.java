/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "USER")
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
    @NamedQuery(name = "User.findByUserId", query = "SELECT u FROM User u WHERE u.userId = :userId"),
    @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
    @NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
    @NamedQuery(name = "User.findByFullname", query = "SELECT u FROM User u WHERE u.fullname = :fullname"),
    @NamedQuery(name = "User.findByUserGroup", query = "SELECT u FROM User u WHERE u.userGroup = :userGroup"),
    @NamedQuery(name = "User.findByFacilityId", query = "SELECT u FROM User u WHERE u.facilityId = :facilityId"),
    @NamedQuery(name = "User.findByTimeLogin", query = "SELECT u FROM User u WHERE u.timeLogin = :timeLogin"),
    @NamedQuery(name = "User.findByViewIdentifier", query = "SELECT u FROM User u WHERE u.viewIdentifier = :viewIdentifier"),
    @NamedQuery(name = "User.findByTimeStamp", query = "SELECT u FROM User u WHERE u.timeStamp = :timeStamp"),
    @NamedQuery(name = "User.findByUploaded", query = "SELECT u FROM User u WHERE u.uploaded = :uploaded"),
    @NamedQuery(name = "User.findByTimeUploaded", query = "SELECT u FROM User u WHERE u.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "User.findByLocalId", query = "SELECT u FROM User u WHERE u.localId = :localId"),
    @NamedQuery(name = "User.findByStateIds", query = "SELECT u FROM User u WHERE u.stateIds = :stateIds"),
    @NamedQuery(name = "User.findByIdUuid", query = "SELECT u FROM User u WHERE u.idUuid = :idUuid"),
    @NamedQuery(name = "User.findByUuid", query = "SELECT u FROM User u WHERE u.uuid = :uuid")})
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private Long userId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "USERNAME")
    private String username;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "PASSWORD")
    private String password;
    @Size(max = 100)
    @Column(name = "FULLNAME")
    private String fullname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "USER_GROUP")
    private String userGroup;
    @Column(name = "FACILITY_ID")
    private BigInteger facilityId;
    @Column(name = "TIME_LOGIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeLogin;
    @Column(name = "VIEW_IDENTIFIER")
    private Integer viewIdentifier;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Column(name = "LOCAL_ID")
    private BigInteger localId;
    @Size(max = 90)
    @Column(name = "STATE_IDS")
    private String stateIds;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
    private Collection<Userprivilege> userprivilegeCollection;

    public User() {
    }

    public User(Long userId) {
        this.userId = userId;
    }

    public User(Long userId, String username, String password, String userGroup) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.userGroup = userGroup;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public BigInteger getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(BigInteger facilityId) {
        this.facilityId = facilityId;
    }

    public Date getTimeLogin() {
        return timeLogin;
    }

    public void setTimeLogin(Date timeLogin) {
        this.timeLogin = timeLogin;
    }

    public Integer getViewIdentifier() {
        return viewIdentifier;
    }

    public void setViewIdentifier(Integer viewIdentifier) {
        this.viewIdentifier = viewIdentifier;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getUploaded() {
        return uploaded;
    }

    public void setUploaded(Integer uploaded) {
        this.uploaded = uploaded;
    }

    public Date getTimeUploaded() {
        return timeUploaded;
    }

    public void setTimeUploaded(Date timeUploaded) {
        this.timeUploaded = timeUploaded;
    }

    public BigInteger getLocalId() {
        return localId;
    }

    public void setLocalId(BigInteger localId) {
        this.localId = localId;
    }

    public String getStateIds() {
        return stateIds;
    }

    public void setStateIds(String stateIds) {
        this.stateIds = stateIds;
    }

    public String getIdUuid() {
        return idUuid;
    }

    public void setIdUuid(String idUuid) {
        this.idUuid = idUuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
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
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.User[ userId=" + userId + " ]";
    }
    
}
