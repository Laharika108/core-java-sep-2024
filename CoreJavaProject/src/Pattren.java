

import java.util.Scanner;

public class Pattren {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = scan.nextInt();
		
		
		// 1 2 3 4...
		for(int i=1;i<=num;i++) {
			System.out.print(i + "  ");
		}
		
		System.out.println("\n--------------------");
		
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4
		// 1 2 3 4...
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\n--------------------");
		
		// 1 1 1 1
		// 2 2 2 2
		// 3 3 3 3
		// 4 4 4 4
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("\n--------------------");
		
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\n--------------------");
		
		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		System.out.println("\n--------------------");
		
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		for(int i=num;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\n--------------------");
		
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		
		// Sandhya's code snippet
		System.out.println("Sandhya's code snippet");
		int number=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        
        //Kusuma's code snippet
        System.out.println("Kusuma's code snippet");
        int n = 1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
            	System.out.print(n + " ");
            	n++;
            }
            System.out.println();
       }
       System.out.println("\n--------------------");
        
       //       1
       //     1 2
       //   1 2 3
       // 1 2 3 4
       	
        for(int i=1;i<=num;i++) {
        	 for(int k=(num-i)*2;k>0;k--){
                 System.out.print(" ");
             }
			for(int j=1;j<=i;j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("\n--------------------");
		
		//      1
		//    1 2 1
		//  1 2 3 2 1
		//1 2 3 4 3 2 1
		for(int i=1;i<=num;i++) {
       	 	for(int k=(num-i)*2;k>0;k--){
                System.out.print(" ");
            }
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			for(int m=i-1;m>0;m--) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
		System.out.println("\n--------------------");
	
		
	}

}