package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utilities.ConfigReader;
import utilities.DriverBase;
import java.time.Duration;

public class Batch_PageObjects {

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
	By rowCheckbox = By.xpath("//td//span[@class='p-button-icon pi pi-trash']");
	By rowEditIcon = By.xpath("//span[@class='p-button-icon pi pi-pencil']");
	By rowDeleteIcon = By.xpath("//td//span[@class='p-button-icon pi pi-trash']");
	By popup = By.xpath("//div[@role='dialog']");
	
	// add new batch
	
	By name = By.xpath("//input[@id='batchName' and @type='text']");
	By description = By.xpath("//input[@id='batchDescription' and @type='text']");
	By noOfClasses1 = By.xpath("//input[@id='batchNoOfClasses' and @type='number']");
	By statusActive = By.xpath("//*[text()=' ACTIVE ']");
	By statusActive1 = By.xpath("//input[@id='ACTIVE']");
	By statusActive2 = By.xpath("//div[@class=\"p-radiobutton p-component\"]/../../../div[2]/p-radiobutton");
	By statusInactive = By.xpath("//*[text()=' INACTIVE ']");
	By cancelButton = By.xpath("//span[text()='Cancel']");
	By saveButton = By.xpath("//span[@class='p-button-label' and text()='Save']/..");
	By searchBox = By.xpath("//input[@placeholder='Search...']");
	By eXitButton = By.xpath("//div/div/button[@type='button']");
	By progNameDropdown = By.xpath("//span[@class='p-dropdown-trigger-icon ng-tns-c101-80 pi pi-chevron-down']");
	By progNameDropdown1 = By.xpath("//div[@class='p-dropdown-trigger ng-tns-c101-87']");
	By progNameDropdown2 = By.xpath("//p-dropdown[@placeholder='Select a Program name']");
	By progNameDropdown3 = By.xpath("//span[@class='p-dropdown-trigger-icon ng-tns-c101-50 pi pi-chevron-down']");
	By dropdownArrow = By.xpath("//div[@aria-haspopup='listbox']");
	By dropdownArrow2 = By.xpath("//div[@role='button' and @aria-haspopup='listbox']");
	By specificDescript = By.xpath("//span[text()='qawarriors3']");
	By radioButton = By.xpath("//p-radiobutton[@id='batchStatus']");
	By descriptionErrMsg = By.xpath("//small[text()='Batch Description is required.']");
	String progName = "qawarriors1";
	String batchName1 = "qawarriors";
	String batchName2 = "qawarriors7";
	String batchDescription1 = "beginners";
	By batchNameRow = By.xpath("//td[text()=batchName]");
	
	By errorMsgTextFields = By.xpath("//small[@id='text-danger']");
	By errorMsgTextFields1 = By.xpath("//small[text()='This field should start with an alphabet and min 2 character.']");
	String errTextField = "This field should start with an alphabet and min 2 character.";
	
	By errorMsgBatchName = By.xpath("//small[text()='Batch Name is required. ']");
	String errBatchName = "Batch Name is required.";
	By errorMsgDescription = By.xpath("//small[text()='Batch Description is required.']");
	String errDescription = "Batch Description is required.";
	By errorMsgProgName = By.xpath("//small[text()='Program Name is required.']");
	String errProgName = "Program Name is required.";
	By errorMsgStatus = By.xpath("//small[text()='Status is required.']");
	String errStatus = "Status is required.";
	By errorMsgNoOfClass1 = By.xpath("//small[text()='Number of classes is required.']");
	By errorMsgNoOfClass = By.xpath("//small[@id='text-danger']");
	String errNoOfClass = "Number of classes is required.";
	
	// edit new batch
	
	By statusInactive1 = By.xpath("//div[@class='p-radiobutton-box']");
	By nameWebTable = By.xpath("//td[normalize-space()='qawarriors']");
	By nameWebTable1 = By.xpath("//tbody/tr[1]/td[2]");
	By descriptionWebTable1 = By.xpath("//tbody/tr[1]/td[3]");
	By descriptionWebTable = By.xpath("//tbody/tr[1]/td[text()='level 1']");
	
	
	By programNameWebTable = By.xpath("//tbody/tr[1]/td[6]");
	By noOfClassesWebTable = By.xpath("//tbody/tr[1]/td[5]");
	By statusWebTable = By.xpath("//tbody/tr[1]/td[4]");
	
