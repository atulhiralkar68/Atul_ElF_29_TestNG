package testScripts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomRepository.CreateInvoicePage;
import pomRepository.HomePage;
import pomRepository.InvoicePage;
import pomRepository.ItemsLookUpPage;
import pomRepository.Login_Page;
import pomRepository.OrganisationLookUpPage;

public class TC_Login_001 {

	public static void main(String[] args) {
		//Pre condition
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String expectedLoginPageTitle="vtiger CRM 5 - Commercial Open Source CRM";
		String expectedHomePageTitle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String expectedInvoicePageTitle = "Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
		String expectedCreateInvoicePageTitle = "Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
		
		//Step1 : navigate to application
		driver.get("http://localhost:8888/");		
		if(expectedLoginPageTitle.equals(driver.getTitle())) {
			System.out.println("Login page is displayed");
		}else {
			System.out.println("Login page is not displayed");
		}
		
		//Step2 : login to application
		Login_Page loginPage = new Login_Page(driver);
		loginPage.loginToApplication("admin", "root");
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		if(expectedHomePageTitle.equals(driver.getTitle())) {
			System.out.println("Home page is displayed");
		}else {
			System.out.println("Home page is not displayed");
		}
		
		//Step3 : Go to "More" DropDown menu & click on "Invoice" sub menu
		HomePage homePage = new HomePage(driver);
		Actions actions = new Actions(driver);
		actions.moveToElement(homePage.getMoreLink()).perform();
		homePage.getInvoiceLink().click();
		wait.until(ExpectedConditions.titleIs(expectedInvoicePageTitle));
		if(expectedInvoicePageTitle.equals(driver.getTitle())) {
			System.out.println("Invoice page is displayed");
		}else {
			System.out.println("Invoice page is not displayed");
		}
		
		//Step4 : click on lookup image of "Create Invoice" Page
		InvoicePage invoicePage = new InvoicePage(driver);
		invoicePage.getCreateInvoiceIcon().click();
		wait.until(ExpectedConditions.titleIs(expectedCreateInvoicePageTitle));
		if(expectedCreateInvoicePageTitle.equals(driver.getTitle())) {
			System.out.println("Create Invoice page is displayed");
		}else {
			System.out.println("Create Invoice page is not displayed");
		}
		
		//Step5 : Create a Invoice with be below info:Enter Subject,Billing Address,Shipping Address & click on "Look-UP" image beside the "Organisation" field
		CreateInvoicePage createInvoicePage = new CreateInvoicePage(driver);
		createInvoicePage.getSubjectTextField().clear();
		createInvoicePage.getSubjectTextField().sendKeys("Motog Billing");
		createInvoicePage.getBillingAddressTextField().clear();
		createInvoicePage.getBillingAddressTextField().sendKeys("Hadapsar,Pune");
		createInvoicePage.getShippingAddressTextField().clear();
		createInvoicePage.getSubjectTextField().sendKeys("Hadapsar,Pune");
		String parentWindowId = driver.getWindowHandle();
		createInvoicePage.getOrganisationLookUpIcon().click();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		OrganisationLookUpPage organisationLookUpPage = new OrganisationLookUpPage(driver);
		organisationLookUpPage.getEdfgGroupLimited().click();
		driver.switchTo().alert().accept();
		driver.switchTo().window(parentWindowId);
		
		//Step6: Click on "Look-UP"image beside the item name and select the "product" 
		createInvoicePage.getItemsLookUpIcon().click();
		allWindowIds=driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		ItemsLookUpPage itemsLookUpPage = new ItemsLookUpPage(driver);
		itemsLookUpPage.getItemOne().click();
		
		//Step7: Enter QTY and click on save
		driver.switchTo().window(parentWindowId);
		createInvoicePage.getQuantityTextField().sendKeys("1");
		createInvoicePage.getSaveButton().click();
		
		//Step8: Click on Logout
		homePage.signOut(actions);
		wait.until(ExpectedConditions.titleIs(expectedLoginPageTitle));
		if(expectedLoginPageTitle.equals(driver.getTitle())) {
			System.out.println("Login page is displayed");
		}else {
			System.out.println("Login page is not displayed");
		}
	}

}
