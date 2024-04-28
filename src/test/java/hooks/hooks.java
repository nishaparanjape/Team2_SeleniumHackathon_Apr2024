package hooks;

import java.io.IOException;
import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.DriverBase;
import utilities.LoggerLoad;
import io.cucumber.java.*;

public class hooks {
	//public static WebDriver driver;
	public static ConfigReader reader;
	public static DriverBase driverbase = new DriverBase();

	
	@BeforeAll
	public static void SetUp() throws IOException {
		reader = new ConfigReader();
		String browser = reader.getBrowser();
		driverbase.initDriver(browser);
		System.out.println("_________________________________DRIVER INITIALIZED________________________________________");
	}
	
	@AfterAll
	public static void TearDown() {
		driverbase.closeDriver();
		System.out.println("_________________________________DRIVER CLOSED__________________________");
		driverbase.quitDriver();
	}
	
	@After
	public void takeScreenshotOnFailure(Scenario scenario) throws IOException {
		if (scenario.isFailed()) {
			String name= scenario.getName();
			TakesScreenshot ts = (TakesScreenshot) driverbase.getDriver();	
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			File screenshotDestinationFile = new File(System.getProperty("user.dir") + "\\Screenshots\\" + name);
			scenario.attach(src, "image/png", name);
			System.out.println(name + " failed !!! ");
			LoggerLoad.info(name + " failed !!! ");
		}
	}
}
