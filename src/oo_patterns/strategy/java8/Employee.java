package oo_patterns.strategy.java8;

import java.util.Date;
import java.util.function.BiFunction;

public class Employee {

	private String name;
	private String country;
	private double monthlySalary;
	private PayrollCalculator payrollCalculator;
		
	public Employee(String name, String country, double salary) {
		super();
		this.name = name;
		this.country = country;
		this.monthlySalary = salary;
		
		switch(this.country) {
			case "US": payrollCalculator = (e,date) -> e.getSalary()*0.3; break;
			case "BR": payrollCalculator = (e,date) -> { 
				if (date.getMonth()==11) {
					return 2*e.getSalary()*0.6;
				}
				return e.getSalary()*0.6;
			}; break;
			case "SL": payrollCalculator = (e,date) -> e.getSalary()*0.8; break;
		}
		
			
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public double getSalary() {
		return monthlySalary;
	}
	
	public double getTaxes() {
		
		return payrollCalculator.calculateTaxes(this, new Date());
	};
	
	public double getTotalCost() {
		return payrollCalculator.calculateTotalCost(this, new Date());
	}
	
			
}
