package oo_patterns.template_method.java8;

import java.util.Date;

public class SearchParameters {
	
	private String origin;
	private String destination;
	private Date date;
	
	public SearchParameters(String origin, String destination, Date date) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.date = date;
	}

	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}

	public Date getDate() {
		return date;
	}

	
	
	
}
