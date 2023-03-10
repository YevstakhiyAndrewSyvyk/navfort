Feature: Calendar event page functionality.
  User story: As a user, I want to write the “Description” when I create a calendar event.

  @US10-AC1-1
  Scenario: Driver should be able to write messages in the Description box.
    Given the user is on the login page
    Given the user logged in as "driver"
    When  user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    Then  user writes "Scrum daily meeting" in Description UC
    And  user see the message "Scrum daily meeting" in the input box


  @US10-AC1-2
  Scenario: Store manager should be able to write messages in the Description box.
    Given the user is on the login page
    Given the user logged in as "store manager"
    When  user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    Then  user writes "Scrum daily meeting" in Description UC
    And  user see the message "Scrum daily meeting" in the input box


  @US10-AC1-3
  Scenario: Sales manager should be able to write messages in the Description box.
    Given the user is on the login page
    Given the user logged in as "sales manager"
    When  user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    Then  user writes "Scrum daily meeting" in Description UC
    And  user see the message "Scrum daily meeting" in the input box

