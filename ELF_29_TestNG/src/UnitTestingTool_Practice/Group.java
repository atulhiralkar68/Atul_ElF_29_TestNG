package UnitTestingTool_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
	
	@Test(dependsOnGroups ={"Smoke","Functional"})//Group calling
	
	public void createAccAll1() {
		//int a=1/0;
		Reporter.log("From Function ", true);
	}


}
