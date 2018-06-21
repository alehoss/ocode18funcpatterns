package oo_patterns.strategy.java8;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	private List<Employee> allEmployees = new ArrayList<Employee>();
	
	public EmployeeRepository() {
		allEmployees.add(new Employee("John Smith", "US", 10000));
		allEmployees.add(new Employee("Joao Silva", "BR", 5000));
		allEmployees.add(new Employee("Chamith Perera", "SL", 5000));
		allEmployees.add(new Employee("Mary Stronach", "US", 12000));
	}
	
	public List<Employee> getAll() {
		return allEmployees;
	}
	
}
