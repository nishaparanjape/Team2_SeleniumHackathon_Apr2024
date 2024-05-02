package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.*;
import utilities.LoggerLoad;

public class Batch_StepDefinitions {

	LoginPage login = new LoginPage();
	Batch_PageObjects pageObjects = new Batch_PageObjects();

	@Given("The Admin logs in the portal st")
	public void the_admin_logs_in_the_portal() throws IOException {

		login.launchUrl();
		login.enterUserName();
		login.enterPassword();
		login.clickLogin();

		LoggerLoad.info("The Admin logs in the portal");
	}

	@Given("Admin is on dashboard page after Login st")
	public void admin_is_on_dashboard_page_after_login() throws IOException {

		login.ValiadateDashboardPage();
		LoggerLoad.info("Admin is on dashboard page after Login");
	}

	@When("clicks on {string} from navigation bar st")
	public void clicks_on_from_navigation_bar(String string) {

		pageObjects.clickBatch();
		LoggerLoad.info("clicks on batch from navigation bar");
	}

	@Then("Admin should see the {string} in the URL st")
	public void admin_should_see_the_in_the_url(String string) {

		pageObjects.batchUrlValidation(string);
		LoggerLoad.error("Admin should see the Manage Batch in the URL");
	}

	@Then("Admin should see the {string} in the header st")
	public void admin_should_see_the_in_the_header(String string) {

		pageObjects.headerValidation(string);
		LoggerLoad.info("Admin should see the Manage Batch in the header");
	}

	@Then("Admin should see the pagination controls under the data table st")
	public void admin_should_see_the_pagination_controls_under_the_data_table() {

		pageObjects.paginationValidation();
		LoggerLoad.info("Admin should see the pagination controls under the data table");
	}

	@Then("Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, Edit, Delete st")
	public void admin_should_see_the_data_table_with_headers_batch_name_batch_description_batch_status_no_of_classes_program_name_edit_delete() {

		pageObjects.webtableHeaderValidation();
		LoggerLoad.info(
				"Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, Edit, Delete");
	}

	@Then("Admin should be able to see the {string} icon button that is disabled st")
	public void admin_should_be_able_to_see_the_icon_button_that_is_disabled(String string) {

		pageObjects.deleteDisabledValidation();
		LoggerLoad.info("Admin should be able to see the delete icon button that is disabled");
	}

	@Then("Admin should be able to see the {string} button st")
	public void admin_should_be_able_to_see_the_button(String string) {

		pageObjects.newBatchButtonDisplayed();
		LoggerLoad.info("Admin should be able to see the + A New batch button");
	}

	@Then("Each row in the data table should have a checkbox st")
	public void each_row_in_the_data_table_should_have_a_checkbox() {

		pageObjects.rowCheckboxDisplayed();
		LoggerLoad.info("Each row in the data table should have a checkbox");
	}

	@Then("Each row in the data table should have a edit icon that is enabled st")
	public void each_row_in_the_data_table_should_have_a_edit_icon_that_is_enabled() {

		pageObjects.rowEditIconEnabled();
		LoggerLoad.info("Each row in the data table should have a edit icon that is enabled");
	}

	@Then("Each row in the data table should have a delete icon that is enabled st")
	public void each_row_in_the_data_table_should_have_a_delete_icon_that_is_enabled() {

		pageObjects.rowDeleteIconEnabled();
		LoggerLoad.info("Each row in the data table should have a delete icon that is enabled");
	}
	
	
	@When("Admin clicks {string} button st")
	public void admin_clicks_button(String string) {

		pageObjects.newBatchButtonClick();
		LoggerLoad.info("Admin clicks + A New batch  button");
	}

	@Then("A new pop up with Batch details appears st")
	public void a_new_pop_up_with_batch_details_appears() {

		pageObjects.popup();
		LoggerLoad.info("A new pop up with Batch details appears");
	}


	// add batch
	
	
	
	@Then("The pop up should include the field- Name as text box st")
	public void the_pop_up_should_include_the_field_name_as_text_box() {

		pageObjects.nameTextbox();
		LoggerLoad.info("The pop up should include the field- Name as text box");
	}

