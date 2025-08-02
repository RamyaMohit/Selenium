package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAmazonInteractions {

	public static void main(String[] args) throws IOException , InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Adding Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//click button continue shopping
//		driver.findElement(By.linkText("Continue shopping")).click();
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		//search the data
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("oneplus 9 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();
        //price of first mobile
        WebElement price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        String firstPrice = price.getText().replace(",", "").trim();
        Integer productPrice =Integer.parseInt(firstPrice);
        System.out.println("Mobile Price:" + productPrice);
        //number of customer ratings
        WebElement ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
        String customerRatings=ratings.getText();
        System.out.println("Customer ratings:" +customerRatings);
        //click the first text link
        driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-line-clamp-3-for-col-12 s-link-style a-text-normal'])[1]//span")).click();
        //take the screen shot of the page
        File source1 = driver.getScreenshotAs(OutputType.FILE);
        //setup the destination file
        File destination = new File("./Screenshot/phone.png");
        //store the screenshot in destinatio folder
        FileUtils.copyFile(source1, destination);
        //click the add to cart button
        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        Thread.sleep(3000);
        //get the cart subtotal
        WebElement subtotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        String phoneSubTotal = subtotal.getText().replace(",", "").trim();
        Integer cartTotal1 = Integer.parseInt(phoneSubTotal);
        System.out.println("cart subtotal is:" +cartTotal1);
        //verify the total
        if(productPrice == cartTotal1)
        {
        	System.out.println("Total is same");
        }else {
        	System.out.println("Total not same");
        }
        
        //close the browser
        driver.quit();
	}

}
