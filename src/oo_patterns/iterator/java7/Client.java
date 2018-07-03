package oo_patterns.iterator.java7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		BufferedReader reader = new BufferedReader(new FileReader("/home/alehoss/dev/ocode/mobydick.txt"));
		List<String> allLines = new ArrayList<>();
		String line = reader.readLine();
		while (line!=null) {
			allLines.add(line);
			line = reader.readLine();
		}
		Text text = new Text(allLines);
		Iterator<Text> iterator = text.iterator();
		while (iterator.hasNext()) {
			String paragraph = iterator.next().getContent().get(0);
			System.out.println("paragraph = " + paragraph);
		}
		long time = System.currentTimeMillis() - start;
		System.out.println("Iterator java7: " + time + "ms");
	}

}
