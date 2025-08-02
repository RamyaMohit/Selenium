package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click continue shoppping
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		Actions act1 = new Actions(driver);
		WebElement element1 = driver.findElement(By.linkText("Conditions of Use & Sale"));
		//scroll action perform
		act1.scrollToElement(element1).perform();
		element1.click();
		
	}

}
