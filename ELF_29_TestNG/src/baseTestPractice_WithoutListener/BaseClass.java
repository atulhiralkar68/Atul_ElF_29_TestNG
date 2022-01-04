package baseTestPractice_WithoutListener;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



import listeners.demo;
import pom_Pages_Vtiger.HomePage;
import pom_Pages_Vtiger.LoginPage;

public class BaseClass{

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
	}

	//Logout
	@AfterMethod// take ScreenShot Is use to take S S without using Listener
	public void logoutOfApplication(ITestResult result) {
		
		int status = result.getStatus();
		if(status == 2) {
			TakesScreenshot ts=(TakesScreenshot)demo.driver;
			File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
			File destfile = new File("./errorshots/"+result.getMethod().getMethodName()+"NewSC.png");
			tempScreenshot.renameTo(destfile);
		}
		
		HomePage homePage =new HomePage(driver);
		homePage.getUserImage().click();
		homePage.getLogoutLink().click();
	}
 
	//Close Browser
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}

