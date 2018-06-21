package oo_patterns.template_method.java7;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		BaseFlightSearch search = new ExpediaFlightSearch();
		search.findAndBookCheapestFlight("RIO", "HCL", new Date());

	}

}
