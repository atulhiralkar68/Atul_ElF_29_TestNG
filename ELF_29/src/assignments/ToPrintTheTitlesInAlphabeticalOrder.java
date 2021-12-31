package assignments;

import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPrintTheTitlesInAlphabeticalOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
		Set<String> allWindowIds = driver.getWindowHandles();
		Set<String> titles = new TreeSet<>();
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String title = driver.getTitle();
			titles.add(title);
		}
		
		for(String pageTitle:titles) {
			System.out.println(pageTitle);
		}
		
		driver.quit();
		
	}

}