	@Then("The pop up should include the field- Number of classes as text box st")
	public void the_pop_up_should_include_the_field_number_of_classes_as_text_box() {

		pageObjects.noOfClassesTextbox();
		LoggerLoad.info("The pop up should include the field- Number of classes as text box");
	}

	@Then("The pop up should include the field- Description as text box st")
	public void the_pop_up_should_include_the_field_description_as_text_box() {

		pageObjects.descriptionTextbox();
		LoggerLoad.info("The pop up should include the field- Description as text box");
	}

	@Then("The pop up should include the field- Program Name as drop down st")
	public void the_pop_up_should_include_the_field_program_name_as_drop_down() throws InterruptedException {

		pageObjects.programNameDropdown();
		LoggerLoad.info("The pop up should include the field- Program Name as drop down");
	}

	@Then("The pop up should include the field- Status as radio button st")
	public void the_pop_up_should_include_the_field_status_as_radio_button() {

		pageObjects.statusRadiobutton();
		LoggerLoad.info("The pop up should include the field- Status as radio button");
	}
//AddBatch16
	
	@When("Fill in all the fields except description with valid values and click save st")
	public void fill_in_all_the_fields_except_description_with_valid_values_and_click_save() {

		pageObjects.descriptionOptional();
		LoggerLoad.info("Fill in all the fields except description with valid values and click save");
	}

	@Then("The newly added batch should be present in the data table in Manage Batch page st")
	public void the_newly_added_batch_should_be_present_in_the_data_table_in_manage_batch_page()
			throws InterruptedException {

		pageObjects.isNewBatchAdded();
		LoggerLoad.info("The newly added batch should be present in the data table in Manage Batch page");
	}

	@When("Fill in all the fields with valid values and click save st")
	public void fill_in_all_the_fields_with_valid_values_and_click_save() throws InterruptedException {

		pageObjects.addNewBatchValid();
		LoggerLoad.info("Fill in all the fields with valid values and click save");

	}

	@When("Admin enters {string} for the {string} st")
	public void admin_enters_for_the(String string, String string2) {

		pageObjects.addNewBatchInvalid(string, string2);
		LoggerLoad.info("Admin enters invalid values for the field name");
	}

	@Then("Admin gets a Error message alert near the text field st")
	public void admin_gets_a_error_message_alert_near_the_text_field() {

		pageObjects.errTextField();
		LoggerLoad.info("Admin gets a Error message alert near the text field");
	}

	@When("Fill in all the fields with valid values but name as blank click save st")
	public void fill_in_all_the_fields_with_valid_values_but_name_as_blank_click_save() {

		pageObjects.blankName();
		LoggerLoad.info("Fill in all the fields with valid values but name as blank click save");
	}

	@Then("Admin gets a Error message alert near the name text field st")
	public void admin_gets_a_error_message_alert_near_the_name_text_field() {

		pageObjects.errBatchName();
		LoggerLoad.info("Admin gets a Error message alert near the name text field");
	}

	@When("Fill in all the fields with valid values but description as blank click save st")
	public void fill_in_all_the_fields_with_valid_values_but_description_as_blank_click_save() {

		pageObjects.blankDescription();
		LoggerLoad.info("Fill in all the fields with valid values but description as blank click save");
	}

	@Then("Admin gets a Error message alert near the description text field st")
	public void admin_gets_a_error_message_alert_near_the_description_text_field() {

		pageObjects.errDescription();
		LoggerLoad.info("Admin gets a Error message alert near the description text field");
	}

	@When("Fill in all the fields with valid values but program name as blank click save st")
	public void fill_in_all_the_fields_with_valid_values_but_program_name_as_blank_click_save() {

		pageObjects.blankProgName();
		LoggerLoad.info("Fill in all the fields with valid values but program name as blank click save");
	}

	@Then("Admin gets a Error message alert near the program name text field st")
	public void admin_gets_a_error_message_alert_near_the_program_name_text_field() {

		pageObjects.errProgName();
		LoggerLoad.info("Admin gets a Error message alert near the program name text field");
	}

	@When("Fill in all the fields with valid values but status as blank click save st")
	public void fill_in_all_the_fields_with_valid_values_but_status_as_blank_click_save() {

		pageObjects.blankStatus();
		LoggerLoad.info("Fill in all the fields with valid values but status as blank click save");
	}

