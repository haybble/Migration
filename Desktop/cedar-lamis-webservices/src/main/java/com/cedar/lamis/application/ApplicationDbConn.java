package com.cedar.lamis.application;


import com.cedar.lamis.entity.Patient;
import com.cedar.lamis.query.impl.LamisDbImpl;
import com.cedar.lamis.util.Util;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class ApplicationDbConn {

    public static final String PROPERTIES_FILE = "app-db.yml";
    public static final Properties PROPERTIES = new Properties();
  
    
    public static void main(String[] args) throws IOException{
     ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream propertiesFile =  classLoader.getResourceAsStream(PROPERTIES_FILE);
       
        if (propertiesFile != null) {
        PROPERTIES.load(propertiesFile);
        
//         LamisDbImpl result = new LamisDbImpl(String.valueOf(Util.getProperty("dbpath")));
//         List<Patient> patientList = result.getPatient();
//            System.out.println("got here as"+ patientList.stream().count());

        System.out.println("Got property here as "+ PROPERTIES.getProperty("id"));
        }
        
        else {
            System.out.println("Cant connect to the database through the property file");
        }
        
            
        }
        
        
        
    
    

}
