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
@Table(name = "DELIVERY")
@NamedQueries({
    @NamedQuery(name = "Delivery.findAll", query = "SELECT d FROM Delivery d"),
    @NamedQuery(name = "Delivery.findByDeliveryId", query = "SELECT d FROM Delivery d WHERE d.deliveryId = :deliveryId"),
    @NamedQuery(name = "Delivery.findByPatientId", query = "SELECT d FROM Delivery d WHERE d.patientId = :patientId"),
    @NamedQuery(name = "Delivery.findByFacilityId", query = "SELECT d FROM Delivery d WHERE d.facilityId = :facilityId"),
    @NamedQuery(name = "Delivery.findByDateDelivery", query = "SELECT d FROM Delivery d WHERE d.dateDelivery = :dateDelivery"),
    @NamedQuery(name = "Delivery.findByAncId", query = "SELECT d FROM Delivery d WHERE d.ancId = :ancId"),
    @NamedQuery(name = "Delivery.findByBookingStatus", query = "SELECT d FROM Delivery d WHERE d.bookingStatus = :bookingStatus"),
    @NamedQuery(name = "Delivery.findByRomDeliveryInterval", query = "SELECT d FROM Delivery d WHERE d.romDeliveryInterval = :romDeliveryInterval"),
    @NamedQuery(name = "Delivery.findByModeDelivery", query = "SELECT d FROM Delivery d WHERE d.modeDelivery = :modeDelivery"),
    @NamedQuery(name = "Delivery.findByEpisiotomy", query = "SELECT d FROM Delivery d WHERE d.episiotomy = :episiotomy"),
    @NamedQuery(name = "Delivery.findByVaginalTear", query = "SELECT d FROM Delivery d WHERE d.vaginalTear = :vaginalTear"),
    @NamedQuery(name = "Delivery.findByMaternalOutcome", query = "SELECT d FROM Delivery d WHERE d.maternalOutcome = :maternalOutcome"),
    @NamedQuery(name = "Delivery.findByGestationalAge", query = "SELECT d FROM Delivery d WHERE d.gestationalAge = :gestationalAge"),
    @NamedQuery(name = "Delivery.findByTimeHivDiagnosis", query = "SELECT d FROM Delivery d WHERE d.timeHivDiagnosis = :timeHivDiagnosis"),
    @NamedQuery(name = "Delivery.findBySourceReferral", query = "SELECT d FROM Delivery d WHERE d.sourceReferral = :sourceReferral"),
    @NamedQuery(name = "Delivery.findByHepatitisbStatus", query = "SELECT d FROM Delivery d WHERE d.hepatitisbStatus = :hepatitisbStatus"),
    @NamedQuery(name = "Delivery.findByHepatitiscStatus", query = "SELECT d FROM Delivery d WHERE d.hepatitiscStatus = :hepatitiscStatus"),
    @NamedQuery(name = "Delivery.findByScreenPostPartum", query = "SELECT d FROM Delivery d WHERE d.screenPostPartum = :screenPostPartum"),
    @NamedQuery(name = "Delivery.findByArvRegimenPast", query = "SELECT d FROM Delivery d WHERE d.arvRegimenPast = :arvRegimenPast"),
    @NamedQuery(name = "Delivery.findByArvRegimenCurrent", query = "SELECT d FROM Delivery d WHERE d.arvRegimenCurrent = :arvRegimenCurrent"),
    @NamedQuery(name = "Delivery.findByDateArvRegimenCurrent", query = "SELECT d FROM Delivery d WHERE d.dateArvRegimenCurrent = :dateArvRegimenCurrent"),
    @NamedQuery(name = "Delivery.findByDateConfirmedHiv", query = "SELECT d FROM Delivery d WHERE d.dateConfirmedHiv = :dateConfirmedHiv"),
    @NamedQuery(name = "Delivery.findByClinicStage", query = "SELECT d FROM Delivery d WHERE d.clinicStage = :clinicStage"),
    @NamedQuery(name = "Delivery.findByCd4Ordered", query = "SELECT d FROM Delivery d WHERE d.cd4Ordered = :cd4Ordered"),
    @NamedQuery(name = "Delivery.findByCd4", query = "SELECT d FROM Delivery d WHERE d.cd4 = :cd4"),
    @NamedQuery(name = "Delivery.findByTimeStamp", query = "SELECT d FROM Delivery d WHERE d.timeStamp = :timeStamp"),
    @NamedQuery(name = "Delivery.findByUploaded", query = "SELECT d FROM Delivery d WHERE d.uploaded = :uploaded"),
    @NamedQuery(name = "Delivery.findByTimeUploaded", query = "SELECT d FROM Delivery d WHERE d.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Delivery.findByUserId", query = "SELECT d FROM Delivery d WHERE d.userId = :userId"),
    @NamedQuery(name = "Delivery.findByIdUuid", query = "SELECT d FROM Delivery d WHERE d.idUuid = :idUuid"),
    @NamedQuery(name = "Delivery.findByUuid", query = "SELECT d FROM Delivery d WHERE d.uuid = :uuid")})
