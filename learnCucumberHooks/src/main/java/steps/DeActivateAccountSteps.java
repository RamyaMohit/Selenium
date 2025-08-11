package steps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeActivateAccountSteps extends BaseClass {
	
	
	@When("Click on the DeActivate link")
	public void click_on_the_de_activate_link() {
		 WebElement deleteAccount = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Deactivate Account")));
		 deleteAccount.click();
	}

	@When("Click OK link on the alert")
	public void click_ok_link_on_the_alert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.alertIsPresent());

	    Alert alert = driver.switchTo().alert();
	    alert.accept(); // Click OK
	}

	@Then("Delete Account Successfully")
	public void delete_account_successfully() {
	   System.out.println("Account Deleted successfully");
	}


}
