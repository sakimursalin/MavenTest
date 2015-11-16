package utilities;

public class BrowserUtil extends StartWebdriver{
	
	
	public static void backButton() {
		driver.navigate().back();
	}
	
	public static void forwardButton() {
		driver.navigate().forward();
		
	}
	
	public static void refreshPage() {
		driver.navigate().refresh();
		
	}
	
	public static void navigateToWebPage(String url) {
		driver.navigate().to(url);
		
	}
	
	public static void windowMaximize() {
		driver.manage().window().maximize();
		
	}

}
