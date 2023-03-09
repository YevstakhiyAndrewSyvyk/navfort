@US04
Feature:As a user, I want to access to Vehicle contracts page

  Background: User is already in the log in page
    Given the user is on the login page

  @US04_AC1
  Scenario:Store managers access the Vehicle contracts page.
    Given the user is on the login page
    When the user logged in as "Store manager"
    Then Then user clicks "Fleet" main menu and sub menu "Vehicle Contract"
    Then the user should see title "All - Vehicle Contract - Entities - System - Car - Entities - System"

  Scenario:Sales managers access the Vehicle contracts page.
    Given the user is on the login page
    When the user logged in as "Sales manager"
    Then Then user clicks "Fleet" main menu and sub menu "Vehicle Contract"
    Then the user should see title "All - Vehicle Contract - Entities - System - Car - Entities - System"

  @US04_AC2
  Scenario:Driver accesses the Vehicle contracts page.
    Given the user is on the login page
    When the user logged in as "Driver"
    Then Then user clicks "Fleet" main menu and sub menu "Vehicle Contract"
    Then the user should see the warning message "You do not have permission to perform this action."



