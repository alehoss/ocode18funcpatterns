package oo_patterns.decorator.java8;

import java.util.function.Supplier;

public class Client {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		FileStringSource fileSource = new FileStringSource("/home/alehoss/dev/ocode/test1.txt");
		String fileContent = fileSource.read();
		System.out.println(fileContent);

		Supplier<String> allTransformations =
				StringTransformations.createReverseStringTransformer(
						StringTransformations.createCapitalizerStringTransformer(
								fileSource::read));
		System.out.println(allTransformations.get());
		long time = System.currentTimeMillis() - start;
		System.out.println("Decorator java8: " + time + "ms");


	}

}
