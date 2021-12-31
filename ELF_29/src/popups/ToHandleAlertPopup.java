package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.marimallappawomenscollege.org/contactus.php?current=contactus");
		driver.findElement(By.name("Send")).click();
		Alert alertPopUp1 = driver.switchTo().alert();
		String alertMessage = alertPopUp1.getText();
		System.out.println(alertMessage);
		Thread.sleep(2000);
		alertPopUp1.accept();
		driver.findElement(By.name("name")).sendKeys("Sumanth");
		Thread.sleep(2000);
		driver.findElement(By.name("Send")).click();
		Alert alertPopUp2 = driver.switchTo().alert();
		System.out.println(alertPopUp2.getText());
		Thread.sleep(2000);
		alertPopUp2.dismiss();
	}

}
