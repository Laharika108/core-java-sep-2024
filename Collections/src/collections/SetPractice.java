
package collections;

import java.util.HashSet;

public class SetPractice {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(0);
		hs.add(20);
		hs.add(100);
		hs.add(34);
		hs.add(56);
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.remove(100));
		System.out.println(hs);
		System.out.println(hs.contains(10));
//		System.out.println(hs);
		System.out.println(hs.size());
		for (Integer integer : hs) {
			System.out.print(integer +" ,");
			
		}
	}

}
