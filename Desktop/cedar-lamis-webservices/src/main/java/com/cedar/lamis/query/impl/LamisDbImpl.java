/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.query.impl;

import com.cedar.lamis.entity.Adhere;
import com.cedar.lamis.entity.Adherehistory;
import com.cedar.lamis.entity.Adr;
import com.cedar.lamis.entity.Adrhistory;
import com.cedar.lamis.entity.Anc;
import com.cedar.lamis.entity.Appointment;
import com.cedar.lamis.entity.Assessment;
import com.cedar.lamis.entity.Casemanager;
import com.cedar.lamis.entity.Child;
import com.cedar.lamis.entity.Childfollowup;
import com.cedar.lamis.entity.Chroniccare;
import com.cedar.lamis.entity.Clinic;
import com.cedar.lamis.entity.Communitypharm;
import com.cedar.lamis.entity.CommunitypharmCopy30;
import com.cedar.lamis.entity.Conversation;
import com.cedar.lamis.entity.Delivery;
import com.cedar.lamis.entity.Deviceconfig;
import com.cedar.lamis.entity.Devolve;
import com.cedar.lamis.entity.Dhisvalue;
import com.cedar.lamis.entity.Dmscreenhistory;
import com.cedar.lamis.entity.Drug;
import com.cedar.lamis.entity.Drugtherapy;
import com.cedar.lamis.entity.Eac;
import com.cedar.lamis.entity.Eid;
import com.cedar.lamis.entity.Encounter;
import com.cedar.lamis.entity.Exchange;
import com.cedar.lamis.entity.Hts;
import com.cedar.lamis.entity.Indexcontact;
import com.cedar.lamis.entity.Indicator;
import com.cedar.lamis.entity.Indicatorvalue;
import com.cedar.lamis.entity.Item;
import com.cedar.lamis.entity.Labno;
import com.cedar.lamis.entity.Laboratory;
import com.cedar.lamis.entity.Labtest;
import com.cedar.lamis.entity.Labtestcategory;
import com.cedar.lamis.entity.Lga;
import com.cedar.lamis.entity.Maternalfollowup;
import com.cedar.lamis.entity.Message;
import com.cedar.lamis.entity.Mhtc;
import com.cedar.lamis.entity.Monitor;
import com.cedar.lamis.entity.Motherinformation;
import com.cedar.lamis.entity.Nigqual;
import com.cedar.lamis.entity.Oi;
import com.cedar.lamis.entity.Oihistory;
import com.cedar.lamis.entity.Participant;
import com.cedar.lamis.entity.Partnerinformation;
import com.cedar.lamis.entity.Patient;
import com.cedar.lamis.entity.Patientcasemanager;
import com.cedar.lamis.entity.Performance;
import com.cedar.lamis.entity.Pharmacy;
import com.cedar.lamis.entity.Prescription;
import com.cedar.lamis.entity.Privilege;
import com.cedar.lamis.entity.Regimen;
import com.cedar.lamis.entity.Regimendrug;
import com.cedar.lamis.entity.Regimenhistory;
import com.cedar.lamis.entity.Regimentype;
import com.cedar.lamis.entity.Schedule;
import com.cedar.lamis.entity.Sent;
import com.cedar.lamis.entity.Specimen;
import com.cedar.lamis.entity.State;
import com.cedar.lamis.entity.Status;
import com.cedar.lamis.entity.Statushistory;
import com.cedar.lamis.entity.Sti;
import com.cedar.lamis.entity.Tbscreenhistory;
import com.cedar.lamis.entity.Unsent;
import com.cedar.lamis.entity.User;
import com.cedar.lamis.entity.Userprivilege;
import com.cedar.lamis.entity.Validated;
import com.cedar.lamis.util.Util;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.cedar.lamis.query.LamisDbQueries;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Administrator Implmentated interfaces for all the custom querries and
 * JPA Crud.
 */
public class LamisDbImpl implements LamisDbQueries {

    private final EntityManager em;

    public static void main(String[] args) {
        System.out.println("got here as " + Util.getProperty("id"));
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));

    }

    // Constructors with no paramaters
    public LamisDbImpl() {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory(String.valueOf(Util.getProperty("id")));
        em = emf.createEntityManager();

    }

    // contructors with persistence properties parameters and database file path . Filepath are set from the Properties file
    public LamisDbImpl(String driver, String dbfilepath, String user, String passwd) {
        EntityManagerFactory emf = null;
        Map<String, String> persistentPropertiesMap = new HashMap<>();

        persistentPropertiesMap.put("javax.persistence.jdbc.url", "jdbc:h2:file:" + dbfilepath);
        persistentPropertiesMap.put("javax.persistence.jdbc.user", user);
        persistentPropertiesMap.put("javax.persistence.jdbc.password", passwd);
        persistentPropertiesMap.put("javax.persistence.jdbc.driver", driver);

        emf = Persistence.createEntityManagerFactory(String.valueOf(Util.getProperty("id")), persistentPropertiesMap);

        em = emf.createEntityManager();

    }

