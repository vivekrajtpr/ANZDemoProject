package com.home.loan.step.definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import junit.framework.Assert;

public class StartOverStepDefinition {
	
	WebDriver driver;

	LoadTestData tests = new LoadTestData();
	
	
	@Given("browser is open")
	public void browser_is_open() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();



	}

	@And("user is on home loans calculators page for Sart over features")
	public void user_is_on_home_loans_calculators_page_for_Sart_over_features() {
		driver.get(tests.readPropfie().getProperty("url"));// getting the URl from config properties file

	}
	
	@Given("user enter the values in some required Field")
	public void user_enter_the_values_in_some_required_Field() throws InterruptedException {
		
		PageLocators locatore = new PageLocators(driver);
		Thread.sleep(5000);
		// getting the Your Income Amt. from config properties file
		System.out.println(tests.readPropfie().getProperty("yourearningamt"));
		locatore.enterYourIncome(tests.readPropfie().getProperty("yourearningamt"));
		// getting the Living Expenses Amt. from config properties file
		locatore.enterLivingExpenses(tests.readPropfie().getProperty("livingexpense"));
	    
	}

	@And("click How much I can borrow button")
	public void click_How_much_I_can_borrow_button() {
		PageLocators locatores = new PageLocators(driver);
		locatores.clickBorrowButton();// click on the "Work out how much I could borrow" button
	    
	}

	@And("Click the Start Over button")
	public void click_the_Start_Over_button() throws InterruptedException {
		PageLocators locatores = new PageLocators(driver);
		locatores.clickStartOverButton();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//input[@aria-describedby='q2q1i1 q2q1i2']")).click();
		String text1 =driver.findElement(By.xpath("//input[@aria-describedby='q2q1i1 q2q1i2']")).getText();
		System.out.println(text1);
		Assert.assertEquals(text1, "");
		driver.close();
		driver.quit();
	   
	}

}