public class Delivery implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DELIVERY_ID")
    private Long deliveryId;
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
    @Column(name = "DATE_DELIVERY")
    @Temporal(TemporalType.DATE)
    private Date dateDelivery;
    @Column(name = "ANC_ID")
    private BigInteger ancId;
    @Column(name = "BOOKING_STATUS")
    private Integer bookingStatus;
    @Size(max = 25)
    @Column(name = "ROM_DELIVERY_INTERVAL")
    private String romDeliveryInterval;
    @Size(max = 45)
    @Column(name = "MODE_DELIVERY")
    private String modeDelivery;
    @Size(max = 25)
    @Column(name = "EPISIOTOMY")
    private String episiotomy;
    @Size(max = 7)
    @Column(name = "VAGINAL_TEAR")
    private String vaginalTear;
    @Size(max = 25)
    @Column(name = "MATERNAL_OUTCOME")
    private String maternalOutcome;
    @Column(name = "GESTATIONAL_AGE")
    private Integer gestationalAge;
    @Size(max = 100)
    @Column(name = "TIME_HIV_DIAGNOSIS")
    private String timeHivDiagnosis;
    @Size(max = 100)
    @Column(name = "SOURCE_REFERRAL")
    private String sourceReferral;
    @Size(max = 70)
    @Column(name = "HEPATITISB_STATUS")
    private String hepatitisbStatus;
    @Size(max = 70)
    @Column(name = "HEPATITISC_STATUS")
    private String hepatitiscStatus;
    @Column(name = "SCREEN_POST_PARTUM")
    private Integer screenPostPartum;
    @Size(max = 100)
    @Column(name = "ARV_REGIMEN_PAST")
    private String arvRegimenPast;
    @Size(max = 100)
    @Column(name = "ARV_REGIMEN_CURRENT")
    private String arvRegimenCurrent;
    @Column(name = "DATE_ARV_REGIMEN_CURRENT")
    @Temporal(TemporalType.DATE)
    private Date dateArvRegimenCurrent;
    @Column(name = "DATE_CONFIRMED_HIV")
    @Temporal(TemporalType.DATE)
    private Date dateConfirmedHiv;
    @Size(max = 15)
    @Column(name = "CLINIC_STAGE")
    private String clinicStage;
    @Size(max = 7)
    @Column(name = "CD4_ORDERED")
    private String cd4Ordered;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CD4")
    private Double cd4;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "UPLOADED")
    private Integer uploaded;
    @Column(name = "TIME_UPLOADED")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeUploaded;
    @Column(name = "USER_ID")
    private BigInteger userId;
    @Size(max = 36)
    @Column(name = "ID_UUID")
    private String idUuid;
    @Size(max = 36)
    @Column(name = "UUID")
    private String uuid;

    public Delivery() {
    }

    public Delivery(Long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Delivery(Long deliveryId, long patientId, long facilityId, Date dateDelivery) {
        this.deliveryId = deliveryId;
        this.patientId = patientId;
        this.facilityId = facilityId;
        this.dateDelivery = dateDelivery;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
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

    public Date getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(Date dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public BigInteger getAncId() {
        return ancId;
    }

    public void setAncId(BigInteger ancId) {
        this.ancId = ancId;
    }

    public Integer getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(Integer bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getRomDeliveryInterval() {
        return romDeliveryInterval;
    }

    public void setRomDeliveryInterval(String romDeliveryInterval) {
        this.romDeliveryInterval = romDeliveryInterval;
    }

    public String getModeDelivery() {
        return modeDelivery;
    }

    public void setModeDelivery(String modeDelivery) {
        this.modeDelivery = modeDelivery;
    }

    public String getEpisiotomy() {
        return episiotomy;
    }

    public void setEpisiotomy(String episiotomy) {
        this.episiotomy = episiotomy;
    }

    public String getVaginalTear() {
        return vaginalTear;
    }

    public void setVaginalTear(String vaginalTear) {
        this.vaginalTear = vaginalTear;
    }

    public String getMaternalOutcome() {
        return maternalOutcome;
    }

    public void setMaternalOutcome(String maternalOutcome) {
        this.maternalOutcome = maternalOutcome;
    }

    public Integer getGestationalAge() {
        return gestationalAge;
    }

    public void setGestationalAge(Integer gestationalAge) {
        this.gestationalAge = gestationalAge;
    }

    public String getTimeHivDiagnosis() {
        return timeHivDiagnosis;
    }

    public void setTimeHivDiagnosis(String timeHivDiagnosis) {
        this.timeHivDiagnosis = timeHivDiagnosis;
    }

    public String getSourceReferral() {
        return sourceReferral;
    }

    public void setSourceReferral(String sourceReferral) {
        this.sourceReferral = sourceReferral;
    }

    public String getHepatitisbStatus() {
        return hepatitisbStatus;
    }

    public void setHepatitisbStatus(String hepatitisbStatus) {
        this.hepatitisbStatus = hepatitisbStatus;
    }

    public String getHepatitiscStatus() {
        return hepatitiscStatus;
    }

    public void setHepatitiscStatus(String hepatitiscStatus) {
        this.hepatitiscStatus = hepatitiscStatus;
    }

    public Integer getScreenPostPartum() {
        return screenPostPartum;
    }

    public void setScreenPostPartum(Integer screenPostPartum) {
        this.screenPostPartum = screenPostPartum;
    }

    public String getArvRegimenPast() {
        return arvRegimenPast;
    }

    public void setArvRegimenPast(String arvRegimenPast) {
        this.arvRegimenPast = arvRegimenPast;
    }

    public String getArvRegimenCurrent() {
        return arvRegimenCurrent;
    }

    public void setArvRegimenCurrent(String arvRegimenCurrent) {
        this.arvRegimenCurrent = arvRegimenCurrent;
    }

    public Date getDateArvRegimenCurrent() {
        return dateArvRegimenCurrent;
    }

    public void setDateArvRegimenCurrent(Date dateArvRegimenCurrent) {
        this.dateArvRegimenCurrent = dateArvRegimenCurrent;
    }

    public Date getDateConfirmedHiv() {
        return dateConfirmedHiv;
    }

    public void setDateConfirmedHiv(Date dateConfirmedHiv) {
        this.dateConfirmedHiv = dateConfirmedHiv;
    }

    public String getClinicStage() {
        return clinicStage;
    }

    public void setClinicStage(String clinicStage) {
        this.clinicStage = clinicStage;
    }

    public String getCd4Ordered() {
        return cd4Ordered;
    }

    public void setCd4Ordered(String cd4Ordered) {
        this.cd4Ordered = cd4Ordered;
    }

    public Double getCd4() {
        return cd4;
    }

    public void setCd4(Double cd4) {
        this.cd4 = cd4;
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

    public BigInteger getUserId() {
        return userId;
    }

    public void setUserId(BigInteger userId) {
        this.userId = userId;
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
        hash += (deliveryId != null ? deliveryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Delivery)) {
            return false;
        }
        Delivery other = (Delivery) object;
        if ((this.deliveryId == null && other.deliveryId != null) || (this.deliveryId != null && !this.deliveryId.equals(other.deliveryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Delivery[ deliveryId=" + deliveryId + " ]";
    }
    
}
