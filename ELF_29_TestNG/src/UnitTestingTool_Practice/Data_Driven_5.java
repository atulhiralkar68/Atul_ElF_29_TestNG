package UnitTestingTool_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Driven_5 {
	
	@DataProvider(name="data",parallel=true)
	public String[][] sendData(){
		String[][] a= {
				{"admin","manager","https://demo.actitime.com/login.do"},
			    {"admin","manager","https://demo.actitime.com/login.do"}
				};
		return a;
	}
	

	@Test(dataProvider="data")
	public void create_loan(String[] cred) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(cred[2]);
		driver.findElement(By.id("username")).sendKeys(cred[0]);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(cred[1]);
		driver.close();
	}


}
