package UnitTestingTool_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependancy_Group4 {
	
	@Test(groups="System", dependsOnGroups = {"Smoke","Integration"})
	public void transferAccount() {
		Reporter.log("Account is Transfer", true);
	}

}
