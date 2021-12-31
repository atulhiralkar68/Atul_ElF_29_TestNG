package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationLookUpPage {

	public OrganisationLookUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="EDFG Group Limited")
	private WebElement edfgGroupLimited;

	public WebElement getEdfgGroupLimited() {
		return edfgGroupLimited;
	}
	
	
}
