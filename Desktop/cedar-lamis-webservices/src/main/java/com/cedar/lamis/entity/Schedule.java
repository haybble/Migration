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
@Table(name = "SCHEDULE")
@NamedQueries({
    @NamedQuery(name = "Schedule.findAll", query = "SELECT s FROM Schedule s"),
    @NamedQuery(name = "Schedule.findByScheduleId", query = "SELECT s FROM Schedule s WHERE s.scheduleId = :scheduleId"),
    @NamedQuery(name = "Schedule.findByFacilityId", query = "SELECT s FROM Schedule s WHERE s.facilityId = :facilityId"),
    @NamedQuery(name = "Schedule.findByMonday", query = "SELECT s FROM Schedule s WHERE s.monday = :monday"),
    @NamedQuery(name = "Schedule.findByTuesday", query = "SELECT s FROM Schedule s WHERE s.tuesday = :tuesday"),
    @NamedQuery(name = "Schedule.findByWednesday", query = "SELECT s FROM Schedule s WHERE s.wednesday = :wednesday"),
    @NamedQuery(name = "Schedule.findByThursday", query = "SELECT s FROM Schedule s WHERE s.thursday = :thursday"),
    @NamedQuery(name = "Schedule.findByFriday", query = "SELECT s FROM Schedule s WHERE s.friday = :friday"),
    @NamedQuery(name = "Schedule.findBySaturday", query = "SELECT s FROM Schedule s WHERE s.saturday = :saturday"),
    @NamedQuery(name = "Schedule.findBySunday", query = "SELECT s FROM Schedule s WHERE s.sunday = :sunday"),
    @NamedQuery(name = "Schedule.findByService", query = "SELECT s FROM Schedule s WHERE s.service = :service")})
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "SCHEDULE_ID")
    private Long scheduleId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Column(name = "MONDAY")
    private Integer monday;
    @Column(name = "TUESDAY")
    private Integer tuesday;
    @Column(name = "WEDNESDAY")
    private Integer wednesday;
    @Column(name = "THURSDAY")
    private Integer thursday;
    @Column(name = "FRIDAY")
    private Integer friday;
    @Column(name = "SATURDAY")
    private Integer saturday;
    @Column(name = "SUNDAY")
    private Integer sunday;
    @Size(max = 100)
    @Column(name = "SERVICE")
    private String service;

    public Schedule() {
    }

    public Schedule(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Schedule(Long scheduleId, long facilityId) {
        this.scheduleId = scheduleId;
        this.facilityId = facilityId;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public Integer getMonday() {
        return monday;
    }

    public void setMonday(Integer monday) {
        this.monday = monday;
    }

    public Integer getTuesday() {
        return tuesday;
    }

    public void setTuesday(Integer tuesday) {
        this.tuesday = tuesday;
    }

    public Integer getWednesday() {
        return wednesday;
    }

    public void setWednesday(Integer wednesday) {
        this.wednesday = wednesday;
    }

    public Integer getThursday() {
        return thursday;
    }

    public void setThursday(Integer thursday) {
        this.thursday = thursday;
    }

    public Integer getFriday() {
        return friday;
    }

    public void setFriday(Integer friday) {
        this.friday = friday;
    }

    public Integer getSaturday() {
        return saturday;
    }

    public void setSaturday(Integer saturday) {
        this.saturday = saturday;
    }

    public Integer getSunday() {
        return sunday;
    }

    public void setSunday(Integer sunday) {
        this.sunday = sunday;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scheduleId != null ? scheduleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Schedule)) {
            return false;
        }
        Schedule other = (Schedule) object;
        if ((this.scheduleId == null && other.scheduleId != null) || (this.scheduleId != null && !this.scheduleId.equals(other.scheduleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Schedule[ scheduleId=" + scheduleId + " ]";
    }
    
}
