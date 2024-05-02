package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageObjectModel.*;

import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.DriverBase;
import utilities.LoggerLoad;

public class UserStepDef {
UserPOM u,u2;
public static ConfigReader reader = new ConfigReader();
public static DriverBase driverBase = new DriverBase();
public static WebDriver driver = driverBase.getDriver();

@Given("Admin is on dashboard page after Login-dk")
public void admin_is_on_dashboard_page_after_login_dd() throws InterruptedException {
   	//System.out.println("in user validation :::: " + driver.getCurrentUrl());
	u= new UserPOM(driver); 
	
    boolean isDashboardDisplayed = u.isDashboardDisplayed();
    Assert.assertTrue(isDashboardDisplayed);
    LoggerLoad.info("....................Admin logged in successfully and launched on  the Dasboard....................");
}

@When("Admin clicks {string} from navigation bar-dk")
public void admin_clicks_from_navigation_bar_dd(String string) throws InterruptedException {
   
	u.user(); 
	LoggerLoad.info("....................Navigated to  Manage User....................");
   
}
@Then("Admin should be able to see the {string} button above the data table-dd")
public void admin_should_be_able_to_see_the_button_above_the_data_table_dd(String string) throws InterruptedException {
  u.validate_addstudent_button();
  LoggerLoad.info("....................Assign student button is Enabled....................");	
}
@Then("Admin should be able to see the search text box above the data table-dd")
public void admin_should_be_able_to_see_the_search_text_box_above_the_data_table_dd() {
    
u.validate_search_buton();
LoggerLoad.info("...................Search button is Enabled....................");	
}

@Then("Admin should see similar count of header and coloumn on the data table-dd")
public void admin_should_see_similar_count_of_header_and_coloumn_on_the_data_table_dd() {
     u.validate_noofdata();
     LoggerLoad.info("...................Validated Column with header....................");		
}

@Then("Each row in the data table should have a checkbox-dd")
public void each_row_in_the_data_table_should_have_a_checkbox_dd() {
     u.validate_checkbox();
     LoggerLoad.info("...................Validated Checkbox....................");     
   
}

@Then("Each row in the data table should have a edit icon that is enabled-dd")
public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled_dd() {
    u.validate_editbox_on_eachrow();
    LoggerLoad.info("...................Validated Edit icon on each row....................");   
}

@Then("Each row in the data table should have a delete icon that is enabled-dd")
public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled_dd() {
    
    u.validate_deletebox_on_eachrow();
    LoggerLoad.info("...................Validated Delete icon on each row....................");
}


@Given("Admin is on Manage User Page-dd")
public void admin_is_on_manage_user_page_dd() {
 
    
}


@When("Admin enters user name into search box-dd")
public void admin_enters_user_name_into_search_box_dd() {
 
}

@Then("Admin should see user displayed with the entered {string} and {string}-dd")
public void admin_should_see_user_displayed_with_the_entered_and_dd(String name, String sn) throws InterruptedException {
   System.out.println("**** Scenario "+sn);
u.search_by_username(name);
LoggerLoad.info("...................Validated Search button with name....................");

}


@When("Admin clicks on the edit icon-dd")
public void admin_clicks_on_the_edit_icon_dd() {
  
    
}

@Then("A new pop up with User details appears-dd")
public void a_new_pop_up_with_user_details_appears_dd() throws InterruptedException {
      u.user_edit_userdetails(); 
 LoggerLoad.info("...................Validated User Details Pop up....................");	      
}

@When("Update the fields with{string} {string}{string} {string} {string} {string} {string} {string}{string} {string} {string} data and click submit")
public void update_the_fields_with_data_and_click_submit(String data,String fn,String mn, String ln, String l, String pn, String lurl, String mail, String comments, String ug, String pg) throws InterruptedException {
 	u.user_details_data_from_examples(data,fn,mn,ln,l,pn,lurl,mail,comments,ug,pg); 
	 
}
@Then("Admin gets {string} and see the updated values in data table")
public void admin_gets_and_see_the_updated_values_in_data_table(String message) {
	System.out.println("------ "+message);
	LoggerLoad.info("...................Validated with Examples data....................");	          
}





@When("Admin clicks Cancel button on edit popup-dd")
public void admin_clicks_cancel_button_on_edit_popup_dd() throws InterruptedException {
    
    u.validate_userdetails_cancelbutton();
}

@Then("Admin can see the User details popup disappears and can see nothing changed for particular User-dd")
public void admin_can_see_the_user_details_popup_disappears_and_can_see_nothing_changed_for_particular_user_dd() {
    
	LoggerLoad.info("...................Validated with Cancel button on user details....................");	          
}



@When("Admin clicks on ID sort icon-dd")
public void admin_clicks_on_id_sort_icon_dd() {   
  
}
@Then("Admin should see User details are sorted by id-dd")
public void admin_should_see_user_details_are_sorted_by_id_dd() throws InterruptedException {
	u.sortuserid();
    LoggerLoad.info("...................Validated User Sort By Id....................");	          
	}


@When("Admin clicks on name sort icon-dd")
public void admin_clicks_on_name_sort_icon_dd() {
     
   
}

@Then("Admin should see User details are sorted by name-dd")
public void admin_should_see_user_details_are_sorted_by_name_dd() {
	u.sortusername();
	 LoggerLoad.info("...................Validated User Sort By Name....................");	        

	}
@When("Admin clicks on Location sort icon-dd")
public void admin_clicks_on_location_sort_icon_dd() {
  
   
}

@Then("Admin should see User details are sorted by Location-dd")
public void admin_should_see_user_details_are_sorted_by_location_dd() {
	u.sortuserlocation();
    LoggerLoad.info("...................Validated User Sort By Location....................");	          
 }


@When("Admin clicks on Phone number sort icon-dd")
public void admin_clicks_on_phone_number_sort_icon_dd() {
   
}
@Then("Admin should see User details are sorted by Phone number-dd")
public void admin_should_see_user_details_are_sorted_by_phone_number_dd() throws InterruptedException {

	 u.sortuserphnnum();
	 LoggerLoad.info("...................Validated User Sort By Phone number....................");	        
  
	}


@When("Admin clicks the delete icon-dd")
public void admin_clicks_the_delete_icon_dd() {
}

@Then("Admin should see a alert open with heading {string} along with  {string} and {string} button for deletion-dd")
public void admin_should_see_a_alert_open_with_heading_along_with_and_button_for_deletion_dd(String string, String string2, String string3) throws InterruptedException {
	u.delete_checkbox();
    LoggerLoad.info("...................Validated User Delete Confirm, Yes and No....................");	        

}

@Given("Admin is on Confirm Deletion alert-dd")
public void admin_is_on_confirm_deletion_alert_dd() {
    
}


@When("Admin clicks {string} button on the alert-dd")
public void admin_clicks_button_on_the_alert_dd(String string) throws InterruptedException {
	u.delete_user_yes();
    
}


@Then("Admin gets a message {string} alert and do not see that user in the data table-dd")
public void admin_gets_a_message_alert_and_do_not_see_that_user_in_the_data_table_dd(String string) throws InterruptedException {
     	
		
		 LoggerLoad.info("...................Validated User Delete YES button....................");	        	
	}
@When("Admin clicks  No option-dd")
public void admin_clicks_no_option_dd() throws InterruptedException {
	u.delete_user_no();
	 LoggerLoad.info("...................Validated User Delete NO button....................");	        
}

@When("Admin clicks on close button-dd")
public void admin_clicks_on_close_button_dd() throws InterruptedException {
    u.delete_user_close();
	
}

@Then("Admin can see the deletion alert disappears without deleting-dd")
public void admin_can_see_the_deletion_alert_disappears_without_deleting_dd() {
	 LoggerLoad.info("...................Validated User Delete close button....................");	
}


//@Userpagevalidation1
@Then("Admin should see the Manage User in the URL")
public void admin_should_see_the_manage_user_in_the_url() {
	boolean isManageuserDisplayed = u.isManageuserDisplayed();
    Assert.assertTrue(isManageuserDisplayed);
    LoggerLoad.info("....................Page is on Manage User....................");
}

//@Userpagevalidation2
@Then("Admin should see a heading with text Manage user on the page")
public void admin_should_see_a_heading_with_text_manage_user_on_the_page() {
	boolean isManageuserDisplayed = u.isManageuserDisplayed();
    Assert.assertTrue(isManageuserDisplayed);
    LoggerLoad.info("....................Page is on Manage User....................");
}


