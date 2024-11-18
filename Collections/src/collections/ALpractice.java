package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ALpractice {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,5,8,9,2};
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
		System.out.println(al1);
//		System.out.println(al1.size());
		al1.add(100);
		System.out.println(al1);
		al1.set(0, 200);
		System.out.println(al1);

		for (Integer integer : al1) {
			System.out.print(integer +" ,");
		}
	}

}
