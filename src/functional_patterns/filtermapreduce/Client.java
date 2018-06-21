package functional_patterns.filtermapreduce;

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
		text.stream().forEach(paragraph-> {
			System.out.println("paragraph = " + paragraph.getContent());
		}); 
		
		text.stream()
			.filter(paragraph2 -> paragraph2.getContent().size()>15)
			.forEach(paragraph3-> {
			System.out.println("paragraph with >15 lines = " + paragraph3.getContent());
		}); 

		text.stream()
			.map(paragraph -> paragraph.capitalize())
			.forEach(paragraph-> {
			System.out.println("paragraph capitalized = " + paragraph.getContent());
		}); 
		
		text.stream().reduce((aggregateText, paragraph) -> {
			List<String> newContent = new ArrayList<>();
			newContent.addAll(aggregateText.getContent());
			newContent.add(paragraph.getContent().get(0));
			Text newAggregateText = new Text(newContent);
			return newAggregateText;
		}).forEach(paragraph-> {
			System.out.println("paragraph with 1st lines only = " + paragraph.getContent());
		}); 
		
			
		
	}

}
