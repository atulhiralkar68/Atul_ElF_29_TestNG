package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.json.simple.parser.ParseException;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException, ParseException {
		File file = new File("./data/data.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.get("username"));
	}

}
