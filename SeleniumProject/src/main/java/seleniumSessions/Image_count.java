package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image_count {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get( "https://www.amazon.in/");
		 List<WebElement> image_list = driver.findElements( By.tagName( "img"));
		 int image_count = image_list.size();
		 System.out.println("the number of images are "+image_count);
		 for(int i=0; i<image_count; i++) {
			 System.out.println(i+"---->"+image_list.get(i).getAttribute( "src"));
		 }
		 driver.quit();

	}

}
