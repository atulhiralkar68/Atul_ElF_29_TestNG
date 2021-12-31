package assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbanLadder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://www.urbanladder.com/");
		Actions actions = new Actions(driver);
		WebElement livingModule = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
		actions.moveToElement(livingModule).perform();
		driver.findElement(By.linkText("Lounge Chairs")).click();
		driver.findElement(By.partialLinkText("Close")).click();
		String parentWindowId = driver.getWindowHandle();
		WebElement product = driver.findElement(By.xpath("//ul[contains(@class,'productlist')]/child::li[3]/descendant::div[@class='price-number']/child::span"));
		wait.until(ExpectedConditions.visibilityOf(product));
		String price = product.getText();
		char[] priceArray = price.toCharArray();
		String cost = "";
		for(char p : priceArray) {
			if(p>=48 && p<=57 ) {
				cost=cost+p;
			}
		}
		int productCost = Integer.parseInt(cost);
		if(productCost>=20000) {
			System.out.println("The product cost is more than 20000");
		} else {
			System.out.println("The product cost is less than 20000");
		}
		product.click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.xpath("//button[@data-event='add_to_cart' and @data-variantname='(Floral)']")).click();
	}

}
