package day9;

public class SingletonPattern {

	public static void main(String[] args) {
		//singleObject obj= new singleObject();// shows compile time error
		SingleObject obj= SingleObject.getInstance();
		obj.showMessage();
		obj.setCode(234);
		System.out.println(obj.getCode());

	}

}
