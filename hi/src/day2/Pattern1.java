package day2;

public class Pattern1 {

	public static void main(String[] args) {
		String str= "hello";
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.substring(0,i+1));
		}

	}

}
