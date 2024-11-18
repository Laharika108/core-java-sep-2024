package collections;

import java.util.Stack;

public class Spractice {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>();
		s1.add("laharika");
		s1.add("pandu");
		s1.add("abc");
		s1.add("xyz");
		
		s1.add("lucky");
		s1.set(0, "pawan");
		s1.push("bangram");// element pushed at last of the array
		System.out.println(s1.pop());// remove the last item in the array
		System.out.println(s1.peek());// it will just display the last item but won't be remove the item from the array
		System.out.println(s1.search("pandu"));// it will display the index starting with 1  from bottom to top of the item that we have passed 
		
		System.out.println(s1);
		
		System.out.println(s1.size());
		System.out.println(s1.capacity());
	}

}
