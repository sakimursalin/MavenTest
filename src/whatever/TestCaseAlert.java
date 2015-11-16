package whatever;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseAlert extends StartWebDriver{

	@Test(priority=1) //@BeforeTest
	public void javaScriptAlertPage () throws InterruptedException{
		
		ClickUtil.clickMethod("xpath", "//*[@id='main']/div[3]/div[1]/a[1]");
		Thread.sleep(2000);
		ClickUtil.clickMethod("linkText", "JS Popup Alert");
		Thread.sleep(2000);
		
	}
	
	@Test(priority=2)
	public void alertMethodOne () throws InterruptedException {
		String url = driver.getCurrentUrl();
		Thread.sleep(1000);
		ClickUtil.clickMethod("xpath", "//*[@id='main']/div[6]/a");
		Thread.sleep(2000);
		
		WindowHandlingUtil.multipleWindows(1);
			
		WebElement ele = element("id", "iframeResult");
		driver.switchTo().frame(ele);
		
		ClickUtil.clickMethod("xpath", "html/body/button");
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(5000);
		ClickUtil.clickMethod("xpath", "html/body/button");
		Thread.sleep(3000);
		alert.accept();
		Thread.sleep(2000);
		WindowHandlingUtil.multipleWindows(1);
		driver.close();
		WindowHandlingUtil.multipleWindows(0);
		driver.navigate().to(url);
		//steUp();
	}
	
	@Test(priority=3)
	public void alertMethodtwo () throws InterruptedException {
		ClickUtil.clickMethod("xpath", "//*[@id='main']/div[8]/a");
		WindowHandlingUtil.multipleWindows(1);
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		ClickUtil.clickMethod("xpath", "html/body/button");
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Saki Mursalin");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.close();
		WindowHandlingUtil.multipleWindows(0);
		driver.close();
	}
	
	/*@Test(priority=1)
	public void alertMethodTwo () throws InterruptedException {
		ClickUtil.clickMethod("xpath", "//*[@id='main']/p[19]/a");
		Thread.sleep(2000);
		ClickUtil.clickMethod("xpath", "//*[@id='sidemenuinner']/div/a[74]");
		Thread.sleep(2000);
		ClickUtil.clickMethod("xpath", "//*[@id='main']/div[3]/div/a");
		Thread.sleep(2000);
		
		WindowHandlingUtil.multipleWindows(1);
		Thread.sleep(3000);
		//driver.switchTo().frame(driver.findElement(By.id("tryitLeaderboard")));
		element("id", "//*[@id='myFile']").sendKeys("/Users/Shakib/Desktop/Arafat Mamun (Resume).doc");
		driver.close();
		driver.navigate().back();
	}*/
	
	/*public void homepage(){
		driver.navigate().back();
	}*/
	
}
