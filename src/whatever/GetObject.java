package whatever;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetObject extends StartWebDriver {

	@Test
	public static void objectMethod() throws InterruptedException {
			
		Set<String> mySet = new HashSet<String>();
		List<WebElement> myObject = driver.findElements(By.tagName("a"));
		
		for (int i=0; i<myObject.size(); i++){
			System.out.println(i + "  :" + myObject.get(i).getText());
		}
		System.out.println(myObject.size());
		
		for (int i=0;i<myObject.size(); i++){
			mySet.add(myObject.get(i).getText());
		}
		
		System.out.println(mySet.size());
		
		//java.util.Iterator<String> iterator = mySet.iterator();
		ArrayList<String> newArray = new ArrayList<String>(mySet);
		
		for (int i=24; i<mySet.size(); i++){
			
			//driver.findElement(By.linkText(iterator.next())).click();
			driver.findElement(By.linkText(newArray.get(i))).click();
			driver.manage().window().maximize();
			
			Set<String> handles = driver.getWindowHandles();
			List<String> listOfHandles = new ArrayList<String>(handles);
			
				if(listOfHandles.size()==1) {
				driver.navigate().back();
				Thread.sleep(5000);
				}
				else {
				
				TargetLocator targetWindow = driver.switchTo();
				targetWindow.window(listOfHandles.get(1));
				driver.close();
				targetWindow.window(listOfHandles.get(0));
					Thread.sleep(2000);
				}
			
		}
		
		
	}
}
