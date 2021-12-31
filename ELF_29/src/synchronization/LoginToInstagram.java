package synchronization;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToInstagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		

//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
//				.withTimeout(30, TimeUnit.SECONDS)
//				.pollingEvery(10, TimeUnit.MILLISECONDS)
//				.ignoring(NoSuchElementException.class);


		driver.get("https://www.instagram.com/");
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userame")));
		WebElement usTf = driver.findElement(By.name("username"));
		driver.findElement(By.name("password")).sendKeys("123455Fads");
		driver.findElement(By.xpath("//button[.='Log In']")).click();
	}
}