	@Then("Admin gets a Error message alert near the status text field st")
	public void admin_gets_a_error_message_alert_near_the_status_text_field() {

		pageObjects.errStatus();
		LoggerLoad.info("Admin gets a Error message alert near the status text field");
	}

	@When("Fill in all the fields with valid values but no of classes as blank click save st")
	public void fill_in_all_the_fields_with_valid_values_but_no_of_classes_as_blank_click_save() {

		pageObjects.blankNoOfClasses();
		LoggerLoad.info("Fill in all the fields with valid values but no of classes as blank click save");
	}

	@Then("Admin gets a Error message alert near the no of classes text field st")
	public void admin_gets_a_error_message_alert_near_the_no_of_classes_text_field() throws InterruptedException {

		pageObjects.errNoOfClasses();
		LoggerLoad.info("Admin gets a Error message alert near the no of classes text field");
	}

	// edit batch
	
	
	

	@When("The Admin clicks the edit icon st")
	public void the_admin_clicks_the_edit_icon() {

		pageObjects.searchBatch();
		pageObjects.editClick();
		LoggerLoad.info("The Admin clicks the edit icon");
	}

	@Given("Admin clicks the edit icon st")
	public void admin_clicks_the_edit_icon() {

		pageObjects.searchBatch();
		pageObjects.editClick();
		LoggerLoad.info("Admin clicks the edit icon");
	}

	@When("Update the Description with valid values- {string} and click save st")
	public void update_the_description_with_valid_values_and_click_save(String string) throws InterruptedException {

		pageObjects.updateDescription(string);
		LoggerLoad.info("Update the Description with valid values and click save");
	}

	@Then("The updated Description -{string} should appear on the data table st")
	public void the_updated_description_should_appear_on_the_data_table(String string) throws InterruptedException {

		pageObjects.updatedDescription(string);
		LoggerLoad.warn("The updated Description should appear on the data table");
	}

	@When("Update the NoOfClasses with valid values- {int} and click save st")
	public void update_the_no_of_classes_with_valid_values_and_click_save(Integer int1) throws InterruptedException {

		pageObjects.updateNoOfClasses(int1);
		LoggerLoad.info("Update the NoOfClasses with valid values and click save");
	}

	@Then("The updated NoOfClasses- {int} should appear on the data table st")
	public void the_updated_no_of_classes_should_appear_on_the_data_table(Integer int1) throws InterruptedException {

		pageObjects.updatedNoOfClasses(int1);
		LoggerLoad.warn("The updated NoOfClasses should appear on the data table");
	}

	@When("Update the Status and click save st")
	public void update_the_status_and_click_save() {

		pageObjects.updateStatus();
		LoggerLoad.info("Update the Status and click save");
	}

	@Then("The updated Status should appear on the data table st")
	public void the_updated_status_should_appear_on_the_data_table() {

		pageObjects.updatedStatus();
		LoggerLoad.warn("The updated Status should appear on the data table");
	}

	@When("Update the Description with invalid values - {string} and click save st")
	public void update_the_description_with_invalid_values_and_click_save(String string) throws InterruptedException {

		pageObjects.updateDescription(string);
		LoggerLoad.warn("Update the Description with invalid values and click save");
	}

	@When("Update the NoOfClasses with invalid values - {string} and click save st")
	public void update_the_no_of_classes_with_invalid_values_and_click_save(String string) throws InterruptedException {

		pageObjects.updateNoOfClasses(string);
		LoggerLoad.warn("Update the NoOfClasses with invalid values and click save");
	}

	@When("Erase data from mandatory field - Description st")
	public void erase_data_from_mandatory_field_description() throws InterruptedException {

		pageObjects.updateDescription("");
		LoggerLoad.info("Erase data from mandatory field - Description");
	}

	@When("Erase data from mandatory field - {string} NoOfClasses st")
	public void erase_data_from_mandatory_field_no_of_classes(String string) throws InterruptedException {

		pageObjects.updateNoOfClasses(string);
		LoggerLoad.info("Erase data from mandatory field - NoOfClasses");
	}

	@When("Erase data from description field st")
	public void erase_data_from_description_field() throws InterruptedException {

		pageObjects.updateDescription("");
		LoggerLoad.info("Erase data from description field");
	}

