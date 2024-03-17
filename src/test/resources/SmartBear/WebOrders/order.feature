Feature: WebOrder functionality input fields

  Scenario: AC check all input fields on web order page happy path
  # Given user is on main page of login page and validates title as 'Web Orders Login'
   # Then user enters their username as 'Tester' and password as 'test'
    #And user clicks on login button
    #When user is on main page user clicks on order tab
    #Then user is on order page selects 'ScreenSaver' enters quantity as '200'
    #And user enters price as '500' discount as '50' and total as '1000'
    # address information
    #Then user enters their name as 'Ganbaa Jargal' and street address as 'chicago st'
    #When user enter city as 'Chicago' and state as 'Illinois' and zipcode as '60019'
    #Then user selects visa and provides cc as '123456789' and expiration date as '01/12'
    #And user finally clicks on process button

  Scenario Outline: check all input field
    Given user is on main page of login page and validates title as 'Web Orders Login'
    Then user enters their username as 'Tester' and password as 'test'
    And user clicks on login button
    When user is on main page user clicks on order tab
    Then user is on order page selects '<productName>' enters quantity as '<quantity>'
    And user enters price as '<price>' discount as '<discount>' and total as '<total>'
    Then user enters their name as '<name>' and street address as '<address>'
    When user enter city as '<city>' and state as '<state>' and zipcode as '<zipcode>'
    Then user selects visa and provides cc as '<cc>' and expiration date as '<exp>'
    And user finally clicks on process button
    Examples: test data
      | productName | quantity | price | discount | total | name   | address     | city    | state    | zipcode | cc     | exp   |
      | ScreenSaver | 500      | 400   | 300      | 1500  | ganbaa | chicago ave | chicago | Illinois | 60089   | 123456 | 12/12 |
      | ScreenSaver | !@#$%    | -300  | 000      | 1500  | ganbaa | chicago ave | chicago | Illinois | 60089   | 123456 | 12/12 |
      | ScreenSaver |          | 400   | 300      | ababa | ganbaa | chicago ave | chicago | Illinois | 60089   | 123456 | 12/12 |





