package testCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.ClickUtil;
import utilities.StartWebdriver;

public class AttachingFileTutorial extends StartWebdriver{

	@Test
	public void attachingFile() throws InterruptedException {
		
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='myFile']")).sendKeys("/Users/Mujab/Desktop/TechnosoftLogo.png");
		Thread.sleep(5000);
	}
	
}
