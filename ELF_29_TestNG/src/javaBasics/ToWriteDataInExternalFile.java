package javaBasics;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToWriteDataInExternalFile {

	public static void main(String[] args) throws IOException {
		
		// Create Object 
		FileOutputStream fileOutputStream= new FileOutputStream("./Resources/fos.txt");//Data Stored in fox File
		fileOutputStream.write('A');
		fileOutputStream.write('T');
		fileOutputStream.write('U');
		fileOutputStream.write('L');
		fileOutputStream.close();// After Completion Close it
	}

}
