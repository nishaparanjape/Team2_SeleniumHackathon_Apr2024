@userPageModule
  Feature: UserPageValidation Module
  
 	Background: 
 	#Logged on the LMS portal as admin
 	Given Admin is on dashboard page after Login
    When Admin clicks User from navigation bar
  
 	@Userpagevalidation1
 	Scenario: Validate landing in User page  
    Then Admin should see the Manage User in the URL
    
  	@Userpagevalidation2
  	Scenario: Validate the heading
    Then Admin should see a heading with text Manage user on the page
    
   	@Userpagevalidation3
  	Scenario: Validate the text and pagination icon below the data table
    Then Admin should see the text as Showing x to y of z entries along with Pagination icon below the table.x- starting record number on that page y-ending record number on that page z-Total number of records
    
    @Userpagevalidation4
  	Scenario: Validate data table headers in the User Page
    Then Admin Should see the data table with column names Id, Name, location, Phone Number, Edit/Delete
    
    @Userpagevalidation5
  	Scenario: Validating the default state of Delete button
    Then Admin should see a Delete button on the top left hand side as Disabled
    
    @Userpagevalidation6
  	Scenario: Validate "+ A New user" button in User Page
    Then Admin should be able to see the A New User button above the data table
    
    @Userpagevalidation7
 	Scenario: Validate "+ Assign staff"  button in User page
    Then Admin should be able to see the  Assign staff button above the data table