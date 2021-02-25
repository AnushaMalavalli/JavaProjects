package day3;

public class RuntimeError {

	public static void main(String[] args) {
		int x=7;
		int y=3;
		int a[]= {3,4,5,6,7,8};
		try {
			int r=x/y;
			System.out.println("result="+r);
			System.out.println("elements="+a[3]);
			
			}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
			
		}
		System.out.println("success");

	}

}
