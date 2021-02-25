package day9;

public class ClassAdoptor extends AbstractAdapter {
	public void methodOne() {
		System.out.println("This is method one ");
	}
	public static void main(String[] args) {
		AdapterExample ad= new ClassAdoptor();
		ad.methodOne();
	}
}