@programadd
Feature: Edit program

Background:Login 

 Given LMS application https
 When Valid credentials are given to login
 And admin logins in successfully and lands in Dashboard page
 
 @programadd1
 Scenario:Validate Program Details Popup window
 Given Admin is on Manage Program Page
 When Admin clicks <A New Program>button
 Then Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close(X) Icon on the top right corner of the window
 
 @programadd2
 Scenario:Validate input fields and their text boxes in Program details form 
 Given Admin is on Manage Program Page
 When Admin clicks <A New Program>button
 Then Admin should see two input fields and their respective text boxes in the program details window
 
 @programadd3
 Scenario:Validate radio button for Program Status 
 Given Admin is on Manage Program Page
 When Admin clicks <A New Program>button
 Then Admin should see two radio button for Program Status
 
 @programadd4
 Scenario:Empty form submission
 Given Admin is on "Program Details" Popup window
 When Admin clicks <Save>button without entering any data
 Then Admin gets a Error message alert 
 
 @programadd5
 Scenario:Enter only Program Name
 Given Admin is on "Program Details" Popup window
 When Admin enters only<Program Name> in text box and clicks Save button
 Then Admin gets a message alert 'Description is required'
 
 @programadd6
 Scenario:Enter only Program Description
 Given Admin is on "Program Details" Popup window
 When Admin enters only<Program description> in text box and clicks Save button
 Then Admin gets a message alert Name is required
 
 @programadd7
 Scenario:Select Status only
 Given Admin is on "Program Details" Popup window
 When Admin selects only Status and clicks Save button
 Then Admin gets a message alert Name and Description required
 
 @programadd8
 Scenario:Validate invalid values on the text column
 Given Admin is on "Program Details" Popup window
 When Admin enters only numbers or special char in name and desc column
 Then Admin gets a Error message alert 
 
 @programadd9
 Scenario:Validate Cancel/Close(X) icon on Program Details form
 Given Admin is on "Program Details" Popup window
 When Admin clicks Cancel Close Icon on Program Details form
 Then Program Details popup window should be closed without saving
 
 @programadd10
 Scenario:Validate Save button on Program Details form
 Given Admin is on "Program Details" Popup window
 When Enter all the required fields with valid values and click Save button
 Then Admin gets a message "Successful Program Created" alert and able to see the new program added in the data table
 
 @programadd11
 Scenario:Validate Cancel button on Program Details form
 Given Admin is on "Program Details" Popup window
 When Admin clicks Cancel button 
 Then Admin can see the Program details popup disappears without creating any program
#
