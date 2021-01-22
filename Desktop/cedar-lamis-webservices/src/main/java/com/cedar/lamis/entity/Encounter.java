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
@Table(name = "ENCOUNTER")
@NamedQueries({
    @NamedQuery(name = "Encounter.findAll", query = "SELECT e FROM Encounter e"),
    @NamedQuery(name = "Encounter.findByEncounterId", query = "SELECT e FROM Encounter e WHERE e.encounterId = :encounterId"),
    @NamedQuery(name = "Encounter.findByFacilityId", query = "SELECT e FROM Encounter e WHERE e.facilityId = :facilityId"),
    @NamedQuery(name = "Encounter.findByCommunitypharmId", query = "SELECT e FROM Encounter e WHERE e.communitypharmId = :communitypharmId"),
    @NamedQuery(name = "Encounter.findByDateVisit", query = "SELECT e FROM Encounter e WHERE e.dateVisit = :dateVisit"),
    @NamedQuery(name = "Encounter.findByQuestion1", query = "SELECT e FROM Encounter e WHERE e.question1 = :question1"),
    @NamedQuery(name = "Encounter.findByQuestion2", query = "SELECT e FROM Encounter e WHERE e.question2 = :question2"),
    @NamedQuery(name = "Encounter.findByQuestion3", query = "SELECT e FROM Encounter e WHERE e.question3 = :question3"),
    @NamedQuery(name = "Encounter.findByQuestion4", query = "SELECT e FROM Encounter e WHERE e.question4 = :question4"),
    @NamedQuery(name = "Encounter.findByQuestion5", query = "SELECT e FROM Encounter e WHERE e.question5 = :question5"),
    @NamedQuery(name = "Encounter.findByQuestion6", query = "SELECT e FROM Encounter e WHERE e.question6 = :question6"),
    @NamedQuery(name = "Encounter.findByQuestion7", query = "SELECT e FROM Encounter e WHERE e.question7 = :question7"),
    @NamedQuery(name = "Encounter.findByQuestion8", query = "SELECT e FROM Encounter e WHERE e.question8 = :question8"),
    @NamedQuery(name = "Encounter.findByQuestion9", query = "SELECT e FROM Encounter e WHERE e.question9 = :question9"),
    @NamedQuery(name = "Encounter.findByRegimen1", query = "SELECT e FROM Encounter e WHERE e.regimen1 = :regimen1"),
    @NamedQuery(name = "Encounter.findByRegimen2", query = "SELECT e FROM Encounter e WHERE e.regimen2 = :regimen2"),
    @NamedQuery(name = "Encounter.findByRegimen3", query = "SELECT e FROM Encounter e WHERE e.regimen3 = :regimen3"),
    @NamedQuery(name = "Encounter.findByRegimen4", query = "SELECT e FROM Encounter e WHERE e.regimen4 = :regimen4"),
    @NamedQuery(name = "Encounter.findByDuration1", query = "SELECT e FROM Encounter e WHERE e.duration1 = :duration1"),
    @NamedQuery(name = "Encounter.findByDuration2", query = "SELECT e FROM Encounter e WHERE e.duration2 = :duration2"),
    @NamedQuery(name = "Encounter.findByDuration3", query = "SELECT e FROM Encounter e WHERE e.duration3 = :duration3"),
    @NamedQuery(name = "Encounter.findByDuration4", query = "SELECT e FROM Encounter e WHERE e.duration4 = :duration4"),
    @NamedQuery(name = "Encounter.findByPrescribed1", query = "SELECT e FROM Encounter e WHERE e.prescribed1 = :prescribed1"),
    @NamedQuery(name = "Encounter.findByPrescribed2", query = "SELECT e FROM Encounter e WHERE e.prescribed2 = :prescribed2"),
    @NamedQuery(name = "Encounter.findByPrescribed3", query = "SELECT e FROM Encounter e WHERE e.prescribed3 = :prescribed3"),
    @NamedQuery(name = "Encounter.findByPrescribed4", query = "SELECT e FROM Encounter e WHERE e.prescribed4 = :prescribed4"),
    @NamedQuery(name = "Encounter.findByDispensed1", query = "SELECT e FROM Encounter e WHERE e.dispensed1 = :dispensed1"),
    @NamedQuery(name = "Encounter.findByDispensed2", query = "SELECT e FROM Encounter e WHERE e.dispensed2 = :dispensed2"),
    @NamedQuery(name = "Encounter.findByDispensed3", query = "SELECT e FROM Encounter e WHERE e.dispensed3 = :dispensed3"),
    @NamedQuery(name = "Encounter.findByDispensed4", query = "SELECT e FROM Encounter e WHERE e.dispensed4 = :dispensed4"),
    @NamedQuery(name = "Encounter.findByNotes", query = "SELECT e FROM Encounter e WHERE e.notes = :notes"),
    @NamedQuery(name = "Encounter.findByNextRefill", query = "SELECT e FROM Encounter e WHERE e.nextRefill = :nextRefill"),
    @NamedQuery(name = "Encounter.findByRegimentype", query = "SELECT e FROM Encounter e WHERE e.regimentype = :regimentype"),
    @NamedQuery(name = "Encounter.findByTimeStamp", query = "SELECT e FROM Encounter e WHERE e.timeStamp = :timeStamp"),
    @NamedQuery(name = "Encounter.findByUploaded", query = "SELECT e FROM Encounter e WHERE e.uploaded = :uploaded"),
    @NamedQuery(name = "Encounter.findByTimeUploaded", query = "SELECT e FROM Encounter e WHERE e.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Encounter.findByIdUuid", query = "SELECT e FROM Encounter e WHERE e.idUuid = :idUuid"),
    @NamedQuery(name = "Encounter.findByUuid", query = "SELECT e FROM Encounter e WHERE e.uuid = :uuid"),
    @NamedQuery(name = "Encounter.findByDeviceconfigId", query = "SELECT e FROM Encounter e WHERE e.deviceconfigId = :deviceconfigId")})
