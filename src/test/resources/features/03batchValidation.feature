@Batch_Module1
Feature: Batch Page Validation Feature 

  Background: The Admin is logged in to LMS portal
  
  Given The Admin logs in the portal
    
    Given Admin is on dashboard page after Login 
    When clicks on "Batch" from navigation bar

  @BatchPage01
  Scenario: Validate landing in Batch page
    Then Admin should see the "Manage Batch" in the URL

  @BatchPage02
  Scenario: Validate header in the Batch Page
    Then Admin should see the "Manage Batch" in the header

  @BatchPage03
  Scenario: Validate pagination in the Batch Page
    Then Admin should see the pagination controls under the data table

  @BatchPage04
  Scenario: Validate data table headers in the Batch Page
    Then Admin Should see the data table with headers Batch name, Batch Description,Batch Status, No. of classes, Program Name, Edit, Delete

  @BatchPage05
  Scenario: Validate Delete button in Batch Page
    Then Admin should be able to see the "Delete" icon button that is disabled

  @BatchPage06
  Scenario: Validate "+ A New batch" in Batch Page
    Then Admin should be able to see the "+ A New batch" button

  @BatchPage07
  Scenario: Validate data rows
    Then Each row in the data table should have a checkbox

  @BatchPage08
  Scenario: Validate data rows
    Then Each row in the data table should have a edit icon that is enabled

  @BatchPage09
  Scenario: Validate data rows
    Then Each row in the data table should have a delete icon that is enabled

  @BatchPage10
  Scenario: Validate pop up for adding batch
    When Admin clicks "+ A New Batch" button
    Then A new pop up with Batch details appears

