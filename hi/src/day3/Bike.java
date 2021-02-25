package day3;

public class Bike implements Vehicle {

	public static void main(String[] args) {
		Bike B=new Bike();
		B.wheel();
		B.engine();

	}

	@Override
	public void wheel() {
		System.out.println("Number of wheels in Bike:2");
		
	}

	@Override
	public void engine() {
		System.out.println("Number of engines in Bike:1");
		
	}

}
