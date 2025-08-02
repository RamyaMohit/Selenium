package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0hmve49wsm9ad1483g51uu2c6b3462962.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//open the child page link
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//store address in set
		Set<String> allPageAddress = driver.getWindowHandles();
		System.out.println(allPageAddress);
		List<String>  allAdrdresses = new ArrayList<String>(allPageAddress);
		String page2 = allAdrdresses.get(1);
		String page1 =allAdrdresses.get(0);
		//Switch to page2
		driver.switchTo().window(page2);
		String childPageTitle = driver.getTitle();		
		System.out.println("child page:" +childPageTitle);
		driver.close();
		//switch to page1
		driver.switchTo().window(page1);
		String parentPageTitle = driver.getTitle();		
		System.out.println("parent page:" + parentPageTitle);

		}

}
