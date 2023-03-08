@US07
Feature: User should be able to select any vehicle from the Vehicle page
  User Story:  As a user, I want to check all available checkboxes.

  Background: User is already in the log in page
    Given the user is on the login page

    @US07_AC1_SL_MNG
  Scenario: Verify that once the sales manager launch on the Vehicle page, all the checkboxes should be unchecked.
    Given the user logged in as "sales manager"
    Given the user is on the vehicle page AS
    When user sees all the checkboxes in the table AS
    Then user verifies that all of them are unchecked AS

    @US07_AC1_ST_MNG
  Scenario: Verify that once the store manager launch on the Vehicle page, all the checkboxes should be unchecked.
    Given the user logged in as "store manager"
    Given the user is on the vehicle page AS
    When user sees all the checkboxes in the table AS
    Then user verifies that all of them are unchecked AS

  @US07_AC2_SL_MNG
  Scenario: Verify that sales manager can successfully check the first checkbox to check all the cars
    Given the user logged in as "sales manager"
    Given the user is on the vehicle page AS
    When user checks the first checkbox to check all cars AS
    Then user verifies that all checkboxes for all cars are checked AS

  @US07_AC2_ST_MNG
  Scenario: Verify that store manager can successfully check the first checkbox to check all the cars
    Given the user logged in as "store manager"
    Given the user is on the vehicle page AS
    When user checks the first checkbox to check all cars AS
    Then user verifies that all checkboxes for all cars are checked AS

  @US07_AC3_SL_MNG
  Scenario: Verify that sales manager can successfully select any vehicle
    Given the user logged in as "sales manager"
    Given the user is on the vehicle page AS
    When user checks any vehicle AS
    Then all of the selected vehicles are selected

  @US07_AC3_ST_MNG
  Scenario: Verify that store manager can successfully select any vehicle
    Given the user logged in as "store manager"
    Given the user is on the vehicle page AS
    When user checks any vehicle AS
    Then all of the selected vehicles are selected