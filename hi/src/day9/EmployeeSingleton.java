package day9;

public class EmployeeSingleton {

	public static void main(String[] args) {
		EmpSingleObject obj= EmpSingleObject.getInstance();
		obj.showMessage();
		obj.setCode(234);
		obj.setName("anusha");
		obj.setSalary(50000);
		System.out.println(obj.getCode()+" "+obj.getName()+" "+obj.getSalary());

	}

}
