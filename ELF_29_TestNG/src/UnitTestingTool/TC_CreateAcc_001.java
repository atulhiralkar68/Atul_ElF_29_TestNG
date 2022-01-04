package UnitTestingTool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC_CreateAcc_001 {
    @Parameters({"url","username","password"})
	@Test(groups="Smoke")
	public void createAcc(@Optional("https://demo.actitime.com/login.do") String url,
			              @Optional("trainee") String username,
			              @Optional("trainee") String password ) {
	    
		Reporter.log("From Create Account", true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		//driver.close();
	}
}



