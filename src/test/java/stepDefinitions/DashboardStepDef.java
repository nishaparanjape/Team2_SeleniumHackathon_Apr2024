package stepDefinitions;

import java.io.IOException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.*;


public class DashboardStepDef{
	
	DashboardPage Dashboard= new DashboardPage();
	
	@Given("LMS application https")
	public void lms_application_https() throws IOException {	 
		Dashboard.launchUrl();
	}

	@When("Valid credentials are given to login")
	public void valid_credentials_are_given_to_login() {
		Dashboard.enterUserName();
		Dashboard.enterPassword();
		Dashboard.clickLogin();
	}

	@And("admin logins in successfully and lands in Dashboard page")
	public void admin_logins_in_successfully() throws InterruptedException {
		Thread.sleep(3000);
		Dashboard.dashboardPageValidation();
	}
	

	@Then("admin should see manage program as header")
	public void admin_should_see_manage_program_as_header() {
	   Dashboard.managebatchvalidation();
	}

	@Then("HTTP response >= {int}. Then the link is broken")
	public void http_response_then_the_link_is_broken(Integer int1) {
	   Dashboard.brokenlink();
	}

	@Then("admin should see LMS -Learning management system as title")
	public void admin_should_see_lms_learning_management_system_as_title() {
	   Dashboard.validateLMS();
	}

	@Then("LMS title should be on the top left corner of page")
	public void lms_title_should_be_on_the_top_left_corner_of_page() {
	   Dashboard.lmsquadinants();
	}

	@Then("admin should see correct spelling in navigation bar text")
	public void admin_should_see_correct_spelling_in_navigation_bar_text() {
	   Dashboard.CheckSpellings();
	}

	@Then("admin should see correct spelling and space in LMS title")
	public void admin_should_see_correct_spelling_and_space_in_lms_title() {
		Dashboard.validateLMS();
	}

	@Then("admin should see the navigation bar text on the top right side")
	public void admin_should_see_the_navigation_bar_text_on_the_top_right_side() {
	   Dashboard.navigationquadinants();
	}

	@Then("admin should see program in the 1st place")
	public void admin_should_see_program_in_the_1st_place() {
	   Dashboard.validateProgram();
	}

	@Then("admin should see batch in the 2nd place")
	public void admin_should_see_batch_in_the_2nd_place() {
	   Dashboard.validateBatch();
	}

	@Then("admin should see user in the 3rd place")
	public void admin_should_see_user_in_the_3rd_place() {
	   Dashboard.validateUser();
	}

	@Then("admin should see logout in the 4th place")
	public void admin_should_see_logout_in_the_4th_place() {
	   Dashboard.logoutvalidate();
	}
	
	 @When ("Admin click Logout button on navigation bar")
	 public void Admin_click_Logout_button_on_navigation_bar() {
	 Dashboard.clicklogout();
	 }
	@Then("admin should land on login in page")
	public void admin_should_land_on_login_in_page() {
	    Dashboard.loginvalidate();
	}
}
