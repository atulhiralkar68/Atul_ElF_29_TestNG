package UnitTestingTool_Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependancyCreationGroup{
	
	@Test(groups="functional")//Group declaration
	public void createAccNew() {
		//int a=1/0;
		Reporter.log("From Create Account", true);
	}
}
