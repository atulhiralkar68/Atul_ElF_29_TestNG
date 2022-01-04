package UnitTestingTool_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Data_Drivern2 {
	 public String[] sendData() {
     	String [] a = {"https://www.shadi.com/","https://employer.apna.co/login/"};
     	return a;
     }
     
     @Test(dataProvider ="sendData")
     public void create_Loan(String url) {
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     	WebDriver driver=new ChromeDriver();
     	driver.get(url);
      	driver.close();
     }
}
