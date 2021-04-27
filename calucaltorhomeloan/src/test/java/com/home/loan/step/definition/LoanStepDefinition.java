package com.home.loan.step.definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoanStepDefinition {


	WebDriver driver;

	LoadTestData test = new LoadTestData();
	@Given("browser is launch")
	public void browser_is_launch() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

}

	@And("user is on the personal home-loans calculators page")
	public void user_is_on_the_personal_home_loans_calculators_page() {
		driver.get(test.readPropfie().getProperty("url"));// getting the URl from config properties file

	}

	@When("user enter the values in the all required Field")
	public void user_enter_the_values_in_the_all_required_Field() throws InterruptedException {
		PageLocators locatores = new PageLocators(driver);
		Thread.sleep(5000);
		//locatores.clickDependantDropDown();
		System.out.println(test.readPropfie().getProperty("yourearningamt"));
		
		// getting the Your Income Amt. from config properties file
		locatores.enterYourIncome(test.readPropfie().getProperty("yourearningamt"));
		// getting the Other Income Amt. from config properties file
		locatores.enterOtherIncome(test.readPropfie().getProperty("otherincome"));
		// getting the Living Expenses Amt. from config properties file
		locatores.enterLivingExpenses(test.readPropfie().getProperty("livingexpense"));
		// getting the Other Loan Repayments Amt. from config properties file
		locatores.enterotherLoanRepayments(test.readPropfie().getProperty("otherloanrepayment"));
		// getting the Total CreditCard Limits Amt. from config properties file
		locatores.enterTotalCreditCardLimits(test.readPropfie().getProperty("creditcardlimits"));


	}

	@And("click on the button How much I can borrow")
	public void click_on_the_button_How_much_I_can_borrow() {
		PageLocators locatores = new PageLocators(driver);
		locatores.clickBorrowButton();// click on the "Work out how much I could borrow" button

	}

	@And("get the expected result")
	public void get_the_expected_result() throws InterruptedException {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Thread.sleep(9000);

		String text =driver.findElement(By.xpath("//span[@class='borrow__result__text__amount']")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "$507,000"); // verifying the calculated amt. displaying properly.
		driver.close(); 
		driver.quit();
	}


}
