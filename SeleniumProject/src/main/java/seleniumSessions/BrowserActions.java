package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserActions {

	WebDriver driver;

	public WebDriver launch_browser(String browser) {

		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
			break;

		default:
			System.out.println("the browser not found  " + browser);
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		 

	}

	public void launch_url(String url) {
		driver.get(url);
	}

	public String get_pagetitle() {
		return driver.getTitle();

	}

	public void quit_browser() {
		driver.quit();
	}
	
	public void close_browser() {
		driver.close();
	}

}
