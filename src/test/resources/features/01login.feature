@HomePage

Feature: Login page Validation
	Background:
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	
	@login1
	Scenario: Verify admin is able to land on home page with invalid URL
	When Admin gives the invalid LMS portal URL
	Then Admin should receive 404 page not found error

	@login2
	Scenario: Verify for broken link		
	Then HTTP response >= 400 the link is broken
	
	@login3
	Scenario: Verify admin is able to land on home page
	Then Admin should land on the home page
	
	@login4
  Scenario: Verify the text spelling in the page 		
  Then Admin should see correct spellings in all fields 
  
  @login5
	Scenario: Verify the company logo		
	Then Admin should see logo on the left side

	@login
	Scenario: Verify application name		
	Then Admin should see LMS - Learning Management System
	
	@login666	
	Scenario: Verify company name		
	Then Admin should see company name below the app name
	
	@login7
	Scenario: Validate sign in content		
	Then Admin should see "Please login to LMS application"
	
	@login8
	Scenario: Verify text field is present		
	Then Admin should see two text field
	
	@login9
	Scenario: Verify text on the first text field		
	Then Admin should see "user" in the first text field
	
	@login10
	Scenario: Verify asterik next to user text		
	Then Admin should see * symbol next to user text
	
	@login11
	Scenario: Verify text on the second text field		
	Then Admin should see "password" in the second text field
	
	@login12
	Scenario: Verify asterik next to password text		
	Then Admin should see * symbol next to password text
	
	@login13
	Scenario: Verify the alignment input field for the login		
	Then Admin should see input field on the centre of the page
	
	@login14
	Scenario: verify Login is present		
	Then Admin should see login button 
	
	@login15
	Scenario: Verify the alignment of the login button		
	Then Admin should see login button on the centre of the page
	
	@login16
	Scenario: Verify input descriptive test in user field		
	Then Admin should see user in gray color
	
	@login17
	Scenario: Verify input descriptive test in password field		
	Then Admin should see password in gray color
	
	@login19
	Scenario: Validate login with invalid credentials		
	When Admin is in Home Page	
	And Admin enter invalid credentials and clicks login button 	
	Then Error message please check username/password
	
	@login20
	Scenario: Validate login credentials with null username	
	When Admin is in Home Page	
	And Admin enter value only in password and clicks login button 	
	Then Error message please check username/password
	
	@login21
	Scenario: Validate login credentials with null password	
	When Admin is in Home Page	
	And Admin enter value only in username and clicks login button 	
	Then Error message please check username/password
	
	@login22
	Scenario: verify login button action through keyboard	
	When Admin is in Home Page	
	And Admin enter valid credentials and clicks login button through keyboard	
	Then Admin should land on dashboard page
	
	@login23
	Scenario: verify login button action through mouse	
	When Admin is in Home Page	
	And Admin enter valid credentials and clicks login button through mouse	
	Then Admin should land on dashboard page
    
  @login18
	Scenario: Validate login with valid credentials	
	When Admin is in Home Page	
	When Admin enter valid credentials and clicks login button
	Then Admin should land on dashboard page
#	  
  #@Relogin2
#Scenario: Relogin
 #Given LMS application https
 #When Valid credentials are given to login
 #And admin logins in successfully and lands in Dashboard page
 
  #@batchTrial
  #Scenario: verify
  #Then Admin should land on the home page
#	And Admin enter valid credentials and clicks login button 	
  #When clicks on "Batch" from navigation bar
  #When Admin clicks "+ A New Batch" button
#	Given A new pop up with Batch details appears	
#	When Any of the mandatory fields are blank	
#	When click on save
#	Then Error message should appear
#	When add all fields
#	And click on save
#	Then it should update the table