package oo_patterns.template_method.java7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oo_patterns.template_method.java8.SearchParameters;

public class ExpediaFlightSearch extends BaseFlightSearch {

	private ExpediaDelegate delegate = new ExpediaDelegate();
	
	@Override
	public List<SearchResult> searchFlights(String origin, String destination, Date date) {
		return delegate.searchFlights(new SearchParameters(origin, destination, date));
	}

	@Override
	public boolean bookFlight(SearchResult result) {
		return delegate.bookFlight(result);
	}

}
