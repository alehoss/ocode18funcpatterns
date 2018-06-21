package oo_patterns.template_method.java7;

import java.util.Date;

public class SearchResult {

	private String company;
	private Date dateTimeOrigin;
	private Date dateTimeDestination;
	private double price;
	
	
	public SearchResult(String company, Date dateTimeOrigin, Date dateTimeDestination, double price) {
		super();
		this.company = company;
		this.dateTimeOrigin = dateTimeOrigin;
		this.dateTimeDestination = dateTimeDestination;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}
		
	public Date getDateTimeOrigin() {
		return dateTimeOrigin;
	}
	
	public Date getDateTimeDestination() {
		return dateTimeDestination;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "SearchResult [company=" + company + ", dateTimeOrigin=" + dateTimeOrigin + ", dateTimeDestination="
				+ dateTimeDestination + ", price=" + price + "]";
	}
	
	
	
}
