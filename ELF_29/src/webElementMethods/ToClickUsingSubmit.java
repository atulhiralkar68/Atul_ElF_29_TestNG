package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClickUsingSubmit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demo.vtiger.com/vtigercrm/");
//		driver.findElement(By.id("username")).clear();
//		driver.findElement(By.id("username")).sendKeys("Sumanth");
//		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.id("password")).sendKeys("abcd1234");
//		driver.findElement(By.xpath("//button[text()='Sign in']")).submit();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).submit();
	}

}
