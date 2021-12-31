package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//properties or states
	@FindBy(name="user_name") 
	private WebElement userNameTextField;
	
	@FindBy(name="user_password") 
	private WebElement passwordTextField;
	
	@FindBy(id="submitButton") 
	private WebElement loginButton;

	//getter methods
	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//business logics or functions
	public void loginToApplication(String username,String password) {
		getUserNameTextField().clear();
		getUserNameTextField().sendKeys(username);
		getPasswordTextField().clear();
		getPasswordTextField().sendKeys(password);
		getLoginButton().click();
	}
	
	
}
