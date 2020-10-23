package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptUtilTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");

		JavaScriptUtil jsutil = new JavaScriptUtil(driver);

		/*
		 * WebElement logo =
		 * driver.findElement(By.xpath("//a[@class='nav-logo-link']")); WebElement
		 * hellosignIn = driver.findElement(By.id("nav-link-accountList")); WebElement
		 * signinbtn = driver.findElement(By.xpath("//span[@class='action-inner']"));
		 * WebElement mailid = driver.findElement(By.id( "ap_email")); WebElement
		 * mailname = driver.findElement(By.id( "email"));
		 */

		jsutil.scrollPageDown();
		Thread.sleep(5000);
		jsutil.scrollPageUp();
		/*
		 * jsutil.scrollIntoView(signinbtn); jsutil.flash(signinbtn);
		 */
		// jsutil.scrollPageUp();

		// jsutil.drawBorder( logo);

		// System.out.println(jsutil.getPageInnerText());

		// System.out.println("title of the page before signin is ---> " +
		// jsutil.getTitleByJS());

		// jsutil.clickElementByJS(hellosignIn);
		// String title = jsutil.getTitleByJS();
		// System.out.println("title of the page after signin is ---> " + title);

		/*
		 * jsutil.generateAlert( "clicked on signIn"); Alert alert
		 * =driver.switchTo().alert(); alert.accept();
		 */
		// System.out.println("---------------------------------------------------------------------------------------");
		// System.out.println(jsutil.getBrowserInfo());

	}

}
