Feature: User page1

Background: Logged on the LMS portal as admin and clicks User on the navigation bar 
Given Admin is on dashboard page after Login-dk
When Admin clicks "User" from navigation bar-dk 
And Admin clicks on the edit icon-dd  

Scenario: Validate row level edit icon
Then A new pop up with User details appears-dd

Scenario Outline: Check if the fields are updated with examples data
When Update the fields with "<firstname>" "<lastname>" "<location>" <phone_number> "<UG>" "<PG>" data and click submit
Then Admin gets "<message>" and see the updated values in data table
Examples: 
|firstname|lastname|location|phone_number|UG|PG|message|
|SDET     |Tester  |Tampa |9999999999 |BE|ME| valid data in all the feilds|
|SDET     |Tester  |Tampa |9999999999 ||| valid data in mandatory fields|
|     | | | |BE|ME| valid data in additional fields|
|@SDET     |@Tester  |Tampa |999999999 ||| invalid data|
|56567a   |3Tester |2Tampa |9999999999 |BE|ME| invalid data|

Scenario: Validate Cancel button on Edit popup
When Admin clicks Cancel button on edit popup-dd 
Then Admin can see the User details popup disappears and can see nothing changed for particular User-dd