package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createdleadstepdefinitions extends Baseclass {

	@When("Click on Crmsfa link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on lead button")
	public void click_on_lead_button() {
		driver.findElement(By.linkText("Leads")).click();

	}

	@When("Click on create lead")
	public void click_on_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	@Given("Company name as {string}")
	public void company_name_as(String lead) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(lead);

	}

	@Given("first name as {string}")
	public void first_name_as(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);

	}

	@Given("Last name as {string}")
	public void last_name_as(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}

	@Given("Enter phonenumber {string}")
	public void enter_phonenumber(String phn) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phn);
	}

	@Then("click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitButton")).click();

	}

}
