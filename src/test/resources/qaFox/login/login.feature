Feature: check login functionality

  Scenario Outline: check negative scenario for login functionality
    When user is on login page user validates title '<title>'
    Then user enters email as '<email>' and password as '<password>' and validates error msg as '<errorMessage>'
    Examples: test data for login functionality
      | title         | email          | password | errorMessage                                          |
      | Account Login | test@mail.com  | asdfgh   | Warning: No match for E-Mail Address and/or Password. |
      | Account Login | joke@mail.com  | 123456   | Warning: No match for E-Mail Address and/or Password. |
      | Account Login | hoho@mail.com  | !@#$%^   | Warning: No match for E-Mail Address and/or Password. |
      | Account Login | ?nail@mail.com |          | Warning: No match for E-Mail Address and/or Password. |
      | Account Login |                | password | Warning: No match for E-Mail Address and/or Password. |
      | Account Login |                |          | Warning: No match for E-Mail Address and/or Password. |


