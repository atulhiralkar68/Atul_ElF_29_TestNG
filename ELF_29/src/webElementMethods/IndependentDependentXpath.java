package webElementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependentDependentXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/men-apparel");
		String parentWindowId = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(@href,'10167357')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'15088192')]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'2175513')]")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			driver.findElement(By.xpath("//button[.='M']")).click();
			driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
		driver.findElement(By.xpath("//div[text()='H&M']/../..//span[text()='Size: ']")).click();
		driver.findElement(By.xpath("//div[text()='XL']")).click();
		driver.findElement(By.xpath("//div[text()='Done']")).click();
		
	}

}
