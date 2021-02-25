package day9;

import java.util.Scanner;

public class Example2 {

	
		public static int getNumber(String input)
		{
			int output=0;
			for(int i=0;i<=input.length()-1;i++)
			{
				switch(input.charAt(i)) {
				case '0':output+=0;break;
				case '1':output+=1;break;
				case '2':output+=2;break;
				case '3':output+=3;break;
				case '4':output+=4;break;
				case '5':output+=5;break;
				case '6':output+=6;break;
				case '7':output+=7;break;
				case '8':output+=8;break;
				case '9':output+=9;break;
				}
			}
			return output;
		}

		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the string");
			String str=scanner.next();
			int res=getNumber(str);
			System.out.println(res);
		}


	}


