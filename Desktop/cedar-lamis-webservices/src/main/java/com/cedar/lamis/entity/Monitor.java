/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "MONITOR")
@NamedQueries({
    @NamedQuery(name = "Monitor.findAll", query = "SELECT m FROM Monitor m"),
    @NamedQuery(name = "Monitor.findByMonitorId", query = "SELECT m FROM Monitor m WHERE m.monitorId = :monitorId"),
    @NamedQuery(name = "Monitor.findByFacilityId", query = "SELECT m FROM Monitor m WHERE m.facilityId = :facilityId"),
    @NamedQuery(name = "Monitor.findByEntityId", query = "SELECT m FROM Monitor m WHERE m.entityId = :entityId"),
    @NamedQuery(name = "Monitor.findByTableName", query = "SELECT m FROM Monitor m WHERE m.tableName = :tableName"),
    @NamedQuery(name = "Monitor.findByOperationId", query = "SELECT m FROM Monitor m WHERE m.operationId = :operationId"),
    @NamedQuery(name = "Monitor.findByUserId", query = "SELECT m FROM Monitor m WHERE m.userId = :userId"),
    @NamedQuery(name = "Monitor.findByTimeStamp", query = "SELECT m FROM Monitor m WHERE m.timeStamp = :timeStamp"),
    @NamedQuery(name = "Monitor.findByUploaded", query = "SELECT m FROM Monitor m WHERE m.uploaded = :uploaded"),
    @NamedQuery(name = "Monitor.findByTimeUploaded", query = "SELECT m FROM Monitor m WHERE m.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Monitor.findByDeviceType", query = "SELECT m FROM Monitor m WHERE m.deviceType = :deviceType"),
    @NamedQuery(name = "Monitor.findByIdUuid", query = "SELECT m FROM Monitor m WHERE m.idUuid = :idUuid"),
    @NamedQuery(name = "Monitor.findByUuid", query = "SELECT m FROM Monitor m WHERE m.uuid = :uuid")})
public class Monitor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MONITOR_ID")
    private Long monitorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ENTITY_ID")
    private String entityId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 75)
    @Column(name = "TABLE_NAME")
    private String tableName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OPERATION_ID")
    private int operationId;
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Size(max = 40)
    @Column(name = "DEVICE_TYPE")
    private String deviceType;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;

    public Monitor() {
    }

    public Monitor(Long monitorId) {
        this.monitorId = monitorId;
    }

    public Monitor(Long monitorId, long facilityId, String entityId, String tableName, int operationId) {
        this.monitorId = monitorId;
        this.facilityId = facilityId;
        this.entityId = entityId;
        this.tableName = tableName;
        this.operationId = operationId;
    }

    public Long getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(Long monitorId) {
        this.monitorId = monitorId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public int getOperationId() {
        return operationId;
    }

    public void setOperationId(int operationId) {
        this.operationId = operationId;
    }

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
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

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (monitorId != null ? monitorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Monitor)) {
            return false;
        }
        Monitor other = (Monitor) object;
        if ((this.monitorId == null && other.monitorId != null) || (this.monitorId != null && !this.monitorId.equals(other.monitorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Monitor[ monitorId=" + monitorId + " ]";
    }
    
}
