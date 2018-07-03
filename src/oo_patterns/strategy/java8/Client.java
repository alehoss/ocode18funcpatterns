package oo_patterns.strategy.java8;

import java.util.List;

public class Client {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<Employee> allEmployees = new EmployeeRepository().getAll();
		allEmployees.forEach((e) -> {
			System.out.println(e.getName() + " (" + e.getCountry() + ")");
			System.out.println(" salary = " + e.getSalary());
			System.out.println(" taxes = " + e.getTaxes());
			System.out.println(" total cost = " + e.getTotalCost());
		});
		long time = System.currentTimeMillis() - start;
		System.out.println("Strategy java8: " + time + "ms");
	}

}
