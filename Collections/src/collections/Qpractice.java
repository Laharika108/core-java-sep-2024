package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Qpractice {

	public static void main(String[] args) {
		PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
		q.add(20);
		q.add(10);
		q.add(1);
		q.add(30);
		q.offer(40);
		q.offer(0);
		System.out.println(q);
		//Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty
		System.out.println(q.poll());
		System.out.println(q);
		//Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty
		System.out.println(q.peek());
		System.out.println(q);

	}

}
