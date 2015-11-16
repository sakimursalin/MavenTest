package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.DropdownUtil;
import utilities.StartWebdriver;

public class DropDownTutorials extends StartWebdriver{
	
	private static String selectMonth = "//*[@id='month']";
	private static String locatorXpath= "xpath";
	
	@Test
	public static void dropdown() throws InterruptedException {
	/*	Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		Thread.sleep(10000);
		dropdown.selectByIndex(2);
		Thread.sleep(5000);
		dropdown.selectByValue("12");
		Thread.sleep(5000);
		dropdown.selectByVisibleText("Aug");
		Thread.sleep(5000);*/
		
		Thread.sleep(10000);
		DropdownUtil.select(locatorXpath, 2, selectMonth);
		Thread.sleep(5000);
		DropdownUtil.select(locatorXpath, "12", selectMonth);
		Thread.sleep(5000);
		DropdownUtil.selecteByVisibleText(locatorXpath, selectMonth, "Aug");
		Thread.sleep(5000);
	}

}
