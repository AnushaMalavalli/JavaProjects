package day9;

public class SingleObject {
	private int code;
	//create an object
	private static SingleObject instance= new SingleObject();
	//make constructor private
	private SingleObject() {

}
	//get the object
	public static SingleObject getInstance() {
		return instance;
	}
	public void showMessage() {
		System.out.println("hello");
	}
	public void setCode(int code)
	{
		this.code=code;
		
	}
	public int getCode() {
		return code;
	}
}