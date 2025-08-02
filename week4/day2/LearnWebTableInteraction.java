package week4.day2;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTableInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Intialize the chrome driver
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Add Implicit wait for webpage fully loaded
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//launch the URL
		driver.get("https://erail.in/");
		//Enter from station
		WebElement fromStation =driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
		fromStation.clear();
		fromStation.sendKeys("MAS");
		fromStation.sendKeys(Keys.TAB);
		//Enter to station
		WebElement toStation = driver.findElement(By.xpath("//input[@id='txtStationTo']"));
		toStation.clear();
		toStation.sendKeys("MDU");
		toStation.sendKeys(Keys.TAB);
		//uncheck the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
		if(checkbox.isSelected())
		{
			checkbox.click();
		}
		
		Thread.sleep(2000);
		//Select the train names in the table
		List<WebElement> trainNames = driver.findElements(By.xpath("//div[@id='divTrainsList']//table/tbody/tr/td[2]"));

		Integer tableSize = trainNames.size();
        System.out.println("Total Trains Found: " + tableSize);
        
        //create empty set
        Set<String> uniqNames = new LinkedHashSet<>();
        //Iterate the Train table List 
        for(int i=0;i < tableSize;i++)
        {
        	String trainNames1 = trainNames.get(i).getText();
        	//Add tablenames in set 
        	if(!uniqNames.add(trainNames1))
        	{
        		//retrieve the unique names
        		System.out.println("Unique train names:" + uniqNames);
        	}
        }
        
        
        

	}

}
