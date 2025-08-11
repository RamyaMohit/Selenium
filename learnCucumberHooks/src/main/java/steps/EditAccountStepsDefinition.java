package steps;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccountStepsDefinition extends BaseClass{
	
	@When("Clcikk on the FindAccount link")
	public void clcikk_on_the_find_account_link() {
	   driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
	}

	@When("Clicck on the AccountId link")
	public void clicck_on_the_account_id_link() {
		
		driver.findElement(By.xpath("//a[contains(@href,'viewAccount?partyId=')]")).click();
		
		 String currentWindow = driver.getWindowHandle();
	     Set<String> allWindows = driver.getWindowHandles();
	     for (String window : allWindows) {
	            if (!window.equals(currentWindow)) {
	                driver.switchTo().window(window);
	            }
	        }

	}
	
	@When("Click on the Edit button")
	public void click_on_the_edit_button() {
		  WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit")));
		  editButton.click();
	}
	
	@Given("Edit the AccountName as {string}")
	public void edit_the_account_name_as(String accName) {
	 WebElement accNameNew = driver.findElement(By.xpath("//input[@id='accountName']"));
	 accNameNew.clear();
	 accNameNew.sendKeys(accName);
	}

	@Given("Edit the total employees as {string}")
	public void edit_the_total_employees_as(String totalEmp) {
	  WebElement newEmployeesTotal =  driver.findElement(By.xpath("//input[@id='numberEmployees']"));
	  newEmployeesTotal.clear();
	  newEmployeesTotal.sendKeys(totalEmp);
	  
	}

	@Given("Edit the description as {string}")
	public void edit_the_description_as(String description1) {
	  WebElement newDescription = driver.findElement(By.xpath("//textarea[@name='description']"));
	  newDescription.clear();
	  newDescription.sendKeys(description1);
	}


	@When("Click on the Edit link")
	public void click_on_the_edit_link() {
		 WebElement saveBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='smallSubmit'])[1]")));
	     saveBtn.click();

	}

	@Then("Account Edited successfully")
	public void account_edited_successfully() {
	  System.out.println("Account Edited successfully");
	}


}
