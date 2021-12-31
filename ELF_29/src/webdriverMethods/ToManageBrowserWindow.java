package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToManageBrowserWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.hdfc.com");
		
		Dimension browserSize = driver.manage().window().getSize();
		System.out.println(browserSize.getHeight());
		System.out.println(browserSize.getWidth());
		
		Point browserPostion = driver.manage().window().getPosition();
		System.out.println(browserPostion.getX());
		System.out.println(browserPostion.getY());
		
		Thread.sleep(2000);
		Dimension dim = new Dimension(200, 100);
		driver.manage().window().setSize(dim);
		Thread.sleep(2000);
		Point point = new Point(50, 50);
		driver.manage().window().setPosition(point);
	}

}
