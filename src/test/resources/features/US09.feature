@US09
  Feature: User should be able to see error messages when enters an invalid integer into the calendar repeat day input box.
    User story: As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.

    Background: User is already in the log in page
      Given the user is on the login page
@US09_1
      Scenario: Verify that once the sales manager launch on the Create Activities page under Activities
        Given the user logged in as "sales manager"
        Given the user on the Create Activities page MH
        Then user click Create Event button MH
        Then user click repeat checkbox MH
        And user input invalid integer numbers in repeat every box MH
        Then the user sees given error message MH

@US09_2
    Scenario: Verify that once the store manager launch on the Create Activities page under Activities
      Given the user logged in as "store manager"
      Given the user on the Create Activities page MH
      Then user click Create Event button MH
      Then user click repeat checkbox MH
      And user input invalid integer numbers in repeat every box MH
      Then the user sees given error message MH
@US09_3
    Scenario: Verify that once the driver launch on the Create Activities page under Activities
      Given the user logged in as "driver"
      Given the user on the Create Activities page MH
      Then user click Create Event button MH
      Then user click repeat checkbox MH
      And user input invalid integer numbers in repeat every box MH
      Then the user sees given error message MH
    @US09_4
    Scenario: Verify that once the sales manager launch on the Create Activities page under Activities
      Given the user logged in as "sales manager"
      Given the user on the Create Activities page MH
      Then user click Create Event button MH
      Then user click repeat checkbox MH
      And user input 0 integer number in repeat every box MH
      Then the user sees given error message for less number MH
    @US09_5
    Scenario: Verify that once the store manager launch on the Create Activities page under Activities
      Given the user logged in as "store manager"
      Given the user on the Create Activities page MH
      Then user click Create Event button MH
      Then user click repeat checkbox MH
      And user input 0 integer number in repeat every box MH
      Then the user sees given error message for less number MH
    @US09_6
    Scenario: Verify that once the driver launch on the Create Activities page under Activities
      Given the user logged in as "driver"
      Given the user on the Create Activities page MH
      Then user click Create Event button MH
      Then user click repeat checkbox MH
      And user input 0 integer number in repeat every box MH
      Then the user sees given error message for less number MH