public class Encounter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ENCOUNTER_ID")
    private Long encounterId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "COMMUNITYPHARM_ID")
    private long communitypharmId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Size(max = 5)
    @Column(name = "QUESTION1")
    private String question1;
    @Size(max = 5)
    @Column(name = "QUESTION2")
    private String question2;
    @Size(max = 5)
    @Column(name = "QUESTION3")
    private String question3;
    @Size(max = 5)
    @Column(name = "QUESTION4")
    private String question4;
    @Size(max = 5)
    @Column(name = "QUESTION5")
    private String question5;
    @Size(max = 5)
    @Column(name = "QUESTION6")
    private String question6;
    @Size(max = 5)
    @Column(name = "QUESTION7")
    private String question7;
    @Size(max = 5)
    @Column(name = "QUESTION8")
    private String question8;
    @Size(max = 5)
    @Column(name = "QUESTION9")
    private String question9;
    @Size(max = 100)
    @Column(name = "REGIMEN1")
    private String regimen1;
    @Size(max = 100)
    @Column(name = "REGIMEN2")
    private String regimen2;
    @Size(max = 100)
    @Column(name = "REGIMEN3")
    private String regimen3;
    @Size(max = 100)
    @Column(name = "REGIMEN4")
    private String regimen4;
    @Column(name = "DURATION1")
    private Integer duration1;
    @Column(name = "DURATION2")
    private Integer duration2;
    @Column(name = "DURATION3")
    private Integer duration3;
    @Column(name = "DURATION4")
    private Integer duration4;
    @Column(name = "PRESCRIBED1")
    private Integer prescribed1;
    @Column(name = "PRESCRIBED2")
    private Integer prescribed2;
    @Column(name = "PRESCRIBED3")
    private Integer prescribed3;
    @Column(name = "PRESCRIBED4")
    private Integer prescribed4;
    @Column(name = "DISPENSED1")
    private Integer dispensed1;
    @Column(name = "DISPENSED2")
    private Integer dispensed2;
    @Column(name = "DISPENSED3")
    private Integer dispensed3;
    @Column(name = "DISPENSED4")
    private Integer dispensed4;
    @Size(max = 500)
    @Column(name = "NOTES")
    private String notes;
    @Column(name = "NEXT_REFILL")
    @Temporal(TemporalType.DATE)
    private Date nextRefill;
    @Size(max = 100)
    @Column(name = "REGIMENTYPE")
    private String regimentype;
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
    @Column(name = "DEVICECONFIG_ID")
    private BigInteger deviceconfigId;
    @JoinColumn(name = "PATIENT_ID", referencedColumnName = "PATIENT_ID")
    @ManyToOne(optional = false)
    private Patient patientId;

    public Encounter() {
    }

    public Encounter(Long encounterId) {
        this.encounterId = encounterId;
    }

    public Encounter(Long encounterId, long facilityId, long communitypharmId, Date dateVisit) {
        this.encounterId = encounterId;
        this.facilityId = facilityId;
        this.communitypharmId = communitypharmId;
        this.dateVisit = dateVisit;
    }

    public Long getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(Long encounterId) {
        this.encounterId = encounterId;
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

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public String getQuestion5() {
        return question5;
    }

    public void setQuestion5(String question5) {
        this.question5 = question5;
    }

    public String getQuestion6() {
        return question6;
    }

    public void setQuestion6(String question6) {
        this.question6 = question6;
    }

    public String getQuestion7() {
        return question7;
    }

    public void setQuestion7(String question7) {
        this.question7 = question7;
    }

    public String getQuestion8() {
        return question8;
    }

    public void setQuestion8(String question8) {
        this.question8 = question8;
    }

    public String getQuestion9() {
        return question9;
    }

    public void setQuestion9(String question9) {
        this.question9 = question9;
    }

    public String getRegimen1() {
        return regimen1;
    }

    public void setRegimen1(String regimen1) {
        this.regimen1 = regimen1;
    }

    public String getRegimen2() {
        return regimen2;
    }

    public void setRegimen2(String regimen2) {
        this.regimen2 = regimen2;
    }

    public String getRegimen3() {
        return regimen3;
    }

    public void setRegimen3(String regimen3) {
        this.regimen3 = regimen3;
    }

    public String getRegimen4() {
        return regimen4;
    }

    public void setRegimen4(String regimen4) {
        this.regimen4 = regimen4;
    }

    public Integer getDuration1() {
        return duration1;
    }

    public void setDuration1(Integer duration1) {
        this.duration1 = duration1;
    }

    public Integer getDuration2() {
        return duration2;
    }

    public void setDuration2(Integer duration2) {
        this.duration2 = duration2;
    }

    public Integer getDuration3() {
        return duration3;
    }

    public void setDuration3(Integer duration3) {
        this.duration3 = duration3;
    }

    public Integer getDuration4() {
        return duration4;
    }

    public void setDuration4(Integer duration4) {
        this.duration4 = duration4;
    }

    public Integer getPrescribed1() {
        return prescribed1;
    }

    public void setPrescribed1(Integer prescribed1) {
        this.prescribed1 = prescribed1;
    }

    public Integer getPrescribed2() {
        return prescribed2;
    }

    public void setPrescribed2(Integer prescribed2) {
        this.prescribed2 = prescribed2;
    }

    public Integer getPrescribed3() {
        return prescribed3;
    }

    public void setPrescribed3(Integer prescribed3) {
        this.prescribed3 = prescribed3;
    }

    public Integer getPrescribed4() {
        return prescribed4;
    }

    public void setPrescribed4(Integer prescribed4) {
        this.prescribed4 = prescribed4;
    }

    public Integer getDispensed1() {
        return dispensed1;
    }

    public void setDispensed1(Integer dispensed1) {
        this.dispensed1 = dispensed1;
    }

    public Integer getDispensed2() {
        return dispensed2;
    }

    public void setDispensed2(Integer dispensed2) {
        this.dispensed2 = dispensed2;
    }

    public Integer getDispensed3() {
        return dispensed3;
    }

    public void setDispensed3(Integer dispensed3) {
        this.dispensed3 = dispensed3;
    }

    public Integer getDispensed4() {
        return dispensed4;
    }

    public void setDispensed4(Integer dispensed4) {
        this.dispensed4 = dispensed4;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getNextRefill() {
        return nextRefill;
    }

    public void setNextRefill(Date nextRefill) {
        this.nextRefill = nextRefill;
    }

    public String getRegimentype() {
        return regimentype;
    }

    public void setRegimentype(String regimentype) {
        this.regimentype = regimentype;
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

    public BigInteger getDeviceconfigId() {
        return deviceconfigId;
    }

    public void setDeviceconfigId(BigInteger deviceconfigId) {
        this.deviceconfigId = deviceconfigId;
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
        hash += (encounterId != null ? encounterId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Encounter)) {
            return false;
        }
        Encounter other = (Encounter) object;
        if ((this.encounterId == null && other.encounterId != null) || (this.encounterId != null && !this.encounterId.equals(other.encounterId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Encounter[ encounterId=" + encounterId + " ]";
    }
    
}
