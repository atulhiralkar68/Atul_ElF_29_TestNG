package dataDriven;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadNMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step1:- Create Object For File Input Stream Or File Reader

		File absPath = new File("./Resources/data.xlsx");
		//Step 2:- Create Object For respective File type
		Workbook workbook  = WorkbookFactory.create(absPath);

		Sheet loginSheet = workbook.getSheet("Login");
		int rowCount = loginSheet.getPhysicalNumberOfRows();
		int columnCount = loginSheet.getRow(0).getPhysicalNumberOfCells();
		String [][] sarr = new  String [rowCount][columnCount];

		for(int i=0;i<rowCount;i++) {
			for(int j=0;j<columnCount;j++) {
				sarr[i][j]=loginSheet.getRow(i).getCell(j).toString();
			}
		}
	}



}
