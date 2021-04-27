Feature: Verifying Message if invalid data enterd in Home Loan borrowing calculator page.

Scenario: Verifying the Message displays properly as expected.

    Given application browser  should be open
    And user should be on home loans calculators page for Sart over features
    When user enter the values in Living expenses Field
    And user clicks on the How much I can borrow button
    And Verify the message