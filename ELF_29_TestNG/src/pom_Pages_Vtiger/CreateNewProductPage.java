package pom_Pages_Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewProductPage {
	
	public CreateNewProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "productname")
	private WebElement productName;
	
	@FindBy(name = "button")
	private WebElement saveButton;
	
	@FindBy(name = "discontinued")
	private WebElement checkBox;
	
	@FindBy(xpath = "//input[@class='crmbutton small cancel']")
	private WebElement cancelButton;

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
}
