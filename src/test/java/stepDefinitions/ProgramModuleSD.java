package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.*;
//import pageObject.programdeletepom;
//import pageObject.programeditpom;
//import pageObject.programmultipledeletepom;
import utilities.LoggerLoad;

public class ProgramModuleSD{
	
	ProgramModulePom ProgramAdd= new ProgramModulePom();
	ProgramModulePom ProgramEdit= new ProgramModulePom();
	ProgramModulePom ProgramDelete= new ProgramModulePom();
	ProgramModulePom ProgramMulDel= new ProgramModulePom();


	@When("Admin clicks <A New Program>button")
	public void admin_clicks_a_new_program_button() {
		LoggerLoad.info("....................Checked heading....................");
		ProgramAdd.clickadd();
	}
	
	@Then("Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close\\(X) Icon on the top right corner of the window")
	public void admin_should_see_a_popup_open_for_program_details_with_empty_form_along_with_save_and_cancel_button_and_close_x_icon_on_the_top_right_corner_of_the_window() {
		LoggerLoad.info("....................Validating the dialog box....................");
		ProgramAdd.programdetailpopupvalidation();
	}
	
	@Then("Admin should see two input fields and their respective text boxes in the program details window")
	public void admin_should_see_two_input_fields_and_their_respective_text_boxes_in_the_program_details_window() {
		LoggerLoad.info("....................Checking textbox....................");
		ProgramAdd.nameTextValidation();
	    ProgramAdd.descriptionTextValidation();
	}
	
	@Then("Admin should see two radio button for Program Status")
	public void admin_should_see_two_radio_button_for_program_status() {
		LoggerLoad.info("....................Validating radio button....................");
	    ProgramAdd.statusButtonValidation();
	}
	
	@Given("Admin is on {string} Popup window")
	public void admin_is_on_popup_window(String string) {
		LoggerLoad.info("....................user is in dialog box....................");
		ProgramAdd.clickadd();
		ProgramAdd.programdetailpopupvalidation();
	    }
	
	@When("Admin clicks <Save>button without entering any data")
	public void admin_clicks_save_button_without_entering_any_data() {
		LoggerLoad.info("....................user clicks on save....................");
	    ProgramAdd.clicksave();
	}
	
	@When("Admin enters only<Program Name> in text box and clicks Save button")
	public void admin_enters_only_program_name_in_text_box_and_clicks_save_button() throws InterruptedException {
		//Thread.sleep(1000);
		LoggerLoad.info("...................Add program name and save....................");
		ProgramAdd.addnewprogramname();
		ProgramAdd.clicksave();
	}
	
	@Then("Admin gets a message alert {string}")
	public void admin_gets_a_message_alert(String string) {
		LoggerLoad.info("....................user gets error msg....................");
		ProgramAdd.Validateerrormsgforstatus();
	}
	
	@When("Admin enters only<Program description> in text box and clicks Save button")
	public void admin_enters_only_program_description_in_text_box_and_clicks_save_button() {
		LoggerLoad.info("....................add description and save....................");
		ProgramAdd.addnewprogramdescription();
		ProgramAdd.clicksave();
	}
	@Then ("Admin gets a message alert Name is required")
	public void admin_gets_a_message_alert_Name_is_required() {
		LoggerLoad.info("....................Validating error message....................");
			ProgramAdd.Validateerrormsgforname();
	}
	
	@When("Admin selects only Status and clicks Save button")
	public void admin_selects_only_status_and_clicks_save_button() {
		LoggerLoad.info("....................add status and save....................");
		ProgramAdd.statusButtonValidation();
		ProgramAdd.clicksave();
	}
	@Then("Admin gets a message alert Name and Description required")
	public void admin_gets_a_message_alert_Name_and_Description_required() {
		LoggerLoad.info("....................Validating error message....................");
		ProgramAdd.Validateerrormsgforname();
	}
	@When("Admin clicks Cancel Close Icon on Program Details form")
	public void admin_clicks_cancel_close_icon_on_program_details_form() {
		LoggerLoad.info("....................user clicks cancel....................");
		ProgramAdd.clickclose();
	}
	
	@Then("Program Details popup window should be closed without saving")
	public void program_details_popup_window_should_be_closed_without_saving() {
		LoggerLoad.info("....................Validating title....................");
		ProgramAdd.managebatchvalidation();
	}
	
	@When("Enter all the required fields with valid values and click Save button")
	public void enter_all_the_required_fields_with_valid_values_and_click_save_button() {
		LoggerLoad.info("....................enters valid credentials....................");
	    ProgramAdd.addnewprogram();
	    ProgramAdd.addnewdescription();
	    ProgramAdd.clickstatus();
	    ProgramAdd.clicksave();
	    
	}
	
