package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckWhetherACheckBoxIsSelectedOrNot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.kalkifashion.com/mens.html");
		driver.findElement(By.id("wzrk-cancel")).click();
		WebElement checkBoxEle = driver.findElement(By.xpath("//span[text()='Within 45 Days']/../..//input[@type='checkbox']"));
		System.out.println(checkBoxEle.isSelected());
		checkBoxEle.click();
		System.out.println(checkBoxEle.isSelected());
	}

}
