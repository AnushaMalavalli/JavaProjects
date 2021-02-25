package day5;

public class Employee implements Comparable<Employee>{
	protected int code;
	protected String name;
	protected double salary;
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Employee(int code, String name, double salary) {
		super();
		this.code = code;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee() {
		
	}

	@Override
	public int compareTo(Employee o) {
		int diff=this.code-(o.getCode());
		return diff;
	}
	

}