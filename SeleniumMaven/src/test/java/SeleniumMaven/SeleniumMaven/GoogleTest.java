package SeleniumMaven.SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver; 

	@BeforeTest 
	public void StartBrowser_NavURL() { 
	driver = new FirefoxDriver(); 
	driver.manage().window().maximize(); 
	}


	@AfterTest 
	public void CloseBrowser() {
	 driver.quit(); 
	} 

	@Test 
	public void testToCompareDoubles() { 
	driver.get("http://www.google.com");
	 } 
	
}
