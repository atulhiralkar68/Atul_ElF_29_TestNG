package dataDriven;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSON {

	public static void main(String[] args) throws IOException, ParseException {
		File file = new File("./data/data.json");
		FileReader fr = new FileReader(file);
		
		JSONParser parser = new JSONParser();
		JSONObject jsonObj = (JSONObject)parser.parse(fr);
		
		System.out.println(jsonObj.get("username"));
		System.out.println(jsonObj.get("password"));
	}

}
