package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtil extends StartWebdriver{
	
	public static void takeScreenShot(String fileName) {
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("Selenium\\" + fileName + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
