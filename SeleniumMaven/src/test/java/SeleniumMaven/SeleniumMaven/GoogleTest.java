package SeleniumMaven.SeleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
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
	 //driver.quit(); 
	} 

	@Test 
	public void testToCompareDoubles() {
		
		System.out.println("#####################################");
    	
    	System.out.println("Starting Firefox Driver");
    	
        driver.get("http://www.guru99.com/selenium-tutorial.html"); 
        
        System.out.println("Opened Guru Url");
        
        String title = driver.getTitle();   
        
        System.out.println("Title is : "+title);
        
        Assert.assertTrue(title.contains("Free Selenium Tutorials"));
        
        System.out.println("#####################################");
	 } 
	
}
