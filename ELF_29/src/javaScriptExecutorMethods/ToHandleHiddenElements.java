package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		
		driver.get("https://www.facebook.com/signup");
		WebElement hiddenEle = driver.findElement(By.name("custom_gender"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0);");
		String title = (String) js.executeScript("return document.title");
		System.out.println(title);
//		js.executeScript("arguments[0].value='It is working';", hiddenEle);
//		driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']")).click();
	}

}
