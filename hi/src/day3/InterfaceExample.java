package day3;

public class InterfaceExample implements InterfaceOne, InterfaceThree{

	public static void main(String[] args) {
		InterfaceExample I=new InterfaceExample();
		I.methodOne();
		I.methodTwo();
		I.methodThree();
		

	}

	@Override
	public void methodThree() {
		System.out.println("Interface One");
		
	}

	@Override
	public void methodOne() {
		System.out.println("Interface Two");
		
	}

	@Override
	public void methodTwo() {
		System.out.println("Interface Three");
		
	}

}
