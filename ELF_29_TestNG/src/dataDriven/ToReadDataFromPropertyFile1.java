package dataDriven;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile1 {

	public static void main(String[] args) throws IOException {
		//Step1:- Create Object For File Input Stream Or File Reader

		File file =new File("./Resources/data.properties");
		//FileInputStream fileInputStream=new FileInputStream(file);
		FileReader fr = new FileReader(file);//Here we use FileReader instead of FileInputStream
		//Step 2:- Create Object For respective File type
		Properties properties = new Properties();

		//call the Read Method 
		properties.load(fr);

		System.out.println(properties.get("username"));
		System.out.println(properties.get("password"));
		
		System.setProperty(""+properties.get("browserkey"), properties.get("browserpath")+"");
	    WebDriver driver = new ChromeDriver();
	    

	}

}
