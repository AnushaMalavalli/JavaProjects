package day2;

public class EmployeeAppln {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.setEmpcode(1234);
		emp.setEmpname("ncapg");
		emp.setBasicsal(600000);
		System.out.println(emp.getEmpcode()+" "+emp.getEmpname()+" "+emp.getBasicsal());

	}

}
