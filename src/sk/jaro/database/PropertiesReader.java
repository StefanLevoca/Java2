package sk.jaro.database;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PropertiesReader {
    public static final String ORACLE_HOST = "oracledb.host";
    public static final String ORACLE_PORT = "oracledb.port";
    public static final String ORACLE_DB_NAME= "oracledb.dbname";
    public static final String ORACLE_USER = "oracledb.user";
    public static final String ORACLE_PSW = "oracledb.psw";

    public String getProperty(String property){
        String filename = "application.properties";
        String propertyValue = "";
        java.util.Properties prop = new java.util.Properties();
        InputStream input = null;
        try {
            input = getClass().getClassLoader().getResourceAsStream(filename);
            if (input == null) {
//                LOG.error("Sorry, unable to find " + filename);
                return "Sorry, unable to find " + filename;
            }

            prop.load(input);

            propertyValue = prop.getProperty(property);
            if (propertyValue != null && !propertyValue.isEmpty()){
                return propertyValue;
            }else {
//                LOG.error("property '"+property+"' not specified in config.properties file");
                return null;
            }

        } catch (FileNotFoundException ex) {
//            LOG.error("file config.properties file not found ",ex);
        } catch (IOException ex) {
//            LOG.error("IOException",ex);
        }

//        LOG.error("return empty property value without taking from "+filename);
        return propertyValue;
    }

}
