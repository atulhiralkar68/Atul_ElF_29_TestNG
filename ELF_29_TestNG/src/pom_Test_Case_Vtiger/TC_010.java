package pom_Test_Case_Vtiger;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base_Test_Vtiger.VTiger_BaseTest;
import pom_Pages_Vtiger.CreateNewProductPage;
import pom_Pages_Vtiger.HomePage;
import pom_Pages_Vtiger.ProductListPage;

public class TC_010 extends VTiger_BaseTest{

	@Test
	public void create_Product() {

		HomePage homePage=new HomePage(driver);
		ProductListPage productListPage=new ProductListPage(driver);
		CreateNewProductPage createNewProductPage=new CreateNewProductPage(driver);

		homePage.getProductLink().click();
		String productLinkPageTitle = "Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
		assertEquals(driver.getTitle(),productLinkPageTitle , "'Product' List page not display");

		productListPage.getNewProduct().click();
		String createNewProductPageTitle = "Administrator - Products - vtiger CRM 5 - Commercial Open Source CRM";
		assertEquals(driver.getTitle(), createNewProductPageTitle, "Create New Product Page not display");

		createNewProductPage.getProductName().sendKeys("Laptop");
		createNewProductPage.getCancelButton().click();
	}
}
