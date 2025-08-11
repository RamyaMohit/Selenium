package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class CreateAccountPage extends BaseClass{
	
	public CreateAccountPage enterAccountname()
	{
		driver.findElement(By.id("accountName")).sendKeys("POM Account");
		return this;
	}
	
	public CreateAccountPage enterTotalEmployees()
	{
		driver.findElement(By.id("numberEmployees")).sendKeys("8");
		return this;
	}
	
	public ViewAccountPage clickCreateAccountlink()
	{
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage();
	}

}
