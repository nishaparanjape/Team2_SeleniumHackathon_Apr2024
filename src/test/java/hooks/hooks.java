package hooks;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;
import utilities.DriverBase;

import io.cucumber.java.*;

public class hooks {
	public static WebDriver driver;
	public static ConfigReader reader;
	public static DriverBase driverbase = new DriverBase();

	
	@BeforeAll
	public static void SetUp() throws IOException {
		reader = new ConfigReader();
		String browser = reader.getBrowser();
		driverbase.initDriver(browser);
	}
	
	@AfterAll
	public static void TearDown() {
		driverbase.closeDriver();
	}
}