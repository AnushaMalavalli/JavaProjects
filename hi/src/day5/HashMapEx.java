package day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args, Object entry) {
		HashMap<String,Integer> phonebook=new HashMap<>();
		phonebook.put("mnop", 1234);
		phonebook.put("abcd", 4567);
		phonebook.put("hijk", 891011);
		phonebook.put("lmno", 12131415);
		System.out.println(phonebook);
		Set set =phonebook.entrySet();
		Iterator itr=set.iterator();
	//search operation
		System.out.println(phonebook.get("xyz"));
		while(itr.hasNext()) 
			System.out.println(itr.next());
		System.out.println(phonebook.values());
		//using map.entry
		System.out.println();
		itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry1=  (Entry) itr.next();
			System.out.println(entry1.getKey()+"---"+ entry1.getValue());
		
		
		
		
		
		
		

	}

}
}
