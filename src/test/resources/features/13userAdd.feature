@AddUserModule
  Feature: AddUser Module
  
 Background: 
 #Admin is on dashboard page after Login
 #Admin is on the Manage User Page after clicking on User on the navigation bar
 
  
 @AddUser1 @test
  Scenario: Validate User Details Popup window
    Given Admin is on Manage User Page-kk
    When Admin clicks A New User button-kk
    Then Admin should see pop up open for user details with First Name Middle name Last Name Location phone email  linkedin url User Role Role status visa Undergraduate postgraduate time zone user comments and user fields along with Cancel Submit and close buttons
    
  @AddUser2
  Scenario: Validate input fields and text boxes in user details form
    Given Admin is on Manage User Page-kk
    When Admin clicks A New User button-kk
    Then Admin should see  text boxes for the fields First Name, Middle name, Last Name, Location, phone, email, linkedin url, Undergraduate, postgraduate,time zone ,user comments
    
  @AddUser3 
  Scenario: Validate drop downs in new user form
    Given Admin is on Manage User Page-kk
    When Admin clicks A New User button-kk
    Then Admin should see drop downs for the fields User Role, Role status, visa status on user details pop up
    
   @AddUser4 @test
  Scenario: Check if user is created when only mandatory fields are entered with valid data
    Given Admin is on  User details pop up-kk
    When Admin enters mandatory fields in the form and clicks on submit button
   Then Admin gets message User added Successfully 
    
    @AddUser5
  Scenario: Check if user is created when only optional fields are entered with valid data
    Given Admin is on  User details pop up-kk
    When Admin skips to add value in mandatory field
    Then Admin should see error message below the test field and the field will be highlighed in red color
    
    @AddUser6 
  Scenario: check if user is created when invalid data is entered in all of the fields
   Given Admin is on  User details pop up-kk
    When Admin enters invalid data in all of the  fields in the form and clicks on submit button
    Then Admin gets error message and user is not created
    
   @AddUser7
  Scenario: Empty form submission
   Given Admin is on  User details pop up-kk
    When Admin clicks on submit button without entering data 
    Then user won't be created and Admin gets error message
    
    @AddUser8
  Scenario: Validate Cancel/Close(X) icon on User Details form
   Given Admin is on  User details pop up-kk
    When Admin clicks Cancel CloseX Icon on User Details form
    Then User Details popup window should be closed without saving
    
    @AddUser9
  Scenario: Validate Cancel button on User Details form
   Given Admin is on  User details pop up-kk
    When Admin clicks Cancel button-kk 
    Then Admin can see the User details popup disappears without adding any user
    
    @AddUser10
  Scenario: Check if the user details are added in data table
   Given Admin is on  User details pop up-kk
    When Fill in all the fields with valid values and click submit
    Then The newly added user should be present in the data table in Manage User page
    
    
    