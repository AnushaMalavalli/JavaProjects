package day9;

import java.util.Scanner;

public class Example1 {


		public static String getFirstLetter(String input)
		{
			String output="";
			output+=input.charAt(0);
			for(int i=0;i<=input.length()-1;i++)
			{
				if(input.charAt(i)==' ')
				{
					output+=input.charAt(i+1);
				}
			}
			return (output.toUpperCase());
			
		}

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=scanner.nextLine();
			String res=getFirstLetter(str);
			System.out.println(res);
		}
	}


