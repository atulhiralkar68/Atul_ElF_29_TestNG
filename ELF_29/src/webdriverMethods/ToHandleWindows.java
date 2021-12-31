package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;


public class ToHandleWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.naukri.com/");
		String parentWindowId = driver.getWindowHandle();
		String expectedTitle = "Tech Mahindra";
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			if(expectedTitle.equals(driver.getTitle())) {
				break;
			}
		}
		driver.switchTo().window(parentWindowId);
		String sourceCode = driver.getPageSource();
	}

}
