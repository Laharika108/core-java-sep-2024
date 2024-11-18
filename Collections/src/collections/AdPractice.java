package collections;

import java.util.ArrayDeque;

public class AdPractice {

	public static void main(String[] args) {
		ArrayDeque<String> ad =  new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("Apple");
		ad.addLast("Mango");
		ad.offer("abc");
		ad.offerLast("XYZ");
		ad.offerFirst("qwe");
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad);
		System.out.println(ad.peekLast());
		System.out.println(ad);
		System.out.println(ad.peekFirst());
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);

	}

}
