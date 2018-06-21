package oo_patterns.strategy.java7;

import java.util.Date;

public interface PayrollCalculator {

	public double calculateTaxes(Employee e, Date date);
	public double calculateTotalCost(Employee e, Date date);
	
}
