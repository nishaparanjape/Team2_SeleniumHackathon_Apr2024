 @programMultipleDelete
Feature: Multiple Delete program

Background:Login 

 Given LMS application https
 When Valid credentials are given to login
 And admin logins in successfully and lands in Dashboard page
 
@programmultipledelete1
Scenario: Validate Common Delete button enabled after clicking on any checkbox
Given Admin is in Manage Program page
When Admin clicks any checkbox in the data table
Then Admin should see common delete option enabled under header Manage Program

@programmultipledelete2
Scenario: Validate multiple program deletion by selecting Single checkbox
Given Admin is on Confirm Deletion alert
When Admin clicks YES button on the delete alert
Then Admin should land on Manage Program page and can see the selected program is deleted from the data table

@programmultipledelete3
Scenario: Validate multiple program deletion by selecting Single checkbox
Given Admin is on Confirm Deletion alert
When Admin clicks NO button on the delete alert
Then Admin should land on Manage Program page and can see the selected program is not deleted from the data table

@programedit4
Scenario: Validate multiple program deletion by selecting multiple check boxes
Given Admin is on Confirm Deletion alert after selecting multiple programs
When Admin clicks YES button on the delete alert
Then Admin should land on Manage Program page and can see the selected programs are deleted from the data table

@programedit5
Scenario: Validate Cancel button on Edit popup
Given Admin is on Confirm Deletion alert
When Admin clicks NO button on the delete alert 
Then Admin should land on Manage Program page and can see the selected programs are not deleted from the data table

#@Relogin2
#Scenario: Relogin
 #Given LMS application https
 #When Valid credentials are given to login
 #And admin logins in successfully and lands in Dashboard page
