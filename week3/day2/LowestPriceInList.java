package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowestPriceInList {

	public static void main(String[] args) {
		// Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("https://www.amazon.in/");
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		// Search for phones
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");

		// Click the search button
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		
		// Get all phone price elements
		List<WebElement> allPhonePriceElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int numberOfPriceElements = allPhonePriceElements.size();
		System.out.println("The number of price elements is: " + numberOfPriceElements);

		// Create list to store integer prices
		List<Integer> newPriceList = new ArrayList<>();

		for (int i = 0; i < numberOfPriceElements; i++) {
			String priceText = allPhonePriceElements.get(i).getText().replace(",", "").trim();
			System.out.println("New price text: " + priceText);

			if (!priceText.isEmpty()) {
				try {
					int price = Integer.parseInt(priceText);
					newPriceList.add(price);
				} catch (NumberFormatException e) {
					System.out.println("Invalid price format: " + priceText);
				}
			}
		}

		// Sort and get lowest price
		if (!newPriceList.isEmpty()) {
			// sort in ascending order
			Collections.sort(newPriceList);  
			System.out.println("Sorted Price List: " + newPriceList);
			int lowestPrice = newPriceList.get(0);
			System.out.println("Lowest price is: ₹" + lowestPrice);
		} else {
			System.out.println("No valid prices found.");
		}

		// Close browser
		driver.close();
	}
}
