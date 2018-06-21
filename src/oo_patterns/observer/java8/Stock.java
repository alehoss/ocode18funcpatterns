package oo_patterns.observer.java8;

import java.util.ArrayList;
import java.util.List;

public class Stock {

	private String name;
	private double price;
	
	private List<StockObserver> observers = new ArrayList<>();
	
	public Stock(String name, double price) {
		super();
		this.name = name;
		this.price = price;
		StockRepository.add(this);
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		for (StockObserver observer: observers) {
			observer.priceUpdated(price);
		}
	}

	public String getName() {
		return name;
	}
	
	public void addObserver(StockObserver observer) {
		observers.add(observer);
	}
	
	public void removeObserver(StockObserver observer) {
		observers.remove(observer);
	}
	
}
