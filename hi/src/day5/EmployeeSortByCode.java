package day5;

import java.util.Comparator;

public class EmployeeSortByCode implements Comparator<Employee>{

		@Override
		public int compare(Employee emp1, Employee emp2) {
			int diff= emp1.getCode()-emp2.getCode();
			return diff;
		}

	}

