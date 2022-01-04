package UnitTestingTool.UnitTestingTool;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DummyBaseTest {
	
	
	@BeforeSuite
	public void dataBaseConnection() {
		Reporter.log("from (Before Suite) Data Base Connection ", true);
	}

	@BeforeTest
	public void browserSettings() {
		Reporter.log("from (BeforeTest) Browser Settings", true);
	}
	
	@BeforeClass
	public void launchingBrowser() {
		Reporter.log("from (BeforeClass) Launching Browser", true);
	}
	
	@BeforeMethod
	public void login() {
		Reporter.log("from (BeforeMethod) Login ", true);
	}
	
	//@test....
	
	@AfterMethod
	public void logout() {
		Reporter.log("from (AfterMethod) logout", true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("from (AfterClass) Close Browser", true);
	}
	
	@AfterTest
	public void settingUndo() {
		Reporter.log("from (AfterTest) Setting Undo ", true);
	}
		
	@AfterSuite
	public void disconnectFromeDB() {
		Reporter.log("from (AfterSuite) Disconnect Frome DB", true);
	}
	
}
