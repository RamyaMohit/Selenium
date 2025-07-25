package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameInteraction  {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");	
		// Maximize the Browser
		driver.manage().window().maximize();
		//switch inside the frame
		driver.switchTo().frame("iframeResult");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		//click the try it button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch to alert
		Alert confiramtion= driver.switchTo().alert();
		String userName = "Ramya";
		//Enter the username
		confiramtion.sendKeys(userName);
		confiramtion.accept();	
		//get text from alert
		String text1 = driver.findElement(By.id("demo")).getText();
        System.out.println("Result on page: " + text1);
        //compare the recieved Text and entered username
		if(text1.contains(userName))
		{
			System.out.println("Entered text is  same");
		}else {
			System.out.println("Entered text is different");
		}
		
		
}

}
		
	

