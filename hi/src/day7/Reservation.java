package day7;

import java.util.Scanner;

public class Reservation implements Runnable {
	private int available=10;
	private int required;
	Scanner sc= new Scanner(System.in);

	@Override
	public synchronized void run() {
		System.out.println("Welcome to "+Thread.currentThread().getName());
		System.out.println("Available berths: "+available);
		if(available!=0) {
		System.out.println("Enter required berths ");
		required=sc.nextInt();
		if(required<=available)
		{
			System.out.println(required+" berths allocated to "+Thread.currentThread().getName());
			available-=required;
		}
		else
		{
			System.out.println("Please enter required berths within the limit:"+available);
		}
		}
		else
		{
			System.out.println("Sorry, Berths not available");
		}
		
	}
	

}