	//@Userpagevalidation3
@Then("Admin should see the text as Showing x to y of z entries along with Pagination icon below the table.x- starting record number on that page y-ending record number on that page z-Total number of records")
public void admin_should_see_the_text_as_showing_x_to_y_of_z_entries_along_with_pagination_icon_below_the_table_x_starting_record_number_on_that_page_y_ending_record_number_on_that_page_z_total_number_of_records() {
	boolean pagination = u.pagination();
    Assert.assertTrue(pagination);
    LoggerLoad.info(".....................Showing x to y of z entries...................");
}

//@Userpagevalidation4
@Then("Admin Should see the data table with column names Id, Name, location, Phone Number, Edit\\/Delete")
public void admin_should_see_the_data_table_with_column_names_id_name_location_phone_number_edit_delete() {
	boolean datatable = u.datatable();
    Assert.assertTrue(datatable);
    LoggerLoad.info("....................Admin Should see the data table....................");
}
//@Userpagevalidation5
@Then("Admin should see a Delete button on the top left hand side as Disabled")
public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
	 u.delbtn();
	 LoggerLoad.info("....................Admin should see a Delete button....................");
}
//@Userpagevalidation6
@Then("Admin should be able to see the A New User button above the data table")
public void admin_should_be_able_to_see_the_a_new_user_button_above_the_data_table() {
    
	boolean addnewuserbtn = u.addnewuserbtn();
    Assert.assertTrue(addnewuserbtn);
    LoggerLoad.info("....................Admin should be able to see the A New User button....................");
}
//@Userpagevalidation7
@Then("Admin should be able to see the  Assign staff button above the data table")
public void admin_should_be_able_to_see_the_assign_staff_button_above_the_data_table() {
	boolean assignstaffbtn = u.assignstaffbtn();
    Assert.assertTrue(assignstaffbtn);
    LoggerLoad.info("....................Admin should be able to see the  Assign staff button....................");
}


