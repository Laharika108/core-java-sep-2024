package generics;

public class Demo {

	public static void main(String[] args) {
		Box box = new Box(100,20,100);
		System.out.println(box);
		BoxGenerics<Integer> box1 = new BoxGenerics(20,40,50);
		
		System.out.println(box1);
	}

}
