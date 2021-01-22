/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "NIGQUAL")
@NamedQueries({
    @NamedQuery(name = "Nigqual.findAll", query = "SELECT n FROM Nigqual n"),
    @NamedQuery(name = "Nigqual.findByNigqualId", query = "SELECT n FROM Nigqual n WHERE n.nigqualId = :nigqualId"),
    @NamedQuery(name = "Nigqual.findByFacilityId", query = "SELECT n FROM Nigqual n WHERE n.facilityId = :facilityId"),
    @NamedQuery(name = "Nigqual.findByPortalId", query = "SELECT n FROM Nigqual n WHERE n.portalId = :portalId"),
    @NamedQuery(name = "Nigqual.findByReviewPeriodId", query = "SELECT n FROM Nigqual n WHERE n.reviewPeriodId = :reviewPeriodId"),
    @NamedQuery(name = "Nigqual.findByThermaticArea", query = "SELECT n FROM Nigqual n WHERE n.thermaticArea = :thermaticArea"),
    @NamedQuery(name = "Nigqual.findByReportingDateBegin", query = "SELECT n FROM Nigqual n WHERE n.reportingDateBegin = :reportingDateBegin"),
    @NamedQuery(name = "Nigqual.findByReportingDateEnd", query = "SELECT n FROM Nigqual n WHERE n.reportingDateEnd = :reportingDateEnd"),
    @NamedQuery(name = "Nigqual.findByPopulation", query = "SELECT n FROM Nigqual n WHERE n.population = :population"),
    @NamedQuery(name = "Nigqual.findBySampleSize", query = "SELECT n FROM Nigqual n WHERE n.sampleSize = :sampleSize"),
    @NamedQuery(name = "Nigqual.findByTimeStamp", query = "SELECT n FROM Nigqual n WHERE n.timeStamp = :timeStamp"),
    @NamedQuery(name = "Nigqual.findByUploaded", query = "SELECT n FROM Nigqual n WHERE n.uploaded = :uploaded"),
    @NamedQuery(name = "Nigqual.findByTimeUploaded", query = "SELECT n FROM Nigqual n WHERE n.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Nigqual.findByIdUuid", query = "SELECT n FROM Nigqual n WHERE n.idUuid = :idUuid"),
    @NamedQuery(name = "Nigqual.findByUuid", query = "SELECT n FROM Nigqual n WHERE n.uuid = :uuid")})
public class Nigqual implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NIGQUAL_ID")
    private Long nigqualId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PORTAL_ID")
    private long portalId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "REVIEW_PERIOD_ID")
    private int reviewPeriodId;
    @Size(max = 2)
    @Column(name = "THERMATIC_AREA")
    private String thermaticArea;
    @Column(name = "REPORTING_DATE_BEGIN")
    @Temporal(TemporalType.DATE)
    private Date reportingDateBegin;
    @Column(name = "REPORTING_DATE_END")
    @Temporal(TemporalType.DATE)
    private Date reportingDateEnd;
    @Column(name = "POPULATION")
    private Integer population;
    @Column(name = "SAMPLE_SIZE")
    private Integer sampleSize;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;
    @JoinColumn(name = "PATIENT_ID", referencedColumnName = "PATIENT_ID")
    @ManyToOne(optional = false)
    private Patient patientId;

    public Nigqual() {
    }

    public Nigqual(Long nigqualId) {
        this.nigqualId = nigqualId;
    }

    public Nigqual(Long nigqualId, long facilityId, long portalId, int reviewPeriodId) {
        this.nigqualId = nigqualId;
        this.facilityId = facilityId;
        this.portalId = portalId;
        this.reviewPeriodId = reviewPeriodId;
    }

    public Long getNigqualId() {
        return nigqualId;
    }

    public void setNigqualId(Long nigqualId) {
        this.nigqualId = nigqualId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public long getPortalId() {
        return portalId;
    }

    public void setPortalId(long portalId) {
        this.portalId = portalId;
    }

    public int getReviewPeriodId() {
        return reviewPeriodId;
    }

    public void setReviewPeriodId(int reviewPeriodId) {
        this.reviewPeriodId = reviewPeriodId;
    }

    public String getThermaticArea() {
        return thermaticArea;
    }

    public void setThermaticArea(String thermaticArea) {
        this.thermaticArea = thermaticArea;
    }

    public Date getReportingDateBegin() {
        return reportingDateBegin;
    }

    public void setReportingDateBegin(Date reportingDateBegin) {
        this.reportingDateBegin = reportingDateBegin;
    }

    public Date getReportingDateEnd() {
        return reportingDateEnd;
    }

    public void setReportingDateEnd(Date reportingDateEnd) {
        this.reportingDateEnd = reportingDateEnd;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Integer getSampleSize() {
        return sampleSize;
    }

    public void setSampleSize(Integer sampleSize) {
        this.sampleSize = sampleSize;
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

    public Patient getPatientId() {
        return patientId;
    }

    public void setPatientId(Patient patientId) {
        this.patientId = patientId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nigqualId != null ? nigqualId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nigqual)) {
            return false;
        }
        Nigqual other = (Nigqual) object;
        if ((this.nigqualId == null && other.nigqualId != null) || (this.nigqualId != null && !this.nigqualId.equals(other.nigqualId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Nigqual[ nigqualId=" + nigqualId + " ]";
    }
    
}
