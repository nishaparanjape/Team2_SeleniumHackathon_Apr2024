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
String uurl="https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com";
WebElement search, userfname, userlname, searchname;
String text,sort;
String n ="teamtwoqa";
  List<WebElement> data, chkboxes, datac, headerc, edit, delete, dataname,count,dataname2,belement,celement,aelement;
public static int size;
//user module user page validation part2
By user= By.xpath("//*[text()='User']");
By Assignstudent=By.xpath("//*[text()='Assign Student']");
By Search=By.id("filterGlobal");
By Data=By.xpath("//p-table/div/div[1]/table/tbody/tr");
By Data_totalcount= By.xpath("//*[contains(text(), ' In total there are ')]");
By Headercount=By.xpath("//p-table//table/thead/tr/th");
By Datacolumn =By.xpath("//p-table//table/tbody/tr[1]/td");
By Checkbox=By.xpath("//p-tablecheckbox/div/div[2]");
//User module edit
By SearchUID=By.xpath("//p-table//div[1]/table/tbody/tr[1]/td[2]");
By SearchTextname=By.xpath("//p-table//div[1]/table/tbody/tr[1]/td[3]");
By Edit=By.xpath("//p-table//table/tbody/tr//button[1]");
By Userdetails=By.xpath("//*[text()='User Details']");
By UserEditclose=By.xpath("//div/p-dialog[1]//div[1]/div/button");
By Edit_fname_label=By.xpath("//*[@id=\"mat-form-field-label-5\"]");
By Edit_lname_label=By.xpath("//*[@id=\"mat-form-field-label-9\"]");
By Edit_location_label=By.xpath("//*[@id=\"mat-form-field-label-11\"]");
By Edit_pn_label=By.xpath("//*[@id=\"mat-form-field-label-13\"]");
By Userfirstname=By.xpath("//div[1]/div[1]/mat-form-field//div[1]/div/input");
By Usermiddlename=By.xpath("//div[1]/div[2]/mat-form-field//div[1]/div/input");
By UserLastname=By.xpath("//div[1]/div[3]/mat-form-field/div/div[1]/div/input");
By Userlocation=By.xpath("//div[2]/div[1]/mat-form-field/div/div[1]/div/input");
By Userphnnum=By.xpath("//div[2]/div[2]/mat-form-field/div/div[1]/div/input");
By Userlurl=By.xpath("//div[2]/div[3]/mat-form-field/div/div[1]/div/input");
By Usermail=By.xpath("//div[4]/div/mat-form-field//div[1]/div/input");
By Usercomments=By.xpath("//div[6]/mat-form-field/div/div[1]/div/input");
By UserUG=By.xpath("//div[5]/div[1]/mat-form-field/div/div[1]/div");
By UserPG=By.xpath("//div[5]/div[2]/mat-form-field/div/div[1]/div");
By Usersubmit=By.xpath("//*[text()='Submit']");
By Usercancel=By.xpath("//*[text()='Cancel']");
By UCancelvalue=By.xpath("//p-table//div[1]/table/tbody/tr[1]/td");
By vfn=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[3]");
By vl=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[4]");
By vpn=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[5]");
By Usererror1=By.xpath("//*[@id=\"mat-error-46\"]/strong");
By Usererror=By.xpath("//mat-card/mat-card-content/div[4]//mat-form-field//div[3]/div");

//user delete
By Delete=By.xpath("//p-table//table/tbody/tr//button[2]");
By Userdelete=By.xpath("//table/tbody/tr[1]/td[6]//button[2]");
By Checkbox1=By.xpath("//table/tbody/tr[1]/td[1]/p-tablecheckbox//div[2]");
By Deleteconfirm=By.xpath("//*[text()='Confirm']");
By Userdeleteyes=By.xpath("//*[text()='Yes']");
By USerdeleteNO=By.xpath("//*[text()='No']");
By Editbutton= By.xpath("//p-table//table/tbody/tr[1]/td[6]//button[1]");
//User sort
By Idsort=By.xpath("//table/thead/tr/th[2]/p-sorticon/i");
By UserIDsort=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[2]");
By Usernamesort=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[3]");
By Userlocationsort=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[4]");
By Userpnsort=By.xpath("//p-table/div/div[1]/table/tbody/tr/td[5]");

