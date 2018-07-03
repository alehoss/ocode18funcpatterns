package oo_patterns.decorator.java7;

public class Client {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		FileStringSource fileSource = new FileStringSource("/home/alehoss/dev/ocode/test1.txt");
		String fileContent = fileSource.read();
		System.out.println(fileContent);
		StringTransformer transformer = new ReverserStringTransformer(new CapitalizerTransformer(fileSource));
		System.out.println(transformer.read());
		long time = System.currentTimeMillis() - start;
		System.out.println("Decorator java7: " + time + "ms");
	}

}
