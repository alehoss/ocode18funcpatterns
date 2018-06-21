package oo_patterns.decorator.java8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStringSource {

	String fileName;
	
	public FileStringSource(String fileName) {
		this.fileName = fileName;
	}
	
	
	public String read() {
		FileReader fileReader;
		StringBuilder stringBuilder = new StringBuilder();

		try {
			fileReader = new FileReader(fileName);
			int charsRead = 0;
			char[] readBuffer = new char[100];
			
			charsRead = fileReader.read(readBuffer);
			while (charsRead>0) {
				stringBuilder.append(readBuffer, 0, charsRead);
				charsRead = fileReader.read(readBuffer);			
			}

		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return stringBuilder.toString();
	}

}
