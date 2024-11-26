package arrays;

import java.util.Scanner;

public class PracticeQuestions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = sc.nextInt();
		int[] allElements = new int[size];
		System.out.println("Enter the elements one by one:");
		for(int i=0;i<allElements.length;i++) {
			allElements[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<allElements.length;i++) {
			sum += allElements[i];
			
		}
		System.out.println("------------------------------------");
		System.out.println("Sum of the elements:" +sum);
		System.out.println("-----------------------------------------");
		int avg = sum / allElements.length;
		System.out.println("Average of the elements:" +avg);
		System.out.println("-----------------------------------------");
		System.out.println("Reverse Order:");
		for(int k=allElements.length-1;k>=0;k--) {
			System.out.println(allElements[k]);
			
		}
		System.out.println("-------------------------------------");
		System.out.println("Print odd numbers:");
		for(int b=0;b<allElements.length;b++) {
		if(allElements[b] % 2 !=0) {
			System.out.println(allElements[b]);
		}
		}
		int minValue = allElements[0];
		int maxValue = allElements[0];
		for(int c=0;c<allElements.length;c++) {
			if( allElements[c] < minValue) {
				minValue = allElements[c];
			}
			if( allElements[c]> maxValue) {
				maxValue = allElements[c];
			}
		}
			System.out.println("MinValues:" +minValue);
			System.out.println("MaxValues:" +maxValue);
		}
		
		}
	
	
	


