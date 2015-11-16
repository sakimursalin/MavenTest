package fourthClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;

import utilities.AlertUtil;
import utilities.ClickUtil;
import utilities.StartWebdriver;
import utilities.WindowHandlesUtil;

public class alertTutorials extends StartWebdriver{
	
	@Test
	public void alert() throws InterruptedException {
		
		Thread.sleep(5000);
		//Click on confirmed button
		ClickUtil.clickButton("xpath", ".//*[@id='main']/div[6]/a");
		WindowHandlesUtil.switchTo(1);
		//Switch to iFramne
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		//Click on try it button
		ClickUtil.clickButton("xpath", "html/body/button");
		//Switch to alert 
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		//Click on try it button
		ClickUtil.clickButton("xpath", "html/body/button");
		alert.accept();
		
		
	}

}
