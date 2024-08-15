@parallel
Feature: Google search functionality

  @dTable

  Scenario: Verify search with multiple input
#    Since this step has already been implemented,
    # we don't need to implement the code/step for this
    When User is on the google home page
    When User search for
    |word|
    |java|
    |selenium|
    |TestNG  |
    |Junit   |
