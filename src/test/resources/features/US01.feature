@US01
Feature: User should be able to see and access all the modules names
  User Story: As a user, I should be accessing all the main modules of the app.

  Background: User is already in the log in page
    Given the user is on the login page

  @US01-1
  Scenario: Store manager should view 8 modules names.
    Given the user logged in as "store manager"
    Then user see all the eight modules
    Then user should access all the eight modules


  @US01-2
  Scenario: sales manager should view 8 modules name.
    Given the user logged in as "sales manager"
    Then user see all the eight modules
    Then user should access all the eight modules

    @US01-3
    Scenario: drivers should view 4 module names.
      Given the user logged in as "driver"
      Then user should see the four modules
      Then user should access the four modules