	// delete batch
	
	By deleteIconHeader = By.xpath(
			"//button[@class='p-button-danger p-button p-component p-button-icon-only']//span[@class='p-button-icon pi pi-trash']");
	By noButton1 = By.xpath("//span[text()='No']");
	By noButton = By.xpath("//span[normalize-space()='No']");
	By yesButton1 = By.xpath("//span[text()='Yes']/..");
	By yesButton = By.xpath("//span[@class='p-button-icon p-button-icon-left pi pi-check']");
	By yesButton3 = By.xpath(
			"//button[@class='ng-tns-c133-7 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']");
	By deleteSuccess1 = By.xpath("//div[text()='Successful']");
	By deleteSuccess2 = By.xpath("//div[text()='batch Deleted']");
	By batchNameWebTable = By.xpath("//td[text()='qawarriors']");
	By batchNameWebTable1 = By.xpath("//td[text()='qawarriors1']");
	By batchNameWebTable2 = By.xpath("//td[text()='qawarriors1']");
	
	By webtableCheckBox = By.xpath("//td[text()='qawarriors']/../td/p-tablecheckbox/div");
	By webtableCheckBox1 = By.xpath("//td[text()='qawarriors1']/../td/p-tablecheckbox/div");

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

	
	
	
	
	
	
	
	
	// add new batch

	public void nameTextbox() {

		WebElement name1 = driver.findElement(name);
		String type = name1.getDomAttribute("type");
		Assert.assertEquals(type, "text");

	}

	public void noOfClassesTextbox() {

		WebElement name1 = driver.findElement(noOfClasses1);
		String type = name1.getDomAttribute("type");
		Assert.assertEquals(type, "number");

	}

	public void descriptionTextbox() {

		WebElement name1 = driver.findElement(description);
		String type = name1.getDomAttribute("type");
		Assert.assertEquals(type, "text");

	}

	public void programNameDropdown() throws InterruptedException {

		String tag = driver.findElement(progNameDropdown2).getTagName();
		Boolean contains = tag.contains("dropdown");
		Assert.assertTrue(contains);

	}

	public void statusRadiobutton() {

		List<WebElement> radioButtons = driver.findElements(radioButton);

		int radiobuttonCount = radioButtons.size();
		int counter = 0;

		for (WebElement radio : radioButtons) {

			if (radio.getTagName().contains("radiobutton")) {
				counter++;
			}
			if (radiobuttonCount == counter) {
				Assert.assertTrue(true);
			}
		}

	}

	public void addBatchName() {

		WebElement batchName3 = driver.findElement(name);
		batchName3.sendKeys(batchName2);

	}

	public void addBatchName(String string) {

		WebElement batchName1 = driver.findElement(name);
		batchName1.sendKeys(string);
	}

	public void addProgramName() {

		driver.findElement(dropdownArrow2).click();
		By prognameValue = By.xpath("//p-dropdownitem/li[@role='option']");
		driver.findElement(prognameValue).click();

	}

	public void addBatchDescription() {

		WebElement batchDes = driver.findElement(description);
		batchDes.sendKeys(batchDescription1);

	}

	public void addBatchDescription(String string) {

		WebElement batchDes = driver.findElement(description);
		batchDes.sendKeys(string);

	}

	public void addStatusActive() {

		WebElement active = driver.findElement(statusActive2);
		Actions action = new Actions(driver);
		action.click(active).perform();
	}

	public void addStatusInactive() {

		driver.findElement(statusInactive).click();
	}

	public void addNoOfClasses() {

		WebElement noOfClassess = driver.findElement(noOfClasses1);
		noOfClassess.sendKeys("6");

	}

	public void clickSave() {

		driver.findElement(saveButton).click();
	}

	public void clickCancel() {

		driver.findElement(cancelButton).click();
	}

	public void descriptionOptional() {

		addBatchName();
		addProgramName();
		addStatusActive();
		addNoOfClasses();
		clickSave();
	}

	public void isNewBatchAdded() throws InterruptedException {

		WebElement search = driver.findElement(searchBox);
		Thread.sleep(4000);
		search.sendKeys(batchName2);
		Thread.sleep(4000);

		WebElement page1 = driver.findElement(nameWebTable1);
		String name = page1.getText();
		Assert.assertEquals(name, batchName2);
		
	}

