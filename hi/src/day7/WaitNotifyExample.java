package day7;

public class WaitNotifyExample {

	public static void main(String[] args) {
		Transactions tran= new Transactions();
		new Thread()
		{
			public void run()
			{
				tran.withdraw(7000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				tran.deposite(5000);
			}
		}.start();
		}
	}


