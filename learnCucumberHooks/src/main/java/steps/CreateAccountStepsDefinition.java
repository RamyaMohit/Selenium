package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccountStepsDefinition extends BaseClass{
	
	@Given("Enter the username as {string}")
	public void enter_the_username_as(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
	}

	@Given("Enter the password as  {string}")
	public void enter_the_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("Click on the login link")
	public void click_on_the_login_link() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should be logged In")
	public void it_should_be_logged_in() {
		System.out.println("User login successful");
	}

	@When("Click on the CRMSFA link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Click on the Accounts link")
	public void click_on_the_accounts_link() {
		driver.findElement(By.linkText("Accounts")).click();
	}


	@When("Clcikk on the CreateAccount link")
	public void clcikk_on_the_create_account_link() {
		driver.findElement(By.linkText("Create Account")).click();
	}

	@Given("Enter the Account Name as (.*)$")
	public void enter_the_account_name_as_testleaf_account_data1(String accountName) {
		driver.findElement(By.id("accountName")).sendKeys(accountName);

	}

	@Given("Enter the Number Of Employees (.*)$")
	public void enter_the_number_of_employees(Integer totalEmployees) {
		driver.findElement(By.id("numberEmployees")).sendKeys(String.valueOf(totalEmployees));

	}

	@Given("Enter the Description as (.*)$")
	public void enter_the_description_as_detailed_description_of_the_account(String description) {
		driver.findElement(By.name("description")).sendKeys(description);

	}

	@When("Click on the Create Account link")
	public void click_on_the_create_account_link() {
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Account should be created")
	public void account_should_be_created() {
	 System.out.println("Account should be created sucessfully");
	}


}
