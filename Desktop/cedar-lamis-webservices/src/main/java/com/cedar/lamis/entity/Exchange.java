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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "EXCHANGE")
@NamedQueries({
    @NamedQuery(name = "Exchange.findAll", query = "SELECT e FROM Exchange e"),
    @NamedQuery(name = "Exchange.findByExchangeId", query = "SELECT e FROM Exchange e WHERE e.exchangeId = :exchangeId"),
    @NamedQuery(name = "Exchange.findByFacilityId", query = "SELECT e FROM Exchange e WHERE e.facilityId = :facilityId"),
    @NamedQuery(name = "Exchange.findByPatient", query = "SELECT e FROM Exchange e WHERE e.patient = :patient"),
    @NamedQuery(name = "Exchange.findByClinic", query = "SELECT e FROM Exchange e WHERE e.clinic = :clinic"),
    @NamedQuery(name = "Exchange.findByPharmacy", query = "SELECT e FROM Exchange e WHERE e.pharmacy = :pharmacy"),
    @NamedQuery(name = "Exchange.findByLaboratory", query = "SELECT e FROM Exchange e WHERE e.laboratory = :laboratory"),
    @NamedQuery(name = "Exchange.findByAdrhistory", query = "SELECT e FROM Exchange e WHERE e.adrhistory = :adrhistory"),
    @NamedQuery(name = "Exchange.findByOihistory", query = "SELECT e FROM Exchange e WHERE e.oihistory = :oihistory"),
    @NamedQuery(name = "Exchange.findByAdherehistory", query = "SELECT e FROM Exchange e WHERE e.adherehistory = :adherehistory"),
    @NamedQuery(name = "Exchange.findByStatushistory", query = "SELECT e FROM Exchange e WHERE e.statushistory = :statushistory"),
    @NamedQuery(name = "Exchange.findByRegimenhistory", query = "SELECT e FROM Exchange e WHERE e.regimenhistory = :regimenhistory"),
    @NamedQuery(name = "Exchange.findBySpecimen", query = "SELECT e FROM Exchange e WHERE e.specimen = :specimen"),
    @NamedQuery(name = "Exchange.findByEid", query = "SELECT e FROM Exchange e WHERE e.eid = :eid"),
    @NamedQuery(name = "Exchange.findByLabno", query = "SELECT e FROM Exchange e WHERE e.labno = :labno"),
    @NamedQuery(name = "Exchange.findByChroniccare", query = "SELECT e FROM Exchange e WHERE e.chroniccare = :chroniccare"),
    @NamedQuery(name = "Exchange.findByTbscreenhistory", query = "SELECT e FROM Exchange e WHERE e.tbscreenhistory = :tbscreenhistory"),
    @NamedQuery(name = "Exchange.findByDmscreenhistory", query = "SELECT e FROM Exchange e WHERE e.dmscreenhistory = :dmscreenhistory"),
    @NamedQuery(name = "Exchange.findByAnc", query = "SELECT e FROM Exchange e WHERE e.anc = :anc"),
    @NamedQuery(name = "Exchange.findByDelivery", query = "SELECT e FROM Exchange e WHERE e.delivery = :delivery"),
    @NamedQuery(name = "Exchange.findByMaternalfollowup", query = "SELECT e FROM Exchange e WHERE e.maternalfollowup = :maternalfollowup"),
    @NamedQuery(name = "Exchange.findByChild", query = "SELECT e FROM Exchange e WHERE e.child = :child"),
    @NamedQuery(name = "Exchange.findByChildfollowup", query = "SELECT e FROM Exchange e WHERE e.childfollowup = :childfollowup"),
    @NamedQuery(name = "Exchange.findByPartnerinformation", query = "SELECT e FROM Exchange e WHERE e.partnerinformation = :partnerinformation"),
    @NamedQuery(name = "Exchange.findByNigqual", query = "SELECT e FROM Exchange e WHERE e.nigqual = :nigqual"),
    @NamedQuery(name = "Exchange.findByDevolve", query = "SELECT e FROM Exchange e WHERE e.devolve = :devolve"),
    @NamedQuery(name = "Exchange.findByEncounter", query = "SELECT e FROM Exchange e WHERE e.encounter = :encounter"),
    @NamedQuery(name = "Exchange.findByDrugtherapy", query = "SELECT e FROM Exchange e WHERE e.drugtherapy = :drugtherapy"),
    @NamedQuery(name = "Exchange.findByAppointment", query = "SELECT e FROM Exchange e WHERE e.appointment = :appointment"),
    @NamedQuery(name = "Exchange.findByMhtc", query = "SELECT e FROM Exchange e WHERE e.mhtc = :mhtc"),
    @NamedQuery(name = "Exchange.findByCommunitypharm", query = "SELECT e FROM Exchange e WHERE e.communitypharm = :communitypharm"),
    @NamedQuery(name = "Exchange.findByCasemanager", query = "SELECT e FROM Exchange e WHERE e.casemanager = :casemanager"),
    @NamedQuery(name = "Exchange.findByPatientcasemanager", query = "SELECT e FROM Exchange e WHERE e.patientcasemanager = :patientcasemanager"),
    @NamedQuery(name = "Exchange.findByEac", query = "SELECT e FROM Exchange e WHERE e.eac = :eac"),
    @NamedQuery(name = "Exchange.findByUser", query = "SELECT e FROM Exchange e WHERE e.user = :user"),
    @NamedQuery(name = "Exchange.findByMonitor", query = "SELECT e FROM Exchange e WHERE e.monitor = :monitor"),
    @NamedQuery(name = "Exchange.findByExport", query = "SELECT e FROM Exchange e WHERE e.export = :export"),
    @NamedQuery(name = "Exchange.findByMotherinformation", query = "SELECT e FROM Exchange e WHERE e.motherinformation = :motherinformation"),
    @NamedQuery(name = "Exchange.findByAssessment", query = "SELECT e FROM Exchange e WHERE e.assessment = :assessment"),
    @NamedQuery(name = "Exchange.findByHts", query = "SELECT e FROM Exchange e WHERE e.hts = :hts"),
    @NamedQuery(name = "Exchange.findByIndexcontact", query = "SELECT e FROM Exchange e WHERE e.indexcontact = :indexcontact"),
    @NamedQuery(name = "Exchange.findByBiometric", query = "SELECT e FROM Exchange e WHERE e.biometric = :biometric")})