	@Then("The updated batch details should appear on the data table st")
	public void the_updated_batch_details_should_appear_on_the_data_table() {

		pageObjects.updatedDescription1();
		LoggerLoad.info("The updated batch details should appear on the data table");
	}

	// delete batch

	@Given("The delete icon on row level in data table is enabled st")
	public void the_delete_icon_on_row_level_in_data_table_is_enabled() {

		pageObjects.rowDeleteEnabled();
		LoggerLoad.info("The delete icon on row level in data table is enabled");

	}

	@When("Admin clicks the delete icon st")
	public void admin_clicks_the_delete_icon() {

		pageObjects.rowDeleteClick();
		LoggerLoad.info("Admin clicks the delete icon");
	}

	@Then("Alert appears with yes and No option st")
	public void alert_appears_with_yes_and_no_option() {

		pageObjects.alertValidation();
		LoggerLoad.info("Alert appears with yes and No option");
	}

	@Given("Admin clicks the delete icon on the row st")
	public void admin_clicks_the_delete_icon_on_the_row() {

		pageObjects.searchBatch();
		pageObjects.rowDeleteClick();
		LoggerLoad.info("Admin clicks the delete icon on the row");

	}

	@When("Admin click yes option st")
	public void admin_click_yes_option() {

		pageObjects.selectYes();
		LoggerLoad.info("Admin click yes option");
	}

	@Then("Batch deleted alert pops and batch is no more available in data table st")
	public void batch_deleted_alert_pops_and_batch_is_no_more_available_in_data_table() {

		pageObjects.deleteSuccess();
		pageObjects.isBatchAbsent();
		LoggerLoad.info("Batch deleted alert pops and batch is no more available in data table");

	}

	@Given("Admin clicks the delete icon on row st")
	public void admin_clicks_the_delete_icon_on_row() {

		pageObjects.searchBatch();
		pageObjects.rowDeleteClick();
		LoggerLoad.info("Admin clicks the delete icon on row");
	}

	@When("Admin click No option st")
	public void admin_click_no_option() {

		pageObjects.selectNo();
		LoggerLoad.info("Admin click No option");
	}

	@Then("Batch is still listed in data table st")
	public void batch_is_still_listed_in_data_table() {

		pageObjects.searchBatch();
		pageObjects.isBatchPresent();
		LoggerLoad.info("Batch is still listed in data table");
	}

	@Given("None of the checkboxes in data table are selected st")
	public void none_of_the_checkboxes_in_data_table_are_selected() {

		LoggerLoad.info("None of the checkboxes in data table are selected");
	}

	@Then("The delete icon under the {string} header should be disabled st")
	public void the_delete_icon_under_the_header_should_be_disabled(String string) {

		pageObjects.multipleDeleteIcon();
		LoggerLoad.info("The delete icon under the Manage Batch header should be disabled");
	}

	@Given("One of the checkbox or row is selected st")
	public void one_of_the_checkbox_row_is_selected() throws InterruptedException {

		pageObjects.searchBatch();
		Thread.sleep(1000);
		pageObjects.selectCheckBox();
		LoggerLoad.info("One of the checkbox or row is selected");

	}

	@When("Click delete icon below {string} header st")
	public void click_delete_icon_below_header(String string) throws InterruptedException {

		Thread.sleep(1000);
		pageObjects.multipleDeleteIconClick();
		LoggerLoad.info("Click delete icon below Manage Batch header");
	}

	@Then("The respective row in the data table is deleted st")
	public void the_respective_row_in_the_data_table_is_deleted() {

		pageObjects.isBatchDeleted();
		LoggerLoad.info("The respective row in the data table is deleted");
	}

	@Given("Two or more checkboxes or row is selected st")
	public void two_or_more_checkboxes_or_row_is_selected() throws InterruptedException {

		pageObjects.searchBatch();
		Thread.sleep(1000);
		pageObjects.selectMultipleCheckBox();
		LoggerLoad.info("Two or more checkboxes or row is selected");
	}

	@Then("The respective rows in the data table is deleted st")
	public void the_respective_rows_in_the_data_table_is_deleted() {

		pageObjects.isMultipleBatchDeleted();
		LoggerLoad.info("The respective rows in the data table is deleted");
	}

}
