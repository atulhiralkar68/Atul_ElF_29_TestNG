package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToNavigateToParticularApp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
