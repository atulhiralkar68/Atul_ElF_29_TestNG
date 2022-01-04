package UnitTestingTool_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependancyGroup2 {
	
	
	@Test(dependsOnGroups ="Smoke")//Group calling
	public void createAccAll() {
		//int a=1/0;
		Reporter.log("From Create Account", true);
	}

}
