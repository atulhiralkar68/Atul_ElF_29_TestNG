package unitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Account_001 {    // testNG class
	
	final static int a =2;
	
	@Test(priority=1)
	public void create_Account() {     // test case
		Reporter.log("create_Account",true);      // test steps
	}
	
	@Test(priority=a,invocationCount=3,enabled=false)
	public static void delete_Account() {
		Reporter.log("delete_Account",true);
	}
	
	@Test(priority=-1)
	public static void modify_Account() {
		Reporter.log("modify_Account",true);
	}
}
