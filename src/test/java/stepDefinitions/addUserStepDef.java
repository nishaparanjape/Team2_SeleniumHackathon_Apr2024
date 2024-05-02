package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.*;
import utilities.ConfigReader;
import utilities.DriverBase;
import utilities.LoggerLoad;

public class addUserStepDef {
	
	
	adduserpom adduserpage;
	public static ConfigReader reader = new ConfigReader();
	public static DriverBase driverBase = new DriverBase();
	public static WebDriver driver = driverBase.getDriver();
	
	public addUserStepDef() {
		
		adduserpage = new adduserpom(driver);
		
	}
	
	//@AddUser1
	 @Given("Admin is on Manage User Page-kk")
	public void admin_is_on_manage_user_page_kk() {
		boolean isManageuserDisplayed = adduserpage.isManageuserDisplayed();
        Assert.assertTrue(isManageuserDisplayed);
        LoggerLoad.info("....................Page is on Manage User....................");
	}

	@When("Admin clicks A New User button-kk")
	public void admin_clicks_a_new_user_button_kk() {
		adduserpage.addnewuserbtn();
		LoggerLoad.info("...............Admin clicks the new user button.........................");
	}

	@Then("Admin should see pop up open for user details with First Name Middle name Last Name Location phone email  linkedin url User Role Role status visa Undergraduate postgraduate time zone user comments and user fields along with Cancel Submit and close buttons")
	public void admin_should_see_pop_up_open_for_user_details_with_first_name_middle_name_last_name_location_phone_email_linkedin_url_user_role_role_status_visa_undergraduate_postgraduate_time_zone_user_comments_and_user_fields_along_with_cancel_submit_and_close_buttons() {
		//labels
		Assert.assertTrue(adduserpage.valFirstName());
		Assert.assertTrue(adduserpage.valLastName());
		Assert.assertTrue(adduserpage.valMiddleName());
		Assert.assertTrue(adduserpage.valLocationName());
		Assert.assertTrue(adduserpage.valPhoneNum());
		Assert.assertTrue(adduserpage.valLinkedIn());
		Assert.assertTrue(adduserpage.valUserRole());
		Assert.assertTrue(adduserpage.valUserRoleStatus());
		Assert.assertTrue(adduserpage.valVisaStatus());
		Assert.assertTrue(adduserpage.valEmail());
		Assert.assertTrue(adduserpage.valPostGrad());
		Assert.assertTrue(adduserpage.valUnderGrad());
		Assert.assertTrue(adduserpage.valTimeZone());
		Assert.assertTrue(adduserpage.valUserComm());
		
		//buttons
		Assert.assertTrue(adduserpage.valCancel());
		Assert.assertTrue(adduserpage.valClose());
		Assert.assertTrue(adduserpage.valsubmit());
		adduserpage.closeAddUserPopup();
		
		LoggerLoad.info("....................user details pop up page....................");
		
		
	}
	//@AddUser2
	@Then("Admin should see  text boxes for the fields First Name, Middle name, Last Name, Location, phone, email, linkedin url, Undergraduate, postgraduate,time zone ,user comments")
	public void admin_should_see_text_boxes_for_the_fields_first_name_middle_name_last_name_location_phone_email_linkedin_url_undergraduate_postgraduate_time_zone_user_comments() {
		Assert.assertTrue(adduserpage.valFirstNametext());
		Assert.assertTrue(adduserpage.valMiddleNametext());
		Assert.assertTrue(adduserpage.valLastNametext());
		Assert.assertTrue(adduserpage.valLocationNametext());
		Assert.assertTrue(adduserpage.valPhoneNumtext());
		Assert.assertTrue(adduserpage.valLinkedIntext());
		
		Assert.assertTrue(adduserpage.valEmailtext());
		Assert.assertTrue(adduserpage.valUnderGradtext());
		Assert.assertTrue(adduserpage.valPostGradtext());
		Assert.assertTrue(adduserpage.valTimeZone());
		Assert.assertTrue(adduserpage.valUserComm());
		adduserpage.closeAddUserPopup();
		LoggerLoad.info("....................Admin see all the required fields...................");
	}
	//@AddUser3
	@Then("Admin should see drop downs for the fields User Role, Role status, visa status on user details pop up")
	public void admin_should_see_drop_downs_for_the_fields_user_role_role_status_visa_status_on_user_details_pop_up() {
		Assert.assertTrue(adduserpage.valUserRoledd());
		Assert.assertTrue(adduserpage.valUserRoleStatusdd());
		Assert.assertTrue(adduserpage.valVisaStatusdd());
		adduserpage.closeAddUserPopup();
		LoggerLoad.info("....................Admin see all the required fields...................");
		
	}
	//@AddUser4
	@Given("Admin is on  User details pop up-kk")
	public void admin_is_on_user_details_pop_up_kk() {
		adduserpage.addnewuserbtn();
		LoggerLoad.info("....................user details pop up page....................");

		
	}

