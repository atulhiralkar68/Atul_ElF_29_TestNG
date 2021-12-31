package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoMouseHovering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
//		actions.contextClick().perform();
		actions.moveToElement(driver.findElement(By.linkText("MEN"))).perform();
		actions.click(driver.findElement(By.linkText("Sherwanis"))).perform();
	}

}
