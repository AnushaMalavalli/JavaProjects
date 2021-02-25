package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class EmployeeList {

	public static void main(String[] args) {
		ArrayList<Employee> emplist= new ArrayList<>();
		emplist.add(new Employee(201,"xyz",12000));
		emplist.add(new Employee(801,"abc",72000));
		emplist.add(new Employee(501,"hij",56000));
		
		emplist.sort((Employee e1, Employee e2)->e1.getCode()-e2.getCode());
		emplist.forEach((emp)->
		System.out.println(emp.getCode()));
		
		emplist.sort((Employee e1, Employee e2)->e1.getName().compareTo(e2.getName()));
		emplist.forEach((emp)->
		System.out.println(emp.getName()));
	
		
	}
	
}

