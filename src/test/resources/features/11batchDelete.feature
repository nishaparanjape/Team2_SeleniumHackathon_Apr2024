@Batch_Module4
Feature: Delete Batch/Batches features

  Background: The Admin is logged in to LMS portal
    Given The Admin logs in the portal st
    Given Admin is on dashboard page after Login st
    When clicks on "Batch" from navigation bar st

  @DeleteBatch32
  Scenario: Validate row level delete icon
    Given The delete icon on row level in data table is enabled st
    When Admin clicks the delete icon st
    Then Alert appears with yes and No option st

  @DeleteBatch33
  Scenario: Validate accept alert
    Given Admin clicks the delete icon on the row st
    When Admin click yes option st
    Then Batch deleted alert pops and batch is no more available in data table st

  @DeleteBatch34
  Scenario: Validate reject alert 
    Given Admin clicks the delete icon on row st
    When Admin click No option st
    Then Batch is still listed in data table st

  @DeleteBatch35
  Scenario: Validate the delete icon below the header
    Given None of the checkboxes in data table are selected st
    Then The delete icon under the "Manage Batch" header should be disabled st

  @DeleteBatch36
  Scenario: Check for single row delete
    Given One of the checkbox or row is selected st
    When Click delete icon below "Manage Batch" header st
    Then The respective row in the data table is deleted st

  @DeleteBatch37
  Scenario: Check for multi row delete
    Given Two or more checkboxes or row is selected st
    When Click delete icon below "Manage Batch" header st
    Then The respective rows in the data table is deleted st
