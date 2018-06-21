package oo_patterns.iterator.java8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("mobydick.txt"));
		List<String> allLines = new ArrayList<>();
		String line = reader.readLine();
		while (line!=null) {
			allLines.add(line);
			line = reader.readLine();
		}
		Text text = new Text(allLines);
		text.forEachParagraph(paragraph-> {
			System.out.println("paragraph = " + paragraph.getContent());
		}); 

	}

}
