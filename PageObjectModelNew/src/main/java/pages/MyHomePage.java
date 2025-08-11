package pages;

import org.openqa.selenium.By;

import Base.BaseClassNew;


public class MyHomePage extends BaseClassNew {
	
public MyLeadsPage clickLeadsLink() {
		
	driver.findElement(By.linkText("Leads")).click();
	return new MyLeadsPage();
	}


}
