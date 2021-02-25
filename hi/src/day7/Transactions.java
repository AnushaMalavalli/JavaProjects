package day7;

public class Transactions {
	int available= 5000;
	synchronized void withdraw(int amount)
	{
		System.out.println("avaialable balance="+this.available);
		System.out.println("trying to withdraw"+amount);
		if(this.available<amount)
		{
			System.out.println("less balance; waiting for deposite");
			try {
				wait();
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.available-=amount;
		System.out.println("withdraw completed...balance is:"+this.available);
		
		
	}
	synchronized void deposite(int amount)
	{
		System.out.println("trying to deposite..balance is:"+amount);
		this.available+=amount;
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" deposit completed....balance is:"+this.available);
		notify();
		
	}

}
