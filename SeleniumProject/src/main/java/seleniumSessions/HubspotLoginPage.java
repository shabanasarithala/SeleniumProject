package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HubspotLoginPage {

	
	// by locators ..... page objects
	static By email = By.id( "username");
	static By password = By.id( "password");
	static By login_button = By.id( "loginBtn");
	static By signup_link = By.linkText( "Sign up");
	static By homepage_header = By.cssSelector( "h1.private-page__title");
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		BrowserActions br = new BrowserActions();
		WebDriver driver = br.launch_browser("chrome");
		br.launch_url( "https://app.hubspot.com/login");
		Thread.sleep( 5000);
		ElementUtil elementutil = new ElementUtil(driver);
		elementutil.sendkeys(email,  "shabanasarithala2@gmail.com");
		elementutil.sendkeys(password,  "Disha129@");
		elementutil.click(login_button);
		Thread.sleep( 5000);
		String header = elementutil.get_text(homepage_header);
		System.out.println("home page header is "+ header);
		if(header.contains( "Sales Dashboard")) {
			System.out.println("logged in sucessfully");
		}
		else {
			System.out.println("could not login");
		}
		
		System.out.println(br.get_pagetitle());
		
		 

	}

}
