package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCLearTheContentInTextField {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.id("username")).sendKeys("adsfs",Keys.ENTER);
		String actualErrorMessage = "";
		String errorMessage = driver.findElement(By.id("validationMessage")).getText();
		System.out.println(errorMessage);
		if(actualErrorMessage.equals(errorMessage)) {
			System.out.println();
		}
		
		
	}

}
