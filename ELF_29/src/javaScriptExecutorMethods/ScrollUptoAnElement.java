package javaScriptExecutorMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUptoAnElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	

		driver.get("https://meesho.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement expectedEle = driver.findElement(By.xpath("//strong[text()='Beauty & Makeup']"));
		
//		js.executeScript("arguments[0].scrollIntoView(true);", expectedEle);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
	}

}
