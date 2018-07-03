package oo_patterns.template_method.java7;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		BaseFlightSearch search = new ExpediaFlightSearch();
		search.findAndBookCheapestFlight("RIO", "HCL", new Date());
		long time = System.currentTimeMillis() - start;
		System.out.println("Template java7: " + time + "ms");
	}

}
