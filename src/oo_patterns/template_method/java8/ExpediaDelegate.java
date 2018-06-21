package oo_patterns.template_method.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oo_patterns.template_method.java8.SearchParameters;

public class ExpediaDelegate {

	public static List<SearchResult> searchFlights(SearchParameters params) {
		System.out.println("searching flights on Expedia");
		List<SearchResult> results = new ArrayList<>();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			results.add(new SearchResult("TAM", sdf.parse("2017-07-22 15:30"), sdf.parse("2017-07-22 17:30"), 300));
			results.add(new SearchResult("GOL", sdf.parse("2017-07-22 9:40"), sdf.parse("2017-07-22 11:30"), 200));					
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return results;
	}

	public static boolean bookFlight(SearchResult result) {
		System.out.println("book flight on Expedia");
		return true;
	}
	
	
}
