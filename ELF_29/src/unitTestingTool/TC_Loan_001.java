package unitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Loan_001 {   //testNG class

	final int q=1;
	
	@Test(invocationCount=q)
	public void create_Loan() { // test case
		Reporter.log("create_Loan",true);
	}
}
