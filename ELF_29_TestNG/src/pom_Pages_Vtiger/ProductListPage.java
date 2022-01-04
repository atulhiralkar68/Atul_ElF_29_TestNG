package pom_Pages_Vtiger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
	
	public ProductListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement newProduct;
	
	@FindBy(id = "mouseArea_Product Name")
	private WebElement verifiedProductName;

	@FindBy(xpath="//span[@id='dtlview_Product Active']")
	private WebElement verifyCheckBox;
	
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement productAddedVerificationMassegElement;
	
	public WebElement getNewProduct() {
		return newProduct;
	}

	public WebElement getVerifiedProductName() {
		return verifiedProductName;
	}

	public WebElement getVerifyCheckBox() {
		return verifyCheckBox;
	}

	public WebElement getProductAddedVerificationMassege() {
		return productAddedVerificationMassegElement;
	}
	
}
