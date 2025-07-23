package week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		// Click on the CRMSFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on the Leads link
		driver.findElement(By.linkText("Leads")).click();

		// Click on the CreateLead link
		driver.findElement(By.linkText("Create Lead")).click();
		// Enter company name
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeafOrg");

		// Enter the first name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ramya");
		//Enter the Last name
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Mohit");		
		// Enter the first name local
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("RamyaB");
		//Enter departname
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		//Enter description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead created");
		//Enter email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramyabalakrishnan95@gmail.com");

		//Select state/province
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state1 = new Select(state);
		state1.selectByVisibleText("New York");
		//Click on create button
		driver.findElement(By.name("submitButton")).click();
		//click Edit button
		driver.findElement(By.linkText("Edit")).click();
		//Clear description field
		driver.findElement(By.id("updateLeadForm_description")).clear();
		//Enter important note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit Lead");
		//Enter Update button
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		//getTitle
		//To get the Title of the page
		String title = driver.getTitle();
		System.out.println("Page title:"+ title);
		
		driver.close();
		
	}

}
