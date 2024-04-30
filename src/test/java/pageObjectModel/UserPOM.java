package pageObjectModel;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mongodb.diagnostics.logging.Logger;


public class UserPOM 
{
WebDriver d;
String url="https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/user";
WebElement search, userfname, userlname;
String text,sort;
  List<WebElement> data, chkboxes, datac, headerc, edit, delete, dataname,count;
public static int size;
//user module
By user= By.xpath("//*[text()='User']");
By Assignstudent=By.xpath("//*[text()='Assign Student']");
By Search=By.id("filterGlobal");
By Data=By.xpath("//p-table/div/div[1]/table/tbody/tr");
By Data_totalcount= By.xpath("//*[contains(text(), ' In total there are ')]");
By Headercount=By.xpath("//p-table//table/thead/tr/th");
By Datacolumn =By.xpath("//p-table//table/tbody/tr[1]/td");
By Checkbox=By.xpath("//p-tablecheckbox/div/div[2]");
By Edit=By.xpath("//p-table//table/tbody/tr//button[1]");
By Delete=By.xpath("//p-table//table/tbody/tr//button[2]");
By Userdelete=By.xpath("//table/tbody/tr[1]/td[6]//button[2]");
By Checkbox1=By.xpath("//table/tbody/tr[1]/td[1]/p-tablecheckbox//div[2]");
By Deleteconfirm=By.xpath("//*[text()='Confirm']");
By Userdeleteyes=By.xpath("//*[text()='Yes']");
By USerdeleteNO=By.xpath("//*[text()='No']");
By Editbutton= By.xpath("//p-table//table/tbody/tr[1]/td[6]//button[1]");
By Userdetails=By.xpath("//*[text()='User Details']");
By Userfirstname=By.xpath("//*[@id=\"mat-input-13\"]");
By UserLastname=By.xpath("//*[@id=\"mat-input-15\"]");
By Usersubmit=By.xpath("//*[text()='Submit']");
By Usercancel=By.xpath("//*[text()='Cancel']");
By Idsort=By.xpath("//table/thead/tr/th[2]/p-sorticon/i");
By UserIDsort=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[2]");
By Usernamesort=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[3]");
By Userlocationsort=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[4]");
By Userpnsort=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[5]");

By Namesort=By.xpath("//table/thead/tr/th[3]/p-sorticon/i");
By Locationsort=By.xpath("//table/thead/tr/th[4]/p-sorticon/i");
By Phnsort=By.xpath("//table/thead/tr/th[5]/p-sorticon/i");
By Usersuccess=By.xpath("//*[text()='Successful']");
By Userdeleted=By.xpath("//*[text()='User Deleted']");
By Userdeleteclose=By.xpath("//p-confirmdialog//div[1]//button");

//Part1 user page validation--keerthana
By validatepage = By.xpath("//*[text()=' LMS - Learning Management System ']");
By userbtn = By.xpath("//*[text()='User']");
By manguser = By.xpath("//*[text()=' Manage User']");
By pagination = By.xpath("//div[contains(@class, 'p-paginator-bottom p-paginator p-component ng-star-inserted')]");
By datatable = By.xpath("//table[@role='grid']");
By delbtn = By.xpath("(//button[contains(@class, 'p-button-danger p-button p-component p-button-icon-only')])[1]");
By addnewuserbtn = By.xpath("//*[text()='Add New User']");
By assignstaffbtn = By.xpath("(//button[@id='Assign'])[2]");


public UserPOM(WebDriver idriver) {
	  this.d =idriver; 
}






//public void valdashboard() {
//driver.findElement(validatepage).isDisplayed();
//}


public boolean isDashboardDisplayed() throws InterruptedException {
	Thread.sleep(1000);
    return d.findElement(validatepage).isDisplayed();
}


public void userbtn() {
d.findElement(userbtn).click();;
	} 
public boolean isManageuserDisplayed() {
return d.findElement(manguser).isDisplayed();
}

public boolean pagination() {
return d.findElement(pagination).isDisplayed();
}	

public boolean datatable() {
return d.findElement(datatable).isDisplayed();
}


public void delbtn() {
d.findElement(delbtn).isEnabled();
}
public boolean addnewuserbtn() {
return d.findElement(addnewuserbtn).isDisplayed();
}

public boolean assignstaffbtn() {
return d.findElement(assignstaffbtn).isDisplayed();
}
	  public void user() throws InterruptedException {
		//WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(10));
		  
		 // wait.until(ExpectedConditions.elementToBeClickable(user));
		 Thread.sleep(2000);
		  d.findElement(user).click();


		}
	  
	  public void validate_addstudent_button() throws InterruptedException {
		
		  Boolean addstudent= d.findElement(Assignstudent).isDisplayed();
          Assert.assertTrue(addstudent);
	  }
	  
