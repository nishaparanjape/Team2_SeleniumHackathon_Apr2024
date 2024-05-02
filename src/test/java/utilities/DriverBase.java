package utilities;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverBase {

	public static ConfigReader reader;
	public static WebDriver driver;

	public WebDriver initDriver(String browser) throws IOException {
		
		reader = new ConfigReader();
		browser = reader.getBrowser();

		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			if(driver==null) {
				driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();	
			}
		} 
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(false);
			driver = new FirefoxDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
	}
	
	public void quitDriver() {
		driver.quit();
	}
	

}

