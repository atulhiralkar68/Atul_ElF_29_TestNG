package UnitTestingTool_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependanncyCreationMethod {
	
	@Test
	public void createAcc() {
		//int a=1/0;
		Reporter.log("From Create Account", true);
	}
	
	@Test
	public void modifyAcc() {
		Reporter.log("From modify Account", true);
	}

	
	@Test(dependsOnMethods="createAcc")//if the createAcc TC not run these TC skipped(not execute)
	public void deleteAcc() {          //Output:-Total tests run: 3, Passes: 1, Failures: 1, Skips: 1(use int=a..)
		Reporter.log("From delete Account", true);
	}
	
	@Test(dependsOnMethods={"createAcc","modifyAcc"})//if the createAcc and modifyAcc TC not run these TC skipped(not execute)
	public void deleteAccAll() {          
		Reporter.log("From delete Account", true);
	}



}
