

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		
		// while loop
//		int i = 0; // initial value
//		while(i < 20) { //condition
//			System.out.println("Hello Everyone!!"); // task to be executed multiple time
//			i++;// expression
//		}
//		System.out.println("Loop over...");
//		System.out.println("---------------");
		
		Scanner scan = new Scanner(System.in);
		
		
		// program to print the number 5, N times - use while loop
		
//		System.out.println("Enter the times: ");
//		int times = scan.nextInt();
//		
//		int j = 0; // intial value
//		while(j<times) { // condn
//			System.out.println(5);// task
//			j++; // exp
//		}
//		System.out.println("---------------");
		
		// program to print numbers from 1 to N - use do...while loop
//		System.out.println("Enter the number: ");
//		int num1 = scan.nextInt();
//		int k=1; // initial value
//		do{
//		    System.out.println(k);
//		    k++; // exp
//		}while(k<=num1); // condition
		
		// program to find the sum of first N numbers - use for loop
//		System.out.println("Enter the number: ");
//		int num2 = scan.nextInt();
//		
//		int sum=0;
//		//int i2=1; // is it required?
//		for(int i2=1;i2<=num2;i2++){ // initial value, condition,exp 
//		    sum+=i2; // task
//		}
//		System.out.println(sum);
		
		
		// print multiplication table, get the number and times as input
//		System.out.println("Enter the number: ");
//		int num3 = scan.nextInt();
//		System.out.println("Enter the times: ");
//		int times3 = scan.nextInt();
//		
//		for(int l=1;l<=times3;l++) {
//			System.out.println(num3 + " X " + l + " = " + (num3*l));
//		}
	
		// print the sum of digits in a number
//		System.out.println("Enter the number: ");
//		int num4 = scan.nextInt();
//		// num4 is 354
//		int sum = 0;
//		int lastDigit = 0;
//		for(;num4>0;) {
//			lastDigit = num4 % 10;
//			sum = sum + lastDigit;
//			num4 = num4 / 10;
//		}
//		System.out.println(sum);
		
		// print the factorial of a number
//		System.out.println("Enter the number: ");
//		int num5 = scan.nextInt();
//		int fact=1;
//		for(int i=1;i<=num5;i++){
//		    fact*=i;
//		}
//		System.out.println(fact);
		
		// check whether a number is prime or not
//		System.out.println("Enter the number: ");
//		int num6 = scan.nextInt();
//		boolean isPrime = true;
//		for(int i=2;i<num6;i++){
//		    if(num6%i==0){
//		    	isPrime = false;
//		    	break;
//		   }
//		}
//		if(num6 == 1) {
//			System.out.println(num6 + " is neither prime nor composite number");
//		}else if(isPrime) {
//			System.out.println(num6 + " is a prime number");
//		}else {
//			System.out.println(num6 + " is not a prime number");
//		}
		
//		while(false){
//	        System.out.println("cppbuzz");
//		}
		
		while(true){
		       System.out.println("cppbuzz");
		     break;
		    }
	}

}