/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.halg.kp.controller;

import com.cedar.clinical.logic.CedarResourcePosting;
import com.cedar.database.entities.Allergies;
import com.cedar.database.entities.ClinicalAllergies;
import com.cedar.database.entities.ClinicalConsultation;
import com.cedar.database.entities.ClinicalDrugAdherence;
import com.cedar.database.entities.ClinicalDrugPrescription;
import com.cedar.database.entities.ClinicalHIVServices;
import com.cedar.database.entities.ClinicalLabTests;
import com.cedar.database.entities.ClinicalRegistration;
import com.cedar.database.entities.ClinicalServices;
import com.cedar.database.entities.ClinicalTBServices;
import com.cedar.database.entities.ClinicalVitalSigns;
import com.cedar.database.entities.Disabilities;
import com.cedar.database.entities.DrugAdherence;
import com.cedar.database.entities.Genders;
import com.cedar.database.entities.Heirarchy;
import com.cedar.database.entities.HeirarchyUnits;
import com.cedar.database.entities.Laboratories;
import com.cedar.database.entities.Languages;
import com.cedar.database.entities.MaritalStatus;
import com.cedar.database.entities.Nationalities;
import com.cedar.database.entities.NextOfKin;
import com.cedar.database.entities.Occupations;
import com.cedar.database.entities.Pharmacies;
import com.cedar.database.entities.ProgramType;
import com.cedar.database.entities.Programs;
import com.cedar.database.entities.Qualifications;
import com.cedar.database.entities.Relationship;
import com.cedar.database.entities.Religions;
import com.cedar.database.entities.SoftwareSuite;
import com.cedar.database.entities.TargetGroups;
import com.cedar.database.entities.UserBySuite;
import com.cedar.database.entities.UserRoles;
import com.cedar.database.entities.UserType;
import com.cedar.database.entities.Users;
import com.cedar.database.entities.UsersInformation;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/api/v1")
public class WSResourcePosting {

    @Autowired
    CedarResourcePosting postLogic;

