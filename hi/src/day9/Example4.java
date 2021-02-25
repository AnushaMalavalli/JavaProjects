package day9;

import java.util.Scanner;

public class Example4 {

	
		public static String addLast(String input)
		{
			String output1="";
			String output2="";
			for(int i=0;i<=input.length()-1;i++)
			{
				if(input.charAt(i)=='x')
				{
					output2+=input.charAt(i);
				}
				else
				{
					output1+=input.charAt(i);
				}
			}
			return (output1+output2);
		}

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=scanner.nextLine();
			String res=addLast(str);
			System.out.println(res);
		}

	}


