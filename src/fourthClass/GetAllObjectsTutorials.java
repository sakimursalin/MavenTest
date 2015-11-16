package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.StartWebdriver;

public class GetAllObjectsTutorials extends StartWebdriver{
	
	@Test
	public static void getAllObjects() {
/*		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		for(WebElement allEle: allLinks) {
			//System.out.println("Link : " + allEle.getText());
			System.out.println("href : " + allEle.getAttribute("href"));
		}*/
		
		List<WebElement> element = driver.findElements(By.tagName("input"));
		
		for(WebElement test : element) {
			System.err.println("id : " + test.getAttribute("id"));
			System.err.println("name : " + test.getAttribute("name"));
			System.err.println("title : " + test.getAttribute("title"));
		}
	}

}
