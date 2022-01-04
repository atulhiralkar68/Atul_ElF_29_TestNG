package pom_Pages_Vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="user_name")
	private WebElement userNameTextField;

	@FindBy(name="user_password")
	private WebElement passwordTextField1;

	@FindBy(id="submitButton")
	private WebElement loginButton;

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField1;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
