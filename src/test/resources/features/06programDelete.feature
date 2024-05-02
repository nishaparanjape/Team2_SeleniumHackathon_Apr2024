 @programedit
Feature: Edit program

Background:Login 

 Given LMS application https
 When Valid credentials are given to login
 And admin logins in successfully and lands in Dashboard page
 
 @programdelete1
Scenario: Delete Feature
Given Admin is on Manage Program Page  
When Admin clicks <Delete> button on the data table for any row
Then Admin should see a alert open with heading "Confirm" along with  <YES> and <NO> button for deletion

@programdelete2
Scenario: Validate details for Confirm Deletion form
Given Admin is on Manage Program Page  
When Admin clicks <Delete> button on the data table for any row
Then Admin should see a message "Are you sure you want to delete <Program name>?"

@programdelete3
Scenario: Click Yes on deletion window
Given Admin clicks <Delete> button and is on Confirm Deletion alert
When Admin clicks <YES> button on the alert
Then Admin gets a message "Successful Program Deleted" alert and able to see that program deleted in the data table

@programdelete4
Scenario: Click No on deletion window
Given Admin clicks <Delete> button and is on Confirm Deletion alert
When Admin clicks <NO> button on the alert
Then Admin can see the deletion alert disappears without deleting

@programdelete5
Scenario: Validate Cancel/Close(X) icon on Confirm Deletion alert
Given Admin clicks <Delete> button and is on Confirm Deletion alert
When Admin clicks Cancel or Close Icon on Deletion alert
Then Admin can see the deletion alert disappears without any changes

 