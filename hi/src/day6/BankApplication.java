package day6;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Transactions tran= new Transactions();
		
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		while(!flag) {
		System.out.println("1.create");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		System.out.println("4.check");
		System.out.println("5.view");
		System.out.println("6.exit");
		System.out.println("Enter the option ");
		String type=sc.next();
		int accN;
		double amnt;
		String name;
		switch(type)
		{  
		   case  "1":
		   {
			   System.out.println("Enter your name and amount to deposit");
			   name=sc.next();
			   amnt=sc.nextDouble();
			   tran.create(name, amnt);
			   break;
		   }
		   case "2":
		   {
			   System.out.println("Enter the account number and ammount to deposit");
			   accN=sc.nextInt();
			   amnt=sc.nextDouble();
			   tran.deposit(accN, amnt);
			   break;
		   }
		   case "3":
		   {
			   System.out.println("Enter the account number and ammount to withdraw");
			   accN=sc.nextInt();
			   amnt=sc.nextDouble();
			   tran.withdraw(accN, amnt);
			   break;
		   }
		   case "4":
		   {
			   System.out.println("Enter the account number to check balance");
			   accN=sc.nextInt();
			   tran.checkBalance(accN);
			   break;
		   }
		   case "5":
		   {
			   tran.viewAllAccount();
			   break;
		   }
		   case "6":
		   {
			   flag=true;
			   break;
		   }
		
		}
		}
	}
}
