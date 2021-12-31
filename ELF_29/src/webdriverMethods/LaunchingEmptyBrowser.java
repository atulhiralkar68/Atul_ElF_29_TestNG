package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingEmptyBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		FirefoxDriver driver1 = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver2 = new EdgeDriver();
	}

}
