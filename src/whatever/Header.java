package whatever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Header extends StartWebDriver {


	@Test
	public void findHeaderNames() throws InterruptedException {
		
		List<WebElement> myList = driver.findElements(By.tagName("a"));
		for(int i=0; i<myList.size(); i++){
			System.out.println(i+1 +". " + myList.get(i).getText());	
		}
	for (int i=30; i<=38; i++){
		ClickUtil.clickMethod("linkText", myList.get(i).getText());	
		Thread.sleep(2000);
		driver.navigate().back();
		}
	}
}
