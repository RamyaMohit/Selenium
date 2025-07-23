package week2day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Axespath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
			
		ChromeDriver driver = new ChromeDriver(options);

		// Load Url
		driver.get("http://leaftaps.com/opentaps/");

		// Maximize the Browser
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//form[@id='login']/p[2]"));

	}

}
