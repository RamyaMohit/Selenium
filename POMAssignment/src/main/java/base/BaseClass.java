package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static ChromeDriver driver;
    
	@BeforeMethod
	public void preConditions() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void postConditions() {
		driver.close();

	}
}
