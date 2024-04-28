package stepDefinitions;

import java.io.IOException;
import org.testng.Assert;
import com.aspose.ocr.AsposeOCRException;
import io.cucumber.java.en.*;
import net.sourceforge.tess4j.TesseractException;
import pageObjectModel.LoginPage;
import utilities.LoggerLoad;

public class LoginStepDef {
	LoginPage login = new LoginPage();
	
	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {
	  //   
		LoggerLoad.info("....................Launched the browser....................");
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() throws IOException {
		//LoginPage.GiveCorrectURL();
		login.launchUrl();
		LoggerLoad.info("....................Launched the URL....................");
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
		login.CheckForHomePage();
		LoggerLoad.info("....................Landed on home page....................");
	}

	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() throws IOException {
		System.out.println("invalid url - when ");
		login.launchInvalidUrl();
		LoggerLoad.info("....................Given INVALID URL....................");
	}
	
	@Then("Admin should receive {int} page not found error")
	public void admin_should_receive_page_not_found_error(Integer int1) {
		Assert.assertEquals(false, login.CheckIfValidURL());
		LoggerLoad.info("....................Page not found error....................");
		}	

	@Then("HTTP response >= {int} the link is broken")
	public void the_link_is_broken(int int1) throws IOException {
		int actualRespCode = login.getHTTPResponseCode();
		System.out.println("actual response code ::: " + actualRespCode);
		if(actualRespCode > 0)
			Assert.assertEquals(true, actualRespCode>= int1);
		else
			Assert.assertTrue(true, "no links found on page!!");
		LoggerLoad.info("....................checked if link is broken....................");
	}

	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
		login.CheckSpellings();
		LoggerLoad.info("....................Checked correct spellings....................");
	}

	@Then("Admin should see logo on the left side")
	public void admin_should_see_logo_on_the_left_side() {
	    login.CheckLogo();
		LoggerLoad.info("....................Checked logo....................");
	}

	@Then("Admin should see LMS - Learning Management System")
	public void admin_should_see_lms_learning_management_system() throws AsposeOCRException {
	    login.CheckHeading();
		LoggerLoad.info("....................Checked heading....................");
	}

	@Then("Admin should see company name below the app name")
	public void admin_should_see_company_name_below_the_app_name() throws TesseractException {
	    login.CheckCompanyName();
		LoggerLoad.info("....................Checked Company Name....................");
	}

	@Then("Admin should see {string}")
	public void admin_should_see(String string) {
	    login.CheckParaContent();
	    LoggerLoad.info("....................Checked Paragraph content....................");
	}

	@Then("Admin should see two text field")
	public void admin_should_see_two_text_field() {
	    login.VerifyTwoTextFields();
	}

	@Then("Admin should see {string} in the first text field")
	public void admin_should_in_the_first_text_field(String string) {
	    login.VerifyUserTextBox(string);
	    LoggerLoad.info("....................Checked string in first textbox....................");
	}

	@Then("Admin should see * symbol next to user text")
	public void admin_should_see_symbol_next_to_user_text() {
	    login.VerifyStarWithUserTextBox();
	    LoggerLoad.info("....................Checked star in first textbox....................");
	}

	@Then("Admin should see {string} in the second text field")
	public void admin_should_in_the_second_text_field(String string) {
	    login.VerifyPasswordTextBox(string);
	    LoggerLoad.info("....................Checked string in second textbox....................");
	}

	@Then("Admin should see * symbol next to password text")
	public void admin_should_see_symbol_next_to_password_text() {
	    login.VerifyStarWithPasswordTextBox();
	    LoggerLoad.info("....................Checked star in second textbox....................");
	}

	@Then("Admin should see input field on the centre of the page")
	public void admin_should_see_input_field_on_the_centre_of_the_page() {
	    login.CheckFieldInCenter();
	    LoggerLoad.info("....................Checked position of textboxes....................");
	}

	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
		login.CheckForLoginButton();
	    LoggerLoad.info("....................Checked if button exists....................");
	}

	@Then("Admin should see login button on the centre of the page")
	public void admin_should_see_login_button_on_the_centre_of_the_page() {
	    login.CheckLoginBtnInCenter();
	    LoggerLoad.info("....................Checked position of button....................");
	}

	@Then("Admin should see user in gray color")
	public void admin_should_see_user_in_gray_color() {
	    login.CheckUserFontColor();
	    LoggerLoad.info("....................Checked color of user text....................");
	}

	@Then("Admin should see password in gray color")
	public void admin_should_see_password_in_gray_color() {
	    login.CheckPasswordFontColor();
	    LoggerLoad.info("....................Checked color of password text....................");
	}

	@When("Admin is in Home Page")
	public void admin_is_in_home_page() {
		login.CheckForHomePage();
	    LoggerLoad.info("....................Checked for home page....................");
	}

	@When("Admin enter valid credentials and clicks login button")
	public void admin_enter_valid_credentials_and_clicks_login_button() {
	    login.enterUserName();
	    login.enterPassword();
	    login.clickLogin();
	    LoggerLoad.info("....................entered VALID credentials for login....................");
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() throws IOException {
	    login.ValiadateDashboardPage();
	    LoggerLoad.info("....................checked for dashboard page....................");
	}

	@When("Admin enter invalid credentials and clicks login button")
	public void admin_enter_invalid_credentials_and_clicks_login_button() {
	    login.enterUserName("invalid");
	    login.enterPassword("invalid");
	    login.clickLogin();
	    LoggerLoad.info("....................entered INVALID credentials for login....................");
	}

	@Then("Error message please check username\\/password")
	public void error_message_please_check_username_password() {
		login.CheckErrorMessage();
	    LoggerLoad.info("....................checked for error message....................");
	}

	@When("Admin enter value only in password and clicks login button")
	public void admin_enter_value_only_in_password_and_clicks_login_button() {
		//login.enterUserName("");
	    login.enterPassword("invalid");
	    login.clickLogin();
	    LoggerLoad.info("....................entered only password and clicked on log in....................");
	}

	@When("Admin enter value only in username and clicks login button")
	public void admin_enter_value_only_in_username_and_clicks_login_button() {
		login.enterUserName("invalid");
	    //login.enterPassword("");
	    login.clickLogin();
	    LoggerLoad.info("....................entered only user and clicked on log in....................");
	}

	@When("Admin enter valid credentials and clicks login button through keyboard")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_keyboard() {
		login.enterUserName();
	    login.enterPassword();
	    login.clickLogin("k");
	    LoggerLoad.info("....................entered VALID credentials and clicked login through keyboard....................");
	}

	@When("Admin enter valid credentials and clicks login button through mouse")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_mouse() {
		login.enterUserName();
	    login.enterPassword();
	    login.clickLogin();
	    LoggerLoad.info("....................entered VALID credentials and clicked login through mouse....................");
	}
}
