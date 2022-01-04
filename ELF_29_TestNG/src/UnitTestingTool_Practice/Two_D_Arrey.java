package UnitTestingTool_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Two_D_Arrey {

	@DataProvider(name="d")
	public Integer[][] multipleData() {
		
		Integer[][] arr = {
			            	{20,30,40},
			            	{40,50}
	                   	};
		return arr;
	}
	
	@Test(dataProvider="d",groups = "Smoke")
	public void createAccount (int []arr) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		Reporter.log("Account is created for "+ arr[0] +"times", true );
		Reporter.log("Account is created for "+ arr[1] +"times", true );
        driver.close();
}
}
