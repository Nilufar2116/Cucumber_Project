Feature: Checkboxes Selection Feature
  As a user I want to able to select and unselect checkboxes #1 and #2.

  @checkboxes
  Scenario: Checkboxes verification
    Given User is navigating to the checkboxes page
    And User confirms checkbox 1 is not selected by default
    Then User should confirm checkbox 2 is not selected by default
    When User clicks checkbox 1 to select it
    When User clicks checkbox 2 to deselect it
    Then User should confirm checkbox 1 is selected
    Then User should also confirm checkbox 2 is not selected




