package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class VerifyMessage {
	
	WebDriver driver;

	LoadTestData testdata = new LoadTestData();
	
	@Given("application browser  should be open")
	public void application_browser_should_be_open() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

}
	  
	

	@And("user should be on home loans calculators page for Sart over features")
	public void user_should_be_on_home_loans_calculators_page_for_Sart_over_features() {
		
		driver.get(testdata.readPropfie().getProperty("url"));// getting the URl from config properties file
	    
	}

	@When("user enter the values in Living expenses Field")
	public void user_enter_the_values_in_Living_expenses_Field() throws InterruptedException {
		
		PageLocators locatore = new PageLocators(driver);
		Thread.sleep(5000);
		// getting the Your Income Amt. from config properties file
		System.out.println(testdata.readPropfie().getProperty("livingexpenses"));
		locatore.enterLivingExpenses(testdata.readPropfie().getProperty("livingexpenses"));
	    
	}

	@And("user clicks on the How much I can borrow button")
	public void user_clicks_on_the_How_much_I_can_borrow_button() {
		
		PageLocators locatores = new PageLocators(driver);
		locatores.clickBorrowButton();// click on the "Work out how much I could borrow" button
	    
	}

	@And("Verify the message")
	public void verify_the_message() {
		
		String msgtext =driver.findElement(By.xpath("//span[@class='borrow__error__text']")).getText();
		System.out.println(msgtext);
		Assert.assertEquals(msgtext, testdata.readPropfie().getProperty("expectedMsg"));
		driver.close();
		driver.quit();
		
	    
	}


}
