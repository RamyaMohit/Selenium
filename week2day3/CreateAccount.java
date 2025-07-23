package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize the Browser
		driver.manage().window().maximize();
		// sendKeys
		driver.findElement(By.id("username")).sendKeys("democsr");
		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on the accounts tab link
		driver.findElement(By.linkText("Accounts")).click();
		
		//click on the create account tab
		driver.findElement(By.linkText("Create Account")).click();
		
		//Enter account name in text field
		driver.findElement(By.id("accountName")).sendKeys("Ramya");
		
		//Enter description field
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Enter number of employees
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		
		//Enter sitename
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Click create account button
		driver.findElement(By.className("smallSubmit")).click();
	
		//close the driver
		driver.close();
				
	}

}
