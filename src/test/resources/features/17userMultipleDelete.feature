@e
Feature: Delete user 


Background: Logged on the LMS portal as admin 
Given Admin is on dashboard page after Login-dk
When Admin clicks "User" from navigation bar-dk

Scenario: Validate Common Delete button enabled after clicking on any checkbox
Given Admin is on Manage User Page-dd
When Admin clicks any checkbox in the data table-dd
Then Admin should see common delete option enabled under header Manage Program-dd

Scenario: Validate multiple program deletion by selecting Single checkbox
Given Admin is on Confirm Deletion alert-md
When Admin clicks <YES> button on the alert-dd
Then Admin should land on Manage User page and can see the selected user is deleted from the data table-dd

Scenario: Validate multiple program deletion by selecting Single checkbox
Given Admin is on Confirm Deletion alert-md
When Admin clicks <No> button on the alert-dd
Then Admin should land on Manage User page and can see the selected user is not deleted from the data table-dd

Scenario: Validate multiple program deletion by selecting multiple check boxes
Given Admin is on Confirm Deletion alert-md
When Admin clicks <YES> button on the alert-dd
Then Admin should land on Manage User page and can see the selected users are deleted from the data table-dd
 
 Scenario: Validate multiple program deletion by selecting multiple check boxes
Given Admin is on Confirm Deletion alert-md
When Admin clicks <No> button on the alert-dd
Then Admin should land on Manage User page and can see the selected users are not deleted from the data table-dd
