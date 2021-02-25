package day7;

public class ReservationAppln {

	public static void main(String[] args) {
		Reservation berths=new Reservation();
		Thread t1= new Thread(berths);
		Thread t2= new Thread(berths);
		Thread t3= new Thread(berths);
		Thread t4= new Thread(berths);
		t1.setName("anu");
		t2.setName("avi");
		t3.setName("abhi");
		t4.setName("amrutha");
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		

	}

}
