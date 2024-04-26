package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
	public static String path = "../Team2_Selenium_Apr2024/src/test/resources/properties/Config.properties";
	public static void readConfig() throws IOException {

		FileInputStream fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
	}

	public String getUrl() {

		String url = prop.getProperty("lmsUrl");
		return url;
	}
	
	public String getInvalidUrl() {

		String url = prop.getProperty("lmsInvalidUrl");
		return url;
	}

	public String getUsername() {

		String username = prop.getProperty("user");
		return username;
	}

	public String getPassword() {

		String password = prop.getProperty("password");
		return password;
	}

	public String getBrowser() throws IOException {

		readConfig();
		String browser = prop.getProperty("browser");
		return browser;
	}
	
	public String getDashboardUrl() {

		String url = prop.getProperty("DashboardUrl");
		return url;
	}
}

