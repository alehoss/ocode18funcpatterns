package oo_patterns.iterator.java7;

import java.util.Iterator;

public interface TextIterator extends Iterator<Text> {
	
	public Text next();
	public boolean hasNext();
	
}
