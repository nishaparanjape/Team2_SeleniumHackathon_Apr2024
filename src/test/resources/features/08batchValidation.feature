@Batch_Module1
Feature: Batch Page Validation Feature

  Background: The Admin is logged in to LMS portal
    Given The Admin logs in the portal st
    Given Admin is on dashboard page after Login st
    When clicks on "Batch" from navigation bar st

  @BatchPage01
  Scenario: Validate landing in Batch page
    Then Admin should see the "Manage Batch" in the URL st

  @BatchPage02
  Scenario: Validate header in the Batch Page
    Then Admin should see the "Manage Batch" in the header st

  @BatchPage03
  Scenario: Validate pagination in the Batch Page
    Then Admin should see the pagination controls under the data table st

  @BatchPage04
  Scenario: Validate data table headers in the Batch Page
    Then Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, Edit, Delete st

  @BatchPage05
  Scenario: Validate Delete button in Batch Page
    Then Admin should be able to see the "Delete" icon button that is disabled st

  @BatchPage06
  Scenario: Validate "+ A New batch" in Batch Page
    Then Admin should be able to see the "+ A New batch" button st

  @BatchPage07
  Scenario: Validate data rows
    Then Each row in the data table should have a checkbox st

  @BatchPage08
  Scenario: Validate data rows
    Then Each row in the data table should have a edit icon that is enabled st

  @BatchPage09
  Scenario: Validate data rows
    Then Each row in the data table should have a delete icon that is enabled st

  @BatchPage10
  Scenario: Validate pop up for adding batch
    When Admin clicks "+ A New Batch" button st
    Then A new pop up with Batch details appears st
