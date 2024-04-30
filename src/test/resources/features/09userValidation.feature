@buserpage
Feature: User page1

Background: Logged on the LMS portal as admin 
	
	Given Admin is on dashboard page after Login-dk
	When Admin clicks "User" from navigation bar-dk 


 @Userpagevalidation1 @test
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
    
Scenario: Validate + Assign Student  button in User page
Then Admin should be able to see the "+ Assign Student" button above the data table-dd

Scenario: Validate search box in User page
Then Admin should be able to see the search text box above the data table-dd

#Addtional scenario
Scenario: Validate header count and column count in each row on the data table
Then Admin should see similar count of header and coloumn on the data table-dd

Scenario: Verify Check box on the data table
Then Each row in the data table should have a checkbox-dd

Scenario: Verify edit icon on the data table
Then Each row in the data table should have a edit icon that is enabled-dd

Scenario: Verify  delete icon on the data table
Then Each row in the data table should have a delete icon that is enabled-dd

Scenario Outline: Admin is on dashboard page after Login and clicks User on the navigation bar and search user by name-d
Given Admin is on Manage User Page-dd
When Admin enters user name into search box-dd
Then Admin should see user displayed with the entered "<name>" and "<Scenario>"-dd
Examples: 
|name| Scenario|
|Lms| valid name|
|@1Alexander| invalid name|
