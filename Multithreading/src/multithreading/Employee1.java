package multithreading;

 class Employee1 implements Runnable  {
	@Override
public void run() {
	System.out.println("Hello" + Thread.currentThread().getName());
}
}
