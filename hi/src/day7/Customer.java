package day7;

public class Customer {
	private int custno;
	private String name;
	private Address address;//HAS-A
	public Customer() {
		
	}
	public Customer(int custno, String name, Address address) {
		this.custno = custno;
		this.name = name;
		this.address = address;
	}
	public int getCustno() {
		return custno;
	}
	public void setCustno(int custno) {
		this.custno = custno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
