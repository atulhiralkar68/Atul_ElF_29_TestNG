package frameConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		

		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@src,'widget/app')]"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//span[text()='Gmail']")).click();
	}
}
