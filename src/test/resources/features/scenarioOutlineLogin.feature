@parallel
Feature: Login

  @login
  Scenario Outline: verify login functionality with invalid credentials
    When User is on the login page
    And User enter invalid "<username>" in username field
    And User enters invalid "<password>" in the password field
    And User clicks on login button
    Then User should see an "<errorMessage>"

    Examples:
      | username | password | errorMessage              |
      | test1    | test1    | Your username is invalid! |
      |          |          | Your username is invalid! |
      | test2    | test8900 | Your username is invalid! |
      | test3    | test3234 | Your username is invalid! |
