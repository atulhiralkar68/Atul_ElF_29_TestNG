package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	

//		driver.get("https://www.oracle.com/java/technologies/downloads/");
//		driver.findElement(By.linkText("jdk-11.0.13_linux-aarch64_bin.deb")).click();
//		WebElement disabledElement = driver.findElement(By.xpath("//a[@class='download-file icn-lock']"));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledElement = driver.findElement(By.xpath("//input[@disabled]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", disabledElement);
		js.executeScript("arguments[0].value='Sumanth';", disabledElement);
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='';", disabledElement);
		
		
	}

}
