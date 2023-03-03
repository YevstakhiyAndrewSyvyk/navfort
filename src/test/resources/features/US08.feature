Feature:  Calendar Events functionality
  User Story:  As a user, I want to create a recurring(repetitive) calendar event.

  @US08-1
 Scenario: Verify user should see the number “1” by default in the Repeat Every input.
    Given the user is on the login page
    Then the user logged in as "store manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox
    And user sees Repeat Every day input default value is "1"

  @US08-2
  Scenario: Verify user should see error message after clear repeat day
    Given the user is on the login page
    Then the user logged in as "store manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox
    And user clears the repeat day MY
    And user sees the error message "This value should not be blank." MY

  @US08-1-1
  Scenario Outline: Verify user should see the number “1” by default in the Repeat Every input.
    Given the user is on the login page
    Then the user logged in as "<userType>"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox
    And user sees Repeat Every day input default value is "1"
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |


  @US08-2-1
  Scenario Outline: Verify user should see the number “1” by default in the Repeat Every input.
    Given the user is on the login page
    Then the user logged in as "<userType>"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox
    And user clears the repeat day MY
    And user sees the error message "This value should not be blank." MY
    Examples:
      | userType      |
      | driver        |
      | store manager |
      | sales manager |