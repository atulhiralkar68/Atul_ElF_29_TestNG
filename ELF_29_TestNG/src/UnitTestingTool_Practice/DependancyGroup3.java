package UnitTestingTool_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependancyGroup3 {
	
	@Test(groups="Functional")
	public void modifyAcc() {
		Reporter.log("From modify Account", true);
	}
}
