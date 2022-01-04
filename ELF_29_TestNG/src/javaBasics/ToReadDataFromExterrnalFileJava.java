package javaBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ToReadDataFromExterrnalFileJava {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileStream = new FileInputStream("./Resources/sample.txt");
		int data = fileStream.read();
		
		System.out.println((char)data);//G
		System.out.println((char)fileStream.read());//o
		//we only get two character to get all character we have to call the read method no of time length of character 
		//so we use for loop for that
		
		while(data == 2) {
			System.out.println((char)fileStream.read());
		}
		fileStream.close();
		
		
	}

}
