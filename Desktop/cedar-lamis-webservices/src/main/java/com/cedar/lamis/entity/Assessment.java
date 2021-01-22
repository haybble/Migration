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
@Table(name = "ASSESSMENT")
@NamedQueries({
    @NamedQuery(name = "Assessment.findAll", query = "SELECT a FROM Assessment a"),
    @NamedQuery(name = "Assessment.findByAssessmentId", query = "SELECT a FROM Assessment a WHERE a.assessmentId = :assessmentId"),
    @NamedQuery(name = "Assessment.findByFacilityId", query = "SELECT a FROM Assessment a WHERE a.facilityId = :facilityId"),
    @NamedQuery(name = "Assessment.findByDateVisit", query = "SELECT a FROM Assessment a WHERE a.dateVisit = :dateVisit"),
    @NamedQuery(name = "Assessment.findByClientCode", query = "SELECT a FROM Assessment a WHERE a.clientCode = :clientCode"),
    @NamedQuery(name = "Assessment.findByQuestion1", query = "SELECT a FROM Assessment a WHERE a.question1 = :question1"),
    @NamedQuery(name = "Assessment.findByQuestion2", query = "SELECT a FROM Assessment a WHERE a.question2 = :question2"),
    @NamedQuery(name = "Assessment.findByQuestion3", query = "SELECT a FROM Assessment a WHERE a.question3 = :question3"),
    @NamedQuery(name = "Assessment.findByQuestion4", query = "SELECT a FROM Assessment a WHERE a.question4 = :question4"),
    @NamedQuery(name = "Assessment.findByQuestion5", query = "SELECT a FROM Assessment a WHERE a.question5 = :question5"),
    @NamedQuery(name = "Assessment.findByQuestion6", query = "SELECT a FROM Assessment a WHERE a.question6 = :question6"),
    @NamedQuery(name = "Assessment.findByQuestion7", query = "SELECT a FROM Assessment a WHERE a.question7 = :question7"),
    @NamedQuery(name = "Assessment.findByQuestion8", query = "SELECT a FROM Assessment a WHERE a.question8 = :question8"),
    @NamedQuery(name = "Assessment.findByQuestion9", query = "SELECT a FROM Assessment a WHERE a.question9 = :question9"),
    @NamedQuery(name = "Assessment.findByQuestion10", query = "SELECT a FROM Assessment a WHERE a.question10 = :question10"),
    @NamedQuery(name = "Assessment.findByQuestion11", query = "SELECT a FROM Assessment a WHERE a.question11 = :question11"),
    @NamedQuery(name = "Assessment.findByQuestion12", query = "SELECT a FROM Assessment a WHERE a.question12 = :question12"),
    @NamedQuery(name = "Assessment.findBySti1", query = "SELECT a FROM Assessment a WHERE a.sti1 = :sti1"),
    @NamedQuery(name = "Assessment.findBySti2", query = "SELECT a FROM Assessment a WHERE a.sti2 = :sti2"),
    @NamedQuery(name = "Assessment.findBySti3", query = "SELECT a FROM Assessment a WHERE a.sti3 = :sti3"),
    @NamedQuery(name = "Assessment.findBySti4", query = "SELECT a FROM Assessment a WHERE a.sti4 = :sti4"),
    @NamedQuery(name = "Assessment.findBySti5", query = "SELECT a FROM Assessment a WHERE a.sti5 = :sti5"),
    @NamedQuery(name = "Assessment.findBySti6", query = "SELECT a FROM Assessment a WHERE a.sti6 = :sti6"),
    @NamedQuery(name = "Assessment.findBySti7", query = "SELECT a FROM Assessment a WHERE a.sti7 = :sti7"),
    @NamedQuery(name = "Assessment.findBySti8", query = "SELECT a FROM Assessment a WHERE a.sti8 = :sti8"),
    @NamedQuery(name = "Assessment.findByTimeStamp", query = "SELECT a FROM Assessment a WHERE a.timeStamp = :timeStamp"),
    @NamedQuery(name = "Assessment.findByUserId", query = "SELECT a FROM Assessment a WHERE a.userId = :userId"),
    @NamedQuery(name = "Assessment.findByDeviceconfigId", query = "SELECT a FROM Assessment a WHERE a.deviceconfigId = :deviceconfigId"),
    @NamedQuery(name = "Assessment.findByUploaded", query = "SELECT a FROM Assessment a WHERE a.uploaded = :uploaded"),
    @NamedQuery(name = "Assessment.findByTimeUploaded", query = "SELECT a FROM Assessment a WHERE a.timeUploaded = :timeUploaded"),
    @NamedQuery(name = "Assessment.findByIdUuid", query = "SELECT a FROM Assessment a WHERE a.idUuid = :idUuid"),
    @NamedQuery(name = "Assessment.findByUuid", query = "SELECT a FROM Assessment a WHERE a.uuid = :uuid")})
