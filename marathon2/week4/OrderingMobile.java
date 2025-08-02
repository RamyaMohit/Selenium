package marathon2.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch the URL
		ChromeDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));	
		driver.get("https://dev209663.service-now.com");	
		driver.manage().window().maximize();
		
		//Enter username
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		//Enter Password
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("qy/Q6A=vOM3x");
		//click login button
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		//shadow.findElementByXPath("(//div[@class='sn-polaris-tab can-animate polaris-enabled'])[1]").click();
		WebElement allMenu = shadow.findElementByXPath("(//div[@class='sn-polaris-tab can-animate polaris-enabled'])[1]");
	    allMenu.click();
		
	}

}