By Namesort=By.xpath("//table/thead/tr/th[3]/p-sorticon/i");
By Locationsort=By.xpath("//table/thead/tr/th[4]/p-sorticon/i");
By Phnsort=By.xpath("//table/thead/tr/th[5]/p-sorticon/i");
By Usersuccess=By.xpath("/html/body/app-root/app-user/p-toast/div");
//user delete multiple
By Userdeleteclose=By.xpath("//p-confirmdialog//div[1]//button");
By UDeletebutton=By.xpath("//mat-card-title/div[2]/div[1]/button");
//Part1 user page validation--keerthana
By validatepage = By.xpath("//*[text()=' LMS - Learning Management System ']");
By userbtn = By.xpath("//*[text()='User']");
By manguser = By.xpath("//*[text()=' Manage User']");
By pagination = By.xpath("//div[contains(@class, 'p-paginator-bottom p-paginator p-component ng-star-inserted')]");
By datatable = By.xpath("//table[@role='grid']");
By delbtn = By.xpath("(//button[contains(@class, 'p-button-danger p-button p-component p-button-icon-only')])[1]");
By addnewuserbtn = By.xpath("//*[text()='Add New User']");
By assignstaffbtn = By.xpath("(//button[@id='Assign'])[2]");

//User page assign Student
By Studentrid=By.xpath("//*[@id=\"roleId\"]");
By Studentmail=By.xpath("//*[@id=\"userId\"]");
By StudentPname=By.xpath("//*[@id=\"programName\"]");

public UserPOM(WebDriver idriver) {
	  this.d =idriver; 
}

public WebDriver POMdriver() {
	return d;
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
	        d.navigate().back();
	        d.navigate().forward();
		    Thread.sleep(1000);
			d.findElement(Editbutton).click();
			Thread.sleep(1000);
			text= d.findElement(Userdetails).getText();
			Assert.assertEquals(text,"User Details");
			text= d.findElement(Edit_fname_label).getText();
			Assert.assertEquals(text,"First name");
			text= d.findElement(Edit_lname_label).getText();
			Assert.assertEquals(text,"Last name");
			text= d.findElement(Edit_location_label).getText();
			Assert.assertEquals(text,"Location");
			text= d.findElement(Edit_pn_label).getText();
			Assert.assertEquals(text,"Phone no");
			d.findElement(UserEditclose).click();	
	  }
