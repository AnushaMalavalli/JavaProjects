package day3;

public class Circle extends Shape{
	public Circle(int radius){
		super(radius);
	}
	public static void main(String[] args)
	{
		Shape s=new Circle(5);
		s.findArea();
		}

	@Override
	void findArea()
	{
		System.out.println("Area of Circle is "+(3.14*radius*radius));
	}

}
