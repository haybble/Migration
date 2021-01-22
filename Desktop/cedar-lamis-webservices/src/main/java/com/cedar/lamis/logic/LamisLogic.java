///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.cedar.lamis.logic;
//
//import com.cedar.lamis.entity.Adhere;
//import com.cedar.lamis.entity.Adherehistory;
//import com.cedar.lamis.entity.Adr;
//import com.cedar.lamis.entity.Adrhistory;
//import com.cedar.lamis.entity.Anc;
//import com.cedar.lamis.entity.Appointment;
//import com.cedar.lamis.entity.Assessment;
//import com.cedar.lamis.entity.Casemanager;
//import com.cedar.lamis.entity.Child;
//import com.cedar.lamis.entity.Childfollowup;
//import com.cedar.lamis.entity.Chroniccare;
//import com.cedar.lamis.entity.Clinic;
//import com.cedar.lamis.entity.Communitypharm;
//import com.cedar.lamis.entity.CommunitypharmCopy30;
//import com.cedar.lamis.entity.Conversation;
//import com.cedar.lamis.entity.Delivery;
//import com.cedar.lamis.entity.Deviceconfig;
//import com.cedar.lamis.entity.Devolve;
//import com.cedar.lamis.entity.Dhisvalue;
//import com.cedar.lamis.entity.Dmscreenhistory;
//import com.cedar.lamis.entity.Drug;
//import com.cedar.lamis.entity.Drugtherapy;
//import com.cedar.lamis.entity.Eac;
//import com.cedar.lamis.entity.Eid;
//import com.cedar.lamis.entity.Encounter;
//import com.cedar.lamis.entity.Exchange;
//import com.cedar.lamis.entity.Hts;
//import com.cedar.lamis.entity.Indexcontact;
//import com.cedar.lamis.entity.Indicator;
//import com.cedar.lamis.entity.Indicatorvalue;
//import com.cedar.lamis.entity.Item;
//import com.cedar.lamis.entity.Labno;
//import com.cedar.lamis.entity.Laboratory;
//import com.cedar.lamis.entity.Labtest;
//import com.cedar.lamis.entity.Labtestcategory;
//import com.cedar.lamis.entity.Lga;
//import com.cedar.lamis.entity.Maternalfollowup;
//import com.cedar.lamis.entity.Message;
//import com.cedar.lamis.entity.Mhtc;
//import com.cedar.lamis.entity.Monitor;
//import com.cedar.lamis.entity.Motherinformation;
//import com.cedar.lamis.entity.Nigqual;
//import com.cedar.lamis.entity.Oi;
//import com.cedar.lamis.entity.Oihistory;
//import com.cedar.lamis.entity.Participant;
//import com.cedar.lamis.entity.Partnerinformation;
//import com.cedar.lamis.entity.Patient;
//import com.cedar.lamis.entity.Patientcasemanager;
//import com.cedar.lamis.entity.Performance;
//import com.cedar.lamis.entity.Pharmacy;
//import com.cedar.lamis.entity.Prescription;
//import com.cedar.lamis.entity.Privilege;
//import com.cedar.lamis.entity.Regimen;
//import com.cedar.lamis.entity.Regimendrug;
//import com.cedar.lamis.entity.Regimenhistory;
//import com.cedar.lamis.entity.Regimentype;
//import com.cedar.lamis.entity.Schedule;
//import com.cedar.lamis.entity.Sent;
//import com.cedar.lamis.entity.Specimen;
//import com.cedar.lamis.entity.State;
//import com.cedar.lamis.entity.Status;
//import com.cedar.lamis.entity.Statushistory;
//import com.cedar.lamis.entity.Sti;
//import com.cedar.lamis.entity.Tbscreenhistory;
//import com.cedar.lamis.entity.Unsent;
//import com.cedar.lamis.entity.User;
//import com.cedar.lamis.entity.Userprivilege;
//import com.cedar.lamis.entity.Validated;
//import com.cedar.lamis.query.impl.LamisDbImpl;
//import com.cedar.lamis.util.Util;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author Administrator
// */
//public class LamisLogic {
//
////    public static void main(String[] args) throws IOException {
////        LamisDbImpl lamis_Data = new LamisDbImpl();
////     List<Drug> list = new ArrayList<Drug>();
////       list = lamis_Data.getDrug();
////        System.out.println(list);
//////        list.stream().forEach(t -> {
//////            System.out.println(t);
//////        });
////
////    }
//
//    LamisDbImpl lamis_Data = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
//
//    // lamisPatientTableList
//  
//    public List<Adhere> LamisAdere() throws IOException {
//        return lamis_Data.getAdhere();
//    }
//
//    public List<Adherehistory> LamisAdhereHistory() throws IOException {
//        return lamis_Data.getAdhereHistory();
//    }
//
//    public List<Anc> LamisAnc() throws IOException {
//        return lamis_Data.getAnc();
//    }
//
//    public List<Adr> LamisAdr() {
//        return lamis_Data.getAdr();
//    }
//
//    public List<Adrhistory> LamisAdrHistory() {
//        return lamis_Data.getAdrHistory();
//    }
//    
//    public List<Appointment> LamisAppointment() {
//        return lamis_Data.getAppointment();
//    }
//    
//    public List<Assessment> LamisAssessment() {
//        return lamis_Data.getAssessment();
//    }
//    public List<Casemanager> LamisCaseManager() {
//        return lamis_Data.getCasemanager();
//    }
//    
//    public List<Child> LamisChild() {
//        return lamis_Data.getChild();
//    }
//    
//    public List<Childfollowup> LamisChildFollowup() {
//        return lamis_Data.getChildFollowup();
//    }
//    
//    public List<Chroniccare> LamisChronicCare() {
//        return lamis_Data.getChronicCare();
//    }
//    
//    public List<Clinic> LamisClinic() {
//        return lamis_Data.getClinic();
//    }
//    public List<Communitypharm> LamisCommunityPharm() {
//        return lamis_Data.getCommunityPharm();
//    }
//    public List<CommunitypharmCopy30> LamisCommunitypharmCopy30() {
//        return lamis_Data.getCommunityPharmCopy();
//    }
//    public List<Conversation> LamisConversation() {
//        return lamis_Data.getConversation();
//    }
//    
//    public List<Delivery> LamisDelivery() {
//        return lamis_Data.getDelivery();
//    }
//    
//    public List<Deviceconfig> LamisDeviceConfig() {
//        return lamis_Data.getDeviceConfig();
//    }
//    
//    public List<Devolve> LamisDevolve() {
//        return lamis_Data.getDevolve();
//    }
//    public List<Dhisvalue> LamisDhisvalue() {
//        return lamis_Data.getDhisValue();
//    }
//    public List<Dmscreenhistory> LamisDmscreenHistory() {
//        return lamis_Data.getDmscreenHistory();
//    }
//    public List<Drug> LamisDrug() {
//        return lamis_Data.getDrug();
//     
//    }
//    public List<Drugtherapy> LamisDrugTherapy() {
//        return lamis_Data.getDrugTherapy();
//    }
//    public List<Eac> LamisEac() {
//        return lamis_Data.getEac();
//    }
//    public List<Eid> LamisEid() {
//        return lamis_Data.getEid();
//    }
//    public List<Encounter> LamisEncounter() {
//        return lamis_Data.getEncounter();
//    }
//    public List<Exchange> LamisExchange() {
//        return lamis_Data.getExchange();
//    }
//    public List<Hts> LamisHts() {
//        return lamis_Data.getHts();
//    }
//    public List<Indexcontact> LamisIndexContact(){
//        return lamis_Data.getIndexContact();
//    }
//    public List<Indicator> LamisIndicator() {
//        return lamis_Data.getIndicator();
//    }
//    public List<Indicatorvalue> LamisIndicatorValue() {
//        return lamis_Data.getIndicatorValue();
//    }
//    public List<Item> LamisItem() {
//        return lamis_Data.getItem();
//    }
//    public List<Labno> LamisLabNo() {
//        return lamis_Data.getLabNo();
//    }
//    public List<Laboratory> LamisLaboratory() {
//        return lamis_Data.getLaboratory();
//    }
//    public List<Labtest> LamisLabtest() {
//        return lamis_Data.getLabtest();
//    }
//    public List<Labtestcategory> LamisLabTestCategory() {
//        return lamis_Data.getLabTestcategory();
//    }
//    public List<Lga> LamisLGA() {
//        return lamis_Data.getlGA();
//    }
//    public List<Maternalfollowup> LamisMaternalFollowUp() {
//        return lamis_Data.getMaternalFollowUp();
//    }
//    public List<Message> LamisMessage() {
//        return lamis_Data.getMessage();
//    }
//    public List<Mhtc> LamisMHTC() {
//        return lamis_Data.getMHTC();
//    }
//    public List<Monitor> LamisMonitor() {
//        return lamis_Data.getMonitor();
//    }
//    public List<Motherinformation> LamisMotherInformation() {
//        return lamis_Data.getMotherInformation();
//    }
//    public List<Nigqual> LamisNigqual() {
//        return lamis_Data.getNiqqual();
//    }
//    public List<Oi> LamisOi() {
//        return lamis_Data.getOi();
//    }
//    public List<Oihistory> LamisOiHistory() {
//        return lamis_Data.getOiHistory();
//    }
//    public List<Participant> LamisParticipant() {
//        return lamis_Data.getParticipant();
//    }
//    public List<Partnerinformation> LamisPartnerInformation() {
//        return lamis_Data.getPartnerInfomation();
//    }
//    
//    public List<Patient> LamisPatient() throws IOException {
//       return lamis_Data.getPatient();
//    }
//
//    public List<Patientcasemanager> LamisPatientCaseManager() {
//        return lamis_Data.getPatientCaseManager();
//    }
//    public List<Performance> LamisPerformance() {
//        return lamis_Data.getPerformance();
//    }
//    public List<Pharmacy> LamisPharmacy() {
//        return lamis_Data.getPharmacy();
//    }
//    public List<Prescription> LamisPrescription() {
//        return lamis_Data.getPrescription();
//    }
//    public List<Privilege> LamisPrivilege() {
//        return lamis_Data.getPrivilege();
//    }
//    public List<Regimen> LamisRegimen() {
//        return lamis_Data.getRegimen();
//    }
//    public List<Regimendrug> LamisRegimenDrug() {
//        return lamis_Data.getRegimenDrug();
//    }
//    public List<Regimenhistory> LamisRegimenHistory() {
//        return lamis_Data.getRegimenHistory();
//    }
//    public List<Regimentype> LamisRegimenType() {
//        return lamis_Data.getRegimenType();
//    }
//    public List<Schedule> LamisSchedule() {
//        return lamis_Data.getSchedule();
//    }
//    public List<Sent> LamisSent() {
//        return lamis_Data.getSent();
//    }
//    public List<Specimen> LamisSpecimen() {
//        return lamis_Data.getSpecimen();
//    }
//    public List<State> LamisState() {
//        return lamis_Data.getState();
//    }
//    public List<Status> LamisStatus() {
//        return lamis_Data.getStatus();
//    }
//    public List<Statushistory> LamisStatusHistory() {
//        return lamis_Data.getStatusHistory();
//    }
//    public List<Sti> LamisSti() {
//        return lamis_Data.getSTI();
//    }
//    public List<Tbscreenhistory> LamisTbScreenHistory() {
//        return lamis_Data.getTbScreenHistory();
//    }
//    public List<Unsent> LamisUnsent() {
//        return lamis_Data.getUnsent();
//    }
//    public List<User> LamisUser() {
//        return lamis_Data.getUser();
//    }
//    public List<Userprivilege> LamisUserPrivilege() {
//        return lamis_Data.getUserPrivilege();
//    }
//    public List<Validated> LamisValidated() {
//        return lamis_Data.getValidated();
//    } 
//    
//}
