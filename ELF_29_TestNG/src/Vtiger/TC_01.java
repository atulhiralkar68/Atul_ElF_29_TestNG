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
public class TC_01 {
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
		assertEquals(currentUrl, actualUrl,"URL is incorrect" );

		//Step 3: Enter Valid Username
		WebElement userName = driver.findElement(By.name("user_name"));
		userName.clear();
		userName.sendKeys("admin");
		String actualUsername="admin";
		String expectedName=userName.getAttribute("value");
		assertEquals(expectedName, actualUsername, "Username is incorrect");

		//Step 4: Enter Valid Password
		WebElement password = driver.findElement(By.name("user_password"));
		password.clear();
		password.sendKeys("root");
		String actualPassword="root";
		String expectedPassword = password.getAttribute("value");
		assertEquals(expectedPassword, actualPassword, "Password is inCorrect");

		//Step 5:Click on Login Button
		WebElement loginBtn = driver.findElement(By.id("submitButton"));
		loginBtn.click();
		String expectedTitle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle ,"Home Page not Display");

		//Step 6: Click On Product Link
		WebElement productLink = driver.findElement(By.linkText("Products"));
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
		driver.findElement(By.name("button")).click();

		//Step 9: Verification step
		String expectedProductName="  Laptop";
		String productName = driver.findElement(By.id("mouseArea_Product Name")).getText();
		assertEquals(productName, expectedProductName,"Product name is display in List");

		//step 10:Logout
		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		driver.close();
	}
}
