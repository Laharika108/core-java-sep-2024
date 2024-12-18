

public class DataTypes {

	public static void main(String[] args) {
		
		byte myByte = 10;
		System.out.println("byte = " + myByte);
		
		short myShort = 20;
		System.out.println("short = " + myShort);
		
		int myInt = 30;
		System.out.println("int = " + myInt);
		
		long myLong = 80;
		System.out.println("long = " + myLong);
		
		float myFloat = 3.5f;
		System.out.println("float = " + myFloat);
		
		double myDouble = 24.68;
		System.out.println("double = " + myDouble);
		
		boolean myBoolean = true;
		System.out.println("boolean = " + myBoolean);
		
		char myChar = 'g';
		System.out.println("char = " + myChar);
		
		System.out.println("--------------------");
		
		short myShort1 = 100;
		int myInt1 = myShort1; // implicit casting
		
		int myInt2 = 1;
		byte myByte2 = (byte)myInt2; // explicit casting
		
		int myInt3 = 2500;
		byte myByte3 = (byte)myInt3; // explicit casting
		System.out.println("myInt3 = " + myInt3);
		System.out.println("myByte3 = " + myByte3);

		// a decimal literal is by default of type double
		// hence it has to explicitly casted
		float myFloat2 = 1.5f;
		float myFloat3 = (float)1.5;
		float myFloat4 = 1.5F;

		// boolean myBoolean3 = (boolean)4.5; // not possible
		int myInt4 = (int)34.56; // possible
		
		System.out.println("--------------------");
		// connection between int and char
		int myInt5 = 98;
		char myChar5 = (char)myInt5; // here explicit casting is needed
		System.out.println("myInt5 = " + myInt5);
		System.out.println("myChar5 = " + myChar5);
		
		System.out.println("--------------------");
		
		char myChar6 = 'g';
		int myInt6 = myChar6; // here it is implicitly casted
		System.out.println("myChar6 = " + myChar6);
		System.out.println("myInt6 = " + myInt6);
		
		System.out.println("--------------------");

		
	}

}