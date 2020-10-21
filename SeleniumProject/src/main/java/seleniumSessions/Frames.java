package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	static By header = By.tagName("h2");

	public static void main(String[] args) {
		// http://www.londonfreelance.org/courses/frames/index.html
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get( "http://www.londonfreelance.org/courses/frames/index.html");
		 driver.switchTo().frame( "main");
		 ElementUtil elementutil = new ElementUtil(driver);
		 String header_txt = elementutil.get_text(header);
		 System.out.println(header_txt);
		 if(header_txt.contains("Title bar")) {
			 System.out.println("switched to frame");
		 }
		 else
			 System.out.println("didnt switch to frame");
		 

	}

}
