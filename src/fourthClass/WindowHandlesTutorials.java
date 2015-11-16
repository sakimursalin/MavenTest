package testCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver.TargetLocator;
import org.testng.annotations.Test;

import utilities.ClickUtil;
import utilities.StartWebdriver;
import utilities.WindowHandlesUtil;

public class WindowHandlesTutorials extends StartWebdriver{
	
	@Test
	public void multipleWindow() throws InterruptedException {
		Thread.sleep(10000);
		ClickUtil.clickButton("xpath", "//*[@id='standardTab']/tbody/tr[2]/td/table/tbody/tr[2]/td/a[1]");
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		List<String> listOfHandles = new ArrayList<String>(handles);
		TargetLocator targetWindow = driver.switchTo();
		targetWindow.window(listOfHandles.get(1));
		Thread.sleep(10000);
		ClickUtil.clickButton("xpath", ".//*[@id='content']/table/tbody/tr[2]/td[1]/a");
		Thread.sleep(5000);
		targetWindow.window(listOfHandles.get(0));
		Thread.sleep(10000);
		ClickUtil.clickButton("xpath", ".//*[@id='oneWayDetails']");
		Thread.sleep(5000);
	


	}

}
