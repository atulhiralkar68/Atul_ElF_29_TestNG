package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateInvoicePage {

	public CreateInvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="subject")
	private WebElement subjectTextField;
	
	@FindBy(name="bill_street")
	private WebElement billingAddressTextField;
	
	@FindBy(name="ship_street")
	private WebElement shippingAddressTextField;
	
	@FindBy(xpath="//td[contains(.,'Organization Name') and @class='dvtCellLabel']/..//img[@alt='Select']")
	private WebElement organisationLookUpIcon;
	
	@FindBy(id="searchIcon1")
	private WebElement itemsLookUpIcon;
	
	@FindBy(id="qty1")
	private WebElement quantityTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getSubjectTextField() {
		return subjectTextField;
	}

	public WebElement getBillingAddressTextField() {
		return billingAddressTextField;
	}

	public WebElement getShippingAddressTextField() {
		return shippingAddressTextField;
	}

	public WebElement getOrganisationLookUpIcon() {
		return organisationLookUpIcon;
	}

	public WebElement getItemsLookUpIcon() {
		return itemsLookUpIcon;
	}

	public WebElement getQuantityTextField() {
		return quantityTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
}
