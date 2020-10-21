package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcepts {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get( "https://www.google.com/");// launch url
			
			 System.out.println( driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 driver.navigate().to( "https://www.rediff.com/");
			  
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 driver.navigate().back();
			 System.out.println("navigated backward");
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 driver.navigate().forward();
			 System.out.println("navigated forward");
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 driver.navigate().back();
			 System.out.println("navigated backward");
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 driver.navigate().refresh();
			 System.out.println("refreshed");
			 System.out.println(driver.getTitle());
			 System.out.println(driver.getCurrentUrl());
			 driver.quit();

	}

}
