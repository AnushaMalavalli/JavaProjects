package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
		
		int[] arr= {12,13,7,6,30,1,18,99};
		int max=Arrays.stream(arr).max().getAsInt();
		System.out.println("Maximum element is "+max);
			
	}

}
