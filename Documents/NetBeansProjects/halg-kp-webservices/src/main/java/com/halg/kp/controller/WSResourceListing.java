/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.halg.kp.controller;

import com.cedar.clinical.logic.CedarResourceListing;
import com.cedar.database.entities.Allergies;
import com.cedar.database.entities.Disabilities;
import com.cedar.database.entities.DrugAdherence;
import com.cedar.database.entities.Genders;
import com.cedar.database.entities.Heirarchy;
import com.cedar.database.entities.HeirarchyUnits;
import com.cedar.database.entities.Laboratories;
import com.cedar.database.entities.Languages;
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
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Administrator
 */
@RestController
@RequestMapping("/api/v1")
public class WSResourceListing {

    @Autowired
    CedarResourceListing getLogic;

    @GetMapping("/listgenders")
    @ApiOperation(value = "Endpoint for listing gender")
    public ResponseEntity ListGenders() {
        List<Genders> genderList = getLogic.getGenderList();
        return (genderList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(genderList, HttpStatus.OK);
    }

    @GetMapping("/listallergies")
    @ApiOperation(value = "Endpoint for listing allergies")
    public ResponseEntity ListAllergies() {
        List<Allergies> allergiesList = getLogic.getAllergiesList();
        return (allergiesList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(allergiesList, HttpStatus.OK);
    }

    @GetMapping("/listdiabilities")
    @ApiOperation(value = "Endpoint for listing disabilities")
    public ResponseEntity ListDisabilities() {
        List<Disabilities> diabilitiesList = getLogic.getDisabilityList();
        return (diabilitiesList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(diabilitiesList, HttpStatus.OK);
    }

    @GetMapping("/listdrugadherence")
    @ApiOperation(value = "Endpoint for listing drug adherence")
    public ResponseEntity ListDrugAdherence() {
        List<DrugAdherence> drugAdherencesList = getLogic.getDrugAdherenceList();
        return (drugAdherencesList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(drugAdherencesList, HttpStatus.OK);
    }

    @GetMapping("/listlaboratories")
    @ApiOperation(value = "Endpoint for listing Laboratories")
    public ResponseEntity ListLaboratories() {
        List<Laboratories> laboratoriesList = getLogic.getLaboratoriesList();
        return (laboratoriesList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(laboratoriesList, HttpStatus.OK);
    }

    @GetMapping("/listlanguages")
    @ApiOperation(value = "Endpoint for listing languages")
    public ResponseEntity ListLanguages() {
        List<Languages> languagesList = getLogic.getLanguagesList();
        return (languagesList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(languagesList, HttpStatus.OK);
    }

    @GetMapping("/listmaritalstatus")
    @ApiOperation(value = "Endpoint for listing maritial status")
    public ResponseEntity ListMaritalStatus() {
        List<Genders> genderList = getLogic.getGenderList();
        return (genderList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(genderList, HttpStatus.OK);
    }

    @GetMapping("/userlogin")
    @ApiOperation(value = "Endpoint for userlogin")
    public ResponseEntity ListUsers(@RequestParam("username") String username, @RequestParam("password") String password) throws Exception {
        Users user = getLogic.getUserByUsernamePassword(username, password);
        System.out.println("user got as" + user);
        return (user == null) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(user, HttpStatus.OK);
    }

    @GetMapping("/listnationalities")
    @ApiOperation(value = "Endpoint for listing Nationalities")
    public ResponseEntity ListNationalities() {
        List<Nationalities> nationalitiesList = getLogic.getNationalitiesList();
        return (nationalitiesList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(nationalitiesList, HttpStatus.OK);
    }

    @GetMapping("/listnextofkin")
    @ApiOperation(value = "Endpoint for listing Next of Kin")
    public ResponseEntity ListNextOfKin() {
        List<NextOfKin> nextOfKinList = getLogic.getNextOfKinList();
        return (nextOfKinList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(nextOfKinList, HttpStatus.OK);
    }

    @GetMapping("/listoccupations")
    @ApiOperation(value = "Endpoint for listing occupations")
    public ResponseEntity ListOcuupations() {
        List<Occupations> occupationsList = getLogic.getOccupationsList();
        return (occupationsList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(occupationsList, HttpStatus.OK);
    }

    @GetMapping("/listpharmacies")
    @ApiOperation(value = "Endpoint for listing pharmacies")
    public ResponseEntity ListPharmacies() {
        List<Pharmacies> pharmaciesList = getLogic.getPharmaciesList();
        return (pharmaciesList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(pharmaciesList, HttpStatus.OK);
    }

    @GetMapping("/listprogramtype")
    @ApiOperation(value = "Endpoint for listing program type")
    public ResponseEntity ListProgramType() {
        List<ProgramType> programType = getLogic.getProgramTypeList();
        return (programType.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(programType, HttpStatus.OK);
    }

    @GetMapping("/listprograms")
    @ApiOperation(value = "Endpoint for listing programs")
    public ResponseEntity ListPrograms() {
        List<Programs> programsList = getLogic.getProgramsList();
        return (programsList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(programsList, HttpStatus.OK);
    }

    @GetMapping("/listqualifications")
    @ApiOperation(value = "Endpoint for listing qualifications")
    public ResponseEntity ListQualifications() {
        List<Qualifications> qualificationsList = getLogic.getQualificationsList();
        return (qualificationsList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(qualificationsList, HttpStatus.OK);
    }

    @GetMapping("/listrelationships")
    @ApiOperation(value = "Endpoint for listing relationship")
    public ResponseEntity ListRelationships() {
        List<Relationship> relationshipsList = getLogic.getRelationshipList();
        return (relationshipsList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(relationshipsList, HttpStatus.OK);
    }

    @GetMapping("/listreligions")
    @ApiOperation(value = "Endpoint for listing religions")
    public ResponseEntity ListReligions() {
        List<Religions> religionsList = getLogic.getReligionsList();
        return (religionsList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(religionsList, HttpStatus.OK);
    }

    @GetMapping("/listsoftwaresuites")
    @ApiOperation(value = "Endpoint for listing software suites")
    public ResponseEntity ListSoftwareSuites() {
        List<SoftwareSuite> softwareSuitesList = getLogic.getSoftwareSuiteList();
        return (softwareSuitesList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(softwareSuitesList, HttpStatus.OK);
    }

    @GetMapping("/listtargetgroups")
    @ApiOperation(value = "Endpoint for listing target groups")
    public ResponseEntity ListTargetGroups() {
        List<TargetGroups> targetGroupsList = getLogic.getTargetGroupsList();
        return (targetGroupsList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(targetGroupsList, HttpStatus.OK);
    }

    @GetMapping("/listuserbysuite")
    @ApiOperation(value = "Endpoint for listing user by suite")
    public ResponseEntity ListUserBySuite() {
        List<UserBySuite> userBySuiteList = getLogic.getUserBySuiteList();
        return (userBySuiteList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(userBySuiteList, HttpStatus.OK);
    }

    @GetMapping("/listusertype")
    @ApiOperation(value = "Endpoint for listing user ")
    public ResponseEntity ListUserType() {
        List<UserType> userTypeList = getLogic.getUserTypeList();
        return (userTypeList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(userTypeList, HttpStatus.OK);
    }

    @GetMapping("/listusers")
    @ApiOperation(value = "Endpoint for listing users")
    public ResponseEntity ListUsers() {
        List<Users> usersList = getLogic.getUsersList();
        return (usersList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(usersList, HttpStatus.OK);
    }

    @GetMapping("/listuserinfomation")
    @ApiOperation(value = "Endpoint for listing user information")
    public ResponseEntity ListUserInformation() {
        List<UsersInformation> usersInformationList = getLogic.getUsersInformationList();
        return (usersInformationList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(usersInformationList, HttpStatus.OK);
    }

    @GetMapping("/listuserroles")
    @ApiOperation(value = "Endpoint for listing user roles")
    public ResponseEntity ListUserRoles() {
        List<UserRoles> userRolesList = getLogic.getUserRolesList();
        return (userRolesList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(userRolesList, HttpStatus.OK);
    }

    @GetMapping("/heirarchyunitsbyparentid")
    @ApiOperation(value = "Endpoint for listing heirarchy units by parent id")
    public ResponseEntity ListHeirarchyUnitsByParentId(@RequestParam("parentid") int parentID) {
        List<HeirarchyUnits> heirarchyUnitsList = getLogic.getHeirarchyUnitList(parentID);
        return (heirarchyUnitsList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(heirarchyUnitsList, HttpStatus.OK);
    }

    @GetMapping("/listheirarchies")
    @ApiOperation(value = "Endpoint for listing heirarchies")
    public ResponseEntity ListHeirarchies() {
        List<Heirarchy> heirarchyList = getLogic.getHeirarchyList();
        return (heirarchyList.isEmpty()) ? new ResponseEntity(HttpStatus.BAD_REQUEST) : new ResponseEntity(heirarchyList, HttpStatus.OK);
    }

}