	@When("Admin enters mandatory fields in the form and clicks on submit button")
	public void admin_enters_mandatory_fields_in_the_form_and_clicks_on_submit_button() throws InterruptedException {
		adduserpage.enterFirstName();
		//adduserpage.enterMiddleName();
		adduserpage.enterLastName();
		adduserpage.enterLocation();
		adduserpage.enterPhone();
		//adduserpage.enterLinkedln();
		
		
		
		adduserpage.selectuserrole();
		adduserpage.selectuserrolestatus();
		adduserpage.selectvisastatus();
		//adduserpage.enterEmail();
		//adduserpage.enterUG();
		//adduserpage.enterPG();
		//adduserpage.enterTimezone();
		//adduserpage.enterUsercomm();
		adduserpage.clicksubmit();
		adduserpage.closeAddUserPopup();
		LoggerLoad.info("....................Admin see all the required fields...................");
		
	}

	@Then("Admin gets message User added Successfully")
	public void admin_gets_message_user_added_successfully() {
		adduserpage.usercreatedsuccess();
		//Assert.assertTrue(adduserpage.usercreatedsuccess());
		LoggerLoad.info("....................successfully created...................");
	}
	
	//@AddUser5
	@When("Admin skips to add value in mandatory field")
	public void admin_skips_to_add_value_in_mandatory_field() {
		adduserpage.enterMiddleName();
		adduserpage.enterLinkedln();
		
		adduserpage.enterEmail();
		adduserpage.enterUG();
		adduserpage.enterPG();
		adduserpage.enterTimezone();
		adduserpage.enterUsercomm();
		adduserpage.clicksubmit();
		LoggerLoad.info("....................Admin see all the required fields...................");
		
	}
	@Then("Admin should see error message below the test field and the field will be highlighed in red color")
	public void admin_should_see_error_message_below_the_test_field_and_the_field_will_be_highlighed_in_red_color() {
		Assert.assertTrue(adduserpage.enterFirstNameredtext());
		Assert.assertTrue(adduserpage.enterLastNameredtext());
		Assert.assertTrue(adduserpage.enterLocationredtext());
		Assert.assertTrue(adduserpage.enterPhoneredtext());
		adduserpage.closeAddUserPopup();
		LoggerLoad.info("....................Admin see the highlighted area...................");
		
		
	}
   // @AddUser6

	@When("Admin enters invalid data in all of the  fields in the form and clicks on submit button")
	public void admin_enters_invalid_data_in_all_of_the_fields_in_the_form_and_clicks_on_submit_button() {
		adduserpage.enterFirstName();
		adduserpage.enterMiddleName();
		adduserpage.enterLastName();
		adduserpage.enterLocation();
		adduserpage.enterPhone();		
		adduserpage.enterLinkedln();
		
		adduserpage.enterEmail();
		adduserpage.enterUG();
		adduserpage.enterPG();
		adduserpage.enterTimezone();
		adduserpage.enterUsercomm();		
		
		adduserpage.selectuserrole();
		adduserpage.selectuserrolestatus();
		adduserpage.selectvisastatus();
		
		adduserpage.clicksubmit();
		LoggerLoad.info("....................Admin see all the required fields...................");
	}

