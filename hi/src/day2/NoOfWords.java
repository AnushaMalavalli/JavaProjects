package day2;

public class NoOfWords {

	public static void main(String[] args) {
		String str="hello world";
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
        System.out.println("Number of words:"+count);
	}

}
