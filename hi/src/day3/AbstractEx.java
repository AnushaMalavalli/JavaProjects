package day3;

public class AbstractEx extends Sample {

	public static void main(String[] args) {
		Sample s=new AbstractEx();
		s.display();
		s.show();

	}

	@Override
	void show() {
		System.out.println("this is an abstract method");
		
	}

}
