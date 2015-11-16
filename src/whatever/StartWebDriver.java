package whatever;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;


public class StartWebDriver {

	public static WebDriver driver = null;
	public static String facebook="http://facebook.com";
	public static String enterprise = "http://www.enterprise.com/car_rental/home.do";
	public static String w3school="http://www.w3schools.com";
	public static String expedia = "https://www.expedia.com/Flights-Search?trip=roundtrip&leg1=from:new%20york,to:HNL,departure:11/30/2015TANYT&leg2=from:HNL,to:new%20york,departure:11/30/2015TANYT&passengers=children:0,adults:1,seniors:0,infantinlap:Y&mode=search";
	
	@BeforeSuite
	public static void steUp(){
		driver = new FirefoxDriver();
		driver.navigate().to(expedia);
	}

	public static WebElement element(String Attribute, String locatorOfAttribute) throws NoSuchElementException {
		if(Attribute.equalsIgnoreCase("linkText"))
			 return driver.findElement(By.linkText(locatorOfAttribute));
		else if (Attribute.equalsIgnoreCase("id"))
			 return driver.findElement(By.id(locatorOfAttribute));
		else if (Attribute.equals("xpath"))
			 return driver.findElement(By.xpath(locatorOfAttribute));
		else if (Attribute.equalsIgnoreCase("tagName"))
			 return driver.findElement(By.tagName("select"));
		else throw new NoSuchElementException  ("This element is not found: " +Attribute);
	}

	public static List<WebElement> getElements(String Attribute, String locatorOfAttribute){
		if(Attribute.equalsIgnoreCase("linkText"))
			return driver.findElements(By.linkText(locatorOfAttribute));
		else if (Attribute.equalsIgnoreCase("id"))
			return driver.findElements(By.id(locatorOfAttribute));
		else if (Attribute.equalsIgnoreCase("tagName"))
			return driver.findElements(By.tagName(locatorOfAttribute));
		else if (Attribute.equalsIgnoreCase("className"))
			return driver.findElements(By.className(locatorOfAttribute));
		else throw new NoSuchElementException ("This element is not found: " +Attribute);
	}

}
