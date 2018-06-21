package oo_patterns.strategy.java7;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Employee> allEmployees = new EmployeeRepository().getAll();
		for (Employee e: allEmployees) {
			System.out.println(e.getName() + " (" + e.getCountry() + ")");
			System.out.println(" salary = " + e.getSalary());
			System.out.println(" taxes = " + e.getTaxes());
			System.out.println(" total cost = " + e.getTotalCost());
		}

	}

}
