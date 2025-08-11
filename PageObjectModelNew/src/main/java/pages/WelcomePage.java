package pages;

import org.openqa.selenium.By;
import Base.BaseClassNew;


public class WelcomePage extends BaseClassNew {
	
	public MyHomePage clikCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
        return new MyHomePage();
	}

}