    ObjectMapper objectMapper = new ObjectMapper();

  
    @PostMapping("/postgenders")
    @ApiOperation(value = "Endpoints for adding gender")
    public ResponseEntity PostGenders(@RequestBody String response) throws Exception {
        Genders gender = objectMapper.readValue(response, new TypeReference<Genders>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Genders(response)) ? new ResponseEntity(gender, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postallergies")
    @ApiOperation(value = "Endpoints for adding Allergies")
    public ResponseEntity PostAllergies(@RequestBody String response) throws Exception {
        Allergies allergies = objectMapper.readValue(response, new TypeReference<Allergies>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Allergies(response)) ? new ResponseEntity(allergies, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclinicalallergies")
    @ApiOperation(value = "Endpoints for adding clinical allergies")
    public ResponseEntity PostClinicalAllergies(@RequestBody String response) throws Exception {
        ClinicalAllergies clinicalAllergies = objectMapper.readValue(response, new TypeReference<ClinicalAllergies>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalAllergies(response)) ? new ResponseEntity(clinicalAllergies, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclinicalconsultation")
    @ApiOperation(value = "Endpoint for adding Clinical consultation")
    public ResponseEntity PostClinicalConsultation(@RequestBody String response) throws Exception {
        ClinicalConsultation clinicalConsultation = objectMapper.readValue(response, new TypeReference<ClinicalConsultation>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalConsultation(response)) ? new ResponseEntity(clinicalConsultation, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclinicaldrugadherence")
    @ApiOperation(value = "Endpoint for adding clinical drug adherence")
    public ResponseEntity PostClinicalDrugAdherence(@RequestBody String response) throws Exception {
        ClinicalDrugAdherence clinicalDrugAdherence = objectMapper.readValue(response, new TypeReference<ClinicalDrugAdherence>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalDrugAdherence(response)) ? new ResponseEntity(clinicalDrugAdherence, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclinicaldrugprescription")
    @ApiOperation(value = "Endpoint for adding Clinical drug prescription")
    public ResponseEntity PostClinicalDrugPrescription(@RequestBody String response) throws Exception {
        ClinicalDrugPrescription clinicalDrugPrescription = objectMapper.readValue(response, new TypeReference<ClinicalDrugPrescription>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalDrugPrescription(response)) ? new ResponseEntity(clinicalDrugPrescription, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclinicalhivservices")
    @ApiOperation(value = "Endpoint for adding clinical hiv services")
    public ResponseEntity PostClinicalHIVServices(@RequestBody String response) throws Exception {
        ClinicalHIVServices clinicalHIVServices = objectMapper.readValue(response, new TypeReference<ClinicalHIVServices>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalHIVServices(response)) ? new ResponseEntity(clinicalHIVServices, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclinicallabtests")
    @ApiOperation(value = "Endpoint for adding labtests")
    public ResponseEntity PostClinicalLabTests(@RequestBody String response) throws Exception {
        ClinicalLabTests clinicalLabTests = objectMapper.readValue(response, new TypeReference<ClinicalLabTests>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalLabTests(response)) ? new ResponseEntity(clinicalLabTests, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclinicalregistration")
    @ApiOperation(value = "Endpoint for adding clinical registration")
    public ResponseEntity PostClinicalRegistration(@RequestBody String response) throws Exception {
        ClinicalRegistration clinicalRegistration = objectMapper.readValue(response, new TypeReference<ClinicalRegistration>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalRegistration(response)) ? new ResponseEntity(clinicalRegistration, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclinicalservices")
    @ApiOperation(value = "Endpoint for adding clinical services")
    public ResponseEntity PostClinicalServices(@RequestBody String response) throws Exception {
        ClinicalServices clinicalServices = objectMapper.readValue(response, new TypeReference<ClinicalServices>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalServices(response)) ? new ResponseEntity(clinicalServices, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclinicaltbservices")
    @ApiOperation(value = "Endpoint for adding clinical TB services")
    public ResponseEntity PostClinicalTBServices(@RequestBody String response) throws Exception {
        ClinicalTBServices clinicalTBServices = objectMapper.readValue(response, new TypeReference<ClinicalTBServices>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalTBServices(response)) ? new ResponseEntity(clinicalTBServices, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postclincialvitalsigns")
    @ApiOperation(value = "Endpoint for adding clinical vital signs")
    public ResponseEntity PostClinicalVitalSigns(@RequestBody String response) throws Exception {
        ClinicalVitalSigns clinicalVitalSigns = objectMapper.readValue(response, new TypeReference<ClinicalVitalSigns>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ClinicalVitalSigns(response)) ? new ResponseEntity(clinicalVitalSigns, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postdisabilities")
    @ApiOperation(value = "Endpoint for adding disabilities")
    public ResponseEntity PostDisabilities(@RequestBody String response) throws Exception {
        Disabilities disabilities = objectMapper.readValue(response, new TypeReference<Disabilities>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Disabilities(response)) ? new ResponseEntity(disabilities, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postdrugadherence")
    @ApiOperation(value = "Endpoint for adding adherence")
    public ResponseEntity PostDrugAdherence(@RequestBody String response) throws Exception {
        DrugAdherence drugAdherence = objectMapper.readValue(response, new TypeReference<DrugAdherence>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.DrugAdherence(response)) ? new ResponseEntity(drugAdherence, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postheirarchy")
    @ApiOperation(value = "Endpoint for adding heirarchy")
    public ResponseEntity PostHeirarchy(@RequestBody String response) throws Exception {
        Heirarchy heirarchy = objectMapper.readValue(response, new TypeReference<Heirarchy>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Heirarchy(response)) ? new ResponseEntity(heirarchy, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postheirarchyunits")
    @ApiOperation(value = "Endpoint for adding heirarchy units")
    public ResponseEntity PostHeirarchyUnits(@RequestBody String response) throws Exception {
        HeirarchyUnits heirarchyUnits = objectMapper.readValue(response, new TypeReference<HeirarchyUnits>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.HeirarchyUnits(response)) ? new ResponseEntity(heirarchyUnits, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postlaboratories")
    @ApiOperation(value = "Endpoint for adding laboratories")
    public ResponseEntity PostLaboratories(@RequestBody String response) throws Exception {
        Laboratories laboratories = objectMapper.readValue(response, new TypeReference<Laboratories>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Laboratories(response)) ? new ResponseEntity(laboratories, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postlanguages")
    @ApiOperation(value = "Endpoint for adding languages")
    public ResponseEntity PostLanguages(@RequestBody String response) throws Exception {
        Languages languages = objectMapper.readValue(response, new TypeReference<Languages>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Languages(response)) ? new ResponseEntity(languages, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postmaritalstatus")
    @ApiOperation(value = "Endpoint for adding marital status")
    public ResponseEntity PostMaritalStatus(@RequestBody String response) throws Exception {
        MaritalStatus maritalStatus = objectMapper.readValue(response, new TypeReference<MaritalStatus>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.MaritalStatus(response)) ? new ResponseEntity(maritalStatus, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postnationalities")
    @ApiOperation(value = "Endpoint for adding nationalities")
    public ResponseEntity PostNationalities(@RequestBody String response) throws Exception {
        Nationalities nationalities = objectMapper.readValue(response, new TypeReference<Nationalities>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Nationalities(response)) ? new ResponseEntity(nationalities, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postNextOfKin")
    @ApiOperation(value = "Endpoint for adding Next of kin")
    public ResponseEntity PostNextOfKin(@RequestBody String response) throws Exception {
        NextOfKin nextOfKin = objectMapper.readValue(response, new TypeReference<NextOfKin>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.NextOfKin(response)) ? new ResponseEntity(nextOfKin, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postoccupations")
    @ApiOperation(value = "Endpoint for adding occupations")
    public ResponseEntity PostOccupations(@RequestBody String response) throws Exception {
        Occupations occupations = objectMapper.readValue(response, new TypeReference<Occupations>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Occupations(response)) ? new ResponseEntity(occupations, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postpharmacies")
    @ApiOperation(value = "Endpoint for adding paharmacies")
    public ResponseEntity PostPharmacies(@RequestBody String response) throws Exception {
        Pharmacies pharmacies = objectMapper.readValue(response, new TypeReference<Pharmacies>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Pharmacies(response)) ? new ResponseEntity(pharmacies, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postprogramtype")
    @ApiOperation(value = "Endpoint for adding program type")
    public ResponseEntity PostProgramType(@RequestBody String response) throws Exception {
        ProgramType programType = objectMapper.readValue(response, new TypeReference<ProgramType>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.ProgramType(response)) ? new ResponseEntity(programType, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postprograms")
    @ApiOperation(value = "Endpoint for adding program")
    public ResponseEntity PostPrograms(@RequestBody String response) throws Exception {
        Programs programs = objectMapper.readValue(response, new TypeReference<Programs>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Programs(response)) ? new ResponseEntity(programs, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postqualifications")
    @ApiOperation(value = "Endpoint for adding qualifications")
    public ResponseEntity PostQualifications(@RequestBody String response) throws Exception {
        Qualifications qualifications = objectMapper.readValue(response, new TypeReference<Qualifications>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Qualifications(response)) ? new ResponseEntity(qualifications, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postrelationship")
    @ApiOperation(value = "Endpoint for adding relationship")
    public ResponseEntity PostRelationships(@RequestBody String response) throws Exception {
        Relationship relationship = objectMapper.readValue(response, new TypeReference<Relationship>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Relationships(response)) ? new ResponseEntity(relationship, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postreligions")
    @ApiOperation(value = "Endpoint for adding religions")
    public ResponseEntity PostReligions(@RequestBody String response) throws Exception {
        Religions religions = objectMapper.readValue(response, new TypeReference<Religions>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Religions(response)) ? new ResponseEntity(religions, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postsoftwaresuite")
    @ApiOperation(value = "Endpoint for adding software suite")
    public ResponseEntity PostSoftwareSuite(@RequestBody String response) throws Exception {
        SoftwareSuite softwareSuite = objectMapper.readValue(response, new TypeReference<SoftwareSuite>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.SoftwareSuite(response)) ? new ResponseEntity(softwareSuite, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/posttargetgroups")
    @ApiOperation(value = "Endpoint for adding target groups")
    public ResponseEntity PostTargetGroups(@RequestBody String response) throws Exception {
        TargetGroups targetGroups = objectMapper.readValue(response, new TypeReference<TargetGroups>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.TargetGroups(response)) ? new ResponseEntity(targetGroups, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postuserbysuite")
    @ApiOperation(value = "Endpoint for adding user by suite")
    public ResponseEntity PostUserBySuite(@RequestBody String response) throws Exception {
        UserBySuite userBySuite = objectMapper.readValue(response, new TypeReference<UserBySuite>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.UserBySuite(response)) ? new ResponseEntity(userBySuite, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postusertype")
    @ApiOperation(value = "Endpoint for adding user type")
    public ResponseEntity PostUserType(@RequestBody String response) throws Exception {
        UserType userType = objectMapper.readValue(response, new TypeReference<UserType>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.UserType(response)) ? new ResponseEntity(userType, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postusers")
    @ApiOperation(value = "Endpoint for adding users")
    public ResponseEntity PostUsers(@RequestBody String response) throws Exception {
        Users users = objectMapper.readValue(response, new TypeReference<Users>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.Users(response)) ? new ResponseEntity(users, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postuserroles")
    @ApiOperation(value = "Endpoint for adding user roles")
    public ResponseEntity PostUserRoles(@RequestBody String response) throws Exception {
        UserRoles userRoles = objectMapper.readValue(response, new TypeReference<UserRoles>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.UserType(response)) ? new ResponseEntity(userRoles, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/postusersinformation")
    @ApiOperation(value = "Endpoint for adding users information")
    public ResponseEntity PostUsersInformation(@RequestBody String response) throws Exception {
        UsersInformation usersInformation = objectMapper.readValue(response, new TypeReference<UsersInformation>() {
        });
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return (postLogic.UsersInformation(response)) ? new ResponseEntity(usersInformation, HttpStatus.OK) : new ResponseEntity(HttpStatus.BAD_REQUEST);
    }

}
