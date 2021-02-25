package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class HasAExample {

	public static void main(String[] args) {
		ArrayList<Customer> cust = new ArrayList<>();
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<4;i++) {
			int cusno;
			String name;
			System.out.println("customer name");
			name=sc.next();
			System.out.println("customer number");
			cusno= sc.nextInt();
			Address address =new Address();
			System.out.println("city name");
			address.setCity(sc.next());
			System.out.println("street name");
			address.setStreet(sc.next());
			cust.add(new Customer(cusno,name,address));
		}	
		cust.forEach((cus)->
		{
			System.out.println(cus.getCustno()+" "+cus.getName());
		});
		sc.close();	
		
       
	}

}
