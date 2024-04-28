@HomePage

Feature: Login page Validation

	@login1
	Scenario: Verify admin is able to land on home page with invalid URL
	Given Admin launch the browser
	When Admin gives the invalid LMS portal URL
	Then Admin should receive 404 page not found error

	@login2
	Scenario: Verify for broken link		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL
	Then HTTP response >= 400 the link is broken
	
	@login666 @F
	Scenario: Verify admin is able to land on home page
	Given Admin launch the browser
	When Admin gives the correct LMS portal URL
	Then Admin should land on the home page
	
	@login @1
  Scenario: Verify the text spelling in the page 		
  Given Admin launch the browser	
  When Admin gives the correct LMS portal URL	
  Then Admin should see correct spellings in all fields 
  
  @login @1
	Scenario: Verify the company logo		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see logo on the left side

#	@login
#	Scenario: Verify application name		
#	Given Admin launch the browser	
#	When Admin gives the correct LMS portal URL	
#	Then Admin should see LMS - Learning Management System
#	
#	@login666	
#	Scenario: Verify company name		
#	Given Admin launch the browser	
#	When Admin gives the correct LMS portal URL	
#	Then Admin should see company name below the app name
	
	@login @1
	Scenario: Validate sign in content		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see "Please login to LMS application"
	
	@login @1
	Scenario: Verify text field is present		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see two text field
	
	@login @1
	Scenario: Verify text on the first text field		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see "user" in the first text field
	
	@login @1
	Scenario: Verify asterik next to user text		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see * symbol next to user text
	
	@login @1
	Scenario: Verify text on the second text field		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see "password" in the second text field
	
	@login @1
	Scenario: Verify asterik next to password text		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see * symbol next to password text
	
	@1
	Scenario: Verify the alignment input field for the login		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see input field on the centre of the page
	
	@1
	Scenario: verify Login is present		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see login button 
	
	@1
	Scenario: Verify the alignment of the login button		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see login button on the centre of the page
	
	@1
	Scenario: Verify input descriptive test in user field		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see user in gray color
	
	@1
	Scenario: Verify input descriptive test in password field		
	Given Admin launch the browser	
	When Admin gives the correct LMS portal URL	
	Then Admin should see password in gray color
	
	@1
	Scenario: Validate login with valid credentials	
	Given Admin gives the correct LMS portal URL	
	When Admin enter valid credentials and clicks login button
	Then Admin should land on dashboard page
	
	 @1
	Scenario: Validate login with invalid credentials		
	Given Admin gives the correct LMS portal URL	
	When Admin is in Home Page	
	And Admin enter invalid credentials and clicks login button 	
	Then Error message please check username/password
	
	 @F
	Scenario: Validate login credentials with null username	
	Given Admin gives the correct LMS portal URL		
	When Admin is in Home Page	
	And Admin enter value only in password and clicks login button 	
	Then Error message please check username/password
	
	 @F
	Scenario: Validate login credentials with null password	
	Given Admin gives the correct LMS portal URL		
	When Admin is in Home Page	
	And Admin enter value only in username and clicks login button 	
	Then Error message please check username/password
	
	 @F
	Scenario: verify login button action through keyboard	
	Given Admin gives the correct LMS portal URL		
	When Admin is in Home Page	
	And Admin enter valid credentials and clicks login button through keyboard	
	Then Admin should land on dashboard page
	
	 @1
	Scenario: verify login button action through mouse	
	Given Admin gives the correct LMS portal URL	
	When Admin is in Home Page	
	And Admin enter valid credentials and clicks login button through mouse	
	Then Admin should land on dashboard page
      