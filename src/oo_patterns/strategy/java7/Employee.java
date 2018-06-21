package oo_patterns.strategy.java7;

import java.util.Date;

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
			case "US": payrollCalculator = new USPayrollCalculator(); break;
			case "BR": payrollCalculator = new BRPayrollCalculator(); break;
			case "SL": payrollCalculator = new SLPayrollCalculator(); break;
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
