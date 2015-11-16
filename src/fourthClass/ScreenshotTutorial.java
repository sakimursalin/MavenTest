package testCases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilities.DropdownUtil;
import utilities.ScreenshotUtil;
import utilities.StartWebdriver;

public class ScreenshotTutorial extends StartWebdriver{
	
	private static String selectMonth = "//*[@id='month']";
	private static String locatorXpath= "xpath";
	
	@Test
	public void screenshotTutorial() {
		DropdownUtil.select(locatorXpath, 2, selectMonth);
		DropdownUtil.select(locatorXpath, "12", selectMonth);
		DropdownUtil.selecteByVisibleText(locatorXpath, selectMonth, "Aug");
		
	/*	try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			ScreenshotUtil.takeScreenShot(this.getClass().toString()); 
			Assert.fail(e.toString());
		}*/
		
		
	}
	
	@AfterMethod
	public void afterMethod() {
		ScreenshotUtil.takeScreenShot(this.getClass().toString()); 
	}
	

}
