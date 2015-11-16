package whatever;

import org.testng.annotations.Test;

public class TestCaseWindowHandling extends StartWebDriver {

	@Test
	public void testCaseTwo () throws InterruptedException {
		ClickUtil.clickMethod("xpath", "//*[@id='standardTab']/tbody/tr[2]/td/table/tbody/tr[2]/td/a[1]");
		WindowHandlingUtil.multipleWindows(1);
		Thread.sleep(2000);
		ClickUtil.clickMethod("xpath", "//*[@id='content']/table/tbody/tr[2]/td[1]/a");
		Thread.sleep(2000);
		WindowHandlingUtil.multipleWindows(0);
		ClickUtil.clickMethod("xpath", "//*[@id='oneWayDetails']");
		WindowHandlingUtil.multipleWindows(1);
		Thread.sleep(3000);
		ClickUtil.clickMethod("xpath", "html/body/a");
		
		
	}
}