public void user_details_data_from_examples(String data, String fn,String mn, String ln,String l, String pn,String lurl, String mail, String comments,  String ug, String pg) throws InterruptedException {
		
		    Thread.sleep(1000);
		    search = d.findElement(Search);
			search.click();
			search.clear();
			search.sendKeys(n);
			Thread.sleep(1000);
			dataname=d.findElements(Data);
			//If the name is available it ll edit
	if(dataname.size()!=0) {	
			Thread.sleep(1000);
			searchname = d.findElement(SearchTextname);
			String name=searchname.getText();
		
	if(name.startsWith(n)) {
			
			Thread.sleep(1000);
			d.findElement(Editbutton).click();
   if(!data.equals("additional")) {
			Thread.sleep(1000);
   if(!fn.equals(null)) {
		  userfname = d.findElement(Userfirstname);
		  userfname.click();
		  userfname.clear();
		  userfname.sendKeys(fn);
   }if(mn!=null) {
	     
		  userfname = d.findElement(Usermiddlename);
		  userfname.click();
		  userfname.clear();
		  userfname.sendKeys(mn);
			}if(!ln.equals(null)) {
		  userlname = d.findElement(UserLastname);
		  userlname.click();
	      userlname.clear();
		  userlname.sendKeys(ln);
			}if(l!=null) {
			  userlname = d.findElement(Userlocation);
			  userlname.click();
		      userlname.clear();
			  userlname.sendKeys(l);
			}if(pn!=null) {
			  userlname = d.findElement(Userphnnum);
			  userlname.click();
		      userlname.clear();
			  userlname.sendKeys(pn);
			}if(lurl!=null) {
			  userlname = d.findElement(Userlurl);
			  userlname.click();
		      userlname.clear();
			  userlname.sendKeys(lurl);
			}if(mail!=null) {
			  userlname = d.findElement(Usermail);
			  userlname.click();
		      userlname.clear();
			  userlname.sendKeys(mail);
			}if(comments!=null) {
			  userlname = d.findElement(Usercomments);
			  userlname.click();
		      userlname.clear();
			  userlname.sendKeys(comments);
			}
			  
			
	if(data.equals("success")) {
		       d.findElement(Usersubmit).click();
		       Thread.sleep(1000);
		       int num=n.length();
		       text = d.findElement(vfn).getText();
		       text=text.substring(0,num);
		      
		       Assert.assertEquals(  text,fn);
		       text = d.findElement(vl).getText();
		       Assert.assertEquals(  text,l);
		       text = d.findElement(vpn).getText();
		       Assert.assertEquals(  text,pn);
		       WebElement 	active =	d.switchTo().activeElement();
				text=active.getText();
				Boolean s=text.contains("User Updated Successfully");
				Assert.assertTrue(s);
		       System.out.println("--- Update validation is successfull");
			  
		}
	 else {
			 Thread.sleep(1000);
			 System.out.println("----Error message----  "+d.findElement(Usererror).getText());
			 text= d.findElement(Usererror).getText();
			 Assert.assertEquals(  text.substring(14,25), "is required");
			 d.findElement(UserEditclose).click();
		}}
	  else {
	    	  userlname = d.findElement(Userlurl);
			  userlname.click();
		      userlname.clear();
			  userlname.sendKeys(lurl);
			
			  userlname = d.findElement(Usermail);
			  userlname.click();
		      userlname.clear();
			  userlname.sendKeys(mail);
			  userlname = d.findElement(Usercomments);
			  userlname.click();
		      userlname.clear();
			  userlname.sendKeys(comments); 
			  d.findElement(Usersubmit).click();
			  Thread.sleep(1000);
			  WebElement 	active =d.switchTo().activeElement();
			  text=active.getText();
				//System.out.println(text);
			  Boolean s=text.contains("User Updated Successfully");
			  Assert.assertTrue(s);
			  System.out.println("--- Update validation is successfull");
	     }
			}
			}	
	  }
public void validate_userdetails_cancelbutton() throws InterruptedException {
		    d.navigate().back();
		    d.navigate().forward(); 
		    Thread.sleep(1000);
			d.findElement(Editbutton).click();
			Thread.sleep(1000);
			belement = d.findElements(UCancelvalue);
			String[] bf = new String[belement.size()];

	for(int i=0; i<belement.size();i++) {
			bf[i]=belement.get(i).getText().trim();
				
			 }
			 Thread.sleep(1000);
			 d.findElement(Usercancel).click();
			 Thread.sleep(1000);
			 celement = d.findElements(UCancelvalue);
			 String[] cf = new String[celement.size()];

			 for(int i=0; i<celement.size();i++) {
				 cf[i]=celement.get(i).getText().trim();
				 
			 }
			 Assert.assertEquals(belement, celement);
			 System.out.println("--- Cancel button validation is successfull");	 
	 }
	 
