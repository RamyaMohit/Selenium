package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("https://leafground.com/frame.xhtml");	
		// Maximize the Browser
		driver.manage().window().maximize();
		//switch inside the frame
		driver.switchTo().frame(2);
		//get into inner frame  frame1
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(innerFrame);
		//click the button
		driver.findElement(By.xpath("//button[@id='Click']")).click();
	}

}
