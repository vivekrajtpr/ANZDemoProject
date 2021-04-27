$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/HomeLoanCal.feature");
formatter.feature({
  "name": "Home Loan borrowing calculator feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Home Loan borrowing calculator working properly as expected.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "browser is launch",
  "keyword": "Given "
});
formatter.match({
  "location": "com.home.loan.step.definition.LoanStepDefinition.browser_is_launch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on the personal home-loans calculators page",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.loan.step.definition.LoanStepDefinition.user_is_on_the_personal_home_loans_calculators_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the values in the all required Field",
  "keyword": "When "
});
formatter.match({
  "location": "com.home.loan.step.definition.LoanStepDefinition.user_enter_the_values_in_the_all_required_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the button How much I can borrow",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.loan.step.definition.LoanStepDefinition.click_on_the_button_How_much_I_can_borrow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get the expected result",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.loan.step.definition.LoanStepDefinition.get_the_expected_result()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/MessageVerfy.feature");
formatter.feature({
  "name": "Verifying Message if invalid data enterd in Home Loan borrowing calculator page.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying the Message displays properly as expected.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "application browser  should be open",
  "keyword": "Given "
});
formatter.match({
  "location": "com.home.loan.step.definition.VerifyMessage.application_browser_should_be_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be on home loans calculators page for Sart over features",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.loan.step.definition.VerifyMessage.user_should_be_on_home_loans_calculators_page_for_Sart_over_features()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the values in Living expenses Field",
  "keyword": "When "
});
formatter.match({
  "location": "com.home.loan.step.definition.VerifyMessage.user_enter_the_values_in_Living_expenses_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the How much I can borrow button",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.loan.step.definition.VerifyMessage.user_clicks_on_the_How_much_I_can_borrow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the message",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.loan.step.definition.VerifyMessage.verify_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/StartOver.feature");
formatter.feature({
  "name": "Start Over feature on Home Loan borrowing calculator page.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying Start Over functionality working properly as expected.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "com.home.loan.step.definition.StartOverStepDefinition.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home loans calculators page for Sart over features",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.loan.step.definition.StartOverStepDefinition.user_is_on_home_loans_calculators_page_for_Sart_over_features()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the values in some required Field",
  "keyword": "When "
});
formatter.match({
  "location": "com.home.loan.step.definition.StartOverStepDefinition.user_enter_the_values_in_some_required_Field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click How much I can borrow button",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.loan.step.definition.StartOverStepDefinition.click_How_much_I_can_borrow_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Start Over button",
  "keyword": "And "
});
formatter.match({
  "location": "com.home.loan.step.definition.StartOverStepDefinition.click_the_Start_Over_button()"
});
formatter.result({
  "status": "passed"
});
});