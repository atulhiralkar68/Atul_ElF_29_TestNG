package UnitTestingTool_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependancyGroup {
	
	@Test(dependsOnGroups = {"Smoke","Functional"})
	public void createAccAll() {
		//int a=1/0;
		Reporter.log("From Create Account", true);
	}
	
	

}
