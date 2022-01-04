package pom_Test_Case_Vtiger;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import base_Test_Vtiger.VTiger_BaseTest;
import pom_Pages_Vtiger.CreateNewProductPage;
import pom_Pages_Vtiger.HomePage;
import pom_Pages_Vtiger.ProductListPage;
@Test
public class TC_002 extends VTiger_BaseTest{

	public void createProductWithoutMandatoryField() {

		HomePage homePage=new HomePage(driver);
		ProductListPage productListPage=new ProductListPage(driver);
		CreateNewProductPage createNewProductPage=new CreateNewProductPage(driver);

		homePage.getProductLink().click();
		String productLinkPageTitle = "Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
		assertEquals(driver.getTitle(),productLinkPageTitle , "'Product' List page not display");

		productListPage.getNewProduct().click();
		String createNewProductPageTitle = "Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
		assertEquals(driver.getTitle(), createNewProductPageTitle, "Create New Product Page not display");

		createNewProductPage.getSaveButton().click();
		String errorMassage = driver.switchTo().alert().getText();
		assertEquals(errorMassage, "Product Name cannot be empty", "Alert Massage not display");
		driver.switchTo().alert().accept();
	}
}
