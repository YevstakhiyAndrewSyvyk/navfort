@loginScenarioOutline
Feature: User should be able to login

  Scenario Outline: User should be able to login as either driver, store manager, or sales manager
    Given User is on the Navfort login page
    When User types valid "<login>"
    And User types correct "<password>"
    And User clicks the login button
    Then User sees "<expectedTitle>"

    Examples: logins, passwords and expected titles
      |login           |password    |expectedTitle |
      |user1           |UserUser123 |Dashboard     |
      |storemanager51  |UserUser123 |Dashboard     |
      |salesmanager101 |UserUser123 |Dashboard     |