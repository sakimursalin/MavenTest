package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class StartWebdriver {
	
public static WebDriver driver = null;
public static String facebook = "http://www.facebook.com";
public static String yahoo = "http://www.yahoo.com";
public static String google = "http://www.google.com";
public static String echo = "http://www.echoecho.com/html.htm";
public static String radioButton = "http://www.w3schools.com/html/html_forms.asp";
public static String windowHandle = "http://www.enterprise.com";
public static String alert = "http://www.w3schools.com/js/js_popup.asp";
public static String uploadFile = "http://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_fileupload_get";

	
	@BeforeSuite
	public void setUp(){
		driver = new FirefoxDriver();
		driver.navigate().to(facebook);
		
	}
	
	@AfterSuite(alwaysRun=true)
	public void tearDown() {
			driver.close();
			driver.quit();	

	}

	
public static WebElement getElement(String locator, String attributeOfLocator) {
		
		if(locator.equalsIgnoreCase("id")){
			return driver.findElement(By.id(attributeOfLocator));
		}else if(locator.equalsIgnoreCase("className")){
			return driver.findElement(By.className(attributeOfLocator));
		}else if(locator.equalsIgnoreCase("name")){
			return driver.findElement(By.name(attributeOfLocator));
		}else if(locator.equalsIgnoreCase("xpath")){
			return driver.findElement(By.xpath(attributeOfLocator));
		}else if(locator.equalsIgnoreCase("css")){
			return driver.findElement(By.cssSelector(attributeOfLocator));
		}else
			throw new NoSuchElementException("No Such Element : " + attributeOfLocator);
	}



}
