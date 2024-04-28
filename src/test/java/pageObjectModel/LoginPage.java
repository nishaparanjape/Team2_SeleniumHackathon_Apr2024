package pageObjectModel;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import utilities.ConfigReader;
import utilities.DriverBase;
import utilities.ExcelUtils;
import com.aspose.ocr.AsposeOCR;
import com.aspose.ocr.AsposeOCRException;
import com.aspose.ocr.InputType;
import com.aspose.ocr.Language;
import com.aspose.ocr.License;
import com.aspose.ocr.OcrInput;
import com.aspose.ocr.RecognitionResult;
import com.aspose.ocr.RecognitionSettings;

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
	@FindBy(xpath = "//button[@id='login']") WebElement btnLogin;
	@FindBy (xpath = "//head/title") WebElement title;
	@FindBy (xpath = "//input") List<WebElement> textBoxes; 
	@FindBy (xpath = "//p[text()='Please login to LMS application']") WebElement pPleaseLoginToLMSAPp;
	@FindBy (xpath = "//img[@src='assets/img/LMS-logo.jpg']") WebElement imgLogo;
	@FindBy (xpath = "//*[@class='ng-dirty ng-touched ng-invalid']") WebElement form;
	@FindBy (xpath = "//*[@id='errormessage']") WebElement errMessage;
	@FindBy(xpath = "//html")  WebElement htmlElement;
    @FindBy (tagName = "a") List<WebElement> links;
    @FindBy (xpath = "//*[contains(text(),'Logout')]" ) WebElement lnkLogout;
    
	public LoginPage() {
		System.out.println(" ------------------in constructor login page----------------------");
		PageFactory.initElements(driver, this);
		System.out.println("driver ::::: " + driver);

	}

	public void launchUrl() throws IOException {
		String filePath = reader.getExcelPath();
		String sheetName = "Login";
		Object[][] testData;
		testData = ExcelUtils.readDataFromExcel(filePath, sheetName);			
		System.out.println(" Data : " + testData[0][0]);
		driver.get(testData[0][0].toString());
	}
	
	public void launchInvalidUrl() throws IOException {
		String filePath =  reader.getExcelPath();
		String sheetName = "Login";
		Object[][] testData;
		testData = ExcelUtils.readDataFromExcel(filePath, sheetName);			
		System.out.println("invalid URL : " + testData[0][1]);
		driver.get(testData[0][1].toString());
}
	
	public boolean CheckIfValidURL(){
		 String pageSource = driver.getPageSource().toLowerCase();
//		return !(driver.getTitle().toLowerCase().equals("error") ||
//				(driver.getTitle().toLowerCase().equals("404") ||
//				(driver.getTitle().toLowerCase().equals("not") && 
//						driver.getTitle().toLowerCase().equals("found")));
		return !(pageSource.contains("error") ||
				pageSource.contains("404") ||
				(pageSource.contains("not") && pageSource.contains("found")));
	}

	public int getHTTPResponseCode() throws IOException {
    	int responseCode = 0;
     	System.out.println("Total links are " + links.size());

        for (int i = 0; i < links.size(); i++) {
          WebElement ele = links.get(i);
          String url1 = ele.getAttribute("href");
          URL url = new URL(url1);
          HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
          httpURLConnect.setConnectTimeout(3000);
          httpURLConnect.connect();
          if (httpURLConnect.getResponseCode() == 200) {
            System.out.println(
              url + " - " + httpURLConnect.getResponseMessage()
            );
          }
          if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
            System.out.println(url + " - " + httpURLConnect.getResponseMessage() + " - " +
              HttpURLConnection.HTTP_NOT_FOUND);
        }
      }
        return responseCode;
    }   

	public void enterUserName() {
		//String userName = reader.getUsername();
		
		String filePath = reader.getExcelPath();

		String sheetName = "Login";
		Object[][] testData;
		try {
			testData = ExcelUtils.readDataFromExcel(filePath, sheetName);			
			String userName = testData[0][2].toString();
			user.sendKeys(userName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void enterPassword() {
		//String pass = reader.getPassword();
		String filePath =  reader.getExcelPath();
		String sheetName = "Login";
		Object[][] testData;
		try {
			testData = ExcelUtils.readDataFromExcel(filePath, sheetName);			
			String p= testData[0][3].toString();
			password.sendKeys(p);
		} catch (IOException e) {
			e.printStackTrace();
		}
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
		btnLogin.sendKeys(Keys.ENTER);
	}
	
	public void ValiadateDashboardPage() throws IOException {	
		Assert.assertEquals(lnkLogout.isEnabled(),true);
	}
	
	public void CheckForHomePage() {
		//System.out.println("title :: " + driver.getTitle());
		//String status = htmlElement.getAttribute("status");
        //System.out.println("in valid url status ::: " + status);
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

	public void CheckHeading() throws AsposeOCRException {
//		AsposeOCR api = new AsposeOCR();
//		RecognitionSettings recognitionSettings = new RecognitionSettings();
//		// Add image to the recognition batch
//		OcrInput source = new OcrInput(InputType.SingleImage);
//		System.out.println("image source :: " + imgLogo.getAttribute("src"));
//		source.add("C:/Users/manas/Desktop/LMS-loog.jpg");
//
//		//source.add("assets/img/LMS-logo.jpg");
//		// Specify recognition language
//		RecognitionSettings recognitionSettings1 = new RecognitionSettings();
//		recognitionSettings1.setLanguage(Language.Eng);// ExtLatin);
//		// Extract text from image
//		//source.add(null, imgLogo.getSize().width, imgLogo.getSize().height, )
//        //ArrayList<RecognitionResult> ExtractedTextFromImage = api.Recognize(source, recognitionSettings1);
//
//		ArrayList<RecognitionResult> results = api.Recognize(source, recognitionSettings1);
//		System.out.println("results no. " + results.size());
//		
		//Assert.assertEquals(text.equalsIgnoreCase("LMS - Learning Management System"), true);
		
		
		com.aspose.ocr.AsposeOCR api = new com.aspose.ocr.AsposeOCR();
		com.aspose.ocr.OcrInput input = new com.aspose.ocr.OcrInput(com.aspose.ocr.InputType.SingleImage);
		input.add("C:/Users/manas/Desktop/LMS-loog.jpg");
		ArrayList<RecognitionResult> results = api.RecognizeStreetPhoto(input);

		for (RecognitionResult res : results) {
		    System.out.println(res.recognitionText);
		}
	}
	
	public void CheckCompanyName() throws TesseractException {
//		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Tesseract image = new Tesseract();
//		image.setDatapath("Location for TessData Folder");
//		image.setLanguage("eng");
//		String text = image.doOCR(screenshot);
//		System.out.println("text from image : " + text);
//		Assert.assertEquals(text.equalsIgnoreCase("Numpy Ninja"), true);
		ITesseract inst = new Tesseract();
		//inst.setDatapath("C:\\Users\\manas\\Desktop\\LMS-loog.jpg");
		String result = inst.doOCR(new File("C:\\Users\\manas\\Desktop\\LMS-logo.jpg"));
		System.out.println("result ::::: " + result);
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
}