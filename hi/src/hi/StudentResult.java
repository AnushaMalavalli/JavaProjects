package hi;

public class StudentResult {

	public static void main(String[] args) {
		int regno=001;
		int sub1=60;
		int sub2=90;
		int sub3=30;
		String name="Anusha";
		double total=sub1+sub2+sub3;
		float avg=(sub1+sub2+sub3)/3;
		System.out.println("The regno is:"+regno);
		System.out.println("The name is:"+name);
		System.out.println("The total is:"+total);
		System.out.println("The avg is:"+avg);
		if(sub1>40 &&sub2>40 &&sub3>40)
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		if(avg>60)
		{
			System.out.println("first");
			
		}
		else if(avg>50&& avg<60)
		{
			System.out.println("second");
		}
		else if(avg>40&& avg<50)
		{
			System.out.println("third");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
