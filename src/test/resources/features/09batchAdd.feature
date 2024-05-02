@Batch_Module2
Feature: Add New Batch Feature Validation

  Background: The Admin is logged in to LMS portal
    Given The Admin logs in the portal st
    Given Admin is on dashboard page after Login st
    When clicks on "Batch" from navigation bar st
    When Admin clicks "+ A New Batch" button st

  @AddBatch11
  Scenario: Check if pop up include the field- Name as text box
    Given A new pop up with Batch details appears st
    Then The pop up should include the field- Name as text box st

  @AddBatch12
  Scenario: Check if pop up include the field- Number of classes as text box
    Given A new pop up with Batch details appears st
    Then The pop up should include the field- Number of classes as text box st

  @AddBatch13
  Scenario: Check if pop up include the field- Description as text box
    Given A new pop up with Batch details appears st
    Then The pop up should include the field- Description as text box st

  @AddBatch14
  Scenario: Check if pop up include the field- Program Name as drop down
    Given A new pop up with Batch details appears st
    Then The pop up should include the field- Program Name as drop down st

  @AddBatch15
  Scenario: Check if pop up include the field- Status as radio button
    Given A new pop up with Batch details appears st
    Then The pop up should include the field- Status as radio button st

  @AddBatch16
  Scenario: Check if description is optional field while creating new batch
    Given A new pop up with Batch details appears st
    When Fill in all the fields except description with valid values and click save st
    Then The newly added batch should be present in the data table in Manage Batch page st

  @AddBatch17
  Scenario: Check if the batch details are added in data table while creating new batch with valid values
    Given A new pop up with Batch details appears st
    When Fill in all the fields with valid values and click save st
    Then The newly added batch should be present in the data table in Manage Batch page st

  @AddBatch18
  Scenario Outline: Check for error messages for invalid values in fields
    When Admin enters "<Invalid Values>" for the "<Field Name>" st
    Then Admin gets a Error message alert near the text field st

    Examples: 
      | Field Name  | Invalid Values |
      | Name        |          23456 |
      | Name        | **%$#@         |
      | Name        | 764*&          |
      | Description |         564980 |
      | Description | *$#@#$#@       |
      | Description | 67512*$$@      |

  @AddBatch19
  Scenario: Check if the batch details are added in data table when name is blank click
    Given A new pop up with Batch details appears st
    When Fill in all the fields with valid values but name as blank click save st
    Then Admin gets a Error message alert near the name text field st

  @AddBatch20
  Scenario: Check if the batch details are added in data table when description is blank
    Given A new pop up with Batch details appears st
    When Fill in all the fields with valid values but description as blank click save st
    Then Admin gets a Error message alert near the description text field st

  @AddBatch21
  Scenario: Check if the batch details are added in data table when program name is blank
    Given A new pop up with Batch details appears st
    When Fill in all the fields with valid values but program name as blank click save st
    Then Admin gets a Error message alert near the program name text field st

  @AddBatch22
  Scenario: Check if the batch details are added in data table when status is blank
    Given A new pop up with Batch details appears st
    When Fill in all the fields with valid values but status as blank click save st
    Then Admin gets a Error message alert near the status text field st

  @AddBatch23
  Scenario: Check if the batch details are added in data table when no of classes is blank
    Given A new pop up with Batch details appears st
    When Fill in all the fields with valid values but no of classes as blank click save st
    Then Admin gets a Error message alert near the no of classes text field st
