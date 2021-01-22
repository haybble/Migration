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
@Table(name = "APPOINTMENT")
@NamedQueries({
    @NamedQuery(name = "Appointment.findAll", query = "SELECT a FROM Appointment a"),
    @NamedQuery(name = "Appointment.findByAppointmentId", query = "SELECT a FROM Appointment a WHERE a.appointmentId = :appointmentId"),
    @NamedQuery(name = "Appointment.findByPatientId", query = "SELECT a FROM Appointment a WHERE a.patientId = :patientId"),
    @NamedQuery(name = "Appointment.findByFacilityId", query = "SELECT a FROM Appointment a WHERE a.facilityId = :facilityId"),
    @NamedQuery(name = "Appointment.findByCommunitypharmId", query = "SELECT a FROM Appointment a WHERE a.communitypharmId = :communitypharmId"),
    @NamedQuery(name = "Appointment.findByDateTracked", query = "SELECT a FROM Appointment a WHERE a.dateTracked = :dateTracked"),
    @NamedQuery(name = "Appointment.findByTypeTracking", query = "SELECT a FROM Appointment a WHERE a.typeTracking = :typeTracking"),
    @NamedQuery(name = "Appointment.findByTrackingOutcome", query = "SELECT a FROM Appointment a WHERE a.trackingOutcome = :trackingOutcome"),
    @NamedQuery(name = "Appointment.findByDateLastVisit", query = "SELECT a FROM Appointment a WHERE a.dateLastVisit = :dateLastVisit"),
    @NamedQuery(name = "Appointment.findByDateNextVisit", query = "SELECT a FROM Appointment a WHERE a.dateNextVisit = :dateNextVisit"),
    @NamedQuery(name = "Appointment.findByDateAgreed", query = "SELECT a FROM Appointment a WHERE a.dateAgreed = :dateAgreed"),
    @NamedQuery(name = "Appointment.findByTimeStamp", query = "SELECT a FROM Appointment a WHERE a.timeStamp = :timeStamp"),
    @NamedQuery(name = "Appointment.findByUploaded", query = "SELECT a FROM Appointment a WHERE a.uploaded = :uploaded"),
    @NamedQuery(name = "Appointment.findByTimeUploaded", query = "SELECT a FROM Appointment a WHERE a.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Appointment.findByDeviceconfigId", query = "SELECT a FROM Appointment a WHERE a.deviceconfigId = :deviceconfigId")})
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "APPOINTMENT_ID")
    private Long appointmentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PATIENT_ID")
    private long patientId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMMUNITYPHARM_ID")
    private long communitypharmId;
    @Column(name = "DATE_TRACKED")
    @Temporal(TemporalType.DATE)
    private Date dateTracked;
    @Size(max = 15)
    @Column(name = "TYPE_TRACKING")
    private String typeTracking;
    @Size(max = 15)
    @Column(name = "TRACKING_OUTCOME")
    private String trackingOutcome;
    @Column(name = "DATE_LAST_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateLastVisit;
    @Column(name = "DATE_NEXT_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateNextVisit;
    @Column(name = "DATE_AGREED")
    @Temporal(TemporalType.DATE)
    private Date dateAgreed;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Column(name = "DEVICECONFIG_ID")
    private BigInteger deviceconfigId;

    public Appointment() {
    }

    public Appointment(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Appointment(Long appointmentId, long patientId, long facilityId, long communitypharmId) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.communitypharmId = communitypharmId;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public long getPatientId() {
        return patientId;
    }

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public long getCommunitypharmId() {
        return communitypharmId;
    }

    public void setCommunitypharmId(long communitypharmId) {
        this.communitypharmId = communitypharmId;
    }

    public Date getDateTracked() {
        return dateTracked;
    }

    public void setDateTracked(Date dateTracked) {
        this.dateTracked = dateTracked;
    }

    public String getTypeTracking() {
        return typeTracking;
    }

    public void setTypeTracking(String typeTracking) {
        this.typeTracking = typeTracking;
    }

    public String getTrackingOutcome() {
        return trackingOutcome;
    }

    public void setTrackingOutcome(String trackingOutcome) {
        this.trackingOutcome = trackingOutcome;
    }

    public Date getDateLastVisit() {
        return dateLastVisit;
    }

    public void setDateLastVisit(Date dateLastVisit) {
        this.dateLastVisit = dateLastVisit;
    }

    public Date getDateNextVisit() {
        return dateNextVisit;
    }

    public void setDateNextVisit(Date dateNextVisit) {
        this.dateNextVisit = dateNextVisit;
    }

    public Date getDateAgreed() {
        return dateAgreed;
    }

    public void setDateAgreed(Date dateAgreed) {
        this.dateAgreed = dateAgreed;
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

    public BigInteger getDeviceconfigId() {
        return deviceconfigId;
    }

    public void setDeviceconfigId(BigInteger deviceconfigId) {
        this.deviceconfigId = deviceconfigId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (appointmentId != null ? appointmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.appointmentId == null && other.appointmentId != null) || (this.appointmentId != null && !this.appointmentId.equals(other.appointmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Appointment[ appointmentId=" + appointmentId + " ]";
    }
    
}
