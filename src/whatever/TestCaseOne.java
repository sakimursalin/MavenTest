package whatever;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseOne extends StartWebDriver {

	@Test
	public void elementAction() throws InterruptedException {
		try{
		WebElement ele1 = element("linkText", "Sign Up");
		ele1.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		WebElement ele2 = element("id", "u_0_b");
		ele2.sendKeys("Mohammad");
		Thread.sleep(2000);
		Element.clearMethod(ele2);
		}catch (Exception s){
			ScreenShotUtil.takeScreenShot(this.getClass().toString());
			Assert.fail(s.toString());
		}
				
	}
}
