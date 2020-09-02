package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginscript {
	WebDriver driver;
	WebElement element;
	
@Given("^Open chrome and launch application$")
public void open_chrome_and_launch_application() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\gouthami.pokala\\git\\repository\\GmailCucumber\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");

}
@When("^Enter the \"(.*?)\"	and \"(.*?)\"$")
public void enter_the_and(String username, String password) throws Throwable {
   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		/*
		 * element=driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]"));
		 * ((JavascriptExecutor) driver).executeScript("arguments[0].click();",
		 * element);
		 */
}

	/*
	 * @And("^Enter the \"(.*)\"$") public void enter_the_password(String password)
	 * throws Throwable {
	 * 
	 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	 * //driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	 * throw new PendingException(); }
	 */

@Then("^user loggedin succssfully$")
public void user_loggedin_succssfully() {
    // Write code here that turns the phrase above into concrete actions
   
}


	 
}
