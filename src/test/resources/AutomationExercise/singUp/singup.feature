Feature: Sing up functionality
  Scenario: Happy path for signing up a user
    Given user is on main page and clicks on login button
    When user enters username as 'Bob' and email as 'asddsaaaabb@mail.com' and clicks sign up
    Then user choose title as MR and validates name that user enters 'Bob'
    And user verifies that email field is disabled and enters the password '123456'
    When user chooses the day '1', month 'January' and year '2000'
    Then user enters first name as 'Bob' last name as 'Marley' and address as '1 chicago st'
    When user chooses the country as 'Singapore' provides state as 'Ohio' and city as 'Chicago'
    And user enters the zipcode '60089' and phone number '1112223333' and clicks create account button
