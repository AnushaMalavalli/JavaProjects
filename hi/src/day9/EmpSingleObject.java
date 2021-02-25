package day9;

public class EmpSingleObject {
	private int code;
	private String name;
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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
	private double salary;
	private static EmpSingleObject instance = new EmpSingleObject();
	private EmpSingleObject()
	{
	}
	
	public static EmpSingleObject getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("enter details");
	}
	}


