package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverSessionConcept {

	public static void main(String[] args) {
		 
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get( "https://www.google.com/");// launch url
		 String title = driver.getTitle();
		 System.out.println("The title of page is " + title);
		 // validation point 
		 if(title.equals( "Google"))
			 System.out.println("correct title");
		 else
       System.out.println("incorrect title");	
		// driver.quit(); //Session ID is null
		 driver.close(); // NoSuchSessionException: invalid session id
		 
		 System.out.println(driver.getTitle());
// NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
	}

}
