package oo_patterns.strategy.java7;

import java.util.Date;

public class BRPayrollCalculator implements PayrollCalculator {

	@Override
	public double calculateTaxes(Employee e, Date date) {
		if (date.getMonth()==11) {
			return 2*e.getSalary()*0.6;
		}
		return e.getSalary()*0.6;
	}

	@Override
	public double calculateTotalCost(Employee e, Date date) {
		return e.getSalary()+calculateTaxes(e, date);
	}

}
