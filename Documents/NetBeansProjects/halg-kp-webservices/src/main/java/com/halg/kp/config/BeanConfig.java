/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.halg.kp.config;

import com.cedar.clinical.logic.CedarResourceListing;
import com.cedar.clinical.logic.CedarResourcePosting;
import com.cedar.database.ServiceEntityManager;
import com.cedar.database.ServiceEntityManagerImpl;
import java.io.IOException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Administrator
 */
@Configuration
public class BeanConfig {
    
    @Bean
    public  ServiceEntityManager getServiceEntityManager() throws Exception{
                     return new ServiceEntityManager();
    }
    
    
     @Bean
    public  CedarResourcePosting getCedarResourcePosting() {
                     return new CedarResourcePosting();
    }
    
    
    @Bean
    public CedarResourceListing getCedaarListing(){
    return new CedarResourceListing();
    }
    
    
   
    
}
