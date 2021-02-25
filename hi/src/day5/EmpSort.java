package day5;

import java.util.TreeSet;

public class EmpSort {

	public static void main(String[] args) {
		TreeSet<Employee> emp1= new TreeSet<>();
		emp1.add(new Employee(620,"hjk",1200));
		emp1.add(new Employee(340,"abc",5600));
		emp1.add(new Employee(230,"xyz",3200));
		for(Employee e:emp1)
		{
			System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary());
		}
		

	}

}
