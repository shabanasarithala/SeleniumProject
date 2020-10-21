package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle_ByLocator {

	static By day = By.id("day");
	static By month = By.id("month");
	static By year = By.id("year");

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		List<String> dayslist = getDropDownValuesByLocator(driver, day);

		System.out.println("total days " + dayslist.size());
		System.out.println(dayslist);
		List<String> monthslist = getDropDownValuesByLocator(driver, month);
		System.out.println("total months " + monthslist.size());
		System.out.println(monthslist);
		List<String> yearlist = getDropDownValuesByLocator(driver, year);
		System.out.println("total years " + yearlist.size());
		System.out.println(yearlist);

	}

	public static List<String> getDropDownValuesByLocator(WebDriver driver, By locator) {
		List<String> ar = new ArrayList<String>();
		ElementUtil elementutil = new ElementUtil(driver);

		Select select = new Select(elementutil.get_element(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: " + optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {

			ar.add(optionsList.get(i).getText());
		}
		return ar;
	}
}
