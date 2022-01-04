package Vtiger;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Atul
 *
 */
public class TC_10 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		//Step 1: Launch the Browser

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Step 2: Enter Valid URL

		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		String actualUrl = "http://localhost:8888/index.php?action=index&module=Home";
		String currentUrl = driver.getCurrentUrl();
		assertEquals(actualUrl, currentUrl,"URL is incorrect" );

		//Step 3: Enter Valid Username
		WebElement userName = driver.findElement(By.name("user_name"));
		userName.clear();
		userName.sendKeys("admin");
		String actualUsername="admin";
		String expectedName=userName.getAttribute("value");
		assertEquals(actualUsername, expectedName, "Username is incorrect");

		//Step 4: Enter Valid Password

		WebElement password = driver.findElement(By.name("user_password"));
		password.clear();
		password.sendKeys("root");
		String actualPassword="root";
		String expectedPassword = password.getAttribute("value");
		assertEquals(actualPassword, expectedPassword, "Password is inCorrect");

		//Step 5:Click on Login Button

		WebElement loginBtn = driver.findElement(By.id("submitButton"));
		loginBtn.click();
		String expectedTitle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle, actualTitle ,"Home Page not Display");

		//Step 6: Click On Product Link

		WebElement productLink = driver.findElement(By.linkText("Products"));
		//String expectedProductPageTitle
		productLink.click();
		String expectedProductPageTitle = "Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
		String actualProductPageTitle = driver.getTitle();
		assertEquals(actualProductPageTitle, expectedProductPageTitle,"Product page not display");

		//Step 7: Create New Product
		WebElement newProduct = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		newProduct.click();


		//Step 8:Product name text field
		WebElement product = driver.findElement(By.name("productname"));
		product.sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@class='crmbutton small cancel']")).click();

		//Step 9:Logout
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();

	}
}
