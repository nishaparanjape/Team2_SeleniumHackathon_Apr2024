@Batch_Module3
Feature: Edit Batch features

  Background: The Admin is logged in to LMS portal
    Given The Admin logs in the portal st
    Given Admin is on dashboard page after Login st
    When clicks on "Batch" from navigation bar st

  @EditBatch24
  Scenario: Validate row level edit icon
    Given Each row in the data table should have a edit icon that is enabled st
    When The Admin clicks the edit icon st
    Then A new pop up with Batch details appears st

  @EditBatch25
  Scenario: Check if the fields are updated with valid values -Update the Description
    Given Admin clicks the edit icon st
    When Update the Description with valid values- "level 1" and click save st
    Then The updated Description -"level 1" should appear on the data table st

  @EditBatch26
  Scenario: Check if the fields are updated with valid values -Update the NoOfClasses
    Given Admin clicks the edit icon st
    When Update the NoOfClasses with valid values- 609 and click save st
    Then The updated NoOfClasses- 609 should appear on the data table st

  @EditBatch27
  Scenario: Check if the fields are updated -Update the Status
    Given Admin clicks the edit icon st
    When Update the Status and click save st
    Then The updated Status should appear on the data table st

  @EditBatch28
  Scenario: Check if the fields are updated with invalid values -Update the Description
    Given Admin clicks the edit icon st
    When Update the Description with invalid values - "%$#%" and click save st
    Then Admin gets a Error message alert near the text field st

  @EditBatch29
  Scenario: Check if the fields are updated with invalid values -Update the NoOfClasses
    Given Admin clicks the edit icon st
    When Update the NoOfClasses with invalid values - "classes" and click save st
    Then Admin gets a Error message alert near the no of classes text field st

  @EditBatch30
  Scenario: Check if you get error message when mandatory fields are erased -NoOfClasses
    Given Admin clicks the edit icon st
    When Erase data from mandatory field - "" NoOfClasses st
    Then Admin gets a Error message alert near the no of classes text field st

  @EditBatch31
  Scenario: Check if description field is optional in update
    Given Admin clicks the edit icon st
    When Erase data from description field st
    Then The updated batch details should appear on the data table st
