package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click the alert button
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();		
		driver.findElement(By.linkText("FLIGHTS")).click();
		//getwindow address of all the page
		Set<String> allPageAddress = driver.getWindowHandles();
		System.out.println(allPageAddress);
		//convert set to list
		List<String>  allAdrdresses = new ArrayList<String>(allPageAddress);
		//get parent address
		String parentPage = allAdrdresses.get(0);
		//get child address
		String childPage = allAdrdresses.get(1);
		//move to child page
		driver.switchTo().window(childPage);
		//get the title of child page
		String childPageTitle = driver.getTitle();
		System.out.println(childPageTitle);
		//close the child page
		driver.close();
		//move to parent window
		driver.switchTo().window(parentPage);



	}

}
