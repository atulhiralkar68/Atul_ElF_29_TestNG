package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSendDataIntoATextField {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/");
		driver.findElement(By.id("wzrk-cancel")).click();
		driver.findElement(By.id("search")).sendKeys("a","b","c","defhg",Keys.CONTROL+"a");
	}

}
