package oo_patterns.observer.java7;

public class StockPriceLowerThanObserver implements StockObserver {

	private double priceLowerLimit;
	private Stock stock;
			
	public StockPriceLowerThanObserver(double priceUpperLimit, Stock stock) {
		this.priceLowerLimit = priceUpperLimit;
		this.stock = stock;
		stock.addObserver(this);		
	}



	@Override
	public void priceUpdated(double newPrice) {
		if (newPrice<priceLowerLimit) {
			System.out.println("Alert: price of " + stock.getName() + " (" + newPrice + ") lower than min =" + priceLowerLimit);
			System.out.println("Action: buy more !");
		}

	}

}
