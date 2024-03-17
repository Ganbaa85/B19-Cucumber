@smoke

Feature: Login functionality
# login function
  Background: Login steps
    Given User is navigated to login page
    When User is on login page user enters username and password
    And User clicks on login button
# scenario 1

  Scenario: Positive scenario for url title and header
    Given User is on main page user validate title
    Then User validates url
    And User validate main header
 # scenario 2
  Scenario: Positive scenario validating header on the left and dropdown
    When User is on main page user validates header on the left nav bar
    Then User validates all the list of options from the dropdown
    And User selects price low to high option



