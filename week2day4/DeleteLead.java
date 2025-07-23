package week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");	
		ChromeDriver driver = new ChromeDriver(options);
		
		// Load Url
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		//Enter username and password
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click on the Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on the CRMSFA 
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on the Leads 
		driver.findElement(By.linkText("Leads")).click();
//		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		// Click on the FindLeads 
		driver.findElement(By.linkText("Find Leads")).click();
//		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		//click on phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9094542382");
		//click find leads button
		driver.findElement(By.linkText("Find Leads")).click();
	    //select first leadID
		WebElement firstLeadElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		// Capture the Lead ID
		String leadID = firstLeadElement.getText();
		System.out.println("Captured Lead ID: " + leadID);	
		//click the first leadID
		firstLeadElement.click();
	
		

	}

}
