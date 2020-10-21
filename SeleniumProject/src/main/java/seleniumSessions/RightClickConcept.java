package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		List<WebElement> optionsList = driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-icon')]"));
		// doRightClick(driver, rightClick, optionsList, "Copy");
		List<String> rightClickOptions = getRightClickOptions(driver, rightClick, optionsList);
		System.out.println(rightClickOptions);

	}

	public static void doRightClick(WebDriver driver, WebElement rightClickElement, List<WebElement> optionsList,
			String value) {

		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).build().perform();

		System.out.println("number of options in list " + optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();
			System.out.println(i + "-----" + text);
			if (text.equals(value)) {
				optionsList.get(i).click();
				break;
			}

		}

	}

	public static ArrayList<String> getRightClickOptions(WebDriver driver, WebElement rightClickElement,
			List<WebElement> optionsList) {

		ArrayList<String> ar = new ArrayList<String>();

		Actions action = new Actions(driver);
		action.contextClick(rightClickElement).build().perform();
		System.out.println("number of options in list " + optionsList.size());

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();

			ar.add(text);

		}
		return ar;
	}

}
