package marathon2.week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class marathon2Task1 {

	public static void main(String[] args) throws IOException, InterruptedException{
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));	
		driver.get("https://www.tatacliq.com/");	
		driver.manage().window().maximize();
		//click no thanks button
		driver.findElement(By.xpath("//button[@id='moe-dontallow_button']")).click();
		
		//mouse hover on the brands element
		WebElement brandList = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(brandList).perform();
		
		//mousehover on watches & accessories
		WebElement subBrand = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryDetailsValue'])[4]"));
		Actions act2 =new Actions(driver);
		act2.moveToElement(subBrand).perform();
		
		//click on the first option under featured brands
		driver.findElement(By.xpath("(//div[@class='DesktopHeader__brandsDetails'])[1]")).click();
		//select new ARRIVALS OPTION
		WebElement sourceElement = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select options1 = new Select(sourceElement);
		options1.selectByValue("isProductNew");
		
		//choose men from categories
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		
		//print all the prices

		List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']//h3"));

		List<String> priceList = new ArrayList<>();

		for (int i = 0; i < priceElements.size(); i++) {
		    try {
		        String allPrices = priceElements.get(i).getText();
		        String priceOnly = allPrices.replaceAll("[^\\d]", "").trim(); 
		        priceList.add(priceOnly);
		     
		       
		    } catch (StaleElementReferenceException e) {
		        // If stale element, fetch it again using dynamic XPath
		        WebElement refreshedElement = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder']//h3)[" + (i + 1) + "]"));
		        String refreshedPrice = refreshedElement.getText().replaceAll("[^\\d]", "").trim();
		        priceList.add(refreshedPrice);
		      //  System.out.println("Refetched price: " + refreshedPrice);
		    }
		}

		System.out.println("list price:" + priceList);
		for (String price1 : priceList) {
		    System.out.println("Price: " + price1);
		}
		Integer listRate1 = 0;
		
		if (!priceList.isEmpty()) {
		    String firstPrice = priceList.get(0);
		    listRate1 = Integer.parseInt(firstPrice);
		    System.out.println("First price: " + firstPrice);
		} 
		
		//click on th first resulting watch 
		driver.findElement(By.xpath("(//div[@class='PlpComponent__base'])[1]")).click();
		//use window handling to focus on child page
		Set<String> allPageAddress = driver.getWindowHandles();
		System.out.println(allPageAddress);
		//convert set to list
		List<String>  allAdrdresses = new ArrayList<String>(allPageAddress);
		//get child address
		String childPage = allAdrdresses.get(1);
		//move to child page
		driver.switchTo().window(childPage);
		//get first watch rate
		
		WebElement firstWatchPrice = driver.findElement(By.xpath("(//div[@class='ProductDetailsMainCard__price'])[1]//h3"));
		String rate=firstWatchPrice.getText().trim();
		String firstWatchRate = rate.replace("MRP", "").replace("₹", ""). replace(":", "").replace(",", "").trim();
		Integer newRate = Integer.parseInt(firstWatchRate);
		System.out.println("first price: " + newRate);
		
		//verify the prices
		if(listRate1.equals(newRate)) {
		    System.out.println("Both are same");
		} else {
		    System.out.println("Not same");
		}

		//click on add to bag button
		driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
		//get cart count
		String getCartCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("cart count:" + getCartCount);
		
		//click on cart icon
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		Thread.sleep(3000);
		  //take the screen shot of the page
        File source1 = driver.getScreenshotAs(OutputType.FILE);
        //setup the destination file
        File destination = new File("./Screenshot/watch.png");
        //store the screenshot in destinatio folder
        FileUtils.copyFile(source1, destination);
        //focus on parent window
    	Set<String> allPageAddress1 = driver.getWindowHandles();
		System.out.println(allPageAddress1);
		//convert set to list
		List<String>  allAdrdresses1 = new ArrayList<String>(allPageAddress1);
		//get parent address
		String parentPage1 = allAdrdresses1.get(0);
		//move to parent page
		driver.switchTo().window(parentPage1);
        //close the browser
		driver.close();
    
	}

}
