package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Salesforcestepdefinition {

	public ChromeDriver driver;

	@Given("Open the browser")
	public void open_the_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("The salesforce URL")
	public void the_salesforce_url() {
		driver.get("https://login.salesforce.com/");
	}

	@Given("Enter the username {string}")
	public void enter_the_username(String Uname) {
		driver.findElement(By.id("username")).sendKeys(Uname);
	}

	@Given("Enter the Password {string}")
	public void enter_the_password(String Pwd) {
		driver.findElement(By.id("password")).sendKeys(Pwd);

	}

	@When("Click Login button")
	public void click_login_button() {
		driver.findElement(By.id("Login")).click();

	}

	@Then("Successfully logedin")
	public void successfully_logedin() {

		String Current = driver.getTitle();
		String Actual = "Home | Salesforce";
		if (Actual.equals(Current)) {
			System.out.println("Title Correct");
		} else {
			System.out.println("Title not matched");

		}
	}

	@When("Not Successfully logedin")
	public void not_successfully_logedin() {
	  WebElement Error= driver.findElement(By.id("error"));
	  String Emesssage=Error.getText();
	  
	  if(Emesssage.contentEquals(Emesssage)) 
	  {
		  System.out.println("Error - not able to login recheck credentials");
	  }
	}
}
