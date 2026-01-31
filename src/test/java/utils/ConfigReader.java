package utils;

import java.io.InputStream;
import java.util.Properties;

import factory.DriverManager;

public class ConfigReader {
	Properties prop = null;
	 public final static String CONFIG_DATA_FILE_NAME = "config.properties";


	public Properties loadProperties() {
        try {
            prop = new Properties();
            String configFileResourcePath = "/config/";
            InputStream configResourceInputStream = getClass().getResourceAsStream(configFileResourcePath + CONFIG_DATA_FILE_NAME);
            prop.load(configResourceInputStream);
            DriverManager.setAppUrl(prop.getProperty("appURL"));

            if (DriverManager.getBrowserType() == null ||DriverManager.getBrowserType().isEmpty()) {
            	DriverManager.setBrowserType(prop.getProperty("browser"));
            }
        } catch (Exception e) {
            LoggerFactory.getLogger().error("Unexcepted error occurred when loading configuration. {}", e.getMessage());
        }

        return prop;
    }   
}
