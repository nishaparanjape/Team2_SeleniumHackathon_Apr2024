package stepDefinitions;

import org.testng.Assert;
import hooks.hooks;
import io.cucumber.java.en.*;
import net.sourceforge.tess4j.TesseractException;
import pageObjectModel.LoginPage;

public class LoginStepDef {
	LoginPage login = new LoginPage();
	
	@Given("Admin launch the browser")
	public void admin_launch_the_browser() {
	  //   
	}

	@When("Admin gives the correct LMS portal URL")
	public void admin_gives_the_correct_lms_portal_url() {
		//LoginPage.GiveCorrectURL();
		login.launchUrl();
	}

	@Then("Admin should land on the home page")
	public void admin_should_land_on_the_home_page() {
		login.CheckForHomePage();
	}

	@When("Admin gives the invalid LMS portal URL")
	public void admin_gives_the_invalid_lms_portal_url() {
		login.launchInvalidUrl();
	}

	@Then("Admin should receive {int} page not found error")
	public void admin_should_receive_page_not_found_error(Integer int1) {
		//int actualRespCode = LoginPage.getHTTPResponseCode();
//        Assert.assertEquals(actualRespCode, (int) expectRespCode, "Response code do not match");
		//Assert.assertEquals("page not found", actual);
		Assert.assertTrue(hooks.driver.getTitle().contains("Server Not Found"));

//		try {
//				List<WebElement> links = hooks.driver.findElements(By.tagName("a"));
//	        //get URL of links with getAttribute()
//				for (WebElement link : links) {
//					String url = link.getAttribute("href");
//					URL link1 = new URL(url);
//			        HttpURLConnection c = (HttpURLConnection)link1.openConnection();
//			        //have timeout
//			        c.setConnectTimeout(1000);
//			        // connection began
//			        c.connect();
//			        //getResponseCode() to obtain response code
//			        if(c.getResponseCode()== 200) {
//			           System.out.println(url+" − "+ c.getResponseMessage());
//					   Assert.assertEquals(c.getResponseCode(), 200);
//			        }
//			        if(c.getResponseCode()== int1) {
//					   System.out.println(url+" − "+c.getResponseMessage());
//					   Assert.assertEquals(c.getResponseCode(), 404);
//					}
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	

	@When("Admin gives the correct LMS portal URL	HTTP response >= {int}")
	public void admin_gives_the_correct_lms_portal_url_http_response(Integer int1) {
	    
	}

	@Then("the link is broken")
	public void the_link_is_broken() {
		
	}

	@Then("Admin should see correct spellings in all fields")
	public void admin_should_see_correct_spellings_in_all_fields() {
		login.CheckSpellings();
	}

	@Then("Admin should see logo on the left side")
	public void admin_should_see_logo_on_the_left_side() {
	    login.CheckLogo();
	}

	@Then("Admin should see LMS - Learning Management System")
	public void admin_should_see_lms_learning_management_system() throws TesseractException {
	    login.CheckHeading();
	}

	@Then("Admin should see company name below the app name")
	public void admin_should_see_company_name_below_the_app_name() throws TesseractException {
	    login.CheckCompanyName();
	}

	@Then("Admin should see {string}")
	public void admin_should_see(String string) {
	    login.CheckParaContent();
	}

	@Then("Admin should see two text field")
	public void admin_should_see_two_text_field() {
	    login.VerifyTwoTextFields();
	}

	@Then("Admin should see {string} in the first text field")
	public void admin_should_in_the_first_text_field(String string) {
	    login.VerifyUserTextBox(string);
	}

	@Then("Admin should see * symbol next to user text")
	public void admin_should_see_symbol_next_to_user_text() {
	    login.VerifyStarWithUserTextBox();
	}

	@Then("Admin should see {string} in the second text field")
	public void admin_should_in_the_second_text_field(String string) {
	    login.VerifyPasswordTextBox(string);
	}

	@Then("Admin should see * symbol next to password text")
	public void admin_should_see_symbol_next_to_password_text() {
	    login.VerifyStarWithPasswordTextBox();
	}

	@Then("Admin should see input field on the centre of the page")
	public void admin_should_see_input_field_on_the_centre_of_the_page() {
	    login.CheckFieldInCenter();
	}

	@Then("Admin should see login button")
	public void admin_should_see_login_button() {
		login.CheckForLoginButton();
	}

	@Then("Admin should see login button on the centre of the page")
	public void admin_should_see_login_button_on_the_centre_of_the_page() {
	    login.CheckLoginBtnInCenter();
	}

	@Then("Admin should see user in gray color")
	public void admin_should_see_user_in_gray_color() {
	    login.CheckUserFontColor();
	}

	@Then("Admin should see password in gray color")
	public void admin_should_see_password_in_gray_color() {
	    login.CheckPasswordFontColor();	    
	}

	@When("Admin is in Home Page")
	public void admin_is_in_home_page() {
		login.CheckForHomePage();
	}

	@When("Admin enter valid credentials and clicks login button")
	public void admin_enter_valid_credentials_and_clicks_login_button() {
	    login.enterUserName();
	    login.enterPassword();
	    login.clickLogin();
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
	    login.ValiadateDashboardPage();
	}

	@When("Admin enter invalid credentials and clicks login button")
	public void admin_enter_invalid_credentials_and_clicks_login_button() {
	    login.enterUserName("invalid");
	    login.enterPassword("invalid");
	    login.clickLogin();
	}

	@Then("Error message please check username\\/password")
	public void error_message_please_check_username_password() {
		login.CheckErrorMessage();
	}

	@When("Admin enter value only in password and clicks login button")
	public void admin_enter_value_only_in_password_and_clicks_login_button() {
		//login.enterUserName("");
	    login.enterPassword("invalid");
	    login.clickLogin();
	}

	@When("Admin enter value only in username and clicks login button")
	public void admin_enter_value_only_in_username_and_clicks_login_button() {
		login.enterUserName("invalid");
	    //login.enterPassword("");
	    login.clickLogin();
	}

	@When("Admin enter valid credentials and clicks login button through keyboard")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_keyboard() {
		login.enterUserName();
	    login.enterPassword();
	    login.clickLogin("k");
	}

	@When("Admin enter valid credentials and clicks login button through mouse")
	public void admin_enter_valid_credentials_and_clicks_login_button_through_mouse() {
		login.enterUserName();
	    login.enterPassword();
	    login.clickLogin();
	}
}
