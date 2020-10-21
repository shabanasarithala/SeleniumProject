package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {

	WebDriver driver;

	/**
	 * 
	 * @param driver
	 */

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * 
	 * @param locator
	 * @return
	 */

	public WebElement get_element(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
	}

	/**
	 * 
	 * @param locator
	 * @param value
	 */

	public void sendkeys(By locator, String value) {
		get_element(locator).sendKeys(value);
	}

	/**
	 * 
	 * @param locator
	 * @param value
	 */

	public void actionsSendkeys(By locator, String value) {
		Actions action = new Actions(driver);
		WebElement element = get_element(locator);
		action.sendKeys(element, value).build().perform();

	}

	/**
	 * 
	 * @param locator
	 */

	public void click(By locator) {
		get_element(locator).click();
	}

	/**
	 * 
	 * @param locator
	 */

	public void actionsClick(By locator) {
		Actions action = new Actions(driver);
		WebElement element = get_element(locator);
		action.click(element).build().perform();
	}

	/**
	 * 
	 * @param locator
	 * @return
	 */

	public String get_text(By locator) {
		return get_element(locator).getText();
	}

	/**
	 * 
	 * @param locator
	 */

	public void getDropDownValues(By locator) {
		Select select = new Select(get_element(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: " + optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {
			System.out.println(optionsList.get(i).getText());
		}
	}

	/**
	 * 
	 * @param locator
	 * @param value
	 */

	public void SelectDropDownVisibleText(By locator, String value) {
		Select select = new Select(get_element(locator));
		select.selectByVisibleText(value);
	}

	/**
	 * 
	 * @param locator
	 * @param index
	 */

	public void SelectDropDownIndex(By locator, int index) {
		Select select = new Select(get_element(locator));
		select.selectByIndex(index);
	}

	/**
	 * 
	 * @param locator
	 * @param value
	 */

	public void selectdropdownvalue(By locator, String value) {

		Select select = new Select(get_element(locator));
		List<WebElement> optionslist = select.getOptions();
		System.out.println(optionslist.size());
		for (int i = 0; i < optionslist.size(); i++) {
			if (optionslist.get(i).getText().equals(value)) {
				optionslist.get(i).click();
				break;
			}

		}

	}

	/**
	 * 
	 * @param locator
	 * @return
	 */

	public List<String> getDropDownValuesByLocator(By locator) {
		List<String> ar = new ArrayList<String>();

		Select select = new Select(get_element(locator));
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total values in drop down: " + optionsList.size());
		for (int i = 0; i < optionsList.size(); i++) {

			ar.add(optionsList.get(i).getText());
		}
		return ar;
	}

	/**
	 * 
	 * @param locator
	 * @param locatorValue
	 * @param value
	 */

	public void selectValueFromDropdownWithoutSelectclass(String locator, String locatorValue, String value) {
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

	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param optionsList
	 * @param value
	 */
	public void doRightClick(WebDriver driver, By locator, List<WebElement> optionsList, String value) {

		Actions action = new Actions(driver);
		action.contextClick(get_element(locator)).build().perform();

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

	/**
	 * 
	 * @param driver
	 * @param locator
	 * @param optionsList
	 * @return
	 */

	public ArrayList<String> getRightClickOptions(WebDriver driver, By locator, List<WebElement> optionsList) {

		ArrayList<String> ar = new ArrayList<String>();

		Actions action = new Actions(driver);
		action.contextClick(get_element(locator)).build().perform();
		System.out.println("number of options in list " + optionsList.size());

		for (int i = 0; i < optionsList.size(); i++) {
			String text = optionsList.get(i).getText();

			ar.add(text);

		}
		return ar;
	}

}
