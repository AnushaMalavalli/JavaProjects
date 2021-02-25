package day3;

public abstract class Shape {
	protected int radius;
	protected int length;
	protected int breadth;
	 public Shape(int radius)
	{
		this.radius=radius;
	}
	public Shape(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	abstract void findArea();

}
