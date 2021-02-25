package day6;

public class Account {
	private int acno;
	private	String custname;
	private double balance;
	public Account() {
		
		
	}
	public Account(int acno, String custname, double balance) {
		super();
		this.acno = acno;
		this.custname = custname;
		this.balance = balance;
	}
	public int getAcno() {
		return acno;
	}
	public void setAcno(int acno) {
		this.acno = acno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
