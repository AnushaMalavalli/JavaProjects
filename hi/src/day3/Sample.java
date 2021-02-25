package day3;

public abstract class Sample {
 protected int x;
 protected int y;
 public Sample(){
	 x=10;
	 y=20;
 }
 void display()
 {
	 System.out.println("this is an abstract class");
 }
 abstract void show();
}
