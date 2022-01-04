package base_Test_Vtiger;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pom_Pages_Vtiger.HomePage;
import pom_Pages_Vtiger.LoginPage;

public class VTiger_BaseTest {

	public static WebDriver driver ;

	@BeforeClass
	public void launchBrowser() {
		//Launching Browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=index&module=Home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver,10);
		String loginPageTitle = "vtiger CRM 5 - Commercial Open Source CRM";
		assertEquals(driver.getTitle(), loginPageTitle, "Login page not display");
		Reporter.log("Login page display succesfully");
	}

	//Login To Application
	@BeforeMethod
	public void login() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getUserNameTextField().clear();
		loginPage.getUserNameTextField().sendKeys("admin");
		String username = "admin";
		String useNameText = loginPage.getUserNameTextField().getAttribute("value");
		assertEquals(useNameText , username , "Incorrect Username");
		loginPage.getPasswordTextField().clear();
		loginPage.getPasswordTextField().sendKeys("root");
		String password = "root";
		String passwordText = loginPage.getPasswordTextField().getAttribute("value");
		assertEquals(passwordText, password ,"Incorrect Password");
		loginPage.getLoginButton().click();
		String homePageTitle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		assertEquals(driver.getTitle(), homePageTitle, "Home page not displayed");
		Reporter.log("Home page display succesfully");
	}

	//Logout
	@AfterMethod
	public void logout() {
		HomePage homePage =new HomePage(driver);
		homePage.getUserImage().click();
		homePage.getLogoutLink().click();
		Reporter.log("Logout Succesfully",true);
	}

	//Close Browser
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}



}
