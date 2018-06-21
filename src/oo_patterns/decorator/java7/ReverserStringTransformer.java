package oo_patterns.decorator.java7;

public class ReverserStringTransformer extends StringTransformer {

	public ReverserStringTransformer(StringSource ss) {
		super(ss);
	}
	
	@Override
	public String read() {
		String stringFromChain = stringSource.read();

		return new StringBuilder(stringFromChain).reverse().toString();
	}

}
