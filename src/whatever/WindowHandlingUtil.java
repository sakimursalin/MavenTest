package whatever;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver.TargetLocator;

public class WindowHandlingUtil extends StartWebDriver{

	public static void multipleWindows(int i){
	
		Set<String> handles = driver.getWindowHandles();
		List<String> newHandles = new ArrayList<String>(handles);
		
		TargetLocator targetWindow = driver.switchTo();
		targetWindow.window(newHandles.get(i));
		
		
	}
}
