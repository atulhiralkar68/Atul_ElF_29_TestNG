package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ItemsLookUpPage {

	public ItemsLookUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Double Panel See-thru Clipboard")
	private WebElement itemOne;

	public WebElement getItemOne() {
		return itemOne;
	}

}
