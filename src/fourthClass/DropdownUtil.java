package utilities;

import org.openqa.selenium.support.ui.Select;

public class DropdownUtil extends StartWebdriver{
	
	private static Select dropdown = null;
	
	public static void select(String locator, int index, String attributeOfLocator) {
		dropdown = new Select (getElement(locator, attributeOfLocator));
		dropdown.selectByIndex(index);
	}
	
	public static void select(String locator, String enterValue, String attributeOfLocator) {
		dropdown = new Select (getElement(locator, attributeOfLocator));
		dropdown.selectByValue(enterValue);
	}
	
	public static void selecteByVisibleText(String locator,String attributeOfLocator, String enterText) {
		dropdown = new Select (getElement(locator, attributeOfLocator));
		dropdown.selectByVisibleText(enterText);
		
	}
	
}
