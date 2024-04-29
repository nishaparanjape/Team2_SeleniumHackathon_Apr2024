@dashboard

Feature: Dashboard

	Background:Login 
	Given LMS application https	
	When Valid credentials are given to login
	And admin logins in successfully and lands in Dashboard page
	
	@dashboard1
	Scenario: Verify after login  admin lands on manage program as dashboard page
  Then admin should see manage program as header
	
	@dashboard2
	Scenario: Verify broken link
	Then HTTP response >= 400. Then the link is broken
	
	@dashboard3
	Scenario: Verify LMS title 
	Then admin should see LMS -Learning management system as title
	
	@dashboard4
	Scenario: Verify  LMS title alignment
	Then LMS title should be on the top left corner of page
	
	@dashboard5
	Scenario: Validate navigation bar text
	Then admin should see correct spelling in navigation bar text
	
	@dashboard6
	Scenario: Validate LMS title has correct spelling ang space
	Then admin should see correct spelling and space in LMS title
	
	@dashboard7
	Scenario: Validate alignment for navigation bar
	Then admin should see the navigation bar text on the top right side
	
	@dashboard8
	Scenario: Validate navigation bar order  1st Program
	Then admin should see program in the 1st place
	
	@dashboard9
	Scenario: Validate navigation bar order  2nd Batch
	Then admin should see batch in the 2nd place

  @dashboard10
	Scenario: Validate navigation bar order 3rd User
	Then admin should see user in the 3rd place

	@dashboard11
	Scenario: Validate navigation bar order 4th Logout 
	Then admin should see logout in the 4th place
	
	@dashboard12
	Scenario: Verify Logout button function
	When Admin click Logout button on navigation bar
	Then admin should land on login in page
