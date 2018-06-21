package oo_patterns.observer.java7;

public class Client {

	public static void main(String[] args) {
		Stock stockApple = new Stock("AAPL",143.51);
		Stock stockAmazon = new Stock("AMZN",954.99);
		Stock stockExxon = new Stock("XON",82.03);
		
		StockPriceGreaterThanObserver observerApple = new StockPriceGreaterThanObserver(150, stockApple);
		StockPriceGreaterThanObserver observerAmazon = new StockPriceGreaterThanObserver(960, stockAmazon);
		StockPriceLowerThanObserver observerExxon = new StockPriceLowerThanObserver(80, stockExxon);
		
		stockApple.setPrice(144);
		stockApple.setPrice(148);
		stockAmazon.setPrice(955);
		stockExxon.setPrice(78);
		stockApple.setPrice(151);
	}

}
