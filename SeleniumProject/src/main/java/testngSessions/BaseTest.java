package testngSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters({"browser" , "url"})
	@BeforeTest
	public void setUp(String browser , String url) {
		System.out.println(" open the browser");
		if(browser.equals( "chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if (browser.equals( "firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else
			System.out.println("browser not found..........");
		driver.get(url);
		
	}
   
	@AfterTest
	public void tearDown() {
		System.out.println("close the browser");
		driver.quit();
	}
}