public void sortuserid() throws InterruptedException {
		 
		  Thread.sleep(1000);
		   belement = d.findElements(UserIDsort);
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
		 aelement = d.findElements(UserIDsort);
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
		
		   belement = d.findElements(Usernamesort);
		    String[] bf = new String[belement.size()];
		
	for(int i=0; i<belement.size();i++) {
			 bf[i]=belement.get(i).getText().trim();
			 System.out.println(bf[i]);
		 }
		   	d.findElement(Namesort).click();
		   	 aelement = d.findElements(Usernamesort);
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

		  	belement = d.findElements(Userlocationsort);
		  	String[] bf = new String[belement.size()];
		 
	for(int i=0; i<belement.size();i++) {
			 bf[i]=belement.get(i).getText().trim();
			 System.out.println(bf[i]);
		 }
		  	d.findElement(Locationsort).click();
		  	aelement = d.findElements(Userlocationsort);
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
		  		belement = d.findElements(Userpnsort);
		  		String[] bf = new String[belement.size()];
			
	for(int i=0; i<belement.size();i++) {
				 bf[i]=belement.get(i).getText().trim();
				 System.out.println(bf[i]);
			 }
		  		d.findElement(Phnsort).click();
		  		aelement = d.findElements(Userpnsort);
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
		     search = d.findElement(Search);
			 search.click();
			 search.clear();
			 search.sendKeys(n);
			 Thread.sleep(1000);
			dataname=d.findElements(Data);
	if(dataname.size()!=0) {	
				Thread.sleep(1000);
				searchname = d.findElement(SearchTextname);
				String name=searchname.getText();
				
	if(name.startsWith(n)) {
					
		  Thread.sleep(1000);
		  d.findElement(Userdelete).click();
		  d.findElement(Userdeleteyes).click(); 
		  Thread.sleep(1000);
		  dataname2=d.findElements(Data);
if(dataname.size()>dataname2.size()) {
		System.out.println("_____ User Deleted Successful");
		WebElement 	active =	d.switchTo().activeElement();
		text=active.getText();
		Boolean s=text.contains("User Deleted");
		Assert.assertTrue(s);
	   
		 
	}else {
					// before delete and after delete count 
		Assert.assertNotEquals(dataname.size(),dataname2.size());
				}
				
		System.out.println("------ Yes button validation successfull");
	  }}}