	@Then("Admin gets a message {string} alert and able to see the new program added in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_the_new_program_added_in_the_data_table(String string) {
		LoggerLoad.info("....................Validating successful message....................");
		ProgramAdd.successfulmessage();
	}
	
	@When("Admin clicks Cancel button")
	public void admin_clicks_cancel_button() {
		LoggerLoad.info("....................clicks cancel....................");
		ProgramAdd.clickcancel();
	}
	
	@Then("Admin can see the Program details popup disappears without creating any program")
	public void admin_can_see_the_program_details_popup_disappears_without_creating_any_program() {
		LoggerLoad.info("....................Validating header....................");
		ProgramAdd.managebatchvalidation();
	}
	
	
	@Given("Admin clicks on the edit button and is on Program Details Popup window to Edit")
	public void admin_clicks_on_the_edit_button_and_is_on_program_details_popup_window_to_edit() {
		LoggerLoad.info("....................Click Edit....................");
		ProgramEdit.clickEdit();
	}
	@When("Admin edits the Name column and clicks save button")
	public void admin_edits_the_name_column_and_clicks_save_button() {
		LoggerLoad.info("....................Edit program....................");
		ProgramEdit.editprogram();
		ProgramEdit.clickSave();
		
	}
	
	@Then("Admin gets a message {string} alert and able to see the updated name in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_name_in_the_table_for_the_particular_program(String string) {
		LoggerLoad.info("....................Edit successful msg....................");
		ProgramEdit.Validatesuccessfulmsg();
	}
	
	@When("Admin edits the Description column and clicks save button")
	public void admin_edits_the_description_column_and_clicks_save_button() {
		LoggerLoad.info("....................Edit description....................");
		ProgramEdit.editprogramdescription();
		ProgramEdit.clickSave();
		
	}
	
	@Then("Admin gets a message {string} alert and able to see the updated description in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_description_in_the_table_for_the_particular_program(String string) {
		LoggerLoad.info("....................Edit successful msg....................");
	    ProgramEdit.Validatesuccessfulmsg();
	}
	
	@When("Admin changes the Status and clicks save button")
	public void admin_changes_the_status_and_clicks_save_button() {
		LoggerLoad.info("....................Edit Status....................");
		ProgramEdit.clickeditprogramstatus();
		ProgramEdit.clickSave();
	}
	
	@Then("Admin gets a message {string} alert and able to see the updated status in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_status_in_the_table_for_the_particular_program(String string) {
		LoggerLoad.info("....................Edit successful msg....................");
		ProgramEdit.Validatesuccessfulmsg();
	}
	
	@When("Admin enters only numbers or special char in name and desc column")
	public void admin_enters_only_numbers_or_special_char_in_name_and_desc_column() {
		LoggerLoad.info("....................Edit with special charecters....................");
		ProgramEdit.updateprogram();
		//ProgramEdit.updatedescription();
		//ProgramEdit.clickSave();
	}
	
	@Then("Admin gets a Error message alert")
	public void admin_gets_a_error_message_alert() {
		LoggerLoad.info("....................Error msg....................");
	    ProgramEdit.Validateerrormsg();
	}
	
	@When("Admin clicks <Cancel>button on edit popup")
	public void admin_clicks_cancel_button_on_edit_popup() {
		LoggerLoad.info("....................Clicks cancel....................");
	    ProgramEdit.clickclosepopup();
	    
	}
	
	@Then("Admin can see the Program details popup disappears and can see nothing changed for particular program")
	public void admin_can_see_the_program_details_popup_disappears_and_can_see_nothing_changed_for_particular_program() {
		LoggerLoad.info("....................Checked heading....................");
		ProgramEdit.managebatchvalidation();
	}
	
	@When("Admin clicks <Save>button on edit popup")
	public void admin_clicks_save_button_on_edit_popup() {
		LoggerLoad.info("....................Clicks save....................");
		ProgramEdit.clickSave();
	}
	
	@Then("Admin gets a message {string} alert and able to see the updated details in the table for the particular program")
	public void admin_gets_a_message_alert_and_able_to_see_the_updated_details_in_the_table_for_the_particular_program(String string) {
		LoggerLoad.info("....................Edit successful msg....................");
		ProgramEdit.Validatesuccessfulmsg();
	}
	@Given("Admin is on Manage Program Page")
	public void admin_is_on_manage_program_page() {
		LoggerLoad.info("....................Checked heading....................");
	    ProgramDelete.managebatchvalidation();
	}
	
	@When("Admin clicks <Delete> button on the data table for any row")
	public void admin_clicks_delete_button_on_the_data_table_for_any_row() {
		LoggerLoad.info("....................Click delete....................");
		ProgramDelete.clickDelete();
	}
	
	@Then("Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion(String string) {
		LoggerLoad.info("....................Confirm delete popup....................");
		ProgramDelete.Validatedailogbox();
	}
	
