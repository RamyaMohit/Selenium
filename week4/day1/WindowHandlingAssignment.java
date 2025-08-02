package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingAssignment {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		//Enter the username and password
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//click on the login button	
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();		
		//click CRM/SFA button
        driver.findElement(By.linkText("CRM/SFA")).click();
        //click contacts button
        driver.findElement(By.linkText("Contacts")).click();
        //click merge contacts button
        driver.findElement(By.linkText("Merge Contacts")).click();
        //click on from contact element      
        driver.findElement(By.xpath("//a[contains(@href,'partyIdFrom')]")).click();      
        //explicit wait to met the condition
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println(until);
        //move window to child page
    	Set<String> allPageAddress = driver.getWindowHandles();
		System.out.println(allPageAddress);
		List<String>  allAdrdresses = new ArrayList<String>(allPageAddress);
		//get child page address
		String childWindow = allAdrdresses.get(1);
		//switchto child window
		driver.switchTo().window(childWindow);
		//get first resulting contact
		WebElement element1 = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a"));
		String firstContact = element1.getText();
		element1.click();
		System.out.println(firstContact);
		//focus on parent window
		String parentWindow = allAdrdresses.get(0);
		//switchto parent window
		driver.switchTo().window(parentWindow);
		
		//click to contact
        driver.findElement(By.xpath("//a[contains(@href,'ComboBox_partyIdTo')]")).click();      
        Set<String> allPageAddress2 = driver.getWindowHandles();
		System.out.println(allPageAddress2);
		List<String>  allAdrdresses2 = new ArrayList<String>(allPageAddress2);
		String childWindow2 = allAdrdresses2.get(1);
		//switchto child window
		driver.switchTo().window(childWindow2);
		
		 WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(10));
		 WebElement until2 = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")));
	     until2.click();
	     
	     String parentWindow2 = allAdrdresses2.get(0);
		 //switchto parent window
		 driver.switchTo().window(parentWindow2);
		 
		 driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		 
		 Thread.sleep(1000);
	     Alert alert1 = driver.switchTo().alert();   
	     alert1.accept();
	     //get title of the page
	     String title = driver.getTitle();
	     System.out.println(title);
	     		
	}

}
