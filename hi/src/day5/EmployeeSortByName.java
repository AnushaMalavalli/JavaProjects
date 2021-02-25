package day5;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		int diff= emp1.getName().compareTo(emp2.getName());
		return diff;
	}

}
