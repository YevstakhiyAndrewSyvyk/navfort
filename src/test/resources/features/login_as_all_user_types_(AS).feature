@login_as_all_user_types
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify login with different user types
    Given the user logged in as "<user>"
    Examples:
      | user          |
      | driver        |
      | sales manager |
      | store manager |
