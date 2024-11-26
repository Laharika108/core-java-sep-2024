package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> phoneBook = new HashMap<>();
		phoneBook.put("Pawan", 1010101101);
		phoneBook.put("Laharika", 888888888);
		phoneBook.put("Pawan", 1111111111 );
		phoneBook.put("Pawan", 1010101101);
		phoneBook.put("Lucky", 676767676);
		Set<String> allkeys = phoneBook.keySet();
		for(String eachKey: allkeys) {
			Integer eachValue = phoneBook.get(eachKey);
			System.out.println(eachKey + " : " + eachValue);
		}
		System.out.println("------------------");
		// 2
		Set<Entry<String, Integer>> allEntrySet = phoneBook.entrySet();	
		allEntrySet.forEach((eachEntry)->System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue()));
		
		System.out.println("------------------");
		// 3
		phoneBook.forEach((key, value)->System.out.println(key + " : " + value));
		System.out.println("------------------");
		
		// Update
		phoneBook.replace("Will Smith", 333333333);
		phoneBook.forEach((key, value)->System.out.println(key + " : " + value));
		System.out.println("------------------");
		
		// Delete
		phoneBook.remove("Rupert Grint");
		phoneBook.forEach((key, value)->System.out.println(key + " : " + value));
		System.out.println("------------------");

	}
		
}
