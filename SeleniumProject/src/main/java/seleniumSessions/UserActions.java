package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserActions {
	
	static By email = By.id( "email");
	static By pwd = By.id( "pass");
	static By login = By.name( "login");

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		/*WebElement email = driver.findElement(By.id( "email"));
		WebElement pwd = driver.findElement(By.id( "pass"));
		WebElement login = driver.findElement(By.name( "login"));
		Actions action = new Actions(driver);
		action.sendKeys(email,  "shabana.teste@gmail.com").build().perform();
		action.sendKeys(pwd,  "sha1223").build().perform();
		action.click(login).build().perform();*/
		
		ElementUtil eu = new ElementUtil(driver);
		eu.actionsSendkeys(email,  "shabana@gmail.com");
		eu.actionsSendkeys(pwd,  "gcfgxgckjx");
		eu.actionsClick(login);
		
		
		
		
		
	}

}
