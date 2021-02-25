package day5;

import java.util.Comparator;

public class EmployeeSortBySalary implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		int diff= (int) (emp1.getSalary()-emp2.getSalary());
		return diff;
	}

}
