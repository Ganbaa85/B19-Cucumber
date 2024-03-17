Feature: check input field of Form

  Scenario: Positive case
    Given user is on main page of lambda user clicks on input form submit
    Then  user enters name email and password as follows
      | name     | ganbaa        |
      | email    | test@test.com |
      | password | 123456        |
    When user enters company website and select country from dropdown
      | company | apple    |
      | website | test.com |
      | country | Mongolia |
    Then user enter city also address1 and address2
      | city     | Chicago       |
      | address1 | 1 main st     |
      | address2 | 2 chicago ave |
    When user enters state and zipcode clicks submit button
      | state   | Illinois |
      | zipcode | 60089    |
    Then user validates success massege as follows
    |successMessage|Thanks for contacting us, we will get back to you shortly.|