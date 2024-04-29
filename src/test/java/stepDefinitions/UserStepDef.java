package stepDefinitions;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.*;
import utilities.*;

public class UserStepDef {
	
//	WebDriver driver;
//	UserPage userpageval;
	UserPage user = new UserPage();

//	public UserStepDef() {
//		this.driver = DriverFactory_Thread.getDriver();
//		userpageval = new UserPage(driver);		
//	}

	// @Userpagevalidation1
//	 @Given("Admin is on dashboard page after Login")
//	 public void U1admin_is_on_dashboard_page_after_login() {
//		 boolean isDashboardDisplayed = user.isDashboardDisplayed();
//		 Assert.assertTrue(isDashboardDisplayed);
//		 LoggerLoad.info("....................Admin is on dashboard page....................");
//	 }

	@When("Admin clicks User from navigation bar")
	public void admin_clicks_user_from_navigation_bar() {  
		user.userbtn();
		LoggerLoad.info("....................Clicked user link....................");
	}

	@Then("Admin should see the Manage User in the URL")
	public void admin_should_see_the_manage_user_in_the_url() {
		boolean isManageuserDisplayed = user.isManageuserDisplayed();
        Assert.assertTrue(isManageuserDisplayed);
        LoggerLoad.info("....................Validated the URL for manage user....................");
	}
	
	//@Userpagevalidation2
	@Then("Admin should see a heading with text Manage user on the page")
	public void admin_should_see_a_heading_with_text_manage_user_on_the_page() {
		boolean isManageuserDisplayed = user.isManageuserDisplayed();
        Assert.assertTrue(isManageuserDisplayed);
		LoggerLoad.info("....................Validated the heading manage user....................");
	}
	
	
		//@Userpagevalidation3
	@Then("Admin should see the text as Showing x to y of z entries along with Pagination icon below the table.x- starting record number on that page y-ending record number on that page z-Total number of records")
	public void admin_should_see_the_text_as_showing_x_to_y_of_z_entries_along_with_pagination_icon_below_the_table_x_starting_record_number_on_that_page_y_ending_record_number_on_that_page_z_total_number_of_records() {
		boolean pagination = user.pagination();
        Assert.assertTrue(pagination);
        LoggerLoad.info("....................Validated the entries on user page....................");
	}

	//@Userpagevalidation4
	@Then("Admin Should see the data table with column names Id, Name, location, Phone Number, Edit\\/Delete")
	public void admin_should_see_the_data_table_with_column_names_id_name_location_phone_number_edit_delete() {
		boolean datatable = user.datatable();
        Assert.assertTrue(datatable);
        LoggerLoad.info("....................Validated the data table in user page....................");
	}
	//@Userpagevalidation5
	@Then("Admin should see a Delete button on the top left hand side as Disabled")
	public void admin_should_see_a_delete_button_on_the_top_left_hand_side_as_disabled() {
		user.delbtn();
		LoggerLoad.info("....................Validated the disabled delete button on user page....................");
	}
	//@Userpagevalidation6
	@Then("Admin should be able to see the A New User button above the data table")
	public void admin_should_be_able_to_see_the_a_new_user_button_above_the_data_table() {
		boolean addnewuserbtn = user.addnewuserbtn();
        Assert.assertTrue(addnewuserbtn);
        LoggerLoad.info("....................Validated the new user button on user page....................");
	}
	//@Userpagevalidation7
	@Then("Admin should be able to see the  Assign staff button above the data table")
	public void admin_should_be_able_to_see_the_assign_staff_button_above_the_data_table() {
		boolean assignstaffbtn = user.assignstaffbtn();
        Assert.assertTrue(assignstaffbtn);
        LoggerLoad.info("....................Validated the assign staff button on user page....................");
	}
}
