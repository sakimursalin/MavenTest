package whatever;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends StartWebDriver {

	@Test
	public static void DropDownTutorial() throws InterruptedException {
		
		/*WebElement[] abc = { element("xpath", "//*[@id='month']"), element("xpath", "//*[@id='day']"),
				element("xpath", "//*[@id='year']") };

		for (int i = 0; i < abc.length; i++) {
			Select dropdown = new Select(abc[i]);
			Thread.sleep(2000);

			if (i == 0)
				dropdown.selectByVisibleText("Feb");
			else if (i == 1)
				dropdown.selectByVisibleText("10");
			else
				dropdown.selectByVisibleText("2009");
		
		} 
		*/
		
		 
		 List<WebElement> xyz= getElements("tagname","select");
		 for (int i=0; i<xyz.size(); i++){
		 Select dropdown = new Select(xyz.get(i)); Thread.sleep(2000);
		  
		  if (i==0) dropdown.selectByVisibleText("Feb"); else if (i==1)
		  dropdown.selectByVisibleText("10"); else
		  dropdown.selectByVisibleText("2009"); 
		 }
		 Set<WebElement> mySet = new HashSet<>();
		 mySet.add(xyz.get(0));
		 mySet.add(xyz.get(1));
		 mySet.add(xyz.get(0));
		System.out.println(mySet.size());	 
	}
		 

		/*
		 * DropDownUtil.selection("xpath", "//*[@id='month']", "Feb");
		 * Thread.sleep(1000); DropDownUtil.selection("xpath", "//*[@id='day']",
		 * "10"); Thread.sleep(1000); DropDownUtil.selection("xpath",
		 * "//*[@id='year']", "2008");
		 */
	

}
