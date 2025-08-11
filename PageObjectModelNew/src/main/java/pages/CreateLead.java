package pages;

import org.openqa.selenium.By;

import Base.BaseClassNew;


public class CreateLead extends BaseClassNew {

public CreateLead enterCompanyName() {
	
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
    return this;
	}

public CreateLead enterFirstName() {
	
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
	return this;
}

public CreateLead enterLastName() {
	
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
	return this;
}

public ViewLeadPage clickCreateLead() {
	
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage();
}

	
}
