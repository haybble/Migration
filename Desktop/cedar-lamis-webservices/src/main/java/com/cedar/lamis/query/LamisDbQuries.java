/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.query;

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
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface LamisDbQuries {

    public List<Adhere> getAdhere();
    public List<Adherehistory> getAdhereHistory();
    public List<Adr> getAdr();
    public List<Adrhistory> getAdrHistory();
    public List<Anc> getAnc();
    public List<Appointment> getAppointment();
    public List<Assessment> getAssessment();
    public List<Casemanager> getCasemanager();
    public List<Child> getChild();
    public List<Childfollowup> getChildFollowup();
    public List<Chroniccare> getChronicCare();
    public List<Clinic> getClinic();
    public List<Communitypharm> getCommunityPharm();
    public List<CommunitypharmCopy30> getCommunityPharmCopy();
    public List<Conversation> getConversation();
    public List<Delivery> getDelivery();
    public List<Deviceconfig> getDeviceConfig();
    public List<Devolve> getDevolve();
    public List<Dhisvalue>getDhisValue();
    public List<Dmscreenhistory>getDmscreenHistory();
    public List<Drug> getDrug();
    public List<Drugtherapy>getDrugTherapy();
    public List<Eac>getEac();
    public List<Eid>getEid();
    public List<Encounter>getEncounter();
    public List<Exchange>getExchange();
    public List<Hts>getHts();
    public List<Indexcontact>getIndexContact();
    public List<Indicator> getIndicator();
    public List<Indicatorvalue>getIndicatorValue();
    public List<Item>getItem();
    public List<Labno> getLabNo();
    public List<Laboratory> getLaboratory();
    public List<Labtest> getLabtest();
    public List<Labtestcategory>getLabTestcategory();
    public List<Lga>getlGA();
    public List<Maternalfollowup>getMaternalFollowUp();
    public List<Message>getMessage();
    public List<Mhtc>getMHTC();
    public List<Monitor>getMonitor();
    public List<Motherinformation>getMotherInformation();
    public List<Nigqual>getNiqqual();
    public List<Oi>getOi();
    public List<Oihistory>getOiHistory();
    public List<Participant>getParticipant();
    public List<Partnerinformation>getPartnerInfomation();
    public List<Patient> getPatient();
    public List<Patientcasemanager>getPatientCaseManager();
    public List<Performance> getPerformance();
    public List<Pharmacy> getPharmacy();
    public List<Prescription>getPrescription();
    public List<Privilege>getPrivilege();
    public List<Regimen> getRegimen();
    public List<Regimendrug>getRegimenDrug();
    public List<Regimenhistory>getRegimenHistory();
    public List<Regimentype>getRegimenType();
    public List<Schedule>getSchedule();
    public List<Sent>getSent();
    public List<Specimen>getSpecimen();
    public List<State>getState();
    public List<Status>getStatus();
    public List<Statushistory>getStatusHistory();
    public List<Sti>getSTI();
    public List<Tbscreenhistory>getTbScreenHistory();
    public List<Unsent>getUnsent();
    public List<User>getUser();
    public List<Userprivilege>getUserPrivilege();
    public List<Validated>getValidated();
    
    
    
}
