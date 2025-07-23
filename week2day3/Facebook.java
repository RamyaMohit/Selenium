package week2day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		// Click on the create account button on facebook link
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter firstname
		driver.findElement(By.name("firstname")).sendKeys("Ramya");
		
		//Enter lastname
		driver.findElement(By.name("lastname")).sendKeys("Dinesh");
		
		//Select date in dropdown
		WebElement sourceElement = driver.findElement(By.id("day"));
		Select options1 = new Select(sourceElement);
		options1.selectByValue("13");
		
		//Select month in dropdown
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByValue("5");
		
		//Select year in dropdown
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByValue("1995");
		
		//Select gender
		driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).click(); 
		
		//Enter email address
		driver.findElement(By.name("reg_email__")).sendKeys("mohitramya005@gmail.com");
		
		//Enter password
		driver.findElement(By.name("reg_passwd__")).sendKeys("abcdefg@1995");
		
		//Enter submit button
		driver.findElement(By.name("websubmit")).click();
		
		
	}

}
