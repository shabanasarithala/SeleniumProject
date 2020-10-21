package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		 
		//System.setProperty( "webdriver.chrome.driver", "E:\\Automation hub\\eclipse workspace\\SeleniumProject\\driver files\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver", "./driver files/chromedriver.exe");
		 WebDriver driver = new ChromeDriver(); // launch chrome
		 driver.get( "https://www.google.com/");// launch url
		 String title = driver.getTitle();
		 System.out.println("The title of page is " + title);
		 // validation point 
		 if(title.equals( "Google"))
			 System.out.println("correct title");
		 else
        System.out.println("incorrect title");	
		 
		 String current_url = driver.getCurrentUrl();
		 System.out.println(current_url);
		 if(current_url.contains( "google")) {
			 System.out.println("correct url");
			 
		 }
				 else {
				 System.out.println("incorrect url");
			 
			 
		 }
		 driver.quit();
		 
	
	
	}

}