public void delete_user_no() throws InterruptedException {
		  Thread.sleep(1000);
          d.navigate().back();
		  d.navigate().forward();
		  Thread.sleep(1000);
		  belement = d.findElements(UCancelvalue);
		  String[] bf = new String[belement.size()];

	for(int i=0; i<belement.size();i++) {
			bf[i]=belement.get(i).getText().trim();
				
			 }
			 Thread.sleep(1000);
			 d.findElement(Userdelete).click();
			  d.findElement(USerdeleteNO).click();
			 Thread.sleep(1000);
			 celement = d.findElements(UCancelvalue);
			 String[] cf = new String[celement.size()];

			 for(int i=0; i<celement.size();i++) {
				 cf[i]=celement.get(i).getText().trim();
				 
			 }
			 Assert.assertEquals(belement, celement);
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
public void multiple_delete_icon() throws InterruptedException {
		  Thread.sleep(1000);
		  d.findElement(Checkbox1).click();
		  Boolean b= d.findElement(UDeletebutton).isDisplayed(); 
          Assert.assertTrue(b);
          System.out.println("------ button icon on manage user validation successfull");  
	  }
	  
public void multiple_delete_yes() throws InterruptedException {
		     Thread.sleep(1000);
		     search = d.findElement(Search);
			 search.click();
			 search.clear();
			 search.sendKeys(n);
			 Thread.sleep(1000);
			 dataname=d.findElements(Data);
	if(dataname.size()!=0) {	
				Thread.sleep(1000);
				
				searchname = d.findElement(SearchTextname);
				String name=searchname.getText();
				
	if(name.startsWith(n)) {
					
		 Thread.sleep(1000);
		 d.findElement(Checkbox1).click();
		 d.findElement(UDeletebutton).click();
		 d.findElement(Userdeleteyes).click(); 
		 Thread.sleep(1000);
		 dataname2=d.findElements(Data);
	if(dataname.size()>dataname2.size()) {
			
		WebElement 	active =	d.switchTo().activeElement();
		text=active.getText();
		//System.out.println("***********"+text);
		Boolean s=text.contains("Users Deleted");
		Assert.assertTrue(s);
	    System.out.println("_____ User Deleted Successful");
				}else {
					// before delete and after delete count 
		Assert.assertNotEquals(dataname.size(),dataname2.size());
				}
				
		System.out.println("------ Yes button validation successfull"); 
	  }
			}
}
public void multiple_delete_user_no() throws InterruptedException {
	  Thread.sleep(1000);
      d.navigate().back();
	  d.navigate().forward();
	  Thread.sleep(1000);
	  belement = d.findElements(UCancelvalue);
	  String[] bf = new String[belement.size()];

for(int i=0; i<belement.size();i++) {
		bf[i]=belement.get(i).getText().trim();
			
		 }
		 Thread.sleep(1000);
	  d.findElement(Checkbox1).click();
	  d.findElement(UDeletebutton).click();
	  d.findElement(USerdeleteNO).click();
	  Thread.sleep(1000);
	  celement = d.findElements(UCancelvalue);
	  String[] cf = new String[celement.size()];

		 for(int i=0; i<celement.size();i++) {
			 cf[i]=celement.get(i).getText().trim();
			 
		 }
		 Assert.assertEquals(belement, celement);
	  Assert.assertEquals(d.getCurrentUrl(), url);  
	  System.out.println("------ No button validation successfull");  
}
public void multiple_delete_selectmultiplecheckbox_yes() throws InterruptedException {
    n="Dhivya";
	Thread.sleep(1000);
     search = d.findElement(Search);
	 search.click();
	 search.clear();
	 search.sendKeys(n);
	 Thread.sleep(1000);
	 dataname=d.findElements(Data);
if(dataname.size()!=0) {	
		Thread.sleep(1000);
		
		searchname = d.findElement(SearchTextname);
		String name=searchname.getText();
		
if(name.startsWith(n)) {
	List<WebElement> checkboxes = d.findElements(By.xpath("//table/tbody/tr/td[1]/p-tablecheckbox/div/div[2]"));

	//traverse through the list and select all checkboxes if they are enabled and displayed.
	for(int i=0; i<checkboxes.size(); i++)
	{
		if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
		{
               
             checkboxes.get(i).click();
		}
	}
d.findElement(UDeletebutton).click();
d.findElement(Userdeleteyes).click(); 
Thread.sleep(1000);
dataname2=d.findElements(Data);
if(dataname.size()>dataname2.size()) {
	
WebElement 	active =	d.switchTo().activeElement();
text=active.getText();
//System.out.println("***********"+text);
Boolean s=text.contains("Users Deleted");
Assert.assertTrue(s);
System.out.println("_____ User Deleted Successful");
		}else {
			// before delete and after delete count 
Assert.assertNotEquals(dataname.size(),dataname2.size());
System.out.println("_____ User Deleted failed");
		}
		
System.out.println("------ Yes button validation successfull"); 
	}
}
	}

public void multiple_delete_selectmultiplecheckbox_no() throws InterruptedException {
    n="Dhivya";
	Thread.sleep(1000);
     search = d.findElement(Search);
	 search.click();
	 search.clear();
	 search.sendKeys(n);
	 Thread.sleep(1000);
	 dataname=d.findElements(Data);
if(dataname.size()!=0) {	
		Thread.sleep(1000);
		
		searchname = d.findElement(SearchTextname);
		String name=searchname.getText();
		
if(name.startsWith(n)) {
	List<WebElement> checkboxes = d.findElements(By.xpath("//table/tbody/tr/td[1]/p-tablecheckbox/div/div[2]"));

	//traverse through the list and select all checkboxes if they are enabled and displayed.
	for(int i=0; i<checkboxes.size(); i++)
	{
		if(checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled())
		{
               
             checkboxes.get(i).click();
		}
	}
d.findElement(UDeletebutton).click();
d.findElement(USerdeleteNO).click(); 
Thread.sleep(1000);
dataname2=d.findElements(Data);

Assert.assertEquals(dataname.size(),dataname2.size());

System.out.println("------ no button validation successfull"); 
	}
}
	}

}

