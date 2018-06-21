package oo_patterns.decorator.java8;

import java.util.function.Supplier;

public class StringTransformations {

	public static Supplier<String> 
	createReverseStringTransformer(Supplier<String> nextTransformerFunction) {				
		return () -> {
			String stringFromChain = nextTransformerFunction.get();
			return new StringBuilder(stringFromChain).reverse().toString();			
		};
	}

	
	public static Supplier<String> 
	createCapitalizerStringTransformer(Supplier<String> nextTransformerFunction) {				
		return () -> {
			String stringFromChain = nextTransformerFunction.get();
			return stringFromChain.toUpperCase();
		};
	}

	
	
	
	
}