	@Then("Admin should see a message {string}")
	public void admin_should_see_a_message(String string) {
		LoggerLoad.info("....................Validate dialogbox....................");
		 ProgramDelete.Validatedailogbox();
	}
	
	@Given("Admin clicks <Delete> button and is on Confirm Deletion alert")
	public void admin_clicks_delete_button_and_is_on_confirm_deletion_alert() {
		LoggerLoad.info("....................Validate dialogbox....................");
	ProgramDelete.clickDelete();	
	 ProgramDelete.Validatedailogbox();
	}
	
	@When("Admin clicks <YES> button on the alert")
	public void admin_clicks_yes_button_on_the_alert() {
		LoggerLoad.info("....................Clicks yes in dialogbox....................");
		ProgramDelete.ClickDialogBoxYesdelete();
	}
	
	@Then("Admin gets a message {string} alert and able to see that program deleted in the data table")
	public void admin_gets_a_message_alert_and_able_to_see_that_program_deleted_in_the_data_table(String string) {
		LoggerLoad.info("....................Successful msg....................");
		ProgramDelete.Validatesuccessfulmsg();
	}
	
	@When("Admin clicks <NO> button on the alert")
	public void admin_clicks_no_button_on_the_alert() {
		LoggerLoad.info("....................Clicks no in dialogbox....................");
		ProgramDelete.ClickDialogBoxNodelete();
	}
	
	@Then("Admin can see the deletion alert disappears without deleting")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting() {
		LoggerLoad.info("....................Checked heading....................");
		 ProgramDelete.managebatchvalidation();
	}
	
	@When("Admin clicks Cancel or Close Icon on Deletion alert")
	public void admin_clicks_cancel_or_close_icon_on_deletion_alert() {
		LoggerLoad.info("....................Clicks cancel in dialogbox....................");	
		ProgramDelete.ClickDialogBoxCanceldelete();
	}
	
	@Then("Admin can see the deletion alert disappears without any changes")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes() {
		LoggerLoad.info("....................Dialogbox close....................");
		 ProgramDelete.managebatchvalidation();
	}
	@Given("Admin is in Manage Program page")
	public void admin_is_in_manage_program_page() {
		LoggerLoad.info("....................Checked heading....................");
		ProgramMulDel.managebatchvalidation();
	}
	
	@When("Admin clicks any checkbox in the data table")
	public void admin_clicks_any_checkbox_in_the_data_table() {
		LoggerLoad.info("....................Clicking checkbox....................");
	    ProgramMulDel.clickcheckbox();
	}
	
	@Then("Admin should see common delete option enabled under header Manage Program")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_program() {
		LoggerLoad.info("....................Delete button enable....................");
		ProgramMulDel.deleteButtonEnable();
	}
	
	@Given("Admin is on Confirm Deletion alert")
	public void admin_is_on_confirm_deletion_alert() {
		LoggerLoad.info("....................validating confirm delete....................");
		ProgramMulDel.clickcheckbox();
		ProgramMulDel.clickdelete();
	}
	
	@When("Admin clicks YES button on the delete alert")
	public void admin_clicks_yes_button_on_the_adelete_lert() {
		LoggerLoad.info("....................Click Yes...................");
	    ProgramMulDel.clickYes();
	}
	
	@Then("Admin should land on Manage Program page and can see the selected program is deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_deleted_from_the_data_table() {
		LoggerLoad.info("....................Checked heading....................");
		ProgramMulDel.managebatchvalidation();
	}
	
	@When("Admin clicks NO button on the delete alert")
	public void admin_clicks_no_button_on_the_delete_alert() {
		LoggerLoad.info("....................Click no...................");
	    ProgramMulDel.clickNo();
	}
	
	@Then("Admin should land on Manage Program page and can see the selected program is not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_program_is_not_deleted_from_the_data_table() {
		LoggerLoad.info("....................Checked heading....................");
		ProgramMulDel.managebatchvalidation();
	}
	
	@Given ("Admin is on Confirm Deletion alert after selecting multiple programs")
	public void admin_is_on_Confirm_Deletion_alert_after_selecting_multiple_programs() {
		LoggerLoad.info("....................Clicking multiple checkbox....................");
		ProgramMulDel.clicksearch();
		ProgramMulDel.muldelprogram();
		ProgramMulDel.clickdelete();
	}
	
	@Then("Admin should land on Manage Program page and can see the selected programs are deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_deleted_from_the_data_table() {
		LoggerLoad.info("....................Checked heading....................");
		ProgramMulDel.managebatchvalidation();
	}
	
	@Then("Admin should land on Manage Program page and can see the selected programs are not deleted from the data table")
	public void admin_should_land_on_manage_program_page_and_can_see_the_selected_programs_are_not_deleted_from_the_data_table() {
		LoggerLoad.info("....................Checked heading....................");
		ProgramMulDel.managebatchvalidation();
	}
}


