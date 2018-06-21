package oo_patterns.strategy.java7;

import java.util.Date;

public class USPayrollCalculator implements PayrollCalculator {

	@Override
	public double calculateTaxes(Employee e, Date date) {
		return e.getSalary()*0.3;
	}

	@Override
	public double calculateTotalCost(Employee e, Date date) {
		return e.getSalary()+calculateTaxes(e, date);
	}

}
