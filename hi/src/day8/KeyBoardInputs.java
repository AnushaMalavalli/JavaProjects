package day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KeyBoardInputs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("enter code name salary");
		int code= Integer.parseInt(br.readLine());
		String name= br.readLine();
		double salary= Double.parseDouble(br.readLine());
		System.out.println(code+" "+name+" "+salary);
		System.out.println("enter rno std name ");
		Scanner sc= new Scanner(System.in);
		int rno= sc.nextInt();
		String stdname= sc.next();
		System.out.println(rno+" "+stdname);
		

	}

}
