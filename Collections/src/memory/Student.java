package memory;

public class Student {
String name = "Laharika";
public void greet() {
	System.out.println("Hi " +name);
}
	public static void main(String[] args) {
//	Student s1 = new Student();
	//s1.greet();
		new Student().greet();//Anonymous

	}

}
