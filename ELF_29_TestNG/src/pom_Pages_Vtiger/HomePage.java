package pom_Pages_Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
 
	@FindBy(linkText = "Products")
	private WebElement productLink;
	
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement userImage;
	
	@FindBy(linkText = "Sign Out")
	private WebElement logoutLink;

	public WebElement getProductLink() {
		return productLink;
	}

	public WebElement getUserImage() {
		return userImage;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
}
