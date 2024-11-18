package javabasics;

import java.time.LocalTime;
import java.util.Scanner;

public class Methods {
	public static void greet() {
		LocalTime NowTime =  LocalTime.now();
		int hour  = NowTime.getHour();
		if(hour>=6 && hour<=12) {
			System.out.println("Good Morning");
		}
		if(hour>=12 && hour<=17) {
			System.out.println("Good Evening");
		}
		if(hour>=17 && hour<=21) {
			System.out.print("Good night"+ " ");
		}
		System.out.println(hour);
	}
	public static int computeBasePower(int baseNumber, int powerNumber){
		int output=1;
		for(int i=0;i<powerNumber;i++) {
			output *=baseNumber;
		}
		return output;
	}
	public static int computeRandomNumber() {
		int output = (int)(Math.random()*100);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greet();
		System.out.println("-------------");
		System.out.println("COMPUTE THE POWER");
		Scanner sc1= new Scanner(System.in);
		int base,power;
		System.out.println("Enter the base number");
		base = sc1.nextInt();
		System.out.println("Enter the power");
		power = sc1.nextInt();
		int answer = computeBasePower(base, power);
		System.out.println(base+ " of the  "+power+ " is:" +answer);
		System.out.println("--------------");
		System.out.println("Print random number");
		
	}

	int answer1 = computeRandomNumber();
	System.out.println("Random number between 1 and 100: " + answer1);

	}

	

 
	


