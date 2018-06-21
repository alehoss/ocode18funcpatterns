package oo_patterns.decorator.java7;

public abstract class StringTransformer implements StringSource {

	protected StringSource stringSource;
	
	public StringTransformer(StringSource ss) {
		stringSource = ss;
	}
	
	
}
