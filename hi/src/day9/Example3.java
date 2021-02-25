package day9;

import java.util.Scanner;

public class Example3 {

	
		public static String interchange(String input)
		{
			String output="";
			for(int i=0;i<=input.length()-1;i++)
			{
				if(i==0)
				{
					output+=input.charAt(input.length()-1);
				}
				else if(i==input.length()-1)
				{
					output+=input.charAt(0);
				}
				else
				{
					output+=input.charAt(i);
				}
			}
			return output;
		}

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=scanner.nextLine();
			String res=interchange(str);
			System.out.println(res);
		}

	}


