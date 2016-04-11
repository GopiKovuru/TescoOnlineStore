
package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Multiple_products_steps {
	public static WebDriver multdriver;
	@Given("I want to launch website for multiple search$")
	
	public void user_is_on_Tesco_Groceries_Page() throws Throwable {
		multdriver = new FirefoxDriver();
		multdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		multdriver.get("http://www.tesco.com/groceries");
		}
	
	@When("^I click on multiple search link$")

	public void user_Navigate_to_LogIn_Page() throws Throwable {
		
		multdriver.findElement(By.id("yui_3_13_0_1_1460289278465_806")).click();
//		multdriver.findElement(By.className("multiSearch-bg")).click();
		
		}
	
//	@When("I enter the products \"(.*)\" $")
//	
//	public void user_enters_UserName_and_Password(String username, String password) throws Throwable {
//	public void enter_product_name() throws Throwable {
//		driver.findElement(By.id("searchBox-1")).sendKeys("cucumber"); 
//		driver.findElement(By.id("searchBtn")).click();
////		String bodyText = driver.findElement(By,tagName("body"));
////		Assert.assertTrue("Text found", bodyText.contains("results for cucumber"));
//		Thread.sleep(100);
//		driver.getPageSource().contains("results for 'cucumber'");
//	}
}

