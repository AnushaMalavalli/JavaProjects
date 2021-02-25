package day3;

public class Aeroplane implements Vehicle {

	public static void main(String[] args) {
		Aeroplane A=new Aeroplane();
		A.wheel();
		A.engine();


	}

	@Override
	public void wheel() {
		System.out.println("Number of wheels in Aeroplane:2");
		
	}

	@Override
	public void engine() {
		System.out.println("Number of engines in Aeroplane:8");
		
	}

}
