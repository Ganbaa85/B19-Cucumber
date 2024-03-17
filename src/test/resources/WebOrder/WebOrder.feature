Feature: Group order functionality
  Background: authentication
    Given user navigate to webOrder page
    Then user clears the username and password then enters the new username as 'guest1@microworks.com' and password as 'Guest1!'
    When user click the sign in button

    Scenario: office order positive way
      Given user is on main page user clicks on group order radio button
      Then user selects 'Office' from dropdown
      And user validates office address as '2012 EMPIRE BLVD'
      Then user leaves note for guest as 'eat healthy'
      When user enters info into invitee list as 'test@mail.com'
      Then user clicks on create group order button
      And user validates on main header 'View Group Order' on the next page
      Then user validates total participant as '1'

  Scenario: office order positive way
    Given user is on main page user clicks on group order radio button
    Then user selects 'My House' from dropdown
    And user validates office address as '3137 3137 Laguna Street'
    Then user leaves note for guest as 'eat healthy'
    When user enters info into invitee list as 'test@mail.com'
    Then user clicks on create group order button
    And user validates on main header 'View Group Order' on the next page
    Then user validates total participant as '1'