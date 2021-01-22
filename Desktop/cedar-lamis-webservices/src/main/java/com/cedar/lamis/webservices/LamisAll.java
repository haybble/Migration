/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.webservices;


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
import com.cedar.lamis.entity.Validated_;
//import com.cedar.lamis.logic.LamisLogic;
import com.cedar.lamis.query.impl.LamisDbImpl;
import com.cedar.lamis.util.Util;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author Administrator
 * Rest Webservices
 */
@Path("/ws")
public class LamisAll {

    LamisDbImpl patientData = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));

    

    @GET
    @Path("/adhere")
    @Produces("application/json")
    @Consumes("application/json")

    public Response AdhereList() throws IOException {

        try {

            List<Adhere> api = patientData.getAdhere();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }

    @GET
    @Path("/adherehistory")
    @Produces("application/json")
    @Consumes("application/json")

    public Response AdhereHistoryList() throws IOException {

        try {

            List<Adherehistory> api = patientData.getAdhereHistory();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    
    @GET
    @Path("/adr")
    @Produces("application/json")
    @Consumes("application/json")

    public Response AdrList() throws IOException {

        try {
            List<Adr> api = patientData.getAdr();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }

    @GET
    @Path("/adrhistory")
    @Produces("application/json")
    @Consumes("application/json")

    public Response AdrHistoryList() throws IOException {

        try {
            List<Adrhistory> api = patientData.getAdrHistory();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }

    @GET
    @Path("/anc")
    @Produces("application/json")
    @Consumes("application/json")

    public Response AncList() throws IOException {

        try {
            List<Anc> api = patientData.getAnc();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }

    
    @GET
    @Path("/appointment")
    @Produces("application/json")
    @Consumes("application/json")

    public Response AppointmentList() throws IOException {

        try {
            List<Appointment> api = patientData.getAppointment();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/assessment")
    @Produces("application/json")
    @Consumes("application/json")

    public Response AssessmentList() throws IOException {

        try {
            List<Assessment> api = patientData.getAssessment();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/casemanager")
    @Produces("application/json")
    @Consumes("application/json")

    public Response CaseManagerList() throws IOException {

        try {
            List<Casemanager> api = patientData.getCasemanager();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    

    
    @GET
    @Path("/child")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ChildList() throws IOException {

        try {
            List<Child> api = patientData.getChild();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/childfollowup")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ChildFollowUp() throws IOException {

        try {
            List<Childfollowup> api = patientData.getChildFollowup();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/chroniccare")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ChronicCare() throws IOException {

        try {
            List<Chroniccare> api = patientData.getChronicCare();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/clinic")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ClinicList() throws IOException {

        try {
            List<Clinic> api = patientData.getClinic();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/communitypharm")
    @Produces("application/json")
    @Consumes("application/json")

    public Response CommunityPharm() throws IOException {

        try {
            List<Communitypharm> api = patientData.getCommunityPharm();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/communitypharmcopy")
    @Produces("application/json")
    @Consumes("application/json")

    public Response CommunityPharmCopy() throws IOException {

        try {
            List<CommunitypharmCopy30> api = patientData.getCommunityPharmCopy();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/conversation")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ConversationList() throws IOException {

        try {
            List<Conversation> api = patientData.getConversation();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/delivery")
    @Produces("application/json")
    @Consumes("application/json")

    public Response DeliveryList() throws IOException {

        try {
            List<Delivery> api = patientData.getDelivery();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/deviceconfig")
    @Produces("application/json")
    @Consumes("application/json")

    public Response DeviceConfigList() throws IOException {

        try {
            List<Deviceconfig> api = patientData.getDeviceConfig();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/devolve")
    @Produces("application/json")
    @Consumes("application/json")

    public Response DevolveList() throws IOException {

        try {
            List<Devolve> api = patientData.getDevolve();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/dhisvalue")
    @Produces("application/json")
    @Consumes("application/json")

    public Response DhisValueList() throws IOException {

        try {
            List<Dhisvalue> api = patientData.getDhisValue();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/dmscreenhistory")
    @Produces("application/json")
    @Consumes("application/json")

    public Response DmScreenHistoryList() throws IOException {

        try {
            List<Dmscreenhistory> api = patientData.getDmscreenHistory();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/drug")
    @Produces("application/json")
    @Consumes("application/json")

    public Response DrugList() throws IOException {

        try {
            List<Drug> api = patientData.getDrug();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/drugtherapy")
    @Produces("application/json")
    @Consumes("application/json")

    public Response DrugTherapyList() throws IOException {

        try {
            List<Drugtherapy> api = patientData.getDrugTherapy();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/eac")
    @Produces("application/json")
    @Consumes("application/json")

    public Response EacList() throws IOException {

        try {
            List<Eac> api = patientData.getEac();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/eid")
    @Produces("application/json")
    @Consumes("application/json")

    public Response EidList() throws IOException {

        try {
            List<Eid> api = patientData.getEid();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/encounter")
    @Produces("application/json")
    @Consumes("application/json")

    public Response EncounterList() throws IOException {

        try {
            List<Encounter> api = patientData.getEncounter();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/exchange")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ExchangeList() throws IOException {

        try {
            List<Exchange> api = patientData.getExchange();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/hts")
    @Produces("application/json")
    @Consumes("application/json")

    public Response HtsList() throws IOException {

        try {
            List<Hts> api = patientData.getHts();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/indexcontact")
    @Produces("application/json")
    @Consumes("application/json")

    public Response IndexContactList() throws IOException {

        try {
            List<Indexcontact> api = patientData.getIndexContact();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/indicator")
    @Produces("application/json")
    @Consumes("application/json")

    public Response IndicatorList() throws IOException {

        try {
            List<Indicator> api = patientData.getIndicator();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/indicatorvalue")
    @Produces("application/json")
    @Consumes("application/json")

    public Response IndcatorValueList() throws IOException {

        try {
            List<Indicatorvalue> api = patientData.getIndicatorValue();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/item")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ItemList() throws IOException {

        try {
            List<Item> api = patientData.getItem();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/labno")
    @Produces("application/json")
    @Consumes("application/json")

    public Response LabNoList() throws IOException {

        try {
            List<Labno> api = patientData.getLabNo();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/laboratory")
    @Produces("application/json")
    @Consumes("application/json")

    public Response LaboratoryItem() throws IOException {

        try {
            List<Laboratory> api = patientData.getLaboratory();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/labtest")
    @Produces("application/json")
    @Consumes("application/json")

    public Response LabTestList() throws IOException {

        try {
            List<Labtest> api = patientData.getLabtest();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/labtestcategory")
    @Produces("application/json")
    @Consumes("application/json")

    public Response LabTestCategoryList() throws IOException {

        try {
            List<Labtestcategory> api = patientData.getLabTestcategory();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/lga")
    @Produces("application/json")
    @Consumes("application/json")

    public Response LGAList() throws IOException {

        try {
            List<Lga> api = patientData.getlGA();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/maternalfollowup")
    @Produces("application/json")
    @Consumes("application/json")

    public Response MaternalFollowUpList() throws IOException {

        try {
            List<Maternalfollowup> api = patientData.getMaternalFollowUp();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/message")
    @Produces("application/json")
    @Consumes("application/json")

    public Response MessageList() throws IOException {

        try {
            List<Message> api = patientData.getMessage();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/mhtc")
    @Produces("application/json")
    @Consumes("application/json")

    public Response MHTCList() throws IOException {

        try {
            List<Mhtc> api = patientData.getMHTC();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/monitor")
    @Produces("application/json")
    @Consumes("application/json")

    public Response MonitorList() throws IOException {

        try {
            List<Monitor> api = patientData.getMonitor();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/motherinformation")
    @Produces("application/json")
    @Consumes("application/json")

    public Response MotherInformationList() throws IOException {

        try {
            List<Motherinformation> api = patientData.getMotherInformation();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/nigqual")
    @Produces("application/json")
    @Consumes("application/json")

    public Response NigqualList() throws IOException {

        try {
            List<Nigqual> api = patientData.getNiqqual();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/oi")
    @Produces("application/json")
    @Consumes("application/json")

    public Response OiList() throws IOException {

        try {
            List<Oi> api = patientData.getOi();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/oihistory")
    @Produces("application/json")
    @Consumes("application/json")

    public Response OiHistoryList() throws IOException {

        try {
            List<Oihistory> api = patientData.getOiHistory();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/participant")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ParticipantList() throws IOException {

        try {
            List<Participant> api = patientData.getParticipant();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    @GET
    @Path("/partnerinformation")
    @Produces("application/json")
    @Consumes("application/json")

    public Response PartnerInformationList() throws IOException {

        try {
            List<Partnerinformation> api = patientData.getPartnerInfomation();
            if (api.size() > 0) {
                return Response.ok().status(200).entity(api).build();
            } else {
                return Response.status(401).entity("No values").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;
    }
    
    @GET
    @Path("/patient")
    @Produces("application/json")
    @Consumes("application/json")

    public Response PatientList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Patient> apl = patientData.getPatient();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/patientcasemanager")
    @Produces("application/json")
    @Consumes("application/json")

    public Response PatientCaseManagerList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Patientcasemanager> apl = patientData.getPatientCaseManager();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/performance")
    @Produces("application/json")
    @Consumes("application/json")

    public Response PerformanceList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Performance> apl = patientData.getPerformance();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    
    @GET
    @Path("/pharmacy")
    @Produces("application/json")
    @Consumes("application/json")

    public Response PharmacyList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Pharmacy> apl = patientData.getPharmacy();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/prescription")
    @Produces("application/json")
    @Consumes("application/json")

    public Response PrescriptionList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Prescription> apl = patientData.getPrescription();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    
    @GET
    @Path("/privilege")
    @Produces("application/json")
    @Consumes("application/json")

    public Response PrivilegeList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Privilege> apl = patientData.getPrivilege();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    
    @GET
    @Path("/regimen")
    @Produces("application/json")
    @Consumes("application/json")

    public Response RegimenList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Regimen> apl = patientData.getRegimen();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/regimendrug")
    @Produces("application/json")
    @Consumes("application/json")

    public Response RegimenDrugList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Regimendrug> apl = patientData.getRegimenDrug();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/regimenhistory")
    @Produces("application/json")
    @Consumes("application/json")

    public Response RegimenHistoryList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Regimenhistory> apl = patientData.getRegimenHistory();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/regimentype")
    @Produces("application/json")
    @Consumes("application/json")

    public Response RegimenTypeList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Regimentype> apl = patientData.getRegimenType();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/schedule")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ScheduleList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Schedule> apl = patientData.getSchedule();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/sent")
    @Produces("application/json")
    @Consumes("application/json")

    public Response SentList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Sent> apl = patientData.getSent();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/specimen")
    @Produces("application/json")
    @Consumes("application/json")

    public Response SpecimenList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Specimen> apl = patientData.getSpecimen();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/state")
    @Produces("application/json")
    @Consumes("application/json")

    public Response StateList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<State> apl = patientData.getState();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/status")
    @Produces("application/json")
    @Consumes("application/json")

    public Response StatusList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Status> apl = patientData.getStatus();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/statushistory")
    @Produces("application/json")
    @Consumes("application/json")

    public Response StatusHistoryList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Statushistory> apl = patientData.getStatusHistory();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/sti")
    @Produces("application/json")
    @Consumes("application/json")

    public Response StiList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Sti> apl = patientData.getSTI();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/tbscreenhistory")
    @Produces("application/json")
    @Consumes("application/json")

    public Response TbScreenHistoryList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Tbscreenhistory> apl = patientData.getTbScreenHistory();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/unsent")
    @Produces("application/json")
    @Consumes("application/json")

    public Response UnsentList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Unsent> apl = patientData.getUnsent();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/user")
    @Produces("application/json")
    @Consumes("application/json")

    public Response UserList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<User> apl = patientData.getUser();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/userprivilege")
    @Produces("application/json")
    @Consumes("application/json")

    public Response UserPrivilegeList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Userprivilege> apl = patientData.getUserPrivilege();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }
    @GET
    @Path("/validated")
    @Produces("application/json")
    @Consumes("application/json")

    public Response ValidatedList() throws IOException {
        // List<Patient> apl = new ArrayList<Patient>();
        try {
            List<Validated> apl = patientData.getValidated();
            if (apl.size() > 0) {
                return Response.ok().status(200).entity(apl).build();
            } else {
                return Response.status(401).entity("No Value").build();
            }
        } catch (NullPointerException npe) {
            Response.status(401)
                    .entity("Invalid details..")
                    .build();
        }
        return null;

    }





    











}
