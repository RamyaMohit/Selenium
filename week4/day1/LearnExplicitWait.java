package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LearnExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		//Explicit wait
		
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Boolean until = wait.until(ExpectedConditions.numberOfWindowsToBe(3));
        System.out.println(until);
        
        }

}
