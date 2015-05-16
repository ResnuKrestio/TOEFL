package config;

import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {
	
	private static Properties properties = new Properties();
	public ConfigurationManager() {
		
	}
	
	public static void init() throws IOException{
		readConfiguration();
	}

	private static Properties readConfiguration() {
		try {
			properties.load(ConfigurationManager.class.getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	public static String getConfiguration(String key){
		return properties.getProperty(key);
	}
}
