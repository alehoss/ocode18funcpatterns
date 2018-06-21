package oo_patterns.observer.java7;

import java.util.ArrayList;
import java.util.List;

public class StockRepository {

	private static List<Stock> allStocks = new ArrayList<>();
	
	public static void add(Stock stock) {
		allStocks.add(stock);
	}
	
	public List<Stock> getAllStocks() {
		return allStocks;
	}
	
}