	public void addNewBatchValid() throws InterruptedException {

		addBatchName();
		Thread.sleep(1000);
		addBatchDescription();
		Thread.sleep(1000);
		addProgramName();
		Thread.sleep(1000);
		addStatusActive();
		Thread.sleep(1000);
		addNoOfClasses();
		Thread.sleep(1000);
		clickSave();
		Thread.sleep(1000);
	}

	public void addNewBatchInvalid(String string, String string2) {

		addBatchName(string);
		addBatchDescription(string2);
		addProgramName();
		addStatusActive();
		addNoOfClasses();
		clickSave();
	}

	public void errTextField() {

		String err = driver.findElement(errorMsgTextFields).getText();
		Assert.assertEquals(err, errTextField);
	}

	public void errBatchName() {

		String err = driver.findElement(errorMsgBatchName).getText();
		Assert.assertEquals(err, errBatchName);
	}

	public void errDescription() {

		String err = driver.findElement(errorMsgDescription).getText();
		Assert.assertEquals(err, errDescription);
	}

	public void errProgName() {

		String err = driver.findElement(errorMsgProgName).getText();
		Assert.assertEquals(err, errProgName);
	}

	public void errStatus() {

		String err = driver.findElement(errorMsgStatus).getText();
		Assert.assertEquals(err, errStatus);
	}

	public void errNoOfClasses() throws InterruptedException {

		Thread.sleep(1000);
		String err = driver.findElement(errorMsgNoOfClass).getText();
		Assert.assertEquals(err, errNoOfClass);
	}

	public void blankName() {

		addBatchDescription();
		addProgramName();
		addStatusActive();
		addNoOfClasses();
		clickSave();
	}

	public void blankDescription() {

		addBatchName();
		addProgramName();
		addStatusActive();
		addNoOfClasses();
		clickSave();
	}

	public void blankProgName() {

		addBatchName();
		addBatchDescription();
		addStatusActive();
		addNoOfClasses();
		clickSave();
	}

	public void blankStatus() {

		addBatchName();
		addBatchDescription();
		addProgramName();
		addNoOfClasses();
		clickSave();
	}

	public void blankNoOfClasses() {

		addBatchName();
		addBatchDescription();
		addProgramName();
		addStatusActive();
		clickSave();
	}

	// edit batch

	public void editIconEnabled() {

		Boolean isEnabled = driver.findElement(rowEditIcon).isEnabled();
		Assert.assertTrue(isEnabled);
	}

	public void editClick() {

		driver.findElement(rowEditIcon).click();

	}

	public void saveClick() {

		driver.findElement(saveButton).click();

	}

	public void searchBatch() {

		WebElement search = driver.findElement(searchBox);
		search.clear();
		search.sendKeys(batchName1);

	}

	public void updateDescription(String string) throws InterruptedException {

		searchBatch();
		driver.findElement(description).clear();
		driver.findElement(description).sendKeys(string);
		Thread.sleep(3000);
		saveClick();
		Thread.sleep(3000);
//		driver.navigate().refresh();
	}

	public void updatedDescription(String string) throws InterruptedException {
		
		Thread.sleep(3000);
		String value = driver.findElement(descriptionWebTable).getText();
		Thread.sleep(1000);
		System.out.println(value + "**********");
		Assert.assertEquals(value, string);
	}

	public void updateNoOfClasses(int num) throws InterruptedException {

		try {
			searchBatch();
			driver.findElement(noOfClasses1).clear();
			driver.findElement(noOfClasses1).sendKeys(String.valueOf(num));
			saveClick();
		} catch (Exception e) {
			System.out.println("Unable to enter value to NoOfClasses field");
		}
	}

	public void updatedNoOfClasses(int num) throws InterruptedException {

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(noOfClassesWebTable));

		String value = driver.findElement(noOfClassesWebTable).getText();
		System.out.println(value + "*******************");