	@Then("Admin gets error message and user is not created")
	public void admin_gets_error_message_and_user_is_not_created() {
		adduserpage.failedstatus();
		LoggerLoad.info("....................user is not created...................");
		
		//Assert.assertTrue(adduserpage.failedstatus());
	}
	//@AddUser7
	@When("Admin clicks on submit button without entering data")
	public void admin_clicks_on_submit_button_without_entering_data() {
		adduserpage.clicksubmit();
		//adduserpage.failedstatus();
		LoggerLoad.info("....................Admin clicks the submit button...................");
		
		
		
	}

	@Then("user won't be created and Admin gets error message")
	public void user_won_t_be_created_and_admin_gets_error_message() {
//		Assert.assertTrue(adduserpage.enterFirstNameredtext());
//		Assert.assertTrue(adduserpage.enterLastNameredtext());
//		Assert.assertTrue(adduserpage.enterLocationredtext());
//		Assert.assertTrue(adduserpage.enterPhoneredtext());
		adduserpage.closeAddUserPopup();
		LoggerLoad.info("....................Admin see error message..................");
	}
	//@AddUser8
	@When("Admin clicks Cancel CloseX Icon on User Details form")
	public void admin_clicks_cancel_close_x_icon_on_user_details_form() {
		adduserpage.closeAddUserPopup();
		LoggerLoad.info("....................Admin clicks the close button...................");
	}

	@Then("User Details popup window should be closed without saving")
	public void user_details_popup_window_should_be_closed_without_saving() {
		boolean isManageuserDisplayed = adduserpage.isManageuserDisplayed();
        Assert.assertTrue(isManageuserDisplayed);
        LoggerLoad.info("....................Page is on Manage User...................");
	}
	//@AddUser9
	@When("Admin clicks Cancel button-kk")
	public void admin_clicks_cancel_button_kk() throws InterruptedException {
	    adduserpage.clickCancel();
	    Thread.sleep(10000);
	    LoggerLoad.info("....................Admin clicks the cancel button...................");
	}

	@Then("Admin can see the User details popup disappears without adding any user")
	public void admin_can_see_the_user_details_popup_disappears_without_adding_any_user() {
		boolean isManageuserDisplayed = adduserpage.isManageuserDisplayed();
        Assert.assertTrue(isManageuserDisplayed);
        LoggerLoad.info("....................Page is on Manage User...................");
	}
	// @AddUser10
	@When("Fill in all the fields with valid values and click submit")
	public void fill_in_all_the_fields_with_valid_values_and_click_submit() {
		adduserpage.enterFirstName();
		adduserpage.enterMiddleName();
		adduserpage.enterLastName();
		adduserpage.enterLocation();
		adduserpage.enterPhone();		
		adduserpage.enterLinkedln();
		
		adduserpage.enterEmail();
		adduserpage.enterUG();
		adduserpage.enterPG();
		adduserpage.enterTimezone();
		adduserpage.enterUsercomm();		
		
		adduserpage.selectuserrole();
		adduserpage.selectuserrolestatus();
		adduserpage.selectvisastatus();
		
		adduserpage.clicksubmit();
		//adduserpage.closeAddUserPopup();
		LoggerLoad.info("....................Admin see all the required fields...................");
	}

	@Then("The newly added user should be present in the data table in Manage User page")
	public void the_newly_added_user_should_be_present_in_the_data_table_in_manage_user_page() throws InterruptedException {
		adduserpage.closeAddUserPopup();
		boolean isManageuserDisplayed = adduserpage.isManageuserDisplayed();
        Assert.assertTrue(isManageuserDisplayed);
        LoggerLoad.info("....................Page is on Manage User..................");
        adduserpage.clickProgramLink();
        Thread.sleep(2000);
	}

}
