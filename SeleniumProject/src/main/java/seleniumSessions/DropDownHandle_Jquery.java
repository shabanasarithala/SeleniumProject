package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle_Jquery {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		// System.setProperty( , arg1)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		// single value
		// selectAllValuesFromDropdown(driver, "choice 2");

		// multiple values
		// selectAllValuesFromDropdown(driver, "choice 2" ,"choice 4" , "choice 6 2 3");

		// select all values
		selectAllValuesFromDropdown(driver, "ALL");

	}

	public static void selectAllValuesFromDropdown(WebDriver driver, String... value) {

		List<WebElement> choice_list = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		if (!value[0].equalsIgnoreCase("ALL")) {

			for (int i = 0; i < choice_list.size(); i++) {
				String choice_text = choice_list.get(i).getText();
				System.out.println(choice_text);

				for (int k = 0; k < value.length; k++) {
					if (choice_text.equals(value[k])) {
						choice_list.get(i).click();
						break;
					}

				}

			}

		}

		// for selecting all values
		else {
			try {

				for (int all = 0; all < choice_list.size(); all++) {
					choice_list.get(all).click();
				}

			} catch (Exception e) {

			}

		}

	}
}
