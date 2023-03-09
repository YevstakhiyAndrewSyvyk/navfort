@US02
Feature: As a user, I should be access to the Oroinc Documentation page.

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario: As a driver, I should be access to the Oroinc Documentation page. (Window handle)
    Given the user logged in as "driver"
    When the user clicks on a Get Help Button AS
    Then the user reaches the Oroinc page

  Scenario: As a store manager, I should be access to the Oroinc Documentation page. (Window handle)
    Given the user logged in as "store manager"
    When the user clicks on a Get Help Button AS
    Then the user reaches the Oroinc page

  Scenario: As a sales manager, I should be access to the Oroinc Documentation page. (Window handle)
    Given the user logged in as "sales manager"
    When the user clicks on a Get Help Button AS
    Then the user reaches the Oroinc page