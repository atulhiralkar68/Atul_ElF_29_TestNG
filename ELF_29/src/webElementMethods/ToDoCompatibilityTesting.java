package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDoCompatibilityTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernamTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		Rectangle rectAreaOfUsernameTF = usernamTextField.getRect();
		Rectangle rectAreaOfPasswordTF = passwordTextField.getRect();
		
		System.out.println("X loc of UTF : "+usernamTextField.getLocation().getX());
		System.out.println("X loc of PTF : "+passwordTextField.getLocation().getX());
		
		if(usernamTextField.getLocation().getX()==passwordTextField.getLocation().getX()) {
			System.out.println("It is properly alligned to the left");
		}else {
			System.err.println("It is not properly alligned to the left");
		}
		
		System.out.println("X loc of UTF + width : "+((rectAreaOfUsernameTF.getX()) + (rectAreaOfUsernameTF.getWidth())));
		System.out.println("X loc of UTF + width : "+((rectAreaOfPasswordTF.getX()) + (rectAreaOfPasswordTF.getWidth())));
		if((rectAreaOfUsernameTF.getX()) + (rectAreaOfUsernameTF.getWidth()) == 
				(rectAreaOfPasswordTF.getX()) + (rectAreaOfPasswordTF.getWidth())) {
			System.out.println("It is properly alligned to the right");
		}else {
			System.err.println("It is not properly alligned to the right");
		}
		driver.quit();
		
	}

}
