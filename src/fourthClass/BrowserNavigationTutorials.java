package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.BrowserUtil;
import utilities.StartWebdriver;

public class BrowserNavigationTutorials extends StartWebdriver{
	
	@Test
	public void browserNavigation() throws InterruptedException {
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='u_0_x']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("http://www.google.com");
		
		
		/*BrowserUtil.windowMaximize();
		BrowserUtil.refreshPage();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='u_0_x']")).click();
		BrowserUtil.backButton();
		BrowserUtil.forwardButton();
		BrowserUtil.navigateToWebPage("http://www.google.com");*/
		
	}

}
