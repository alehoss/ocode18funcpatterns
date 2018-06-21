package oo_patterns.iterator.java8;

import java.util.List;
import java.util.function.Consumer;


public class Text {

	private List<String> contentLines;

	public Text(List<String> contentLines) {
		super();
		this.contentLines = contentLines;
	}

	public List<String> getContent() {
		return contentLines;
	}

	private boolean isEmptyLine(String line) {
		if (line==null || line.length()==0 || !line.matches(".*[a-zA-Z]+.*")) {
			return true;
		}
		return false;
	}

	private int findStartOfParagraph(int currentLine) {
		while (currentLine<contentLines.size() && isEmptyLine(contentLines.get(currentLine))) {
			currentLine++;
		}
		return currentLine;
	}

	private int findEndOfParagraph(int currentLine) {
		while (!isEmptyLine(contentLines.get(currentLine)) && currentLine<contentLines.size()) {
			currentLine++;
		}
		return currentLine;
	}

	public void forEachParagraph(Consumer<Text> consumer) {
		int currentLine = 0;
		currentLine = findStartOfParagraph(currentLine);
		int startLine = currentLine;
		while (startLine<contentLines.size()) {
			currentLine = findEndOfParagraph(currentLine);
			int endLine = currentLine;
			consumer.accept(new Text(contentLines.subList(startLine, endLine)));	
			currentLine = findStartOfParagraph(currentLine);
			startLine = currentLine;
		}
		
	}
	
	
}
