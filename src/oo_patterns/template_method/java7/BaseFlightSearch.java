package oo_patterns.template_method.java7;

import java.util.Date;
import java.util.List;

public abstract class BaseFlightSearch {

	public abstract List<SearchResult> searchFlights(String origin, String destination, Date date);
	
	public abstract boolean bookFlight(SearchResult result);
	
	public boolean findAndBookCheapestFlight(String origin, String destination, Date date) {
		List<SearchResult> searchResults = searchFlights(origin, destination, date);
		double cheapestPrice = Double.MAX_VALUE;
		SearchResult cheapestFlight = null;
		
		for (SearchResult result: searchResults) {
			if (result.getPrice()<cheapestPrice) {
				cheapestFlight = result;
				cheapestPrice = result.getPrice();
			}
		}
		System.out.println("booking flight " + cheapestFlight);
		return bookFlight(cheapestFlight);
		
	}
	
	
}
