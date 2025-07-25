package week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("https://leafground.com/alert.xhtml");	
		// Maximize the Browser
		driver.manage().window().maximize();
		//click the button
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		//alert the confirmation
		Alert confiramtion= driver.switchTo().alert();
		String text1 = confiramtion.getText();
		System.out.println(text1);
		confiramtion.accept();		
		
	}

}
