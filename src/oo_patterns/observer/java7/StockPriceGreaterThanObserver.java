package oo_patterns.observer.java7;

public class StockPriceGreaterThanObserver implements StockObserver {

	private double priceUpperLimit;
	private Stock stock;
			
	public StockPriceGreaterThanObserver(double priceUpperLimit, Stock stock) {
		this.priceUpperLimit = priceUpperLimit;
		this.stock = stock;
		stock.addObserver(this);
	}



	@Override
	public void priceUpdated(double newPrice) {
		if (newPrice>priceUpperLimit) {
			System.out.println("Alert: price of " + stock.getName() + " (" + newPrice + ") greater than max =" + priceUpperLimit);
			System.out.println("Action: sell all !");
		}

	}

}
