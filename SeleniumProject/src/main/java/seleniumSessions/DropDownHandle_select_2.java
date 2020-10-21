package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle_select_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		String dob = "12-Oct-1996";
		selectdropdownvalue(day, dob.split("-")[0]);
		selectdropdownvalue(month, dob.split("-")[1]);
		selectdropdownvalue(year, dob.split("-")[2]);

	}

	public static void selectdropdownvalue(WebElement element, String value) {

		Select select = new Select(element);
		List<WebElement> optionslist = select.getOptions();
		System.out.println(optionslist.size());
		for (int i = 0; i < optionslist.size(); i++) {
			if (optionslist.get(i).getText().equals(value)) {
				optionslist.get(i).click();
				break;
			}

		}

	}

}
