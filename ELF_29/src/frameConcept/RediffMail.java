package frameConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String subject = "Test email";
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("login")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123",Keys.ENTER);
		driver.findElement(By.xpath("//a[.='Write mail']")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com",Keys.TAB);
		driver.findElement(By.xpath("//label[text()='Subject:']/following-sibling::input")).sendKeys(subject);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi it is working");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		driver.findElement(By.linkText("Inbox")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[@title='"+subject+"']/..//cite[@title='Select mail']")).click();
		driver.findElement(By.xpath("//span[text()='Delete' and @class='rd_fil_del']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
	}
}
