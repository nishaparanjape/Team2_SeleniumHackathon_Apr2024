Feature: Sort user

Background: Logged on the LMS portal as admin 
Given Admin is on dashboard page after Login-dk
When Admin clicks "User" from navigation bar-dk
Scenario: Sort user by id
Given Admin is on Manage User Page-dd
When Admin clicks on ID sort icon-dd
Then Admin should see User details are sorted by id-dd

Scenario: Sort user by name
Given Admin is on Manage User Page-dd
When Admin clicks on name sort icon-dd
Then Admin should see User details are sorted by name-dd

Scenario: Sort user by Location
Given Admin is on Manage User Page-dd
When Admin clicks on Location sort icon-dd 
Then Admin should see User details are sorted by Location-dd

Scenario: Sort user by Phone number
Given Admin is on Manage User Page-dd
When Admin clicks on Phone number sort icon-dd
Then Admin should see User details are sorted by Phone number-dd
