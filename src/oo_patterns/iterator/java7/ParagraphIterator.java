package oo_patterns.iterator.java7;

import java.io.IOException;

public class ParagraphIterator implements TextIterator {

	private Text text;
	private int currentLine = 0;
			
	ParagraphIterator(Text text) {
		super();
		this.text = text;
	}

	private boolean isEmptyLine(String line) {
		if (line==null || line.length()==0 || !line.matches(".*[a-zA-Z]+.*")) {
			return true;
		}
		return false;
	}
	
	public void findStartOfParagraph() {
		while (currentLine<text.getContent().size() && isEmptyLine(text.getContent().get(currentLine))) {
			currentLine++;
		}
	}

	public void findEndOfParagraph() {
		while (!isEmptyLine(text.getContent().get(currentLine)) && currentLine<text.getContent().size()) {
			currentLine++;
		}
	}

	@Override
	public Text next() {
		int startLine = currentLine;
		findEndOfParagraph();
		int endLine = currentLine;
		if (startLine>=text.getContent().size()) {
			return null;
		}
		return new Text(text.getContent().subList(startLine, endLine));
	}

	@Override
	public boolean hasNext() {
		findStartOfParagraph();
		return currentLine<text.getContent().size();
	}

	public static void main(String[] args) throws IOException {
		System.out.println(new ParagraphIterator(null).isEmptyLine(""));
		System.out.println(new ParagraphIterator(null).isEmptyLine(null));
		System.out.println(new ParagraphIterator(null).isEmptyLine("   "));
		System.out.println(new ParagraphIterator(null).isEmptyLine(" Aas sdf  "));

	}
	
	
}
