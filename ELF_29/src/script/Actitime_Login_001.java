package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Sumanth Keshav
 *
 */
public class Actitime_Login_001 {

	public static void main(String[] args) {
		//Step 1: Open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Chrome browser is launched successfully");
		driver.manage().window().maximize();
		System.out.println("browser window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Step 2: enter the valid url
		driver.get("https://demo.actitime.com/login.do");
		String expectedLoginPageTitle = "actiTIME - Login";
		String actualLoginPageTitle = driver.getTitle();
		if(expectedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Login Page is displayed successfully");
		}else {
			System.err.println("Login Page is not displayed successfully");
		}
		
		//Step 3: enter valid credentials
		String expectedUsernameData = "admin";		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(expectedUsernameData);
		String actualUsernameData = usernameTextField.getAttribute("value");
		if(expectedUsernameData.equals(actualUsernameData)) {
			System.out.println("Username is entered correctly");
		}else {
			System.err.println("Username is not entered correctly");
		}
		
		String expectedPasswordData = "manager";		
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(expectedPasswordData);
		String actualPasswordData = passwordTextField.getAttribute("value");
		if(actualPasswordData.equals(expectedPasswordData)) {
			System.out.println("Password is entered correctly");
		}else {
			System.err.println("Password is not entered correctly");
		}
		
		//Step 4: Click on Login button
		driver.findElement(By.id("loginButton")).click();
		String expectedHomePageTitle = "actiTIME -  Enter Time-Track";
		String actualHomePageTitle = driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("Home Page is displayed successfully");
		}else {
			System.err.println("Home Page is not displayed successfully");
		}
	}

}