@When("Admin clicks any checkbox in the data table-dd")
public void admin_clicks_any_checkbox_in_the_data_table_dd() throws InterruptedException {
   u.multiple_delete_icon();
    
}

@Then("Admin should see common delete option enabled under header Manage Program-dd")
public void admin_should_see_common_delete_option_enabled_under_header_manage_program_dd() {
	 LoggerLoad.info("....................Admin See Delete icon on the manage user page....................");
	}

@Given("Admin is on Confirm Deletion alert-md")
public void admin_is_on_confirm_deletion_alert_md() {
   
    
}

@When("Admin clicks <YES> button on the alert-dd")
public void admin_clicks_yes_button_on_the_alert_dd() throws InterruptedException {
   u.multiple_delete_yes();
    
}

@Then("Admin should land on Manage User page and can see the selected user is deleted from the data table-dd")
public void admin_should_land_on_manage_user_page_and_can_see_the_selected_user_is_deleted_from_the_data_table_dd() {
   
	LoggerLoad.info("....................Selecting single check box delete YES is validated ....................");
}

@When("Admin clicks <No> button on the alert-dd")
public void admin_clicks_no_button_on_the_alert_dd() throws InterruptedException {
   
   u.multiple_delete_user_no();
}

@Then("Admin should land on Manage User page and can see the selected user is not deleted from the data table-dd")
public void admin_should_land_on_manage_user_page_and_can_see_the_selected_user_is_not_deleted_from_the_data_table_dd() {
	LoggerLoad.info("....................Selecting single check box delete NO is validated ....................");
    
}

@Then("Admin should land on Manage User page and can see the selected users are deleted from the data table-dd")
public void admin_should_land_on_manage_user_page_and_can_see_the_selected_users_are_deleted_from_the_data_table_dd() throws InterruptedException {
	 u.multiple_delete_selectmultiplecheckbox_yes();
	 LoggerLoad.info("....................Selecting multiple check box delete YES is validated ...................."); 
}

@Then("Admin should land on Manage User page and can see the selected users are not deleted from the data table-dd")
public void admin_should_land_on_manage_user_page_and_can_see_the_selected_users_are_not_deleted_from_the_data_table_dd() throws InterruptedException {
   u.multiple_delete_selectmultiplecheckbox_no();
    
   LoggerLoad.info("....................Selecting multiple check box delete NO is validated ...................."); 
  }

}
