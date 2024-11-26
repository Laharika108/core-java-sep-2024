package collections;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//SortedSet<String> treeset =  new TreeSet<>(); // for asending order (natural order)
		TreeSet<String> treeset = new TreeSet<>(Collections.reverseOrder());// for desending order
		treeset.add("Bat");
		treeset.add("Yonex");
		treeset.add("Apple");
		treeset.add("Cat");
		treeset.add("Dog");
		for (String eachString : treeset) {
			System.out.println(eachString);
		}
		
	}

}
