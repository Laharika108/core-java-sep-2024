package practicequestions;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiply(2,3);
		subtraction(4,3);
		addition(10,20);
		division(50,10);
		welcome();
	}
		public static void multiply(int a, int b) {
			System.out.println("multiplication:" +a*b);
		
	}
		public static void subtraction(int a, int b) {
			System.out.println("subtraction:" +(a-b));
	}
		public static void addition(int a, int b) {
			System.out.println("addition:" +(a+b));
	}
		public static void division(int a, int b) {
			System.out.println("division:" +a/b);
	}
		public static void welcome() {
			System.out.println("hello!  Welcome .....");
	}
}