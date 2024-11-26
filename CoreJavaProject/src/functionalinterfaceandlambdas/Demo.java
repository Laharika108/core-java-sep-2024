package functionalinterfaceandlambdas;

public class Demo {

	public static void main(String[] args) {
		 Operation add1 = new Addition() ;
		 System.out.println("1) CONVENTIONAL METHOD");
			System.out.println("SUM : " +add1.operate(5, 6)); 
			System.out.println("-------------------------------");
			System.out.println("2) ANONYMOUS METHOD");
		 Operation add2 = new Operation() {
			 @Override
			 public int operate(int a, int b) {
				 return (a+b);
			 }
		 };
		 System.out.println("SUM: " +add2.operate(40,  50));
		 System.out.println("-------------------------------");
		 System.out.println("3) LAMBDA EXPRESION");
			 Operation add3 = (a, b) -> a+b;
			 System.out.println("SUM: " +add3.operate(60, 40));
		 
		 }
	}


