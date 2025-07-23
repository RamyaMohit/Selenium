package week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class Xpathlocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\pc\\eclipse-workspace\\learnAutomation\\Driver\\msedgedriver.exe");		
		
		EdgeDriver driver = new EdgeDriver();
		
		// Load Url
		driver.get("https://www.flipkart.com/");
		// Maximize the Browser
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mens shirt");
		
	}

}
