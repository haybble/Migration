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
import javax.validation.constraints.Size;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "MESSAGE")
@NamedQueries({
    @NamedQuery(name = "Message.findAll", query = "SELECT m FROM Message m"),
    @NamedQuery(name = "Message.findByMessageId", query = "SELECT m FROM Message m WHERE m.messageId = :messageId"),
    @NamedQuery(name = "Message.findByMessageType", query = "SELECT m FROM Message m WHERE m.messageType = :messageType"),
    @NamedQuery(name = "Message.findByDaysToAppointment", query = "SELECT m FROM Message m WHERE m.daysToAppointment = :daysToAppointment"),
    @NamedQuery(name = "Message.findByDateToSend", query = "SELECT m FROM Message m WHERE m.dateToSend = :dateToSend"),
    @NamedQuery(name = "Message.findByRecipients", query = "SELECT m FROM Message m WHERE m.recipients = :recipients"),
    @NamedQuery(name = "Message.findByMessage1", query = "SELECT m FROM Message m WHERE m.message1 = :message1"),
    @NamedQuery(name = "Message.findByMessage2", query = "SELECT m FROM Message m WHERE m.message2 = :message2"),
    @NamedQuery(name = "Message.findByMessage3", query = "SELECT m FROM Message m WHERE m.message3 = :message3"),
    @NamedQuery(name = "Message.findByMessage4", query = "SELECT m FROM Message m WHERE m.message4 = :message4")})
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MESSAGE_ID")
    private Long messageId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MESSAGE_TYPE")
    private int messageType;
    @Column(name = "DAYS_TO_APPOINTMENT")
    private Integer daysToAppointment;
    @Column(name = "DATE_TO_SEND")
    @Temporal(TemporalType.DATE)
    private Date dateToSend;
    @Size(max = 100)
    @Column(name = "RECIPIENTS")
    private String recipients;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "MESSAGE1")
    private String message1;
    @Size(max = 300)
    @Column(name = "MESSAGE2")
    private String message2;
    @Size(max = 300)
    @Column(name = "MESSAGE3")
    private String message3;
    @Size(max = 300)
    @Column(name = "MESSAGE4")
    private String message4;

    public Message() {
    }

    public Message(Long messageId) {
        this.messageId = messageId;
    }

    public Message(Long messageId, int messageType, String message1) {
        this.messageId = messageId;
        this.messageType = messageType;
        this.message1 = message1;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public Integer getDaysToAppointment() {
        return daysToAppointment;
    }

    public void setDaysToAppointment(Integer daysToAppointment) {
        this.daysToAppointment = daysToAppointment;
    }

    public Date getDateToSend() {
        return dateToSend;
    }

    public void setDateToSend(Date dateToSend) {
        this.dateToSend = dateToSend;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getMessage1() {
        return message1;
    }

    public void setMessage1(String message1) {
        this.message1 = message1;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public String getMessage3() {
        return message3;
    }

    public void setMessage3(String message3) {
        this.message3 = message3;
    }

    public String getMessage4() {
        return message4;
    }

    public void setMessage4(String message4) {
        this.message4 = message4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (messageId != null ? messageId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Message)) {
            return false;
        }
        Message other = (Message) object;
        if ((this.messageId == null && other.messageId != null) || (this.messageId != null && !this.messageId.equals(other.messageId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Message[ messageId=" + messageId + " ]";
    }
    
}
