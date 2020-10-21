package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle_SelectClass {

	public static void main(String[] args) {

		// select html tag based drop downs

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		// Select select = new Select(day);
		// select.selectByIndex( 25);
		// select.selectByValue( "12");
		// select.selectByVisibleText( "9");
		// Select select1 = new Select(month);
		// select1.selectByVisibleText( "Jun");
		// Select select2 = new Select(year);
		// select2.selectByVisibleText( "1996");
		/*
		 * List<WebElement> options_List = select.getOptions();
		 * System.out.println("the total number of values in list "+options_List.size())
		 * ; for(int i=0; i<options_List.size(); i++) {
		 * System.out.println(options_List.get(i).getText()); }
		 */

		SelectDropDown(day, "12");
		SelectDropDown(month, "Oct");
		SelectDropDown(year, "1996");

		getDropDownValues(day);
		getDropDownValues(month);
		getDropDownValues(year);

	}

	public static void getDropDownValues(WebElement element) {
		Select select = new Select(element);
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: " + optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());
		}
	}

	public static void SelectDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	public static void SelectDropDown(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

}
