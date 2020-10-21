package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		String browser = "firefox";
		WebDriver driver = null;

		if (browser.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "./driver files/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "./driver files/geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance( SafariDriver.class).setup();

			driver = new SafariDriver();
		}

		else if (browser.equalsIgnoreCase("ie")) {

			driver = new InternetExplorerDriver();

		} else if (browser.equalsIgnoreCase("opera")) {

			driver = new OperaDriver();

		}
		
		else
		{
			System.out.println("the specified browser not found " + browser);
			
		}
		driver.get( "https://www.google.com/");// launch url
		 String title = driver.getTitle();
		 System.out.println("The title of page is " + title);
		 // validation point 
		 if(title.equals( "Google"))
			 System.out.println("correct title");
		 else
       System.out.println("incorrect title");	
		 driver.quit();
		 

	}

}
