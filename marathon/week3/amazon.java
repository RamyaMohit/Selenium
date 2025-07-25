package marathon.week3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class amazon {

	public static void main(String[] args) throws InterruptedException {	
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("guest");		
		ChromeDriver driver = new ChromeDriver(options);
		//wait for seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Load Url
		driver.get("https://www.amazon.in/");	
		// Maximize the Browser
		driver.manage().window().maximize();
		//select bag for boys
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags for boys");
		//click the option
		driver.findElement(By.xpath("//div[text()='bags for boys'][1]")).click();
		//get the result
		WebElement text1 = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span[1]"));
		String total = text1.getText();
		System.out.println(total);
		//checked the first two checkbox
		driver.findElement(By.xpath("//li[@id='p_123/648962']//a[@class='a-link-normal s-navigation-item']")).click();
		driver.findElement(By.xpath("//li[@id='p_123/627098']//a[@class='a-link-normal s-navigation-item']")).click();
		
		Thread.sleep(1000);
		//sort based on newest arrivals
		WebElement sortDropdown = driver.findElement(By.xpath("//span[@class='a-dropdown-label']"));
		sortDropdown.click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		//get first element name
		List<WebElement> allElements = driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
		WebElement list1 = allElements.get(0);
		String name =list1.getText();
		System.out.println("First item name: " + name);
		//get the newest price		
		List<WebElement> price = driver.findElements(By.xpath("(//span[@class='a-price-whole'])"));
		int numberOfPriceElements = price.size();
		System.out.println("The number of price elements is: " + numberOfPriceElements);
		// Create list to store integer prices
		List<Integer> newPriceList = new ArrayList<>();
		for (int i = 0; i < numberOfPriceElements; i++) {
		    String priceText = price.get(i).getText().replace(",", ""); // Remove comma
		    if (!priceText.isEmpty()) {	
		        int price1 = Integer.parseInt(priceText); 
		        newPriceList.add(price1);
		    }
		}
//		System.out.println("Price list: " + newPriceList);
		if (!newPriceList.isEmpty()) {
		    int firstPrice = newPriceList.get(0);
		    System.out.println("The first price is: " + firstPrice);
		}
	   //get the page title
		String pageTitle = driver.getTitle();
		System.out.println("page title:" + pageTitle);
		//close the browser
		driver.close();
	}

}
