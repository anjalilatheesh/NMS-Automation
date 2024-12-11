package nmsHelpers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NmsDriver {
	
	/*
	 * This is the driver class of OrangeHRM Automation project.
	 */
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static interface WebDriverProvider {
	    WebDriver getDriver();
	}
	
	public static void load() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nms.nxtfruit.com/organisation-login");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
}


