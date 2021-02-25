package day2;

public class Substring {

	public static void main(String[] args) {
		String str1="hello bengaluru";
		String str2="llo";
		int start=0;
		int end=0;
		for(int i=0;i<str1.length()-1;i++)
		{
			for(int j=i+1;j<=str1.length();j++)
			{
				if(str2.equals(str1.substring(i,j)))
				{   start=i;
				     end=j;
					break;
				}
			}
		}
		System.out.println("Substring is found between indices "+start+" and "+(end-1));

	}

}
