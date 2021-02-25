package day5;

public interface SampleInterface {
	void hello();
	default void display() {
		System.out.println("this is default method");
	}
	static void output()
	{
		System.out.println("this is static method");
	}

}
