package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class adduserpom {
	
	WebDriver driver;
	

	public adduserpom (WebDriver driver) {
		this.driver = driver;
		
	}
	
	By manguser = By.xpath("//*[text()=' Manage User']");
	By addnewuserbtn = By.xpath("//span[text()='Add New User']");
	By assignstaffbtn = By.xpath("(//button[@id='Assign'])[2]");
	
	By firstnamelabel = By.xpath("//span[contains(text(), 'First name')]");
	By middlenamelabel  = By.xpath("//span[contains(text(), 'Middle name')]");
	By lastnamelabel  = By.xpath("//span[contains(text(), 'Last name')]");
	By locationlabel  = By.xpath("//span[contains(text(), 'Location')]");
	By phonenolabel  = By.xpath("//span[contains(text(), 'Phone no')]");
	By linkedlnlabel  = By.xpath("//span[contains(text(), 'LinkedIn Url')]");
	By userrolelabel  = By.xpath("//label[text()='User Role']");
	By userrolestatuslabel  = By.xpath("//label[text()='User Role Status']");
	By uservisastatuslabel  = By.xpath("//label[text()='User Visa Status']");
	By emaillabel = By.xpath(".//input[@placeholder='Email address']");
	By undergradlabel = By.xpath("//span[contains(text(), 'Under Graduate')]");
	By postgradlabel  = By.xpath("//span[contains(text(), 'Post Graduate')]");
	By timezonelabel  = By.xpath("//span[contains(text(), 'Time Zone')]");
	By usercommlabel  = By.xpath("//span[contains(text(), 'User Comments')]");
	
	By closebtn = By.xpath("//button[contains(@class,'ng-tns-c132-6 p-dialog-header-icon')]");
	By cancelbtn = By.xpath("//button[contains(@class,'mat-focus-indicator mat-raised-button mat-button-base mat-warn')]");
	By submitbtn = By.xpath("//button[contains(@type,'submit')]");
	//By clicksubmit = By.xpath("//button[contains(@class,'mat-focus-indicator mat-raised-button mat-button-base mat-primary')]");

	
	By firstnametext  = By.xpath("//input[@formcontrolname='userFirstName']");
	By middlenametext  = By.xpath("//input[@formcontrolname='userMiddleName']");
	By lastnametext  = By.xpath("//input[@formcontrolname='userLastName']");
	By  locationtext = By.xpath("//input[@formcontrolname='userLocation']");
	By phonenotext  = By.xpath("//input[@formcontrolname='userPhoneNumber']");
	By linkedlntext  = By.xpath("//input[@formcontrolname='userLinkedinUrl']");
	By userroledd  = By.xpath("//*[text()='Select Role']");
	By userrolestatusdd  = By.xpath("//*[text()='Select Role Status']");
	By uservisastatusdd  = By.xpath("//*[text()='Select Visa Status']");
	By emailtext = By.xpath("//input[@formcontrolname='userLoginEmail']");
	By undergradtext  = By.xpath("//input[@formcontrolname='userEduUg']");
	By postgradtext  = By.xpath("//input[@formcontrolname='userEduPg']");
	By timezonetext  = By.xpath("//input[@formcontrolname='userTimeZone']");
	By  usercommtext = By.xpath("//input[@formcontrolname='userComments']");
	
	By selectuserrole = By.xpath("(//li[@class='p-dropdown-item p-ripple'])[2]");
	By selectuserrolestatus = By.xpath("//span[text()='Active']");
	By selectvisastatus = By.xpath("//li[@aria-label='H4']");
	By usercreatedsuccess = By.xpath("//div[contains(@class,'Successful')]");
	
	By enterFirstNameredtext = By.xpath("//mat-error[contains(text(),'First name is')]");
	By enterLastNameredtext = By.xpath("//mat-error[contains(text(),'Last name is')]");
	By enterLocationredtext = By.xpath("//mat-error[contains(text(),'Location is')]");
	By enterPhoneredtext = By.xpath("//mat-error[contains(text(),'Phone number is ')]");
	By programLink = By.xpath("//*[@id='program']");
	
	
			public boolean usercreatedsuccess() {
		try {
			WebElement 	active = driver.switchTo().activeElement();
			String text=active.getText();
			//Boolean s=text.contains("User Deleted");
			System.out.println(text);
			
			//driver.findElement(usercreatedsuccess).isDisplayed();
			//System.out.println(firstnamelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
			
			public boolean failedstatus() {
				try {
					WebElement 	active = driver.switchTo().activeElement();
					String text=active.getText();
					//Boolean s=text.contains("User Deleted");
					System.out.println(text);
					
					return true;
				}catch(Exception e) {
					e.printStackTrace();
					return false;
				}
				
			}
			
			
			
	public boolean isManageuserDisplayed() {
        return driver.findElement(manguser).isDisplayed();
	}
	public void addnewuserbtn() {
		driver.findElement(addnewuserbtn).click();
		}
	public void assignstaffbtn() {
		driver.findElement(assignstaffbtn).click();
		}
	
	
	public boolean valFirstName() {
		try {
			driver.findElement(firstnamelabel).isDisplayed();
			//System.out.println(firstnamelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valFirstNametext() {
		try {
			driver.findElement(firstnametext).click();
			driver.findElement(firstnametext).isDisplayed();
			
			//System.out.println(firstnamelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	public boolean valMiddleName() {
		try {
			driver.findElement(middlenamelabel).isDisplayed();
			//System.out.println(middlenamelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valMiddleNametext() {
		try {
			driver.findElement(middlenametext).click();
			driver.findElement(middlenametext).isDisplayed();
			
			//System.out.println(middlenamelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valLocationName() {
		try {
			driver.findElement(locationlabel).isDisplayed();
			//System.out.println(locationlabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valLocationNametext() {
		try {
			driver.findElement(locationtext).click();
			driver.findElement(locationtext).isDisplayed();
			

			//System.out.println(locationlabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	public boolean valLastName() {
		try {
			driver.findElement(lastnamelabel).isDisplayed();
			//System.out.println(lastnamelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valLastNametext() {
		try {
			driver.findElement(lastnametext).click();
			driver.findElement(lastnametext).isDisplayed();
			
			//System.out.println(lastnamelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	public boolean valPhoneNum() {
		try {
			driver.findElement(phonenolabel).isDisplayed();
			//System.out.println(phonenolabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valPhoneNumtext() {
		try {
			driver.findElement(phonenotext).click();
			driver.findElement(phonenotext).isDisplayed();
			

			//System.out.println(phonenolabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valUserRole() {
		try {
			driver.findElement(userrolelabel).isDisplayed();
			//System.out.println(userrolelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valUserRoledd() {
		try {
			driver.findElement(userroledd).click();
			driver.findElement(userroledd).isDisplayed();
			//System.out.println(userrolelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	
	public boolean valLinkedIn() {
		try {
			driver.findElement(linkedlnlabel).isDisplayed();
			//System.out.println(linkedlnlabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valLinkedIntext() {
		try {
			driver.findElement(linkedlntext).click();
			driver.findElement(linkedlntext).isDisplayed();
			

			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valUserRoleStatus() {
		try {
			driver.findElement(userrolestatuslabel).isDisplayed();
			//System.out.println(userrolestatuslabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valUserRoleStatusdd() {
		try {
			driver.findElement(userrolestatusdd).click();
			driver.findElement(userrolestatusdd).isDisplayed();
			//System.out.println(userrolestatuslabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valUnderGrad() {
		try {
			driver.findElement(undergradlabel).isDisplayed();
			//System.out.println(undergradlabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valUnderGradtext() {
		try {
			driver.findElement(undergradtext).click();
			driver.findElement(undergradtext).isDisplayed();
			

			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valPostGrad() {
		try {
			driver.findElement(postgradlabel).isDisplayed();
			//System.out.println(postgradlabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valPostGradtext() {
		try {
			driver.findElement(postgradtext).click();
			driver.findElement(postgradtext).isDisplayed();
			

			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean valTimeZone() {
		try {
			driver.findElement(timezonelabel).isDisplayed();
			//System.out.println(timezonelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valTimeZonetext() {
		try {
			
			driver.findElement(timezonetext).click();
			driver.findElement(timezonetext).isDisplayed();
			

			//System.out.println(timezonelabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean valUserComm() {
		try {
			driver.findElement(usercommlabel).isDisplayed();
			//System.out.println(usercommlabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valUserCommtext() {
		try {
			
			driver.findElement(usercommtext).click();
			driver.findElement(usercommtext).isDisplayed();
			driver.findElement(usercommtext).sendKeys("success");

						//System.out.println(usercommlabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean valCancel() {
		try {
			driver.findElement(cancelbtn).isDisplayed();
			//System.out.println(cancelbtn + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean clickCancel() {
		try {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
		     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			driver.findElement(cancelbtn).click();
			//System.out.println(cancelbtn + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valsubmit() {
		try {
			driver.findElement(submitbtn).isDisplayed();
			//System.out.println(cancelbtn + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean clicksubmit() {
		try {
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			 driver.findElement(submitbtn).click();
			 Thread.sleep(20000);
			//System.out.println(cancelbtn + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean valClose() {
		try {
			driver.findElement(closebtn).isDisplayed();
			//System.out.println(closebtn + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valVisaStatus() {
		try {
			driver.findElement(uservisastatuslabel).isDisplayed();
			//System.out.println(uservisastatuslabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valVisaStatusdd() {
		try {
			
			driver.findElement(uservisastatusdd).click();
			driver.findElement(uservisastatusdd).isDisplayed();
			
			//System.out.println(uservisastatuslabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean valEmail() {
		try {
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emaillabel);
			driver.findElement(emaillabel).isDisplayed();
			//System.out.println(emaillabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean valEmailtext() {
		try {
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emaillabel);
			driver.findElement(emailtext).click();
			driver.findElement(emailtext).isDisplayed();
			

			
			//System.out.println(emaillabel + "is displayed in pop up screen");
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public void closeAddUserPopup() {
		driver.findElement(closebtn).click();
	}
	
	
	public void enterFirstName() {
		 driver.findElement(firstnametext).sendKeys("testuserf");
	}
	public void enterMiddleName() {
		 driver.findElement(middlenametext).sendKeys("M");
	}
	public void enterLastName() {
		 driver.findElement(lastnametext).sendKeys("testuserl");
	}
	public void enterLocation() {
		 driver.findElement(locationtext).sendKeys("Canada");
	}
	public void enterPhone() {
		 driver.findElement(phonenotext).sendKeys("0987632628");
	}
	public void enterLinkedln() {
		 driver.findElement(linkedlntext).sendKeys("https://www.linkedin.com/in/utetsh2");
	}
	public void enterEmail() {
		 driver.findElement(emailtext).sendKeys("hdhshsh@gmail.com");
	}
	public void enterUG() {
		 driver.findElement(undergradtext).sendKeys("bba");
	}
	public void enterPG() {
		 driver.findElement(postgradtext).sendKeys("mba");
	}
	public void enterTimezone() {
		 driver.findElement(timezonetext).sendKeys("cst");
	}
	public void enterUsercomm() {
		 driver.findElement(usercommtext).sendKeys("success creation user");
	}
	
	public void selectuserrole() {
		driver.findElement(userroledd).click();
		 driver.findElement(selectuserrole).click();
	}
	
	public void selectuserrolestatus() {
		driver.findElement(userrolestatusdd).click();
		 driver.findElement(selectuserrolestatus).click();
	}
	public void selectvisastatus() {
		driver.findElement(uservisastatusdd).click();
		 driver.findElement(selectvisastatus).click();
		 
	}
	
	public boolean enterFirstNameredtext() {
		try {
			driver.findElement(enterFirstNameredtext).isDisplayed();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean enterLastNameredtext() {
		try {
			driver.findElement(enterLastNameredtext).isDisplayed();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean enterLocationredtext() {
		try {
			driver.findElement(enterLocationredtext).isDisplayed();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean enterPhoneredtext() {
		try {
			driver.findElement(enterPhoneredtext).isDisplayed();
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public void clickProgramLink() {
		driver.findElement(programLink).click();
	}
	
}
    
