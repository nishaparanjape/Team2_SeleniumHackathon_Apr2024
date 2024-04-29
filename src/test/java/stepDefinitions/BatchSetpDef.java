package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.*;
import utilities.LoggerLoad;

public class BatchSetpDef {
	LoginPage login = new LoginPage();
	BatchPage batch = new BatchPage();

	@Given("The Admin logs in the portal")
	public void the_admin_logs_in_the_portal() throws IOException {
		login.launchUrl();
		login.enterUserName();
		login.enterPassword();
		login.clickLogin();
		LoggerLoad.info("....................Logged in ....................");
	}

	@Given("Admin is on dashboard page after Login")
	public void admin_is_on_dashboard_page_after_login() throws IOException {
		login.ValiadateDashboardPage();
		LoggerLoad.info("....................Validated the dashboard....................");
	}

	@When("clicks on {string} from navigation bar")
	public void clicks_on_from_navigation_bar(String string) {
		batch.clickBatch();
		LoggerLoad.info("....................Batch link clicked....................");
	}

	@Then("Admin should see the {string} in the URL")
	public void admin_should_see_the_in_the_url(String string) {
		batch.batchUrlValidation(string);
		LoggerLoad.info("....................Validated the URL....................");
	}

	@Then("Admin should see the {string} in the header")
	public void admin_should_see_the_in_the_header(String string) {
		batch.headerValidation(string);
		LoggerLoad.info("....................Validated the header....................");
	}

	@Then("Admin should see the pagination controls under the data table")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {
		batch.paginationValidation();
		LoggerLoad.info("....................Validated pagination controls....................");
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, Edit, Delete")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {
		batch.webtableHeaderValidation();
		LoggerLoad.info("....................Validated the data table with headers....................");
	}

	@Then("Admin should be able to see the {string} icon button that is disabled")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {
		batch.deleteDisabledValidation();
		LoggerLoad.info("....................Validated the disabled delete icon....................");
	}

	@Then("Admin should be able to see the {string} button")
	public void admin_should_be_able_to_see_the_button(String string) {
		batch.newBatchButtonDisplayed();
		LoggerLoad.info("....................Validated the New Batch button....................");
	}

	@Then("Each row in the data table should have a checkbox")
	public void each_row_in_the_data_table_should_have_a_checkbox() {
		batch.rowCheckboxDisplayed();
		LoggerLoad.info("....................Validated the checkbox....................");
	}

	@Then("Each row in the data table should have a edit icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {
		batch.rowEditIconEnabled();
		LoggerLoad.info("....................Validated the enabled edit icon in each row....................");
	}

	@Then("Each row in the data table should have a delete icon that is enabled")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {
		batch.rowDeleteIconEnabled();
		LoggerLoad.info("....................Validated the enabled delete icon in each row....................");
	}

	@When("Admin clicks {string} button")
	public void admin_clicks_button(String string) {
		batch.newBatchButtonClick();
		LoggerLoad.info("....................clicked new batch button....................");
	}

	@Then("A new pop up with Batch details appears")
	public void a_new_pop_up_with_batch_details_appears() {
		batch.popup();
		LoggerLoad.info("....................New popup window with batch details opened....................");
	}
	
	
	
	
	@When ("Any of the mandatory fields are blank")
	public void When_Any_of_the_mandatory_fields_are_blank() {
		batch.populateFields();
	}
	
	@Then("Error message should appear")
	public void Error_message_should_appear() {
		batch.ValidateErrorMsg();
	}
	
	@When ("click on save")
	public void click_on_save() {
		batch.saveBatch();
	}
	
	@When("add all fields")
	public void add_all_fields() throws InterruptedException {
		batch.addAllFields();
	}

	@Then ("it should update the table")
	public void it_should_update_the_table() throws InterruptedException {
		batch.updateTheTable();
	}
	
}