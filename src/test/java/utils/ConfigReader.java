package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	private static Properties prop = new Properties();
	public final static String CONFIG_DATA_FILE_NAME = "config.properties";

	static {

		try {

			String configFileResourcePath = "config/";
			InputStream configResourceInputStream = ConfigReader.class
					.getClassLoader().getResourceAsStream(
							configFileResourcePath + CONFIG_DATA_FILE_NAME);
			prop.load(configResourceInputStream);

		} catch (Exception e) {
			LoggerFactory.getLogger().error(
					"Unexcepted error occurred when loading configuration. {}",
					e.getMessage());
		}
	}

	public static String getProperty(String key) {

		return prop.getProperty(key.trim());
	}
}