public class Exchange implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EXCHANGE_ID")
    private Long exchangeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Column(name = "PATIENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date patient;
    @Column(name = "CLINIC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date clinic;
    @Column(name = "PHARMACY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pharmacy;
    @Column(name = "LABORATORY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date laboratory;
    @Column(name = "ADRHISTORY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date adrhistory;
    @Column(name = "OIHISTORY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date oihistory;
    @Column(name = "ADHEREHISTORY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date adherehistory;
    @Column(name = "STATUSHISTORY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statushistory;
    @Column(name = "REGIMENHISTORY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regimenhistory;
    @Column(name = "SPECIMEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date specimen;
    @Column(name = "EID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eid;
    @Column(name = "LABNO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date labno;
    @Column(name = "CHRONICCARE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chroniccare;
    @Column(name = "TBSCREENHISTORY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tbscreenhistory;
    @Column(name = "DMSCREENHISTORY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dmscreenhistory;
    @Column(name = "ANC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date anc;
    @Column(name = "DELIVERY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date delivery;
    @Column(name = "MATERNALFOLLOWUP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date maternalfollowup;
    @Column(name = "CHILD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date child;
    @Column(name = "CHILDFOLLOWUP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date childfollowup;
    @Column(name = "PARTNERINFORMATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date partnerinformation;
    @Column(name = "NIGQUAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nigqual;
    @Column(name = "DEVOLVE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date devolve;
    @Column(name = "ENCOUNTER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date encounter;
    @Column(name = "DRUGTHERAPY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date drugtherapy;
    @Column(name = "APPOINTMENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date appointment;
    @Column(name = "MHTC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mhtc;
    @Column(name = "COMMUNITYPHARM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date communitypharm;
    @Column(name = "CASEMANAGER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date casemanager;
    @Column(name = "PATIENTCASEMANAGER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date patientcasemanager;
    @Column(name = "EAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eac;
    @Column(name = "USER")
    @Temporal(TemporalType.TIMESTAMP)
    private Date user;
    @Column(name = "MONITOR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date monitor;
    @Column(name = "EXPORT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date export;
    @Column(name = "MOTHERINFORMATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date motherinformation;
    @Column(name = "ASSESSMENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date assessment;
    @Column(name = "HTS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hts;
    @Column(name = "INDEXCONTACT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date indexcontact;
    @Column(name = "BIOMETRIC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date biometric;

    public Exchange() {
    }

    public Exchange(Long exchangeId) {
        this.exchangeId = exchangeId;
    }

    public Exchange(Long exchangeId, long facilityId) {
        this.exchangeId = exchangeId;
        this.facilityId = facilityId;
    }

    public Long getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Long exchangeId) {
        this.exchangeId = exchangeId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public Date getPatient() {
        return patient;
    }

    public void setPatient(Date patient) {
        this.patient = patient;
    }

    public Date getClinic() {
        return clinic;
    }

    public void setClinic(Date clinic) {
        this.clinic = clinic;
    }

    public Date getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Date pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Date getLaboratory() {
        return laboratory;
    }

    public void setLaboratory(Date laboratory) {
        this.laboratory = laboratory;
    }

    public Date getAdrhistory() {
        return adrhistory;
    }

    public void setAdrhistory(Date adrhistory) {
        this.adrhistory = adrhistory;
    }

    public Date getOihistory() {
        return oihistory;
    }

    public void setOihistory(Date oihistory) {
        this.oihistory = oihistory;
    }

    public Date getAdherehistory() {
        return adherehistory;
    }

    public void setAdherehistory(Date adherehistory) {
        this.adherehistory = adherehistory;
    }

    public Date getStatushistory() {
        return statushistory;
    }

    public void setStatushistory(Date statushistory) {
        this.statushistory = statushistory;
    }

    public Date getRegimenhistory() {
        return regimenhistory;
    }

    public void setRegimenhistory(Date regimenhistory) {
        this.regimenhistory = regimenhistory;
    }

    public Date getSpecimen() {
        return specimen;
    }

    public void setSpecimen(Date specimen) {
        this.specimen = specimen;
    }

    public Date getEid() {
        return eid;
    }

    public void setEid(Date eid) {
        this.eid = eid;
    }

    public Date getLabno() {
        return labno;
    }

    public void setLabno(Date labno) {
        this.labno = labno;
    }

    public Date getChroniccare() {
        return chroniccare;
    }

    public void setChroniccare(Date chroniccare) {
        this.chroniccare = chroniccare;
    }

    public Date getTbscreenhistory() {
        return tbscreenhistory;
    }

    public void setTbscreenhistory(Date tbscreenhistory) {
        this.tbscreenhistory = tbscreenhistory;
    }

    public Date getDmscreenhistory() {
        return dmscreenhistory;
    }

    public void setDmscreenhistory(Date dmscreenhistory) {
        this.dmscreenhistory = dmscreenhistory;
    }

    public Date getAnc() {
        return anc;
    }

    public void setAnc(Date anc) {
        this.anc = anc;
    }

    public Date getDelivery() {
        return delivery;
    }

    public void setDelivery(Date delivery) {
        this.delivery = delivery;
    }

    public Date getMaternalfollowup() {
        return maternalfollowup;
    }

    public void setMaternalfollowup(Date maternalfollowup) {
        this.maternalfollowup = maternalfollowup;
    }

    public Date getChild() {
        return child;
    }

    public void setChild(Date child) {
        this.child = child;
    }

    public Date getChildfollowup() {
        return childfollowup;
    }

    public void setChildfollowup(Date childfollowup) {
        this.childfollowup = childfollowup;
    }

    public Date getPartnerinformation() {
        return partnerinformation;
    }

    public void setPartnerinformation(Date partnerinformation) {
        this.partnerinformation = partnerinformation;
    }

    public Date getNigqual() {
        return nigqual;
    }

    public void setNigqual(Date nigqual) {
        this.nigqual = nigqual;
    }

    public Date getDevolve() {
        return devolve;
    }

    public void setDevolve(Date devolve) {
        this.devolve = devolve;
    }

    public Date getEncounter() {
        return encounter;
    }

    public void setEncounter(Date encounter) {
        this.encounter = encounter;
    }

    public Date getDrugtherapy() {
        return drugtherapy;
    }

    public void setDrugtherapy(Date drugtherapy) {
        this.drugtherapy = drugtherapy;
    }

    public Date getAppointment() {
        return appointment;
    }

    public void setAppointment(Date appointment) {
        this.appointment = appointment;
    }

    public Date getMhtc() {
        return mhtc;
    }

    public void setMhtc(Date mhtc) {
        this.mhtc = mhtc;
    }

    public Date getCommunitypharm() {
        return communitypharm;
    }

    public void setCommunitypharm(Date communitypharm) {
        this.communitypharm = communitypharm;
    }

    public Date getCasemanager() {
        return casemanager;
    }

    public void setCasemanager(Date casemanager) {
        this.casemanager = casemanager;
    }

    public Date getPatientcasemanager() {
        return patientcasemanager;
    }

    public void setPatientcasemanager(Date patientcasemanager) {
        this.patientcasemanager = patientcasemanager;
    }

    public Date getEac() {
        return eac;
    }

    public void setEac(Date eac) {
        this.eac = eac;
    }

    public Date getUser() {
        return user;
    }

    public void setUser(Date user) {
        this.user = user;
    }

    public Date getMonitor() {
        return monitor;
    }

    public void setMonitor(Date monitor) {
        this.monitor = monitor;
    }

    public Date getExport() {
        return export;
    }

    public void setExport(Date export) {
        this.export = export;
    }

    public Date getMotherinformation() {
        return motherinformation;
    }

    public void setMotherinformation(Date motherinformation) {
        this.motherinformation = motherinformation;
    }

    public Date getAssessment() {
        return assessment;
    }

    public void setAssessment(Date assessment) {
        this.assessment = assessment;
    }

    public Date getHts() {
        return hts;
    }

    public void setHts(Date hts) {
        this.hts = hts;
    }

    public Date getIndexcontact() {
        return indexcontact;
    }

    public void setIndexcontact(Date indexcontact) {
        this.indexcontact = indexcontact;
    }

    public Date getBiometric() {
        return biometric;
    }

    public void setBiometric(Date biometric) {
        this.biometric = biometric;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (exchangeId != null ? exchangeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exchange)) {
            return false;
        }
        Exchange other = (Exchange) object;
        if ((this.exchangeId == null && other.exchangeId != null) || (this.exchangeId != null && !this.exchangeId.equals(other.exchangeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Exchange[ exchangeId=" + exchangeId + " ]";
    }
    
}
