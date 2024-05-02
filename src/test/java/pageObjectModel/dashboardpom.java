package pageObjectModel;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.ConfigReader;
import utilities.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class dashboardpom {

	public static ConfigReader reader = new ConfigReader();
	public static DriverBase DriverBase = new DriverBase();
	public static WebDriver driver = DriverBase.getDriver();

	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	@FindBy (xpath= "//html/body/app-root/app-program/div/mat-card/mat-card-title/div[1]")
    private WebElement managebatchvalidation;
    @FindBy (xpath="/html/body/app-root/app-header/mat-toolbar/span[1]")
    private WebElement validateLMS;
    @FindBy (xpath="//*[@id='program']")
    private WebElement validateprogram;
    @FindBy (xpath="//*[@id='batch']")
    private WebElement validatebatch;
    @FindBy (xpath="//*[@id='user']")
    private WebElement validateuser;
    @FindBy (xpath="//*[@id='logout']")
    private WebElement validatelogout;
    @FindBy (xpath="//*[@id='logout']")
    private WebElement logout;
    @FindBy(xpath = "/html/body/app-root/app-login/div/mat-card/mat-card-content/form/p")
	private WebElement validateloginpage;
    @FindBy(xpath ="/html/body/app-root/app-header/mat-toolbar")
	private WebElement navigationbar;
	
    public dashboardpom() {
		PageFactory.initElements(driver, this);
	}

	public void launchUrl() {
		String url = reader.getUrl();
		driver.get(url);
	}

	public void username() {
		String userName = reader.getUsername();
		user.sendKeys(userName);
	}

	public void enterPassword() {
		String pass = reader.getPassword();
		password.sendKeys(pass);
	}

	public void clickLogin() {
		login.click();
	}
	 public void dashboardPageValidation() {
	  		boolean dashBoardvalidation = managebatchvalidation.isDisplayed();
	    	 if(dashBoardvalidation) {
					  System.out.println("Manage Batch is Displayed");
				  }
				  else {
					  System.out.println("Manage Batch is not Displayed");
				  }
}
		public void managebatchvalidation(){
	     String expectedTitle = "Manage Program";
         Assert.assertEquals(managebatchvalidation.getText(), expectedTitle);
	}
	
	public void validateLMS(){
		String expectedTitle = "LMS - Learning Management System";
	        Assert.assertEquals(validateLMS.getText(), expectedTitle);
		}
public void validateProgram() {
	 	boolean programValidate = validateprogram.isDisplayed();
  if(programValidate) {
		  System.out.println("Program is Displayed");
	  }
	  else {
		  System.out.println("Program is not Displayed");
	  }
}
        
	public void validateUser() {
  	 	boolean userValidate = validateuser.isDisplayed();
	  if(userValidate) {
			  System.out.println("User is Displayed");
		  }
		  else {
			  System.out.println("User is not Displayed");
		  }
}
     public void logoutvalidate() {
    		  	 	boolean logout = validatebatch.isDisplayed();
    	    	  if(logout) {
    					  System.out.println("Logout is Displayed");
    				  }
    				  else {
    					  System.out.println("Logout is not Displayed");
    				  }
    }
            
           public void clicklogout() {
		logout.click();
	}
           public void loginvalidate() {
		  	 	boolean validatelogin = validateloginpage.isDisplayed();
	    	  if(validatelogin) {
					  System.out.println("LoginPage is Displayed");
				  }
				  else {
					  System.out.println("LoginPage is not Displayed");
				  }
}
	      
	      public void validateBatch() {
		  	 	boolean batchvalidation = validatebatch.isDisplayed();
	    	  if(batchvalidation) {
					  System.out.println("Batch is Displayed");
				  }
				  else {
					  System.out.println("Batch is not Displayed");
				  }
}
	      
	      public void lmsquadinants() {
	      WebElement lms =validateLMS;
	      Point p = lms.getLocation();
	      System.out.println("x-cord-"+p.x+" " +p.getX());
	      System.out.println("y-cord-"+p.y+" " +p.getY());
	      Dimension d = lms.getSize();
	      System.out.println("width-" +d.width+" " +d.getWidth());
	      System.out.println("height-" +d.height+" " +d.getHeight());
	      }
	      
	      public void navigationquadinants() {
		      WebElement lms =navigationbar;
		      Point p = lms.getLocation();
		      System.out.println("x-cord-"+p.x+" " +p.getX());
		      System.out.println("y-cord-"+p.y+" " +p.getY());
		      Dimension d = lms.getSize();
		      System.out.println("width-" +d.width+" " +d.getWidth());
		      System.out.println("height-" +d.height+" " +d.getHeight());
		      	 }
	      
	      public void brokenlink() {
	    	  
	    	  List<WebElement>links=driver.findElements(By.linkText("a"));
	    	  System.out.println(links.size());
	    	  for(WebElement link : links) {
	    		try {
	    		String linkURL = link.getAttribute("href");
	    		URL url = new URL(linkURL);
	    		URLConnection urlConnection = url.openConnection();
	    		HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
	    	    httpURLConnection.setConnectTimeout(5000);
	    	    
	    	    if(httpURLConnection.getResponseCode()>=400)
	    	    {
	    	    	System.out.println(url +" - "+"is broken link");
	    	       }
	    	    else {
	    	    	System.out.println(url +" - "+"is valid link");
	    	    }
	    		}catch(Exception e)
	    		{
	    			System.out.println("This is code for broken links");
	    		}
	    	  }
	    	   	    	  
	      }
	      public void CheckSpellings() {
	  		Assert.assertEquals(validateLMS.getText(), "LMS - Learning Management System");
	  		Assert.assertEquals(validateprogram.getText(), "Program");
	  		Assert.assertEquals(validateuser.getText(), "User");
	  		Assert.assertEquals(validatebatch.getText(), "Batch");
	  		Assert.assertEquals(validatelogout.getText(), "Logout");
	  	}

}      
