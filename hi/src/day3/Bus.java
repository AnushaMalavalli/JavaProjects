package day3;

public class Bus implements Vehicle{

	public static void main(String[] args) {
		Bus B=new Bus();
		B.wheel();
		B.engine();

	}

	@Override
	public void wheel() {
		System.out.println("Number of wheels in Bus:8");
		
	}

	@Override
	public void engine() {
		System.out.println("Number of engines in bus:2");
		
	}

}
