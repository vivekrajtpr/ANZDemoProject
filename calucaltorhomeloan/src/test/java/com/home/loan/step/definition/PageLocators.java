package com.home.loan.step.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLocators {
	

	WebDriver driver;

	By drop_no_of_dependant = By.xpath("//select[@title='Number of dependants']/option[1]");
	By txt_Your_income = By.xpath("//input[@aria-describedby='q2q1i1 q2q1i2']");
	By txt_Your_other_income = By.xpath("//input[@aria-describedby='q2q2i1 q2q2i2']");
	By txt_Living_expenses = By.xpath("//input[@aria-describedby='q3q1i1 q3q1i2']");
	By other_loan_repayments  = By.xpath("//input[@aria-describedby='q3q3i1 q3q3i2']");
	By txt_total_credit_card_limits = By.xpath("//input[@aria-describedby='q3q5i1']");
	By btn_borrow_button = By.xpath("//button[@id='btnBorrowCalculater']");
	By btn_start_over_button = By.xpath("(//button[@aria-label='Start over'])[1]");
	
	
	
	public PageLocators(WebDriver driver) {
		this.driver = driver;
	}

	public void enterYourIncome(String YourIncome) {
		//public void enterYourIncome() {
		
		
		driver.findElement(txt_Your_income).click();
		driver.findElement(txt_Your_income).sendKeys(YourIncome);
	
	}

	public void enterOtherIncome(String otherincome) {
		
		driver.findElement(txt_Your_other_income).click();
		driver.findElement(txt_Your_other_income).sendKeys(otherincome);
			
		
	}

	public void enterLivingExpenses(String livingexpense) {
		
		driver.findElement(txt_Living_expenses).click();
		driver.findElement(txt_Living_expenses).sendKeys(livingexpense);
		
	}
	
	public void enterotherLoanRepayments(String otherloanrepayment) {

		driver.findElement(other_loan_repayments).click();
		driver.findElement(other_loan_repayments).sendKeys(otherloanrepayment);
		
	}
	
	public void enterTotalCreditCardLimits(String creditcardlimits) {
		
		driver.findElement(txt_total_credit_card_limits).click();
		driver.findElement(txt_total_credit_card_limits).sendKeys(creditcardlimits);
	
	}
	
	public void clickDependantDropDown() {

		driver.findElement(drop_no_of_dependant).click();
	}

	public void clickBorrowButton() {
		
		driver.findElement(btn_borrow_button).click();
	}
	
	public void clickStartOverButton() {

		driver.findElement(btn_start_over_button).click();
		
	}



}