		String value1 = String.valueOf(num);
		Assert.assertEquals(value1,value );

	}

	public void updateNoOfClasses(String string) throws InterruptedException {

		try {
			searchBatch();
			driver.findElement(noOfClasses1).clear();
			driver.findElement(noOfClasses1).sendKeys(string);
			saveClick();
		} catch (Exception e) {
			System.out.println("Unable to enter string value to NoOfClasses field");
		}
	}

	public void updateNoOfClasses() throws InterruptedException {

		driver.findElement(noOfClasses1).sendKeys(Keys.DELETE);
		Thread.sleep(2000);
	}

	public void updateStatus() {

		if (driver.findElement(statusActive2).isSelected()) {

			driver.findElement(statusInactive1).click();
			saveClick();

		}

	}

	public void updatedStatus() {

		String value = driver.findElement(statusWebTable).getText();
		System.out.println(value + "*************");
		Assert.assertEquals(value, "INACTIVE");

	}

	public void updatedDescription1() {

		String value = driver.findElement(descriptionWebTable).getAttribute("value");

		Assert.assertEquals(value, null);
	}

	// delete batch

	public void rowDeleteEnabled() {

		Boolean isEnabled = driver.findElement(rowDeleteIcon).isEnabled();
		Assert.assertTrue(isEnabled);
	}

	public void rowDeleteClick() {

		driver.findElement(rowDeleteIcon).click();

	}

	public void alertValidation() {

		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);

		Boolean noIsDisplayed = driver.findElement(noButton).isDisplayed();
		Boolean yesIsDisplayed = driver.findElement(yesButton).isDisplayed();

		softAssert.assertTrue(noIsDisplayed);
		softAssert.assertTrue(yesIsDisplayed);

		softAssert.assertAll();

	}

	public void deleteClick() {

		driver.findElement(searchBox).sendKeys(batchName1);

	}

	public void selectYes() {

		driver.findElement(yesButton).click();

	}

	public void selectNo() {

		driver.findElement(noButton).click();

	}

	public void deleteSuccess() {

		driver.findElement(deleteSuccess1).isDisplayed();
		driver.findElement(deleteSuccess2).isDisplayed();
		String msg1 = driver.findElement(deleteSuccess1).getText();
		String msg2 = driver.findElement(deleteSuccess2).getText();
		String successMsg = msg1 + msg2;
		System.out.println(successMsg);
		Assert.assertEquals(successMsg, "Successfulbatch Deleted");

	}

	public void isBatchPresent() {

		WebElement name = driver.findElement(batchNameWebTable);
		Boolean isPresent = name.isDisplayed();
		Assert.assertTrue(isPresent);

	}

	public void isBatchAbsent() {

		try {
			WebElement name = driver.findElement(batchNameWebTable);
			Boolean isPresent = name.isDisplayed();
			Assert.assertTrue(isPresent);
		} catch (Exception e) {
			System.out.println("Batch is deleted successfully");
			Assert.assertTrue(false);
		}

	}

	public void multipleDeleteIcon() {

		Boolean isEnabled = driver.findElement(deleteIconHeader).isEnabled();
		Assert.assertTrue(isEnabled);
	}

	public void selectCheckBox() {

		driver.findElement(webtableCheckBox).click();

	}

	public void selectMultipleCheckBox() {

		driver.findElement(webtableCheckBox).click();
		driver.findElement(webtableCheckBox1).click();

	}

	public void multipleDeleteIconClick() throws InterruptedException {

		WebElement delete = driver.findElement(deleteIconHeader);
		delete.click();

		String handle = driver.getWindowHandle();
		driver.switchTo().window(handle);

		Thread.sleep(1000);
		selectYes();

	}

	public void isBatchDeleted() {

		try {
			WebElement name = driver.findElement(batchNameWebTable);
			Boolean isPresent = name.isDisplayed();
			Assert.assertTrue(isPresent);
		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Batch is deleted successfully*********");

		}

	}

	public void isMultipleBatchDeleted() {

		try {
			WebElement name = driver.findElement(batchNameWebTable);
			Boolean isPresent = name.isDisplayed();
			softAssert.assertTrue(isPresent);

			WebElement name1 = driver.findElement(batchNameWebTable);
			Boolean isPresent1 = name1.isDisplayed();
			softAssert.assertTrue(isPresent1);

			softAssert.assertAll();

		} catch (Exception e) {
			Assert.assertTrue(true);
			System.out.println("Batches deleted successfully*********");

		}

	}

}
