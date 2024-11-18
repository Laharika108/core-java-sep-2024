package abstraction;

public interface MyInterface {
	int AGE=20;
	void display();
	default String show() {
		System.out.println(myMethod());
		return "in print default";
		
	}
	static String print(){
		return "in print static";
	}
	private String myMethod() {
		return "it is private method";
	}
}
