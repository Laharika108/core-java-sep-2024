import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,c;
		int fact=1;
		System.out.println("Enter the number:");
		n = sc.nextInt();
		
		for(c=1;c<=n;c++) {
			fact*=c;
			System.out.println("The factorial of "+n+" is" +fact);
		}

	}

}
