package stepDefinition;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_product_to_Basket {

	public static void main(String[] args){
		
	}
		public static WebDriver driver;
		@Given("I want to launch the website$")
		
		public void user_is_on_Tesco_Groceries_Page() throws Throwable {
	        driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://www.tesco.com/groceries");
			}
		
		@When("^I click on search field in top navigation pane$")

		public void user_Navigate_to_LogIn_Page() throws Throwable {
			
			driver.findElement(By.xpath(".//*[@id='searchBox-1']")).click();
			
			}
		
		@When("I enter a product and click on search button$")
		public void enter_product_name() throws Throwable {
			driver.findElement(By.id("searchBox-1")).sendKeys("cucumber"); 
			driver.findElement(By.id("searchBtn")).click();
//			String bodyText = driver.findElement(By,tagName("body"));
//			Assert.assertTrue("Text found", bodyText.contains("results for cucumber"));
			Thread.sleep(100);
			driver.getPageSource().contains("results for 'cucumber'");
			
	
			List<WebElement> inputs = driver.findElementsBy(By.tagName(""));
			List<WebElement> links = driver.findElementsBy(By.tagName("product_253558972"));
			
			
			
			
	}

}

