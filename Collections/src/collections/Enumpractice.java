package collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Enumpractice {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Banana");
		v.add("apple");
		v.add("strawberry");
		v.add("Mango");
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		System.out.println("--------------------");

	}
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("Banana",101);
		ht.put("apple",230);
		ht.put("strawberry",459);
		ht.put("Mango",560);
		Enumeration<String> e1 = v.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
}
}
}