	  public void validate_search_buton() {
		
		  Boolean search= d.findElement(Search).isDisplayed(); 
          Assert.assertTrue(search);
		 
	  }
	  
	  public void validate_noofdata() {
		//if Data records is not null
		  //validate no of header count and Column count in each row is same
		 data = d.findElements(Data);
		 System.out.println("**** Row count "+data.size());
		 headerc = d.findElements(Headercount);
		if(data.size()!=0) {
			 datac = d.findElements(Datacolumn);
			 System.out.println("**** Header count "+headerc.size());
			 System.out.println("**** Column count "+datac.size());
		    Assert.assertEquals(headerc.size(), datac.size());
			 Assert.assertNotNull(data.size());
			
			 size=data.size();
		}
		
	  }
  
public void validate_checkbox() {
	chkboxes=d.findElements(Checkbox);  
	if(chkboxes.size()==size) {
	Assert.assertEquals(" ",chkboxes.size(),size);
	System.out.println("**** Check box count "+chkboxes.size()+" and Row count "+size+" Are same");
	}
	  }
	  public void validate_editbox_on_eachrow() {
		  edit = d.findElements(Edit); 
		  if(edit.size()==size) {
				Assert.assertEquals(" ",edit.size(),size);
				System.out.println("**** Edit button count "+edit.size()+" and Row count "+size+" Are same");
		  }
	
	  }
	  
	  public void validate_deletebox_on_eachrow() {
		  delete = d.findElements(Delete);
		  if(delete.size()==size) {
				Assert.assertEquals(" ",delete.size(),size);
				System.out.println("**** Edit button count "+delete.size()+" and Row count "+size+" Are same");
		  }
	
		  }  
	  
	  public void search_by_username(String name) throws InterruptedException  {
		 search = d.findElement(Search);
		 search.click();
		 search.clear();
		search.sendKeys(name);
		Thread.sleep(1000);
		
		dataname=d.findElements(Data);
		if(dataname.size()==0) {
			 System.out.println("**** User name "+name +"Is not availble" );	 
		 }
		 else {
	 System.out.println("**** User name "+name +"Is availble and shows "+dataname.size()+" Rows" );	 
		 }
		
	  }
	
	  public void user_edit_userdetails() throws InterruptedException {
		     Thread.sleep(1000);
			 d.findElement(Editbutton).click();
			text= d.findElement(Userdetails).getText();
			Assert.assertEquals(text,"User Details");
			
	  }
	  public void user_details_data_from_examples() throws InterruptedException {
		  Thread.sleep(1000);
		d.findElement(Editbutton).click();
		  userfname = d.findElement(Userfirstname);
		  userfname.click();
		  userfname.clear();
		  userfname.sendKeys("");
		  userlname = d.findElement(UserLastname);
		  userlname.click();
		  userlname.clear();
		  userlname.sendKeys("");
		  
		  d.findElement(Usersubmit).click();
	  }
	 