//Constructors with database file path with a default properties map N.B Filepath are set from the Properties file
    public LamisDbImpl(String dbfilepath) {
        EntityManagerFactory emf = null;
        Map<String, String> persistentPropertiesMap = new HashMap<>();

        persistentPropertiesMap.put("javax.persistence.jdbc.url", "jdbc:h2:file:" + dbfilepath);
        persistentPropertiesMap.put("javax.persistence.jdbc.user", String.valueOf(Util.getProperty("user")));
        persistentPropertiesMap.put("javax.persistence.jdbc.password", String.valueOf(Util.getProperty("password")));
        persistentPropertiesMap.put("javax.persistence.jdbc.driver", String.valueOf(Util.getProperty("driver")));

        System.out.println("url " + persistentPropertiesMap.get("javax.persistence.jdbc.url"));

        emf = Persistence.createEntityManagerFactory(String.valueOf(Util.getProperty("id")), persistentPropertiesMap);

        em = emf.createEntityManager();

    }
    //CRUD implementaion using jpa

    public void commitTransaction() {

        final EntityTransaction entityTransaction = em.getTransaction();

        if (!entityTransaction.isActive()) {
            entityTransaction.begin();
        }
        entityTransaction.commit();
    }

    public Object queryByRange(String jpqlStmt, int firstResult, int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public <T> T persistEntity(T entity) {
        em.persist(entity);
        commitTransaction();
        return entity;
    }

    public <T> T mergeEntity(T entity) {
        entity = em.merge(entity);
        commitTransaction();
        return entity;
    }

    //Interface implementaion for the all querries.
    @Override
    public List<Adhere> getAdhere() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Adhere.findAll", Adhere.class).getResultList();
    }

    @Override
    public List<Adherehistory> getAdhereHistory() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Adherehistory.findAll", Adherehistory.class).getResultList();
    }

    @Override
    public List<Adr> getAdr() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Adr.findAll", Adr.class).getResultList();
    }

    @Override
    public List<Adrhistory> getAdrHistory() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Adrhistory.findAll", Adrhistory.class).getResultList();
    }

    @Override
    public List<Anc> getAnc() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Anc.findAll", Anc.class).getResultList();
    }

    @Override
    public List<Appointment> getAppointment() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Appointment.findAll", Appointment.class).getResultList();
    }

    @Override
    public List<Assessment> getAssessment() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Assessment.findAll", Assessment.class).getResultList();
    }

    @Override
    public List<Casemanager> getCasemanager() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Casemanager.findAll", Casemanager.class).getResultList();
    }

    @Override
    public List<Child> getChild() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Child.findAll", Child.class).getResultList();
    }

    @Override
    public List<Childfollowup> getChildFollowup() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Childfollowup.findAll", Childfollowup.class).getResultList();
    }

    @Override
    public List<Chroniccare> getChronicCare() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Chroniccare.findAll", Chroniccare.class).getResultList();
    }

    @Override
    public List<Clinic> getClinic() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Clinic.findAll", Clinic.class).getResultList();
    }

    @Override
    public List<Communitypharm> getCommunityPharm() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Communitypharm.findAll", Communitypharm.class).getResultList();
    }

    @Override
    public List<CommunitypharmCopy30> getCommunityPharmCopy() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("CommunitypharmCopy30.findAll", CommunitypharmCopy30.class).getResultList();
    }

    @Override
    public List<Conversation> getConversation() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Conversation.findAll", Conversation.class).getResultList();
    }

    @Override
    public List<Delivery> getDelivery() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Delivery.findAll", Delivery.class).getResultList();
    }

    @Override
    public List<Deviceconfig> getDeviceConfig() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Deviceconfig.findAll", Deviceconfig.class).getResultList();
    }

    @Override
    public List<Devolve> getDevolve() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Devolve.findAll", Devolve.class).getResultList();
    }

    @Override
    public List<Dhisvalue> getDhisValue() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Dhisvalue.findAll", Dhisvalue.class).getResultList();
    }

    @Override
    public List<Dmscreenhistory> getDmscreenHistory() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Dmscreenhistory.findAll", Dmscreenhistory.class).getResultList();
    }

    @Override
    public List<Drug> getDrug() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Drug.findAll", Drug.class).getResultList();
    }

    @Override
    public List<Drugtherapy> getDrugTherapy() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Drugtherapy.findAll", Drugtherapy.class).getResultList();
    }

    @Override
    public List<Eac> getEac() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Eac.findAll", Eac.class).getResultList();
    }

    @Override
    public List<Eid> getEid() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Eid.findAll", Eid.class).getResultList();
    }

    @Override
    public List<Encounter> getEncounter() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Encounter.findAll", Encounter.class).getResultList();
    }

    @Override
    public List<Exchange> getExchange() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Exchange.findAll", Exchange.class).getResultList();
    }

    @Override
    public List<Hts> getHts() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Hts.findAll", Hts.class).getResultList();
    }

    @Override
    public List<Indexcontact> getIndexContact() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Indexcontact.findAll", Indexcontact.class).getResultList();
    }

    @Override
    public List<Indicator> getIndicator() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Indicator.findAll", Indicator.class).getResultList();
    }

    @Override
    public List<Indicatorvalue> getIndicatorValue() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Indicatorvalue.findAll", Indicatorvalue.class).getResultList();
    }

    @Override
    public List<Item> getItem() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Item.findAll", Item.class).getResultList();
    }

    @Override
    public List<Labno> getLabNo() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Labno.findAll", Labno.class).getResultList();
    }

    @Override
    public List<Laboratory> getLaboratory() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Laboratory.findAll", Laboratory.class).getResultList();
    }

    @Override
    public List<Labtest> getLabtest() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Labtest.findAll", Labtest.class).getResultList();
    }

    @Override
    public List<Labtestcategory> getLabTestcategory() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Labtestcategory.findAll", Labtestcategory.class).getResultList();
    }

    @Override
    public List<Lga> getlGA() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Lga.findAll", Lga.class).getResultList();
    }

    @Override
    public List<Maternalfollowup> getMaternalFollowUp() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Maternalfollowup.findAll", Maternalfollowup.class).getResultList();
    }

    @Override
    public List<Message> getMessage() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Message.findAll", Message.class).getResultList();
    }

    @Override
    public List<Mhtc> getMHTC() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Mhtc.findAll", Mhtc.class).getResultList();
    }

    @Override
    public List<Monitor> getMonitor() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Monitor.findAll", Monitor.class).getResultList();
    }

    @Override
    public List<Motherinformation> getMotherInformation() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Motherinformation.findAll", Motherinformation.class).getResultList();
    }

    @Override
    public List<Nigqual> getNiqqual() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Nigqual.findAll", Nigqual.class).getResultList();
    }

    @Override
    public List<Oi> getOi() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Oi.findAll", Oi.class).getResultList();
    }

    @Override
    public List<Oihistory> getOiHistory() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Oihistory.findAll", Oihistory.class).getResultList();
    }

    @Override
    public List<Participant> getParticipant() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Participant.findAll", Participant.class).getResultList();
    }

    @Override
    public List<Partnerinformation> getPartnerInfomation() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Partnerinformation.findAll", Partnerinformation.class).getResultList();
    }

    @Override
    public List<Patient> getPatient() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Patient.findAll", Patient.class).getResultList();

    }

    @Override
    public List<Patientcasemanager> getPatientCaseManager() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Patientcasemanager.findAll", Patientcasemanager.class).getResultList();
    }

    @Override
    public List<Performance> getPerformance() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Performance.findAll", Performance.class).getResultList();
    }

    @Override
    public List<Pharmacy> getPharmacy() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Pharmacy.findAll", Pharmacy.class).getResultList();
    }

    @Override
    public List<Prescription> getPrescription() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Prescription.findAll", Prescription.class).getResultList();
    }

    @Override
    public List<Privilege> getPrivilege() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Privilege.findAll", Privilege.class).getResultList();
    }

    @Override
    public List<Regimen> getRegimen() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Regimen.findAll", Regimen.class).getResultList();
    }

    @Override
    public List<Regimendrug> getRegimenDrug() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Regimendrug.findAll", Regimendrug.class).getResultList();
    }

    @Override
    public List<Regimenhistory> getRegimenHistory() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Regimenhistory.findAll", Regimenhistory.class).getResultList();
    }

    @Override
    public List<Regimentype> getRegimenType() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Regimentype.findAll", Regimentype.class).getResultList();
    }

    @Override
    public List<Schedule> getSchedule() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Schedule.findAll", Schedule.class).getResultList();
    }

    @Override
    public List<Sent> getSent() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Sent.findAll", Sent.class).getResultList();
    }

    @Override
    public List<Specimen> getSpecimen() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Specimen.findAll", Specimen.class).getResultList();
    }

    @Override
    public List<State> getState() {
        List<State> lamisState;
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        lamisState = em.createNamedQuery("State.findAll", State.class).getResultList();
        
     
        
        System.out.println("lamis state : "+lamisState);
        
        return lamisState;
    }

    @Override
    public List<Status> getStatus() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Status.findAll", Status.class).getResultList();
    }

    @Override
    public List<Statushistory> getStatusHistory() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Statushistory.findAll", Statushistory.class).getResultList();
    }

    @Override
    public List<Sti> getSTI() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Sti.findAll", Sti.class).getResultList();
    }

    @Override
    public List<Tbscreenhistory> getTbScreenHistory() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Tbscreenhistory.findAll", Tbscreenhistory.class).getResultList();
    }

    @Override
    public List<Unsent> getUnsent() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Unsent.findAll", Unsent.class).getResultList();
    }

    @Override
    public List<User> getUser() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("User.findAll", User.class).getResultList();
    }

    @Override
    public List<Userprivilege> getUserPrivilege() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Userprivilege.findAll", Userprivilege.class).getResultList();
    }

    @Override
    public List<Validated> getValidated() {
        LamisDbImpl pp = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
        return em.createNamedQuery("Validated.findAll", Validated.class).getResultList();
    }

}
