package oo_patterns.decorator.java8;

import java.util.function.Supplier;

public class Client {

	public static void main(String[] args) {
		FileStringSource fileSource = new FileStringSource("test1.txt");
		String fileContent = fileSource.read();
		System.out.println(fileContent);
		
		Supplier<String> allTransformations = 
				StringTransformations.createReverseStringTransformer(
						StringTransformations.createCapitalizerStringTransformer(
								fileSource::read));
		System.out.println(allTransformations.get());
		

	}

}
