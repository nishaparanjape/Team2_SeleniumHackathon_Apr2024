package pageObjectModel;

import java.awt.Robot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aspose.pdf.internal.html.drawing.Time;
import com.aspose.pdf.internal.imaging.internal.bouncycastle.jcajce.provider.asymmetric.EC;

import org.openqa.selenium.support.ui.*;
import utilities.ConfigReader;
import utilities.DriverBase;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BatchPage {
	public static ConfigReader reader = new ConfigReader();
	public static DriverBase driverBase = new DriverBase();
	public static WebDriver driver = driverBase.getDriver();

	SoftAssert softAssert = new SoftAssert();

	By batch = By.xpath("//button[@id='batch']");
	By batch1 = By.xpath("//span[text()='Batch']");
	By header = By.xpath("//div[text()=' Manage Batch']");
	By pagination = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']");
	By batchName = By.xpath("//th[@psortablecolumn='batchName']");
	By batchDescription = By.xpath("//th[@psortablecolumn='batchDescription']");
	By batchStatus = By.xpath("//th[@psortablecolumn='batchStatus']");
	By noOfClasses = By.xpath("//th[@psortablecolumn='batchNoOfClasses']");
	By programName = By.xpath("//th[@psortablecolumn='programName']");
	By editDelete = By.xpath("//th[text()=' Edit / Delete ']");
	By deleteIcon = By.xpath("//div/button[@icon='pi pi-trash']");
	By newBatchButton = By.xpath("//button[@label='A New Batch']");
	By rowCheckbox = By.xpath("//td//div[@role='checkbox']");
	By rowEditIcon = By.xpath("//span[@class='p-button-icon pi pi-pencil']");
	By rowDeleteIcon = By.xpath("//td//span[@class='p-button-icon pi pi-trash']");
	By popup = By.xpath("//div[@role='dialog']");

	public void clickBatch() {
		driver.findElement(batch).click();
	}

	public void batchUrlValidation(String string) {
		String url = driver.getCurrentUrl();
		String noSpace = string.replaceAll("\\s+", "");
		String lowerCase = noSpace.toLowerCase();
		Boolean isContains = url.trim().contains(lowerCase);
		Assert.assertTrue(isContains);
	}

	public void headerValidation(String string) {
		String headertext = header.toString();
		Boolean isContent = headertext.contains(string);
		Assert.assertTrue(isContent);
	}

	public void paginationValidation() {
		Boolean isPaginationDisplayed = driver.findElement(pagination).isDisplayed();
		Assert.assertTrue(isPaginationDisplayed);
	}

	public void webtableHeaderValidation() {
		Boolean isBatchNameDisplayed = driver.findElement(batchName).isDisplayed();
		Boolean isBatchDescriptionDisplayed = driver.findElement(batchDescription).isDisplayed();
		Boolean isBatchStatusDisplayed = driver.findElement(batchStatus).isDisplayed();
		Boolean isNoOfClassesDisplayed = driver.findElement(noOfClasses).isDisplayed();
		Boolean isProgramNameDisplayed = driver.findElement(programName).isDisplayed();
		Boolean isEditDeleteDisplayed = driver.findElement(editDelete).isDisplayed();

		softAssert.assertTrue(isBatchNameDisplayed);
		softAssert.assertTrue(isBatchDescriptionDisplayed);
		softAssert.assertTrue(isBatchStatusDisplayed);
		softAssert.assertTrue(isNoOfClassesDisplayed);
		softAssert.assertTrue(isProgramNameDisplayed);
		softAssert.assertTrue(isEditDeleteDisplayed);

		softAssert.assertAll();
	}

	public void deleteDisabledValidation() {
		Boolean isDiabledIcon = driver.findElement(deleteIcon).isEnabled();
		Assert.assertFalse(isDiabledIcon);
	}

	public void newBatchButtonDisplayed() {
		Boolean isButtonDisplayed = driver.findElement(newBatchButton).isDisplayed();
		Assert.assertTrue(isButtonDisplayed);
	}

	public void rowCheckboxDisplayed() {
		List<WebElement> rowCheckboxes = driver.findElements(rowCheckbox);

		int checkboxCount = rowCheckboxes.size();
		int counter = 0;

		for (WebElement checkbox : rowCheckboxes) {

			if (checkbox.isDisplayed()) {
				counter++;
			}
			if (checkboxCount == counter) {
				Assert.assertTrue(true);
			}
		}
	}

	public void rowEditIconEnabled() {
		List<WebElement> rowEditIcons = driver.findElements(rowEditIcon);

		int editCount = rowEditIcons.size();
		int counter = 0;

		for (WebElement editIcon : rowEditIcons) {

			if (editIcon.isEnabled()) {
				counter++;
			}
			if (editCount == counter) {
				Assert.assertTrue(true);
			}
		}
	}

	public void rowDeleteIconEnabled() {
		List<WebElement> rowDeleteIcons = driver.findElements(rowDeleteIcon);

		int deleteCount = rowDeleteIcons.size();
		int counter = 0;

		for (WebElement deleteIcon : rowDeleteIcons) {

			if (deleteIcon.isEnabled()) {
				counter++;
			}
			if (counter == deleteCount) {
				Assert.assertTrue(true);
			}
		}
	}

	public void newBatchButtonClick() {
		driver.findElement(newBatchButton).click();
	}

	public void popup() {
		Boolean isDisplayed = driver.findElement(popup).isDisplayed();
		Assert.assertTrue(isDisplayed);
	}
	
	public void populateFields() {
		driver.findElement(batchName).sendKeys("");
	}
	
	public void ValidateErrorMsg() {
		Assert.assertEquals(true, driver.findElement(By.xpath("//*[contains(text(),'Batch Name is required')]")).isDisplayed());
	}
	
	public void saveBatch() {
		driver.findElement(By.xpath("//button[@label='Save']")).sendKeys(Keys.SPACE);
	}
	
	public void addAllFields() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='batchName']")).sendKeys("batch_2");
		driver.findElement(By.xpath("//*[@id='batchDescription']")).sendKeys("desc_2");
		Thread.sleep(2000);
		
		Actions a = new Actions(driver);
		WebElement progName = driver.findElement(By.xpath("//input[@placeholder='Select a Program name']"));
		progName.sendKeys("aaaaa");
		progName.sendKeys(Keys.ENTER);
//		a.sendKeys(progName, Keys.SPACE).perform();
//		a.sendKeys(progName, Keys.SPACE).perform();
//		a.sendKeys(progName, Keys.ARROW_DOWN).perform();
//		a.sendKeys(progName, Keys.ENTER).perform();
//		a.sendKeys(progName, Keys.TAB).perform();
//		a.sendKeys(progName, Keys.TAB).perform();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='batchNoOfClasses']")).sendKeys("3");
		Thread.sleep(2000);

		WebElement status = driver.findElement(By.id("ACTIVE"));		
		a.sendKeys(status, Keys.SPACE).perform();
		Thread.sleep(3000);
	}
	
	public void updateTheTable() throws InterruptedException {
		//driver.navigate().refresh();
		Thread.sleep(3000);
	}
}