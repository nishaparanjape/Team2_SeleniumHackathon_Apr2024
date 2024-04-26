package pageObjectModel;

import java.awt.Color;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v108.dom.model.RGBA;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.Assert;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import hooks.hooks;
import utilities.ConfigReader;
import utilities.DriverBase;
import utilities.ExcelUtils;

public class LoginPage {
	
	public static ConfigReader reader = new ConfigReader();
	public static DriverBase driverBase = new DriverBase();
	public static WebDriver driver = driverBase.getDriver();

	@FindBy(xpath = "//label[@id='mat-form-field-label-1']") WebElement labelUser;
	@FindBy(xpath = "//label[@id='mat-form-field-label-3']") WebElement labelPassword;
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement user;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
//	@FindBy(xpath = "//span[text()='Login']")
//	WebElement btnLogin;
	@FindBy(xpath = "//button[@id='login']") WebElement btnLogin;
	@FindBy (xpath = "//head/title") WebElement title;
	@FindBy (xpath = "//input") List<WebElement> textBoxes; 
	@FindBy (xpath = "//p[text()='Please login to LMS application']") WebElement pPleaseLoginToLMSAPp;
	@FindBy (xpath = "//img[@src='assets/img/LMS-logo.jpg']") WebElement imgLogo;
	@FindBy (xpath = "//*[@class='ng-dirty ng-touched ng-invalid']") WebElement form;
	@FindBy (xpath = "//*[@id='errormessage']") WebElement errMessage;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void launchUrl() {
		String url = reader.getUrl();
		driver.get(url);
	}
	
	public void launchInvalidUrl() {
		String url = reader.getInvalidUrl();
		driver.get(url);
	}

	public void enterUserName() {
		String userName = reader.getUsername();
		user.sendKeys(userName);
	}

	public void enterPassword() {
		String pass = reader.getPassword();
		password.sendKeys(pass);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	
	public void enterUserName(String strUserName) {
		user.sendKeys(strUserName);
	}

	public void enterPassword(String strPassword) {
		password.sendKeys(strPassword);
	}
	
	public void clickLogin(String str) {
		//Robot r = New Robot();
		btnLogin.sendKeys(Keys.SPACE);
	}
	
	public void ValiadateDashboardPage() {		
		String url = reader.getDashboardUrl();
		System.out.println(url+"**************");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Assert.assertEquals(url,currentUrl);
	}
	
	public void CheckForHomePage() {
		System.out.println("title :: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "LMS");
	}
	
	public void CheckSpellings() {
		Assert.assertEquals(pPleaseLoginToLMSAPp.getText(), "Please login to LMS application");
		Assert.assertEquals(labelUser.getText(), "User *");
		Assert.assertEquals(labelPassword.getText(), "Password *");
		Assert.assertEquals(btnLogin.getText(), "Login");
	}
	
	public void CheckLogo() {
		Assert.assertEquals(imgLogo.isDisplayed(), true);
	}

	public void CheckHeading() throws TesseractException {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Tesseract image = new Tesseract();
		image.setDatapath("Location for TessData Folder");
		image.setLanguage("eng");
		String text = image.doOCR(screenshot);
		System.out.println("text from image : " + text);
		Assert.assertEquals(text.equalsIgnoreCase("LMS - Learning Management System"), true);
	}
	
	public void CheckCompanyName() throws TesseractException {
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Tesseract image = new Tesseract();
		image.setDatapath("Location for TessData Folder");
		image.setLanguage("eng");
		String text = image.doOCR(screenshot);
		System.out.println("text from image : " + text);
		Assert.assertEquals(text.equalsIgnoreCase("Numpy Ninja"), true);
	}
	
	public void CheckParaContent() {
		Assert.assertEquals(pPleaseLoginToLMSAPp.getText(), "Please login to LMS application");
	}
	
	public void VerifyTwoTextFields() {
		Assert.assertEquals(textBoxes.size()==2, true);
	}
	
	public void VerifyUserTextBox(String string) {
		Assert.assertEquals(labelUser.getText().toLowerCase().contains(string), true);
	}
	
	public void VerifyPasswordTextBox(String string) {
		Assert.assertEquals(labelPassword.getText().toLowerCase().contains(string), true);
	}
	
	public void VerifyStarWithUserTextBox() {
		Assert.assertEquals(labelUser.getText().toLowerCase().contains("*"), true);
	}
	
	public void VerifyStarWithPasswordTextBox() {
		Assert.assertEquals(labelPassword.getText().toLowerCase().contains("*"), true);
	}
	
	public void CheckFieldInCenter() {
		int txtCenterX = user.getLocation().getX() + (user.getSize().getWidth() / 2);
	    int windowCenterX = driver.manage().window().getSize().getWidth() / 2;
	    int tolerance = 10; 
	    Assert.assertEquals(Math.abs(txtCenterX - windowCenterX) <= tolerance, true);
	    
	    txtCenterX = password.getLocation().getX() + (password.getSize().getWidth() / 2);
	    Assert.assertEquals(Math.abs(txtCenterX - windowCenterX) <= tolerance, true);
	}
	
	public void CheckForLoginButton() {
		Assert.assertEquals( btnLogin.isDisplayed(), true);
	}
	
	public void CheckLoginBtnInCenter() {
		int btnCenterX = btnLogin.getLocation().getX() + (btnLogin.getSize().getWidth() / 2);
	    int windowCenterX = driver.manage().window().getSize().getWidth() / 2;
	    int tolerance = 20; 
	    Assert.assertEquals(Math.abs(btnCenterX - windowCenterX) <= tolerance, true);
	}
	
	public void CheckUserFontColor() {
		System.out.println("font color :: " + labelUser.getCssValue("color"));
//		System.out.println("light gray  : " + Color.LIGHT_GRAY);		
//		System.out.println("dark gray  : " + Color.DARK_GRAY);
//		System.out.println(" gray  : " + Color.GRAY);

		Assert.assertEquals(labelUser.getCssValue("color").toLowerCase().equals("rgba(0, 0, 0, 0.54)"), true);
	}
	
	public void CheckPasswordFontColor() {
		System.out.println("font color :: " + labelPassword.getCssValue("color"));
		Assert.assertEquals(labelPassword.getCssValue("color").toLowerCase().equals("rgba(0, 0, 0, 0.54)"), true);
	}
	
	public void CheckErrorMessage() {
		System.out.println("error msg :: " + errMessage.getText());
		Assert.assertEquals(errMessage.getText().contains
				("Invalid username and password Please try again"), true);
	}
//----------------------------------------------------------------------------------------------------
//	static String filePath = "..\\Team2_Selenium_Apr2024\\src\\test\\resources\\DataDriven\\data.xlsx";
//    static String sheetName = "Login";
//	public static By title = By.xpath("//head/title");
//	public static By tctPassword = By.id("password");
//	public static By txtUserid = By.id("userid");
//	public static By btnLogin = By.id("login");	
//	public static ByAll textboxes = (ByAll) By.xpath("//input"); 
//	public static By pPleaseLoginToLMSAPp = By.xpath("//p[text()='Please login to LMS application']");
//	
//	LoginPage(){
//		
//	}
//	
//	public static void GiveCorrectURL(){
//		Object[][] testData;
//		try {
//			testData = ExcelUtils.readDataFromExcel(filePath, sheetName);			
//			System.out.println(" Data : " + testData[0][0]);
//			driver.get(testData[0][0].toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void CheckForHomePage() {
//		Assert.assertEquals(driver.getTitle(), "LMS");
//	}
	
}