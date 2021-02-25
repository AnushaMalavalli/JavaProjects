package day5;
interface Arithmetic{
	void add(int x, int y);
}

interface Params{
	String output (String name);
	
}
public class Sample2 {

	public static void main(String[] args) {
		SampleInterface sample=()-> {
			System.out.println("sample functional interface");
		};
		sample.hello();
		sample.display();
		SampleInterface.output();
		//functional interface with parameters
		Arithmetic add= (x,y)-> {
			System.out.println(x+y);
		};
		add.add(5,6);
		
		Params p= (name)-> {
			return "hello"+name;
			
		};
		System.out.println(p.output("capgemini"));
	}

}
