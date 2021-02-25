package day3;

public class Rectangle extends Shape{
		protected float area;
	public Rectangle(int length, int breadth) {
		super(length,breadth);
		area=length*breadth;
	}

	public static void main(String[] args) {
		Rectangle s1=new Rectangle(5,7);
		s1.findArea();
		}
	
	@Override
		void findArea()
	{
		System.out.println("The area of rectangle:"+area); 
	}
}



