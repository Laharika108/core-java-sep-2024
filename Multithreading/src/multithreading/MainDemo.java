package multithreading;

public class MainDemo {

	public static void main(String[] args) {
			Employee e1 = new Employee();
			Thread t1= new Thread(e1);
			t1.start();
			Manager m1 = new Manager();
			Thread t2 = new Thread(m1);
			t2.start();

	}

}
