package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.*;
import utilities.LoggerLoad;


public class DashboardSD{
	
	dashboardpom Dashboard= new dashboardpom();
	
	@Given("LMS application https")
	public void lms_application_https() {
		LoggerLoad.info("....................Launched the browser....................");
	 		Dashboard.launchUrl();
	 		
	}

	@When("Valid credentials are given to login")
	public void valid_credentials_are_given_to_login() {
		LoggerLoad.info("....................Enter valid credentials....................");
		Dashboard.username();
		Dashboard.enterPassword();
		Dashboard.clickLogin();
	}

	@And("admin logins in successfully and lands in Dashboard page")
	public void admin_logins_in_successfully() throws InterruptedException {
		Thread.sleep(3000);
		LoggerLoad.info("....................Checked heading....................");
		Dashboard.dashboardPageValidation();

	}

	@Then("admin should see manage program as header")
	public void admin_should_see_manage_program_as_header() {
		LoggerLoad.info("....................Checked heading....................");
	   Dashboard.managebatchvalidation();
	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {
		LoggerLoad.info("....................checked if link is broken....................");
	   Dashboard.brokenlink();
	}

	@Then("admin should see LMS -Learning management system as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
		LoggerLoad.info("....................Checked heading....................");
	   Dashboard.validateLMS();
	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {
		LoggerLoad.info("....................Position of the header....................");
	   Dashboard.lmsquadinants();
	}

	@Then("admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
		LoggerLoad.info("....................Checked correct spellings....................");
	   Dashboard.CheckSpellings();
	}

	@Then("admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
		LoggerLoad.info("....................Checked correct spellings....................");
		Dashboard.validateLMS();
	}

	@Then("admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
		LoggerLoad.info("....................Position of the navigation bar....................");
	   Dashboard.navigationquadinants();
	}

	@Then("admin should see program in the 1st place")
	public void admin_should_see_program_in_the_1st_place() {
		LoggerLoad.info("....................Checked string in first textbox....................");
	   Dashboard.validateProgram();
	}

	@Then("admin should see batch in the 2nd place")
	public void admin_should_see_batch_in_the_2nd_place() {
		LoggerLoad.info("....................Checked string in second textbox....................");
	   Dashboard.validateBatch();
	}

	@Then("admin should see user in the 3rd place")
	public void admin_should_see_user_in_the_3rd_place() {
		LoggerLoad.info("....................Checked string in third textbox....................");
	   Dashboard.validateUser();
	}

	@Then("admin should see logout in the 4th place")
	public void admin_should_see_logout_in_the_4th_place() {
		LoggerLoad.info("....................Checked string in fourth textbox....................");
	   Dashboard.logoutvalidate();
	}
	
	 @When ("Admin click Logout button on navigation bar")
	 public void Admin_click_Logout_button_on_navigation_bar() {
		 LoggerLoad.info("....................Clicklog out....................");
	 Dashboard.clicklogout();
	 }
	@Then("admin should land on login in page")
	public void admin_should_land_on_login_in_page() {
		LoggerLoad.info("....................Click log in....................");
	    Dashboard.loginvalidate();
	}



	
}