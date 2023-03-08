@US13

Feature: As a user, I want to manage filters on the Vehicle Costs page. (Web table and checkbox)

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario:  Users should see 3 columns on the Vehicle Model page
    Given the user logged in as "driver"
    When the user click on Vehicle Cost option under the Fleet tab as driver
    Then user sees three expected columns
    #expectedColumns = TYPE, TOTAL VALUE, DATE


  Scenario:  Users should see 3 columns on the Vehicle Model page
    Given the user logged in as "sales manager"
    When the user click on Vehicle Cost option under the Fleet tab
    Then user sees three expected columns
    #expectedColumns = TYPE, TOTAL VALUE, DATE


  Scenario:  Users should see 3 columns on the Vehicle Model page
    Given the user logged in as "store manager"
    When the user click on Vehicle Cost option under the Fleet tab
    Then user sees three expected columns
    #expectedColumns = TYPE, TOTAL VALUE, DATE

  @wip
  Scenario: User check the first checkbox to check all the Vehicle Costs
    Given the user logged in as "sales manager"
    And the user click on Vehicle Cost option under the Fleet tab
    And the user click on the first checkbox
    Then the user sees all other checkboxes are selected
  @wip
  Scenario: User check the first checkbox to check all the Vehicle Costs
    Given the user logged in as "store manager"
    And the user click on Vehicle Cost option under the Fleet tab
    And the user click on the first checkbox
    Then the user sees all other checkboxes are selected

