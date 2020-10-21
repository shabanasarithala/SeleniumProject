package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandle_Without_SelectClass {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		String dob = "25-Oct-1990";

		String dayOptionsXpath = "//select[@id='day']/option";
		String monthOptionsXpath = "//select[@id='month']/option";
		String yearOptionsXpath = "//select[@id='year']/option";

		// selectValueFromDropdownWithoutSelectclass(driver, "xpath" , dayOptionsXpath,
		// dob.split("-")[0]);
		// selectValueFromDropdownWithoutSelectclass(driver, "xpath", monthOptionsXpath,
		// dob.split( "-") [1]);
		// selectValueFromDropdownWithoutSelectclass(driver, "xpath", yearOptionsXpath,
		// dob.split("-") [2]);

		String dayOptionsCSS = "select#day option";
		String monthOptionsCSS = "select#month option";
		String yearOptionsCSS = "select#year option";

		selectValueFromDropdownWithoutSelectclass(driver, "css", dayOptionsCSS, dob.split("-")[0]);
		selectValueFromDropdownWithoutSelectclass(driver, "css", monthOptionsCSS, dob.split("-")[1]);
		selectValueFromDropdownWithoutSelectclass(driver, "css", yearOptionsCSS, dob.split("-")[2]);

	}

	public static void selectValueFromDropdownWithoutSelectclass(WebDriver driver, String locator, String locatorValue,
			String value) {
		List<WebElement> options_values = null;
		if (locator.equals("xpath")) {
			options_values = driver.findElements(By.xpath(locatorValue));
		} else if (locator.equals("css")) {

			options_values = driver.findElements(By.cssSelector(locatorValue));
		}

		System.out.println(options_values.size());
		for (int i = 0; i < options_values.size(); i++) {
			if (options_values.get(i).getText().equals(value)) {
				options_values.get(i).click();
				break;
			}
		}

	}

}
