package marathon.week3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PvrCinemas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");		
		ChromeDriver driver = new ChromeDriver(options);
		//wait for seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		// Load Url
		driver.get("https://www.pvrcinemas.com/");	
		// Maximize the Browser
		driver.manage().window().maximize();
		//click the chennai location
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		//Click cinema under quickbook
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();		
		//select cinema
		WebElement cinema = driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]"));
		cinema.click();
		
		
	}

}
