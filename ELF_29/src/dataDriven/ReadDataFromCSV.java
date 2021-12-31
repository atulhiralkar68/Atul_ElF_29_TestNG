package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

public class ReadDataFromCSV {

	public static void main(String[] args) throws IOException, CsvException {
		File file = new File("./data/data.csv");
		FileReader fr = new FileReader(file);
		
		CSVReader reader = new CSVReader(fr);
		List<String[]> re = reader.readAll();
		for(String[] a:re) {
			for(String b:a) {
				System.out.println(b);
			}
		}
		
	}

}
