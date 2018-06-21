package oo_patterns.decorator.java7;

public class ByteArrayStringSource implements StringSource {

	
	public ByteArrayStringSource(byte[] byteArray) {
		
	}
	
	@Override
	public String read() {
		return "testing123";
	}

}
