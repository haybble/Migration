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
@Table(name = "CONVERSATION")
@NamedQueries({
    @NamedQuery(name = "Conversation.findAll", query = "SELECT c FROM Conversation c"),
    @NamedQuery(name = "Conversation.findByConversationId", query = "SELECT c FROM Conversation c WHERE c.conversationId = :conversationId"),
    @NamedQuery(name = "Conversation.findByPhone", query = "SELECT c FROM Conversation c WHERE c.phone = :phone"),
    @NamedQuery(name = "Conversation.findByDateMessage", query = "SELECT c FROM Conversation c WHERE c.dateMessage = :dateMessage"),
    @NamedQuery(name = "Conversation.findByMessage", query = "SELECT c FROM Conversation c WHERE c.message = :message"),
    @NamedQuery(name = "Conversation.findByTimeStamp", query = "SELECT c FROM Conversation c WHERE c.timeStamp = :timeStamp"),
    @NamedQuery(name = "Conversation.findByOriginatorId", query = "SELECT c FROM Conversation c WHERE c.originatorId = :originatorId"),
    @NamedQuery(name = "Conversation.findByUnread", query = "SELECT c FROM Conversation c WHERE c.unread = :unread")})
public class Conversation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CONVERSATION_ID")
    private Long conversationId;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "PHONE")
    private String phone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_MESSAGE")
    @Temporal(TemporalType.DATE)
    private Date dateMessage;
    @Size(max = 200)
    @Column(name = "MESSAGE")
    private String message;
    @Column(name = "TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStamp;
    @Column(name = "ORIGINATOR_ID")
    private BigInteger originatorId;
    @Column(name = "UNREAD")
    private Integer unread;

    public Conversation() {
    }

    public Conversation(Long conversationId) {
        this.conversationId = conversationId;
    }

    public Conversation(Long conversationId, String phone, Date dateMessage) {
        this.conversationId = conversationId;
        this.phone = phone;
        this.dateMessage = dateMessage;
    }

    public Long getConversationId() {
        return conversationId;
    }

    public void setConversationId(Long conversationId) {
        this.conversationId = conversationId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateMessage() {
        return dateMessage;
    }

    public void setDateMessage(Date dateMessage) {
        this.dateMessage = dateMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public BigInteger getOriginatorId() {
        return originatorId;
    }

    public void setOriginatorId(BigInteger originatorId) {
        this.originatorId = originatorId;
    }

    public Integer getUnread() {
        return unread;
    }

    public void setUnread(Integer unread) {
        this.unread = unread;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conversationId != null ? conversationId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conversation)) {
            return false;
        }
        Conversation other = (Conversation) object;
        if ((this.conversationId == null && other.conversationId != null) || (this.conversationId != null && !this.conversationId.equals(other.conversationId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cedar.lamis.entity.Conversation[ conversationId=" + conversationId + " ]";
    }
    
}
