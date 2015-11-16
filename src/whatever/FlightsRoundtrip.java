package whatever;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FlightsRoundtrip extends StartWebDriver {

	public static String flyingFrom = "New York, NY (JFK-John F. Kennedy Intl.)";
	public static String flyingTo = "London, England, UK (LHR-Heathrow)";
	public static String departingDate = "10/30/2015";
	public static String returningDate = "11/24/2015";

	@Test
	public static int verifyRoundTrip() throws NoSuchElementException {
		
		/* ClickUtil.clickMethod("xpath", "//*[@id='tab-flight-tab']");
		 ClickUtil.sendKeysMethod("xpath", "//*[@id='flight-origin']",
		 flyingFrom); ClickUtil.sendKeysMethod("xpath",
		 "//*[@id='flight-destination']", flyingTo);
		 ClickUtil.sendKeysMethod("xpath", "//*[@id='flight-departing']",
		 departingDate); ClickUtil.sendKeysMethod("xpath",
		 "//*[@id='flight-returning']", returningDate);
		 ClickUtil.clickMethod("xpath", "//*[@id='search-button']");
		  
		 WindowHandlingUtil.multipleWindows(1); 
		 driver.close();
		 WindowHandlingUtil.multipleWindows(0); */
		 
		ArrayList<String> article = new ArrayList<String>();
		ArrayList<WebElement> articleElement = new ArrayList<WebElement>();

		int i=0;
		while (true){
			
			article.add("//*[@id='flightModule"+i+"']/article");
			try {
				articleElement.add(element("xpath", article.get(i)));
				System.out.println(articleElement.get(i));
			} catch (NoSuchElementException e) {
				System.out.println("Total no of Options : " +articleElement.size());
				article.remove(i);
				break;
			}
			
			i++;
		}				 
		return articleElement.size();
	}
	
}
