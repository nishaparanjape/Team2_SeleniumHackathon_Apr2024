 @programedit
Feature: Edit program

Background:Login 

 Given LMS application https
 When Valid credentials are given to login
 And admin logins in successfully and lands in Dashboard page
 
@programedit1
Scenario: Edit Program Name
Given Admin clicks on the edit button and is on Program Details Popup window to Edit
When Admin edits the Name column and clicks save button
Then Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program

@programedit2
Scenario: Edit Program description
Given Admin clicks on the edit button and is on Program Details Popup window to Edit
When Admin edits the Description column and clicks save button
Then Admin gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program

@programedit3
Scenario: Change Program Status
Given Admin clicks on the edit button and is on Program Details Popup window to Edit
When Admin changes the Status and clicks save button
Then Admin gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program

@programedit4
Scenario: Validate invalid values on the text column
Given Admin clicks on the edit button and is on Program Details Popup window to Edit
When Admin enters only numbers or special char in name and desc column
Then Admin gets a Error message alert 
#
@programedit5
Scenario: Validate Cancel button on Edit popup
Given Admin clicks on the edit button and is on Program Details Popup window to Edit
When Admin clicks <Cancel>button on edit popup
Then Admin can see the Program details popup disappears and can see nothing changed for particular program

@programedit6
Scenario: Validate Save button on Edit popup
Given Admin clicks on the edit button and is on Program Details Popup window to Edit
When Admin clicks <Save>button on edit popup
Then Admin gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program
