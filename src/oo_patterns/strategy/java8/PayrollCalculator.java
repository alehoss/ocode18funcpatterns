package oo_patterns.strategy.java8;

import java.util.Date;

public interface PayrollCalculator {

	public double calculateTaxes(Employee e, Date date);
	
	public default double calculateTotalCost(Employee e, Date date) {
		return e.getSalary()+calculateTaxes(e, date);		
	};
	
}
