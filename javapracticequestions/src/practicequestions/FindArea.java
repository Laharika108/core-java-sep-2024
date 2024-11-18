package practicequestions;

import java.util.Scanner;

public class FindArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Finding area and perimeter of rectangle & traingle......");
		System.out.println("Enter the number:");
		int n1 = sc.nextInt();
		System.out.println("Enter the number:");
		int n2 = sc.nextInt();
		System.out.println("Enter the number:");
		int n3 = sc.nextInt();
		int area = n1*n2;
		int Perimeter = 2*(n1+n2);
		double area1 = (0.5)*(n1*n2);
		int Perimeter1 = n1*n2*n3;
		System.out.println("Area of Rectangle:" +area);
		System.out.println("Perimeter of the reactangel:" +Perimeter);
		System.out.println("Area of Rectangle:" +area1);
		System.out.println("Perimeter of the reactangel:" +Perimeter1);
	}

}
