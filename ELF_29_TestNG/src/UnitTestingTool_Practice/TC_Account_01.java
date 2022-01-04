package UnitTestingTool_Practice;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Account_01 {   //TestNG Class
	
	@Test(priority = -1)//Test cases execute according to priority -1,0,1.....
	public void createAccount() {    
      	Reporter.log("createAccount",true);  
	}
	
	@Test(priority = 0,invocationCount=2) //InvocatinCount means how many times u want to execute that test case
	public void deletAccount() {    
		Reporter.log("deletAccount",true);   //Here true means we r print the value in console as will as in report 
	}
	
	@Test(priority =1,invocationCount = 10 ,enabled = true)
	//if enabled is true means we run the test case false means we r not run the test case(it is not a skip)
	public void modifyAccount() {   
		Reporter.log("modifyAccount",true);   
	}
    final static int a=1;// we can use by declaring As variable but it should be final
	@Test(priority =a,invocationCount = 10 ,enabled = true)
		public void modifyAccount1() {   
		Reporter.log("modifyAccount",true);   
	}
	
	@Test(priority =1,invocationCount = 10 ,enabled = true,threadPoolSize = 2)
	//threadPoolSize is use to run the test cases in batch here it is batch of two means at one time same tc 
	//running in two browser....
	public void modifyAccount3() {   
		Reporter.log("modifyAccount",true);   
	}

	@DataProvider//for  other class
	public String[][] sendData(){
		String[][] a = {{"admin","manager","null"},{"trainee","trainee","Hi"}};
		return a;
	}
	

}

