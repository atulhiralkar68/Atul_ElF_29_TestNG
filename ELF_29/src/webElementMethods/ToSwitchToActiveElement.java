package webElementMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchToActiveElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.switchTo().activeElement().sendKeys("username field is active",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("adsfhklas",Keys.TAB);
		System.out.println(driver.switchTo().activeElement().getTagName());
		
	}
}
