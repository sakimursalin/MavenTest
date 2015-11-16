package whatever;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShotUtil extends StartWebDriver {

	public static void takeScreenShot (String filename) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("Screenshot\\" +filename +".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
