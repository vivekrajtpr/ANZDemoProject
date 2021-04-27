Feature: Home Loan borrowing calculator feature

  Scenario: Home Loan borrowing calculator working properly as expected.
    Given browser is launch
    And user is on the personal home-loans calculators page
    When user enter the values in the all required Field
    And click on the button How much I can borrow
    And get the expected result
