package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Step1:- Create Object For File Input Stream Or File Reader
		
		File file =new File("./Resources/data.properties");
		FileInputStream fileInputStream=new FileInputStream(file);
		
		//Step 2:- Create Object For respective File type
		Properties properties = new Properties();

        //call the Read Method 
		properties.load(fileInputStream);
		
		System.out.println(properties.get("username"));
		System.out.println(properties.get("password"));
		

	}

}
