package dataDriven;

import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step1:- Create Object For File Input Stream Or File Reader

		File absPath = new File("./Resources/data.xlsx");

		//Step 2:- Create Object For respective File type
		Workbook workbook  = WorkbookFactory.create(absPath);

		System.out.println(workbook.getSheet("Login").getRow(0).getCell(3).toString());//TRUE read data from excel sheet
		System.out.println(workbook.getSheet("Login").getRow(5).getCell(4).toString());//java
	}

}


