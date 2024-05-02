package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.ConfigReader;
import utilities.DriverBase;


public class ProgramModulePom {
	
	public static ConfigReader reader = new ConfigReader();
	public static DriverBase DriverBase = new DriverBase();
	public static WebDriver driver = DriverBase.getDriver();
	public ProgramModulePom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath= "//html/body/app-root/app-program/div/mat-card/mat-card-title/div[1]")
    private WebElement managebatchvalidation;
	@FindBy (xpath= "//*[@id=\"new\"]")
    private WebElement addbutton;
	@FindBy (xpath= "//*[/html/body/app-root/app-program/p-dialog/div/div]")
	private WebElement validateprogramdetailspopup;
	@FindBy (xpath= "//*[@id=\"programDescription\"]")
	private WebElement validatedescriptionboxpopup;
	@FindBy (xpath= "//*[@id=\"programName\"]")
	private WebElement validatenameboxpopup;
	@FindBy (xpath= "//*[@id=\"category\"]/div/div[2]")
	private WebElement validatestatuspopup;
	@FindBy (xpath= "//*[@id=\"saveProgram\"]")	
	private WebElement savebutton;
	@FindBy (xpath= "//*[@class='p-dialog-header-close-icon ng-tns-c132-3 pi pi-times']")
	private WebElement closebutton;
	@FindBy (xpath= "//*[contains(text(),'Cancel')]")
	private WebElement cancelbutton;
	@FindBy (xpath= "//*[contains(text(),'Status is required')]")
	private WebElement errormsgstatus;
	@FindBy (xpath= "//*[contains(text(),'Program name is required')]")
	private WebElement errormsgnamerequired;
	@FindBy (xpath= "//*[/html/body/app-root/app-program/p-dialog/div/div/div[2]/div[2]/small\"]")
	private WebElement errormsg;
	@FindBy (xpath="/html/body/app-root/app-program/p-toast/div")
	private WebElement successfulmsg;
	@FindBy (xpath= "//*[@id=\"editProgram\"]")
    private WebElement editbutton;
	@FindBy (xpath= "//*[@id=\"programName\"]")
	 private WebElement editprogrampopup;
	@FindBy (xpath= "//*[@id=\"saveProgram\"]")
	 private WebElement saveprogrampopup;
	@FindBy (xpath= "//*[@id=\"programDescription\"]")
	private WebElement editprogramdescriptionpopup;
	@FindBy (xpath= "//*[@id=\"category\"]/div/div[2]")
	private WebElement editprogramstatuspopup;
	//@FindBy (xpath="/html/body/app-root/app-program/p-dialog/div/div/div[1]/div/button/span")
	//private WebElement closebutton;
	@FindBy (xpath="//*[contains(text(),'This field should')]")
	private WebElement errormessage;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	@FindBy (xpath= "//*[@id=\"deleteProgram\"]")
    private WebElement deletebutton;
	@FindBy (xpath = "/html/body/app-root/app-program/p-confirmdialog/div")
	private WebElement deleteconfirm;
	@FindBy (xpath="/html/body/app-root/app-program/p-confirmdialog/div/div/div[3]/button[2]/span[2]")
	private WebElement deleteDialogBoxYes;
	@FindBy (xpath="/html/body/app-root/app-program/p-confirmdialog/div/div/div[3]/button[1]/span[2]")
	private WebElement deleteDialogBoxNo;
	@FindBy (xpath="/html/body/app-root/app-program/p-confirmdialog/div/div/div[1]/div/button")
	private WebElement deleteDialogBoxCancel;
	@FindBy (xpath= "//*[@class='p-checkbox-box']")
	private WebElement checkbox;
	@FindBy (xpath= "//*[@class='p-button-danger p-button p-component p-button-icon-only']")
	private WebElement deletebuttonenable;
	//@FindBy (xpath= "//*[@class='p-button-danger p-button p-component p-button-icon-only']")
	//private WebElement deletebutton;
	@FindBy (xpath= "//*/html/body/app-root/app-program/p-confirmdialog/div/div")
	private WebElement validatingdialbox;
	@FindBy (xpath= "//span[text()='Yes']")
	private WebElement yesbutton;
	@FindBy (xpath= "//html/body/app-root/app-program/p-confirmdialog/div/div/div[3]/button[1]")
	private WebElement nobutton;
	@FindBy (xpath= "//*[contains(text(),'Java123')]")
	private WebElement deleteMulsdet;
	@FindBy (xpath= "//*[contains(text(),'Java456')]")
	private WebElement deleteMulteam;
	@FindBy (xpath= "//*[contains(text(),'Team3bcs1234')]")
	private WebElement deleteMuluser;
	@FindBy (xpath= "//*[@id='filterGlobal']")
	private WebElement searchbutton;
	
	public void managebatchvalidation(){
	     String expectedTitle = "Manage Program";
        Assert.assertEquals(managebatchvalidation.getText(), expectedTitle);
	}
	
	public void clickadd() {
		addbutton.click();
		}
	
	public void programdetailpopupvalidation() {
  		boolean programDetailPopup = validateprogramdetailspopup.isDisplayed();
    	 if(programDetailPopup) {
				  System.out.println("popup is Displayed");
			  }
			  else {
				  System.out.println("popup is Displayed");
			  }
	}
		
	public void nameTextValidation() {
	  		
		  	boolean nametextvalidation = validatenameboxpopup.isDisplayed();
	    	    		
		  		if(nametextvalidation) {
					  System.out.println("Name is Displayed");
				  }
				  else {
					  System.out.println("Name is not Displayed");
				  }
		  		
	}
	
	public void descriptionTextValidation() {
			
	  	boolean descriptiontextvalidation = validatedescriptionboxpopup.isDisplayed();
		    		
	  		if(descriptiontextvalidation) {
				  System.out.println("Description is Displayed");
			  }
			  else {
				  System.out.println("Description is not Displayed");
			  }
	  		
	}
	public void statusButtonValidation() {
		
	  	boolean statusbuttonvalidation = validatestatuspopup.isDisplayed();
		    		
	  		if(statusbuttonvalidation) {
				  System.out.println("Status is Displayed");
			  }
			  else {
				  System.out.println("Status is not Displayed");
			  }
	  		
	}
	public void clicksave() {
		savebutton.click();
	}
	public void clickclose(){
		closebutton.click();
	}
	public void clickcancel() {
		cancelbutton.click();
	}
	public void addnewprogramname() {
		 String addProgram = reader.getaddProgramName();
		 validatenameboxpopup.sendKeys(addProgram);
		 
	}
	/*public void Validateerrormsg() {
		boolean message = errormsg.isDisplayed();
				if(message) {
					System.out.println("Error Message is Displayed");
				}
				else {
					System.out.println("Error Message is not Displayed");
				}*/
	public void addnewprogramdescription() {
		 String adddescription = reader.getaddProgramDescription();
		 validatedescriptionboxpopup.sendKeys(adddescription);
	}
	public void Validateerrormsgforstatus() {
		boolean message = errormsgstatus.isDisplayed();
				if(message) {
					System.out.println("Error Message is Displayed");
				}
				else {
					System.out.println("Error Message is not Displayed");
				}
	}
	public void Validateerrormsgforname() {
		boolean namemessage = errormsgnamerequired.isDisplayed();
				if(namemessage) {
					System.out.println("Error Message is Displayed");
				}
				else {
					System.out.println("Error Message is not Displayed");
				}
	}
	public void addnewprogram() {
		 String addprogram = reader.getaddNewProgram();
		 validatenameboxpopup.sendKeys(addprogram);
	}
	public void addnewdescription() {
		 String adddescription = reader.getaddNewDescription();
		 validatedescriptionboxpopup.sendKeys(adddescription);
	}
	public void clickstatus() {
		validatestatuspopup.click();
	}
	public void successfulmessage() {
			boolean SuccessfulMessage = successfulmsg.isDisplayed();
		 if(SuccessfulMessage) {
				  System.out.println("successful is Displayed");
			  }
			  else {
				  System.out.println("successful is not Displayed");
			  }
	}
	public void programeditpom() {
		PageFactory.initElements(driver, this);
		
	}
	public void clickEdit() {
	editbutton.click();
	System.out.println("User has clicked on edit option");
	
	}
	public void editprogram() {
	String editNewProgram = reader.geteditnewprogram();
	editprogrampopup.sendKeys(editNewProgram);
	}
	public void clickSave() {
	 saveprogrampopup.click();
		System.out.println("User has clicked on save option");
	}
	
	public void editprogramdescription() {
	 String editNewDescription = reader.geteditnewdescription();
	 editprogramdescriptionpopup.sendKeys(editNewDescription);
	}
	public void clickeditprogramstatus() {
	 	 editprogramstatuspopup.click();
	}
	public void Validatesuccessfulmsg() {
		boolean message = successfulmsg.isDisplayed();
				if(message) {
					System.out.println("Successful Message is Displayed");
				}
				else {
					System.out.println("Successful Message is not Displayed");
				}
	}
	public void clickclosepopup() {
	 closebutton.click();
	}
	
	public void Validateerrormsg() {
	errormessage = driver.findElement(By.xpath("//*[contains(text(),'This field should')]"));	
	 boolean message = errormessage.isDisplayed();
				if(message) {
					System.out.println("Error Message is Displayed");
				}
				else {
					System.out.println("Error Message is not Displayed");
				}
	}
	
	public void updatedescription() {
	 String editDescription = reader.getspecialdescription();
	 editprogramdescriptionpopup.sendKeys(editDescription);
	}
	public void updateprogram() {
	 String editProgram = reader.getspecialprogram();
	 editprogrampopup.sendKeys(editProgram);
	}
	public void clickcheckbox() {
		checkbox.click();
	}
	public void deleteButtonEnable() {
		boolean deletebutton = deletebuttonenable.isDisplayed();
		
			if(deletebutton) {
			  System.out.println("delete button is Displayed");
		  }
		  else {
			  System.out.println("delete button is not Displayed");
		  }
	}
	public void clickdelete() {
		deletebutton.click();
		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);
		
	}
	public void dialogBoxValidation() {
		
	  	boolean dialogboxvalidation = validatingdialbox.isDisplayed();
		    		
	  		if(dialogboxvalidation) {
				  System.out.println("Dialogbox is Displayed");
			  }
			  else {
				  System.out.println("Dialogbox is not Displayed");
			  }
	}
	public void clickYes() {
		yesbutton.click();
	}
	public void clickNo() {
		nobutton.click();
	}
	
	public void clicksearch() {
		searchbutton.click();
	}
	
	public void muldelprogram() {
		List<WebElement> checkboxes =driver.findElements(By.xpath("//table/tbody/tr/td[1]/p-tablecheckbox/div/div[2]"));
		
		//traverse through the list and select all checkboxes if they are enabled and displayed.
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
			{
		           System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
		           checkboxes.get(i).click();
			}
		}
	}
	
	public void clickDelete() {

		deletebutton.click();
		System.out.println("User has clicked on delete option");
	}
	
	public void ClickDialogBoxYesdelete() {
		deleteDialogBoxYes.click();
	}
	
	public void ClickDialogBoxNodelete() {
		deleteDialogBoxNo.click();
	}
	
	public void ClickDialogBoxCanceldelete() {
		deleteDialogBoxCancel.click();
	}
	
	public void Validatedailogbox() {
		boolean dialogbox = deleteconfirm.isDisplayed();
		if(dialogbox) {
			System.out.println("Confirm is Displayed");
		}
		else {
			System.out.println("Confirm is not Displayed");
		}
	}

}
