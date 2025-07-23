package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class createLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		
		
		ChromeDriver driver = new ChromeDriver(options);

		// Load Url
		driver.get("http://leaftaps.com/opentaps/");

		// Maximize the Browser
		driver.manage().window().maximize();

		// Enter the username
		// findElement()
		// sendKeys
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click on the CreateLead link
		driver.findElement(By.linkText("Create Lead")).click();
		
		// Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");

		// Enter the first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");

		// Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bala");
		
		// Handling dropdown
		// Step1: Find the element
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));

		// Step2: Create an Object for Select Class
		Select options1 = new Select(sourceElement);
		
		// Step3: Use the method to select to Select the value
		// options.selectByIndex(3);
		// options.selectByVisibleText("Employee");
		options1.selectByValue("LEAD_EXISTCUST");

		// Click on the Create Lead button
		driver.findElement(By.name("submitButton")).click();
		
		
	
	}

}
