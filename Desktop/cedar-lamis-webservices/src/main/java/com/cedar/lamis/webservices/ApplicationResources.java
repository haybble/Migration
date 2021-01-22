/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.webservices;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Administrator
 */
@ApplicationPath("pl")
public class ApplicationResources extends ResourceConfig{
    
       public ApplicationResources(){
        packages("com.cedar.lamis.webservices","com.fasterxml.jackson.jaxrs.json");
        register(MultiPartFeature.class); 
    }

    
}
