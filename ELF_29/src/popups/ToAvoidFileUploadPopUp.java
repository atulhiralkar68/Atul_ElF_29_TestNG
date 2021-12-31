package popups;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToAvoidFileUploadPopUp {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.naukri.com/");
		wait.until(ExpectedConditions.numberOfWindowsToBe(4));
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			driver.close();
		}
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("wdgt-file-upload")).click();
		Runtime.getRuntime().exec("./autoItProgram/naukri.exe");
	}

}
