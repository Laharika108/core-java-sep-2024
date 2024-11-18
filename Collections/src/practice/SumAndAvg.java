package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumAndAvg {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {4, 5, 0, 9, 8, 10};
		//ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println();
		int sum=0;
		int avg=0;
		
//			for(int i=0;i<arr.length;i++) {
//				System.out.print(arr[i] +" ");
		for (Integer integer : arr) {
			sum +=integer;
			avg = sum/6;
		}
				
			
			System.out.println();
			System.out.println("Sum of list:" +sum);
			System.out.println("Average of list:" +avg);
		}
	}


