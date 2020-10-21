package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Language_Links {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get( "https://www.google.co.in/");
		 
		 List<WebElement> lng_list = driver.findElements( By.xpath( " //div[@id='SIvCob']/a"));
		int lng_count = lng_list.size();
		 System.out.println("total number of languages are "+lng_count);
		 for(int i=0; i<lng_count; i++) {
			 
			  String lng_txt = lng_list.get(i).getText();
			  System.out.println(lng_txt);
			  lng_list.get(i).click();
			  lng_list = driver.findElements( By.xpath( " //div[@id='SIvCob']/a"));
				
			  
			 
		 }
		 driver.quit();

	}

}
