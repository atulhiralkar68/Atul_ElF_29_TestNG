package popups;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToUnderstandStale {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		Actions actions = new Actions(driver);
		actions.click().perform();
		driver.findElement(By.className("langCardClose")).click();
		
		WebElement searchButton = driver.findElement(By.linkText("SEARCH"));
		driver.navigate().refresh();
		driver.findElement(By.linkText("SEARCH")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//img[@alt=\"MMT's LOGO\"]")).click();
//		searchButton.click();
	}
}
