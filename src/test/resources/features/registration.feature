@parallel
Feature: Registration

  @register
  Scenario: Verify registration form
    Given User is on the registration page
    And User enters firstname "Nicole"
    And User enters lastname "Jason"
    And User enters username "njason"
    And User enters email "njason@test.com"
    And User enters password "test2525"
    And User enters phone number "888-908-2929"
    And User selects gender Female
    And User enters date of birth "03/05/1988"
    And User selects Department of Engineering "DE" from dropdown
    And User selects Job title "SDET" from dropdown
    And User selects programming language "Java"
    And User clicks on Sign up button
    Then User should be able to register successfully

    @register2

    Scenario Outline:Verify registration form negative testing
      Given User is on the registration page
      And User enters firstname "<firstName>"
      And User enters lastname "<lastName>"
      And User enters username "<username>"
      And User enters email "<email>"
      And User enters password "<password"
      And User enters phone number "<phoneNumber"
      And User selects gender Female
      And User enters date of birth "<dateOfBirth"
      And User selects Department of Engineering "<department>" from dropdown
      And User selects Job title "SDET" from dropdown
      And User selects programming language "Java"
      And User clicks on Sign up button
      Then User should be able to register successfully
      Examples:
        | firstName | lastName | userName | email           | password | phoneNumber  | dateOfBirth | department |
        | a         | b        | tnot     | kddd@           | 3948     | 3838393489   | 89032909    | VHUY       |
        | Nicole    | Jason    | njason   | njason@test.com | Test2525 | 888-908-2929 | 03/05/1988  | DE         |
