Feature: Delete user


Background: Logged on the LMS portal as admin 
Given Admin is on dashboard page after Login-dk
When Admin clicks "User" from navigation bar-dk


Scenario: Validate row level delete icon
Given Admin is on Manage User Page-dd
When Admin clicks the delete icon-dd
Then Admin should see a alert open with heading "Confirm" along with  "<YES>" and "<NO>" button for deletion-dd

Scenario: Click Yes on deletion window
Given Admin is on Confirm Deletion alert-dd
When Admin clicks "<YES>" button on the alert-dd
Then Admin gets a message "Successful User Deleted" alert and do not see that user in the data table-dd

Scenario: Click No on deletion window
Given Admin is on Confirm Deletion alert-dd
When Admin clicks  No option-dd
Then Admin can see the deletion alert disappears without deleting-dd

Scenario: Validate Close(X) icon on Confirm Deletion alert
Given Admin is on Confirm Deletion alert-dd
When Admin clicks on close button-dd
Then Admin can see the deletion alert disappears without deleting-dd
