package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class logindatatable {
	
	WebDriver driver;
	WebElement element;
	
@Given("^Open chrome and launch app$")
public void open_chrome_and_launch_app() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\gouthami.pokala\\git\\repository\\GmailCucumber\\driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/");

}
@When("^Enter the username	and password crendtials$")
public void enter_the_username_and_password_crendtials(DataTable credentials) throws Throwable {
	List<List<String>> data = credentials.raw();
   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(data.get(0).get(0));
   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(0).get(1));
	
}


@Then("^user loggedin successfully$")
public void user_loggedin_successfully() {
    // Write code here that turns the phrase above into concrete actions
   
}


}
