package data_P;

import org.testng.annotations.DataProvider;

public class Info{

	@DataProvider//for  other class
		public String[][] sendData(){
			String[][] a = {{"admin","manager","null"},{"trainee","trainee","Hi"}};
			return a;
		}
		
	

}
