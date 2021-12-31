package takingScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToTakeScreenshotOfWebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.zomato.com/");
		File tempFile = driver.findElement(By.xpath("//img[contains(@src,'8313a97515fcb0447d2d77c276532a511583262271')]")).getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/webelement.png");
		FileUtils.copyFile(tempFile, destFile);
	}

}
