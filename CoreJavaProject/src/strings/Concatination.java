package strings;

import java.util.Scanner;

public class Concatination {

	public static void main(String[] args) {
//		String str1 = "Hello";
//		String str2  = "Welcome";
//		String result = str1 + str2;
//		System.out.println("The concationation  " +result);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str1 =  sc.next();
		System.out.println("Enter the string:");
		String str2 =  sc.next();
		String result = str1;
		for(int i=0;i<str2.length();i++) {
			result += str2.charAt(i);}
			System.out.println(result);
			
		
		
	}

}
