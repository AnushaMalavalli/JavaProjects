package day6;

import java.util.ArrayList;

public class Transactions {
	ArrayList<Account> accounts= new ArrayList<>();
	public Transactions() {
		accounts.add(new Account(10000,"anusha", 50000));
		accounts.add(new Account(10001,"anala", 45000));
		accounts.add(new Account(100011,"abhi", 70000));
	}
	public void create(String name, double amount)
	{
		int max=0;
		for(Account acn:accounts)
		{
			if(acn.getAcno()>(max+1))
			{
				max=acn.getAcno();
			}
			accounts.add(new Account(max+10,name,amount));
			System.out.println("Account is created successfully");
			System.out.println("Account Number : "+(max+10));
			System.out.println("Balance        : "+amount);
		}
		}
	
	public void deposit(int acno, double amount)
	{
		double bal;
		boolean flag=false;
		for(Account acn:accounts) {
			if(acn.getAcno()==acno)
			{
				bal=acn.getBalance();
				acn.setBalance(bal+amount);
				System.out.println("deposite succes...");
				flag =true;
			}
		}
		if(!flag)
		{
			System.out.println("account not available...");
		}
	}
	
	public void withdraw(int acno, double amount)
	{
		double bal;
		boolean flag=false;
		for(Account acn:accounts) {
			if(acn.getAcno()==acno)
			{
				bal=acn.getBalance();
				acn.setBalance(bal-amount);
				System.out.println("withdraw succes...");
				flag =true;
			}
		}
		if(!flag)
		{
			System.out.println("account not available...");
		}
	}
	
	public void checkBalance(int acno)
	{
		boolean flag=false;
		for(Account acn:accounts) {
			if(acn.getAcno()==acno)
			{
				System.out.println("account balance is..."+acn.getBalance());
				flag =true;
			}
		}
		if(!flag)
		{
			System.out.println("account not available...");
		}
		
	}
	
	public void viewAllAccount()
	{
		System.out.println("number --  name -- balance");
		for(Account acn:accounts)
		{
			System.out.println(acn.getAcno()+" "+acn.getCustname()+" "+acn.getBalance());
			
		}
	}
	
	

}
