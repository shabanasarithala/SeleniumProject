package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popup_Alert_JS {
	
	static By signin_btn = By.name("proceed");

	public static void main(String[] args) {
		 
		//https://mail.rediff.com/cgi-bin/login.cgi
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get( "https://mail.rediff.com/cgi-bin/login.cgi");
		 ElementUtil elementutil = new ElementUtil(driver);
		 elementutil.click(signin_btn);
		 Alert alert = driver.switchTo().alert();
		 String alert_txt = alert.getText();
		 System.out.println(alert_txt);
		 alert.accept();
		
		 

	}

}
