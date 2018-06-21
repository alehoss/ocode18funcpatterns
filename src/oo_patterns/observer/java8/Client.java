package oo_patterns.observer.java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Client {

	public static void main(String[] args) {
		Stock stockApple = new Stock("AAPL",143.51);
		Stock stockAmazon = new Stock("AMZN",954.99);
		Stock stockExxon = new Stock("XON",82.03);


		BiFunction<Double, Stock, StockObserver> 
			priceGreaterThanObserverFunction = (priceUpperLimit, stock) -> {
			return (newPrice) -> {
				if (newPrice>priceUpperLimit) {
					System.out.println("Alert: price of " + stock.getName() + 
							" (" + newPrice + ") greater than max =" + priceUpperLimit);
					System.out.println("Action: sell all !");
				}				
			};
		};

		BiFunction<Double, Stock, StockObserver> priceLowerThanObserverFunction = (priceLowerLimit, stock) -> {
			return (newPrice) -> {
				if (newPrice<priceLowerLimit) {
					System.out.println("Alert: price of " + stock.getName() + " (" + newPrice + ") lower than min =" + priceLowerLimit);
					System.out.println("Action: buy more !");
				}				
			};
		};

		stockApple.addObserver(priceGreaterThanObserverFunction.apply(150.0, stockApple));
		stockAmazon.addObserver(priceGreaterThanObserverFunction.apply(960.0, stockAmazon));
		stockExxon.addObserver(priceLowerThanObserverFunction.apply(80.0, stockExxon));
		
		stockApple.setPrice(144);
		stockApple.setPrice(148);
		stockAmazon.setPrice(955);
		stockExxon.setPrice(78);
		stockApple.setPrice(151);
	}

}
