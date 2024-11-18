package multithreading;

public class Program3 {
	//bricks b1= new bricks();

	public static void main(String[] args) {
		Runnable r1 = ()->{
			for(int i=0;i<=10000;i+=50) {
		}
		};
		Runnable r2 = ()->{
			for(int i=0;i<=10000;i+=50) {
		}
		};
		Runnable r3 = ()->{
			for(int i=0;i<=10000;i+=50) {
		}
		};
		Thread t1= new Thread();
		t1.start();
		Thread t2= new Thread();
		t2.start();
		Thread t3= new Thread();
		t3.start();
		System.out.println();
		

	}
}

 