public class Assessment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ASSESSMENT_ID")
    private Long assessmentId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FACILITY_ID")
    private long facilityId;
    @Column(name = "DATE_VISIT")
    @Temporal(TemporalType.DATE)
    private Date dateVisit;
    @Size(max = 100)
    @Column(name = "CLIENT_CODE")
    private String clientCode;
    @Size(max = 100)
    @Column(name = "QUESTION1")
    private String question1;
    @Size(max = 100)
    @Column(name = "QUESTION2")
    private String question2;
    @Column(name = "QUESTION3")
    private Integer question3;
    @Column(name = "QUESTION4")
    private Integer question4;
    @Column(name = "QUESTION5")
    private Integer question5;
    @Column(name = "QUESTION6")
    private Integer question6;
    @Column(name = "QUESTION7")
    private Integer question7;
    @Column(name = "QUESTION8")
    private Integer question8;
    @Column(name = "QUESTION9")
    private Integer question9;
    @Column(name = "QUESTION10")
    private Integer question10;
    @Column(name = "QUESTION11")
    private Integer question11;
    @Column(name = "QUESTION12")
    private Integer question12;
    @Column(name = "STI1")
    private Integer sti1;
    @Column(name = "STI2")
    private Integer sti2;
    @Column(name = "STI3")
    private Integer sti3;
    @Column(name = "STI4")
    private Integer sti4;
    @Column(name = "STI5")
    private Integer sti5;
    @Column(name = "STI6")
    private Integer sti6;
    @Column(name = "STI7")
    private Integer sti7;
    @Column(name = "STI8")
    private Integer sti8;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "USER_ID")
    private Integer userId;
    @Column(name = "DEVICECONFIG_ID")
    private BigInteger deviceconfigId;
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

    public Assessment() {
    }

    public Assessment(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public Assessment(Long assessmentId, long facilityId) {
        this.assessmentId = assessmentId;
        this.facilityId = facilityId;
    }

    public Long getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(Long assessmentId) {
        this.assessmentId = assessmentId;
    }

    public long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(long facilityId) {
        this.facilityId = facilityId;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
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

    public Integer getQuestion3() {
        return question3;
    }

    public void setQuestion3(Integer question3) {
        this.question3 = question3;
    }

    public Integer getQuestion4() {
        return question4;
    }

    public void setQuestion4(Integer question4) {
        this.question4 = question4;
    }

    public Integer getQuestion5() {
        return question5;
    }

    public void setQuestion5(Integer question5) {
        this.question5 = question5;
    }

    public Integer getQuestion6() {
        return question6;
    }

    public void setQuestion6(Integer question6) {
        this.question6 = question6;
    }

    public Integer getQuestion7() {
        return question7;
    }

    public void setQuestion7(Integer question7) {
        this.question7 = question7;
    }

    public Integer getQuestion8() {
        return question8;
    }

    public void setQuestion8(Integer question8) {
        this.question8 = question8;
    }

    public Integer getQuestion9() {
        return question9;
    }

    public void setQuestion9(Integer question9) {
        this.question9 = question9;
    }

    public Integer getQuestion10() {
        return question10;
    }

    public void setQuestion10(Integer question10) {
        this.question10 = question10;
    }

    public Integer getQuestion11() {
        return question11;
    }

    public void setQuestion11(Integer question11) {
        this.question11 = question11;
    }

    public Integer getQuestion12() {
        return question12;
    }

    public void setQuestion12(Integer question12) {
        this.question12 = question12;
    }

    public Integer getSti1() {
        return sti1;
    }

    public void setSti1(Integer sti1) {
        this.sti1 = sti1;
    }

    public Integer getSti2() {
        return sti2;
    }

    public void setSti2(Integer sti2) {
        this.sti2 = sti2;
    }

    public Integer getSti3() {
        return sti3;
    }

    public void setSti3(Integer sti3) {
        this.sti3 = sti3;
    }

    public Integer getSti4() {
        return sti4;
    }

    public void setSti4(Integer sti4) {
        this.sti4 = sti4;
    }

    public Integer getSti5() {
        return sti5;
    }

    public void setSti5(Integer sti5) {
        this.sti5 = sti5;
    }

    public Integer getSti6() {
        return sti6;
    }

    public void setSti6(Integer sti6) {
        this.sti6 = sti6;
    }

    public Integer getSti7() {
        return sti7;
    }

    public void setSti7(Integer sti7) {
        this.sti7 = sti7;
    }

    public Integer getSti8() {
        return sti8;
    }

    public void setSti8(Integer sti8) {
        this.sti8 = sti8;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigInteger getDeviceconfigId() {
        return deviceconfigId;
    }

    public void setDeviceconfigId(BigInteger deviceconfigId) {
        this.deviceconfigId = deviceconfigId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assessmentId != null ? assessmentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Assessment)) {
            return false;
        }
        Assessment other = (Assessment) object;
        if ((this.assessmentId == null && other.assessmentId != null) || (this.assessmentId != null && !this.assessmentId.equals(other.assessmentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Assessment[ assessmentId=" + assessmentId + " ]";
    }
    
}
