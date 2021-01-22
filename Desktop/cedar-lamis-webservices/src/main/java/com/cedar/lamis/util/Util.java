/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cedar.lamis.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

/**
 *
 * @author damilola
 */
public class Util implements Serializable {

    private static final String PROPERTIES_FILE = "app-db.yml";
    private static final Properties PROPERTIES = new Properties();

    static {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream propertiesFile = classLoader.getResourceAsStream(PROPERTIES_FILE);

        if (propertiesFile == null) {
            throw new ConfigurationException("Properties file '" + PROPERTIES_FILE + "' is missing in classpath.");
        }

        try {
            PROPERTIES.load(propertiesFile);
        } catch (IOException e) {
            throw new ConfigurationException("Cannot load properties file '" + PROPERTIES_FILE + "'.", e);
        }
    }

    public static String getProperty(String key) throws ConfigurationException {
        String property = PROPERTIES.getProperty(key);

        if (property == null || property.trim().length() == 0) {


            throw new ConfigurationException("Required property '" + key + "'"
                    + " is missing in properties file '" + PROPERTIES_FILE + "'.");

        }

        return property;
    }
}
