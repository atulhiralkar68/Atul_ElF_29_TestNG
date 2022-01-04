package dataDriven;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromExel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step1:- Create Object For File Input Stream Or File Reader

		File absPath = new File("./Resources/data.xlsx");
		//Step 2:- Create Object For respective File type
		Workbook workbook  = WorkbookFactory.create(absPath);


		Row row1 = workbook.getSheet("Login").getRow(0);
		String a = row1.getCell(0).getStringCellValue();
		double b = row1.getCell(1).getNumericCellValue();
		LocalDateTime c = row1.getCell(2).getLocalDateTimeCellValue();
		boolean d = row1.getCell(3).getBooleanCellValue();


		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}


