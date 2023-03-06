Feature:  Calendar Events functionality
  User Story:  As a user, I want to create a recurring(repetitive) calendar event.

  @US08-AC1-1
 Scenario: Verify driver should see the number “1” by default in the Repeat Every input.
    Given the user is on the login page
    Then the user logged in as "driver"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user sees Repeat Every day input default value is "1" MY

  @US08-AC1-2
  Scenario: Verify store manager should see the number “1” by default in the Repeat Every input.
    Given the user is on the login page
    Then the user logged in as "store manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user sees Repeat Every day input default value is "1" MY

  @US08-AC1-3
  Scenario: Verify sales manager should see the number “1” by default in the Repeat Every input.
    Given the user is on the login page
    Then the user logged in as "sales manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user sees Repeat Every day input default value is "1" MY

  @US08-AC2-1
  Scenario: Verify driver should see error message after clear repeat day
    Given the user is on the login page
    Then the user logged in as "driver"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user clears the repeat day MY
    And user sees the error message "This value should not be blank." MY
  @US08-AC2-1
  Scenario: Verify sales manager should see error message after clear repeat day
    Given the user is on the login page
    Then the user logged in as "sales manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user clears the repeat day MY
    And user sees the error message "This value should not be blank." MY

  @US08-AC2-1
  Scenario: Verify store manager should see error message after clear repeat day
    Given the user is on the login page
    Then the user logged in as "store manager"
    Then user clicks "Activities" main menu and sub menu "Calendar Events"   MY
    And user clicks create calendar event MY
    And user clicks Repeat checkbox MY
    And user clears the repeat day MY
    And user sees the error message "This value should not be blank." MY