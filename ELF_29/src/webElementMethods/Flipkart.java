package webElementMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(3000);
		addToCart(driver, "APPLE iPhone SE (Black, 64 GB)");
		addToCart(driver, "APPLE iPhone 12 (Black, 64 GB)");
		addToCart(driver, "APPLE iPhone 12 (Blue, 128 GB)");

		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='APPLE iPhone 12 (Black, 64 GB)']/../../../..//div[text()='Remove']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Cancel']/..//div[text()='Remove']")).click();
	}

	static void addToCart(WebDriver driver, String mobileName) throws InterruptedException {
		driver.findElement(By.xpath("//div[text()='"+mobileName+"']")).click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			Thread.sleep(5000);
			driver.close();
		}
		driver.switchTo().window(parentWindowId);
	}

}
