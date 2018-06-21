package oo_patterns.decorator.java7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class CapitalizerTransformer extends StringTransformer {

	
	public CapitalizerTransformer(StringSource ss) {
		super(ss);
	}
	
	@Override
	public String read() {
		String stringFromChain = stringSource.read();
		return stringFromChain.toUpperCase();
	}

}
