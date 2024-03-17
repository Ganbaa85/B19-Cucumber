Feature: negative test case

  Scenario Outline: check login function
    Given user is navigated to main page and click login button
    Then user enter email as '<email>' click next
    And  user provide password as '<password>' validate error message as '<errorMessage>'
    Examples: test case
      | email          | password | errorMessage   |
      | test@test.com | 1234567  | Your email or password were incorrect. |