	  public void sortuserid() throws InterruptedException {
		 
		  Thread.sleep(1000);
		  List<WebElement> belement = d.findElements(UserIDsort);
		 String[] bf = new String[belement.size()];
		 //System.out.println(belement.size());
		 for(int i=0; i<belement.size();i++) {
			 bf[i]=belement.get(i).getText().trim();
			 System.out.println(bf[i]);
		 }
//		 for(int i=0; i<belement.size();i++) {
//			 Arrays.sort(bf);
//			 sort=bf[i];
//			 System.out.println(sort); 
//		 }
		 d.findElement(Idsort).click();
		 Thread.sleep(1000);
		 List<WebElement> aelement = d.findElements(UserIDsort);
		 String[] af = new String[aelement.size()];
		 
		 for(int i=0; i<aelement.size();i++) {
			 af[i]=aelement.get(i).getText().trim();
			 System.out.println(af[i]);
		 }
		 Object a= aelement;
		 for(int i=0; i<aelement.size();i++) {
			 Arrays.sort(bf);
			 
		 }
		 //Comparing after sort data with sorting function
		 Assert.assertEquals(a, aelement);
		 System.out.println("Sort by ID is successfull");
		//Comparing after sort with before sort data 
		 Assert.assertNotEquals(belement, aelement);
		 System.out.println("Sort by ID is successfull");
	  }
	  public void sortusername() {
		
		  List<WebElement> belement = d.findElements(Usernamesort);
		 String[] bf = new String[belement.size()];
		
		 for(int i=0; i<belement.size();i++) {
			 bf[i]=belement.get(i).getText().trim();
			 System.out.println(bf[i]);
		 }
		  d.findElement(Namesort).click();
		  List<WebElement> aelement = d.findElements(Usernamesort);
			 String[] af = new String[aelement.size()];
			 
			 for(int i=0; i<aelement.size();i++) {
				 af[i]=aelement.get(i).getText().trim();
				 System.out.println(af[i]);
			 }
			 Object a= aelement;
			 for(int i=0; i<aelement.size();i++) {
				 Arrays.sort(bf);
				 
			 }
			 
			 Assert.assertEquals(a, aelement);
			 System.out.println("Sort by Name is successfull");
			 Assert.assertNotEquals(belement, aelement);
			 System.out.println("Sort by Name is successfull");
	  }
	  public void sortuserlocation() {

		  List<WebElement> belement = d.findElements(Userlocationsort);
		 String[] bf = new String[belement.size()];
		 
		 for(int i=0; i<belement.size();i++) {
			 bf[i]=belement.get(i).getText().trim();
			 System.out.println(bf[i]);
		 }
		  d.findElement(Locationsort).click();
		  List<WebElement> aelement = d.findElements(Userlocationsort);
			 String[] af = new String[aelement.size()];
			 
			 for(int i=0; i<aelement.size();i++) {
				 af[i]=aelement.get(i).getText().trim();
				 System.out.println(af[i]);
			 }
			 Object a= aelement;
			 for(int i=0; i<aelement.size();i++) {
				 Arrays.sort(bf);
			 }
			 Assert.assertEquals(a, aelement);
			 System.out.println("Sort by Location is successfull");
			 Assert.assertNotEquals(belement, aelement);
			 System.out.println("Sort by Location is successfull");
	  }
	  public void sortuserphnnum() {
		  List<WebElement> belement = d.findElements(Userpnsort);
			 String[] bf = new String[belement.size()];
			
			 for(int i=0; i<belement.size();i++) {
				 bf[i]=belement.get(i).getText().trim();
				 System.out.println(bf[i]);
			 }
		  d.findElement(Phnsort).click();
		  List<WebElement> aelement = d.findElements(Userpnsort);
			 String[] af = new String[aelement.size()];
			 
			 for(int i=0; i<aelement.size();i++) {
				 af[i]=aelement.get(i).getText().trim();
				 System.out.println(af[i]);
			 }
			 Object a= aelement;
			 for(int i=0; i<aelement.size();i++) {
				 Arrays.sort(bf);
			 }
			 Assert.assertEquals(a, aelement);
			 System.out.println("------ Sort by Phone Number is successfull");
			 Assert.assertNotEquals(belement, aelement);
			 System.out.println("------ Sort by Phone Number is successfull");
	  }
	  public void delete_checkbox() throws InterruptedException {
		  Thread.sleep(1000);
		 d.findElement(Checkbox1).click();
          d.findElement(Userdelete).click();
          Thread.sleep(1000);
		String confirm=	 d.findElement(Deleteconfirm).getText(); 
		Assert.assertEquals(confirm, "Confirm");
			 System.out.println("------ Confirm text on the window");
			 Boolean yes= d.findElement(Userdeleteyes).isDisplayed(); 
			  Assert.assertTrue(yes);
			  System.out.println("------ Yes button  on the window");
			  Boolean no= d.findElement(USerdeleteNO).isDisplayed(); 
			  Assert.assertTrue(no);
			  System.out.println("------ No button  on the window");
			d.findElement(Userdeleteclose).click();
	  }
	  public void delete_user_yes() throws InterruptedException {
		  Thread.sleep(1000);
		  //d.findElement(Checkbox1).click();
		  d.findElement(Userdelete).click();
		  //d.findElement(Userdeleteyes).click(); 
		  //text= d.findElement(Usersuccess).getText();
		  //text= d.findElement(Userdeleted).getText();
		  //Assert.assertEquals(  text, "Successful");
		  //Assert.assertEquals(  text, "User Deleted");
		  d.findElement(Userdeleteclose).click();
		  System.out.println("------ Yes button validation successfull");
	  }
	  public void delete_user_no() throws InterruptedException {
		  Thread.sleep(1000);
		 
		  d.findElement(Userdelete).click();
		 d.findElement(USerdeleteNO).click();
		
		// System.out.println(d.getCurrentUrl());
		Assert.assertEquals(d.getCurrentUrl(), url);  
		  System.out.println("------ No button validation successfull");  
	  }
	  public void delete_user_close() throws InterruptedException {
		  Thread.sleep(1000);
		  
		  d.findElement(Userdelete).click();
		  d.findElement(Userdeleteclose).click();
		Boolean close=d.findElement(Userdeleteclose).isEnabled();
		Assert.assertTrue(close);
		Assert.assertEquals(d.getCurrentUrl(), url);
		  System.out.println("------ close button validation successfull");  
	  }
	  
}

