@US14
Feature: User should be able to manage filters on the Marketing page
  User Story: As a user, I want to manage filters on the Marketing page.

  Background: User is already in the log in page
    Given the user is on the login page

  @US14_1_SL
  Scenario: Verify that once the sales manager launch on the Campaigns page under Marketing.
    Given the user logged in as "sales manager"
    Given the user in on the campaign page ROA
    When user sees Manage filters button ROA
    Then user verifies 5 options are checked by default ROA

  @US14_1_ST
  Scenario: Verify that once the store manager launch on the Campaigns page under Marketing.
    Given the user logged in as "store manager"
    Given the user in on the campaign page ROA
    When user sees Manage filters button ROA
    Then user verifies 5 options are checked by default ROA

  @US14_2_SL
  Scenario: Verify that once the sales manager launch on the Campaigns page under Marketing.
    Given the user logged in as "sales manager"
    Given the user in on the campaign page ROA
    When user sees Manage filters button ROA
    And user uncheck one or more options ROA
    Then user verifies one or more options are unchecked ROA


  @US14_2_ST
  Scenario: Verify that once the sales manager launch on the Campaigns page under Marketing.
    Given the user logged in as "store manager"
    Given the user in on the campaign page ROA
    When user sees Manage filters button ROA
    And user uncheck one or more options ROA
    Then user verifies one or more options are unchecked ROA