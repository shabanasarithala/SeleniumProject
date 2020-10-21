package seleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindow_List {
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
		List<String> handles_list = new ArrayList<String>(handles);
	String	parent_windowID = handles_list.get(0);
	System.out.println("parent windowID is "+parent_windowID);
	String	child_windowID = handles_list.get(1);
	System.out.println("child windowID is "+child_windowID);
		

	}

}
