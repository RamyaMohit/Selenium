package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadSteps {
	
	public ChromeOptions options;
	
	public ChromeDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		options =new ChromeOptions();
		options.addArguments("guest");
			
		driver = new ChromeDriver(options);
	}

	@Given("Load the url")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps/");
	}

	@Given("Enter the username as {string}")
	public void enter_the_username_as(String user) {
		driver.findElement(By.id("username")).sendKeys(user);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("It should be logged in")
	public void it_should_be_logged_in() {
	  System.out.println("Login successful");
	}

	@When("Click on the CRMSFA link")
	public void click_on_the_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

	@When("Clcik on the Leads Link")
	public void clcik_on_the_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@When("Click on the CreateLead link")
	public void click_on_the_create_lead_link() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the companyname as {string}")
	public void enter_the_companyname_as(String companyName) {
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}

	@Given("Enter the firstname as {string}")
	public void enter_the_firstname_as(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}

	@Given("Enter the lastname as {string}")
	public void enter_the_lastname_as(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}

	@When("Click on the CreateLead button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Lead should be created")
	public void lead_should_be_created() {
		System.out.println("Lead created");
	}

}
