package oo_patterns.decorator.java7;

public class Client {

	public static void main(String[] args) {
		FileStringSource fileSource = new FileStringSource("test1.txt");
		String fileContent = fileSource.read();
		System.out.println(fileContent);
		StringTransformer transformer = new ReverserStringTransformer(new CapitalizerTransformer(fileSource));
		System.out.println(transformer.read());

	}

}
