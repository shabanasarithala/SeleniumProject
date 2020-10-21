package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_Auth {
	
	 
	
	static By confirm_auth = By.tagName("h3");

	public static void main(String[] args) throws InterruptedException {
		//the-internet.herokuapp.com/basic_auth
		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 String username = "admin";
			String password = "admin";
		 driver.manage().window().maximize();
		 driver.get( "http://"+username+ ":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		 Thread.sleep( 5000);
		 ElementUtil elementutil = new ElementUtil(driver);
		 String auth_text = elementutil.get_text(confirm_auth);
		 if(auth_text.equalsIgnoreCase("basic Auth")){
			 System.out.println("credentials passed and logged in");
			 
		 }
		 else
			 System.out.println("credentials didnt passed");
			 
			 
		 

	}

}
