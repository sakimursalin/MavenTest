package whatever;

import org.openqa.selenium.WebElement;

public class ClickUtil extends StartWebDriver {

	public static void clickMethod (String attribute, String locatorOfAttribute) {
		WebElement ele = element(attribute, locatorOfAttribute);
		ele.click();
		}

	public static void sendKeysMethod (String attribute, String locatorOfAttribute, String myString) {
		WebElement ele = element(attribute, locatorOfAttribute);
		ele.sendKeys(myString);
		}

	
}

