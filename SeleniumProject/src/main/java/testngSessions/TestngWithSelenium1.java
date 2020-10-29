package testngSessions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngWithSelenium1 {
	
	WebDriver driver;
	
	/*@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get( "https://www.google.com/");
		driver.manage().deleteAllCookies();
	}*/
	
	@BeforeMethod
	public void setUp1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get( "https://www.google.com/");
		driver.manage().deleteAllCookies();
	}
	@Test(priority=1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals( title, "Google");
	}
	
	@Test(priority=2)
	public void checkUrl() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue( url.contains( "google"));
	}
	
	
	@Test(priority=3)
	public void checkSearchBox() {
		WebElement search = driver.findElement(By.xpath( "//input[@title = 'Search']"));
		Assert.assertTrue( search.isDisplayed());
		
	}
	
	/*@AfterTest
	public void teardown() {
		driver.quit();
	}*/
	
	@AfterMethod
	public void teardown1() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
