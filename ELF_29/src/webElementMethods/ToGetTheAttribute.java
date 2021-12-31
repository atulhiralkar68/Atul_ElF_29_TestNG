package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://demo.vtiger.com/vtigercrm/");
//		String attrValue = driver.findElement(By.xpath("//img[@class='img-responsive user-logo']"))
//				.getAttribute("id");
//		System.out.println(attrValue);
		
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.id("email")).sendKeys("abcdefg@123.com");
		String dataEntered = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(dataEntered);
	}
}
