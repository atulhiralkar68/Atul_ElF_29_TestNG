package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}

	@FindBy(linkText="More")
	private WebElement moreLink;

	@FindBy(name="Invoice")
	private WebElement invoiceLink;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement userImage;
	
	@FindBy(linkText="Sign Out")
	private WebElement signOutLink;
	
	public WebElement getMoreLink() {
		return moreLink;
	}

	public WebElement getInvoiceLink() {
		return invoiceLink;
	}

	public WebElement getUserImage() {
		return userImage;
	}

	public WebElement getSignOutLink() {
		return signOutLink;
	}
	
	//business logic or functions
	public void signOut(Actions actions) {
		actions.moveToElement(getUserImage()).perform();
		getSignOutLink().click();
	}
	
}
