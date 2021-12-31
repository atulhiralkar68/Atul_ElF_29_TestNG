package actionsClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthScrollBarUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToDragAndDropTheCard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://trello.com/login");
		driver.findElement(By.id("user")).sendKeys("sumanthkeshav.scl@gmail.com");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("password")));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//div[text()='Selenium Practise']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Theory Qusetions']")));
		Actions actions = new Actions(driver);
		WebElement sourceEle = driver.findElement(By.xpath("//span[text()='Theory Qusetions']"));
		WebElement targetEle = driver.findElement(By.xpath("//h2[text()='Mock Qusetions']/../..//span[text()='Add a card']"));
//		actions.dragAndDrop(sourceEle, targetEle).perform();
		actions.clickAndHold(sourceEle).moveByOffset((430-168), 0).release().perform();
	}

}
