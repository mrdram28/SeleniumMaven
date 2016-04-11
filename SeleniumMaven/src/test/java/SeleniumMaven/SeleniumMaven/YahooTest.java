package SeleniumMaven.SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class YahooTest {
	
	WebDriver driver; 

	@BeforeTest 
	public void StartBrowser_NavURL() { 
	driver = new FirefoxDriver(); 
	driver.manage().window().maximize(); 
	}


	@AfterTest 
	public void CloseBrowser() {
	 //driver.quit(); 
	} 

	@Test 
	public void testToCompareDoubles() {
		
		System.out.println("#####################################");
    	
    	System.out.println("Starting Firefox Driver");
    	
        driver.get("https://in.yahoo.com/"); 
        
        System.out.println("Opened Yahoo Url");
        
        String title = driver.getTitle();   
        
        System.out.println("Title is : "+title);
        
        Assert.assertTrue(title.contains("Yahoo"));
        
        System.out.println("#####################################");
	 } 

}
