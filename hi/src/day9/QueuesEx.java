package day9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueuesEx {

	public static void main(String[] args) {
		Queue<String> que= new LinkedList<>();
		que.add("anusha");
		que.add("poorna");
		que.add("pavan");
		System.out.println(que);
		System.out.println(que.remove());
		Iterator<String> itr= que.iterator();
		System.out.println("values are:");
		while(itr.hasNext())
			System.out.println(itr.next());
		
		

	}

}
