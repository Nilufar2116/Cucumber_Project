@parallel
@addRemove
Feature: Add Remove Feature
  As a user I want to be able to add and delete web element

@addRemove2
  Scenario: Verify add and remove web element functionality
    Given User is on the ucode academy add remove page
    When User clicks on Add Element button
    Then A new button should be displayed
    And User clicks on Delete button
    Then Delete Button should deleted

   @addition
  Scenario: Verify add and remove web element functionality
    Given User is on the ucode academy add remove page
    When User clicks on Add Element button
    Then A new button should be displayed
    And User clicks on Delete button
    Then Delete Button should deleted
