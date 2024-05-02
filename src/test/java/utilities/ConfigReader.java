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
		System.out.println("read config done............");
	}

	public String getExcelPath() {
		String path = prop.getProperty("excelpath");
		return path;
	}
	
	
//	public String getUrl() {
//		String url = prop.getProperty("lmsUrl");
//		return url;
//	}
//	
//	public String getInvalidUrl() {
//		String url = prop.getProperty("lmsInvalidUrl");
//		return url;
//	}

//	public String getUsername() {
//		String username = prop.getProperty("user");
//		return username;
//	}
//
//	public String getPassword() {
//		String password = prop.getProperty("password");
//		return password;
//	}

	public String getBrowser() throws IOException {
		readConfig();
		String browser = prop.getProperty("browser");
		return browser;
	}
	
//	public String getDashboardUrl() {
//		String url = prop.getProperty("DashboardUrl");
//		return url;
//	}
	
	public String getDashboardUrl() {

		String url = prop.getProperty("DashboardUrl");
		return url;
	}
	public String geteditnewprogram() {

		String editNewProgram = prop.getProperty("editnewprogram");
		return editNewProgram;
	}
	public String geteditnewdescription() {

		String editNewDescription = prop.getProperty("editnewdescription");
		return editNewDescription;
	}
	public String getspecialdescription() {

		String specialdescription = prop.getProperty("specdescription");
		return specialdescription;
	}
	public String getspecialprogram() {

		String specialprogram = prop.getProperty("specprogram");
		return specialprogram;
	}
	public String getaddProgramName() {

		String addprogramname = prop.getProperty("newprogram");
		return addprogramname;
	}
	public String getaddProgramDescription() {

		String addprogramdescription = prop.getProperty("newdescription");
		return addprogramdescription;
	}
	public String getaddNewProgram() {

		String addnewprogram = prop.getProperty("addnewprogram");
		return addnewprogram;
	}
	public String getaddNewDescription() {

		String addnewdescription = prop.getProperty("addnewdescription");
		return addnewdescription;
	}
	
	public String getUrl() {

		String url = prop.getProperty("lmsUrl");
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
}