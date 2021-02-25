package day9;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<String> stck= new Stack<>();
		stck.add("java");
		stck.add("anusha");
		stck.add("pavan");
		stck.add("poorna");
		System.out.println(stck);
		System.out.println(stck.pop());
		System.out.println(stck.push("capg"));
		Iterator<String> value = stck.iterator(); 
        System.out.println("values:"); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
		
		

	}

}
