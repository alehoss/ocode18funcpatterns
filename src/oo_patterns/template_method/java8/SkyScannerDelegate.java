package oo_patterns.template_method.java8;

import java.util.Date;
import java.util.List;

import oo_patterns.template_method.java8.SearchParameters;

public class SkyScannerDelegate {

	public static List<SearchResult> searchFlights(SearchParameters params) {
		System.out.println("searching flights on SkyScanner");
		return null;
	}

	public static boolean bookFlight(SearchResult result) {
		System.out.println("booking flights on SkyScanner");
		return false;
	}

}
