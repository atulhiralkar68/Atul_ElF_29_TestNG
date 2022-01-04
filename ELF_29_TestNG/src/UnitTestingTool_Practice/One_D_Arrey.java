package UnitTestingTool_Practice;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class One_D_Arrey {
	
	@DataProvider(name="d")
	public Integer[] multipleData() {
		
		Integer[] arr = {20,30,40};
		return arr;
	}
	
	@Test(dataProvider="d",groups = "Smoke")
	public void createAccount (int a) {
		Reporter.log("Account is created for "+ a +"times", true );
	}

}
