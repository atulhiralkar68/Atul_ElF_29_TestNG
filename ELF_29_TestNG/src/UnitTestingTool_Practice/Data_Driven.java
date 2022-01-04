package UnitTestingTool_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Data_Driven {

        public static String[] sendData() {
        	String [] a = {"https://www.shadi.com/","https://employer.apna.co/login/"};
        	return a;
        }
        
        @Test(invocationCount = 4,threadPoolSize = 2)
      public void shadi_Com() {
       System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        	WebDriver driver=new ChromeDriver();
        	driver.get("https://www.shadi.com/");
        	driver.close();
        	
        }
}
