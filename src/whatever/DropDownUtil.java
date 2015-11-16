package whatever;

import org.openqa.selenium.support.ui.Select;

public class DropDownUtil extends StartWebDriver {

	public static Select dropdown = null;
	
	public static void selection(String attribute, String locatorOfAttribute, String value) {
		
		dropdown = new Select (element(attribute, locatorOfAttribute));
		dropdown.selectByVisibleText(value);
		
	}
}
