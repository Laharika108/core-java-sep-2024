package wrapperclasses;

public class IntegerDemo {

	public static void main(String[] args) {
		Integer it1 = new Integer(40);
		Integer it2 = new Integer("40");
		Integer it3 = 40; // recommended
		System.out.println(it1);
		System.out.println(it2);
		System.out.println(it3);
		double dl = it3.doubleValue();
		System.out.println("Double : " +dl);
		Byte bt = it3.byteValue();
		System.out.println("Byte : " +bt);
		Float fl = it3.floatValue();
		System.out.println("Float : " +fl);
		Long lo = it3.longValue();
		System.out.println("Long : " +lo);
		
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		
		int a = 10;
		int b = 20;
		System.out.println("MIN_VALUE :" +Integer.min(a,b));
		System.out.println("Max_VALUE :" +Integer.max(a,b));
		System.out.println("SUM :" +Integer.sum(a,b));
	}

}
