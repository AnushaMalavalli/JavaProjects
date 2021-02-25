package day5;

import java.util.ArrayList;

public class StringSearch {

	public static void main(String[] args) {
		ArrayList<String> nameList =new ArrayList<>();
		nameList.add("hi");
		nameList.add("hello");
		nameList.add("nmam");
		nameList.add("nitte");
		nameList.add("capg");
		nameList.add("blore");
		nameList.add("lb");
		System.out.println(nameList);
		String key="Kook";
		int index=nameList.indexOf(key);
		if(nameList.contains(key))
			System.out.println(key+" found at the location "+(index+1));
		else
			System.out.println(key+" not found");

	}

}
