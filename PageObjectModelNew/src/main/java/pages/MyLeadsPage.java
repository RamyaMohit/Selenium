package pages;

import org.openqa.selenium.By;

import Base.BaseClassNew;


public class MyLeadsPage extends BaseClassNew {
	
public CreateLead clickCreateLeadLink() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLead();
}
}
