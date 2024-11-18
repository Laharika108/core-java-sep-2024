package multithreading;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread t1 = new Thread();
//		t1.start();
//		Thread t2 = new Thread();
//		t2.start();
//		Thread t3 = new Thread();
//		t3.start();
//		Thread t4 = new Thread();
//		t4.start();
////		System.out.println(Thread.currentThread().getName());
////		System.out.println(Thread.currentThread().getId());
//		System.out.println(Thread.activeCount());
		Employee t1 = new Employee();
		t1.start();
		Manager m1 = new Manager();
		m1.start();
		
	}

}
