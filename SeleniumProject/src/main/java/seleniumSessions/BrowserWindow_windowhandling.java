package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindow_windowhandling {
	
	static By popup_1 = By.linkText("Good PopUp #1");
	static By popup_2 = By.linkText("Good PopUp #2");
	static By popup_3 = By.linkText("Good PopUp #3");
	static By popup_4 = By.linkText("Good PopUp #4");

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get( "http://www.popuptest.com/goodpopups.html");
		 ElementUtil elementutil = new ElementUtil(driver);
		 elementutil.click(popup_1);
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent_windowID = it.next();
		System.out.println("parent window id is "+parent_windowID);
		String child_windowID = it.next();
		System.out.println("child window id is "+child_windowID);
		driver.switchTo().window(child_windowID);
		System.out.println("current window title "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parent_windowID);
		System.out.println("current window title "+driver.getTitle());
		
		
		 
		 

	}

}
