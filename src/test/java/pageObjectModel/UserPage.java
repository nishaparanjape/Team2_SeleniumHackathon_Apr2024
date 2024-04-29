package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverBase;

public class UserPage {
//	WebDriver driver;
	public static DriverBase driverBase = new DriverBase();
	public static WebDriver driver = driverBase.getDriver();

//	public UserPage (WebDriver driver) {
//		this.driver = driver;
//	}
//	
	By validatepage = By.xpath("//*[text()=' LMS - Learning Management System ']");
	By userbtn = By.xpath("//*[text()='User']");
	By manguser = By.xpath("//*[text()=' Manage User']");
	By pagination = By.xpath("//div[contains(@class, 'p-paginator-bottom p-paginator p-component ng-star-inserted')]");
	By datatable = By.xpath("//table[@role='grid']");
	By delbtn = By.xpath("(//button[contains(@class, 'p-button-danger p-button p-component p-button-icon-only')])[1]");
	By addnewuserbtn = By.xpath("//*[text()='Add New User']");
	By assignstaffbtn = By.xpath("(//button[@id='Assign'])[2]");
	
	public boolean isDashboardDisplayed() {
        return driver.findElement(validatepage).isDisplayed();
	}
	
	public void userbtn() {
		driver.findElement(userbtn).click();
	}
	
	public boolean isManageuserDisplayed() {
        return driver.findElement(manguser).isDisplayed();
	}
		
	public boolean pagination() {
        return driver.findElement(pagination).isDisplayed();
	}	
	
	public boolean datatable() {
        return driver.findElement(datatable).isDisplayed();
	}
		
	public void delbtn() {
		driver.findElement(delbtn).isEnabled();
		}
	public boolean addnewuserbtn() {
        return driver.findElement(addnewuserbtn).isDisplayed();
	}
	
	public boolean assignstaffbtn() {
        return driver.findElement(assignstaffbtn).isDisplayed();
	}
}
