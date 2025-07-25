package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		// Load URL
		driver.get("https://leafground.com/button.xhtml");	
		// Maximize the Browser
		driver.manage().window().maximize();	
		
		//click the button 
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		//get the title of the page	
		String pageTitle = driver.getTitle();
		System.out.println("Page Title is: " + pageTitle);
		 
		 String title2 = "Dashboard";
		 //Verify the title
		 if(pageTitle.equalsIgnoreCase(title2))
		 {
			 System.out.println("Same title");
		 }else {
			 System.out.println("Not Same title");
		 }	 
		 //navigate to previous page
		 driver.navigate().back();
		 //check if the button is disable
		 boolean buttonEnable = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']/span")).isEnabled();
		 System.out.println(buttonEnable);
		 //location of submit button
		 Point location1 = driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-icon ui-c pi pi-bookmark'][1]")).getLocation();
		 System.out.println("location is:" + location1);
		 
		//get the background color of text
		 String bgColor =driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
		 System.out.println("Background color is:" + bgColor);
		 //get the height and width of the button
		int buttonHeight = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize().getHeight();
		int buttonWidth=driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize().getWidth();
		System.out.println("Height of button is:"+ buttonHeight + " & Width of the button is:" + buttonWidth);
		//close the browser
		driver.close();
	}

}
