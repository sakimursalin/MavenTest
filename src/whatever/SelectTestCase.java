package whatever;

import java.util.ArrayList;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SelectTestCase extends StartWebDriver {

	@Test
	public void selectMethod() throws NoSuchElementException {
	
		ArrayList<String> duration = new ArrayList<String>();
		ArrayList<WebElement> durationElement = new ArrayList<WebElement>();
		
		ArrayList<String> departure = new ArrayList<String>();
		ArrayList<WebElement> departureElement = new ArrayList<WebElement>();
		
		ArrayList<String> arrival = new ArrayList<String>();
		ArrayList<WebElement> arrivalElement = new ArrayList<WebElement>();
		
		int x = FlightsRoundtrip.verifyRoundTrip();
		System.out.println(x);
		
	/*	for (int i =0; i <x; i++) {
			duration.add("//*[@id='flex-card-" +i +"']/div[2]/div[1]/div[2]/div[1]");
			durationElement.add(element("xpath", duration.get(i)));
			
			departure.add("//*[@id='flex-card-" +i +"']/div[2]/div[1]/div[1]/div[1]/span[1]");
			departureElement.add(element("xpath", departure.get(i)));
			
			arrival.add("//*[@id='flex-card-" +i +"']/div[2]/div[1]/div[1]/div[1]/span[2]");
			arrivalElement.add(element("xpath", arrival.get(i)));
			
		}
	
		for (int i=0; i<x; i++){
			System.out.println(i+1 +". " +"Duration : " +durationElement.get(i).getText() +" Departure-Arrival : " +departureElement.get(i).getText() +"-" +arrivalElement.get(i).getText());
		}*/
	
	}
	
}
