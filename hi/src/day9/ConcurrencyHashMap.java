package day9;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyHashMap {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Integer> phones= new ConcurrentHashMap<String, Integer>();
		phones.put("anu", 123);
		phones.put("hi", 1234);
		phones.put("hello", 12345);
		System.out.println(phones);
		
		

	}

}
