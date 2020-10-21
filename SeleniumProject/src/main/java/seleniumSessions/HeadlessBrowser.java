package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		//co.addArguments( "--headless");
		co.addArguments( "--incognito");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get( "https://www.google.com/");// launch url
		 String title = driver.getTitle();
		 System.out.println("The title of page is " + title);
		 // validation point 
		 if(title.equals( "Google")) {
			 System.out.println("correct title");
		 }
		 else {
      System.out.println("incorrect title");	
		 }
		 
		

	}

}
