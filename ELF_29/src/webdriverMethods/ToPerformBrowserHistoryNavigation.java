package webdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.onlinesbi.com");
		Thread.sleep(2000);
		driver.get("https://netbanking.hdfcbank.com/netbanking");
		Thread.sleep(2000);
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		
		URL url = new URL("https://www.selenium.dev/downloads/");
		nav.to(url);
	}

}
