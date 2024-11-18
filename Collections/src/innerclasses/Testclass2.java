package innerclasses;

public class Testclass2 {
	private int id = 101;
	public static void main(String[] args) {
		System.out.println("In Main method: Testclasss2");
		Testclass2 ts2 = new Testclass2();
		test4 t4  = new Testclass2().new test4();
		t4.show();

	}
	public class test4{
		public void show() {
			System.out.println(id);
			
		}
		public void add() {
			test4 t4 = new test4();
		}
	}

}
