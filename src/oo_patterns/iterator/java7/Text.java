package oo_patterns.iterator.java7;

import java.util.Iterator;
import java.util.List;

public class Text implements Iterable<Text> {

	private List<String> contentLines;

	public Text(List<String> contentLines) {
		super();
		this.contentLines = contentLines;
	}

	public List<String> getContent() {
		return contentLines;
	}
	
	public Iterator<Text> iterator() {
		ParagraphIterator iterator = new ParagraphIterator(this);
		return iterator;
	}
	
	
}
