package multithreading;

public class PrintRequestThread implements Runnable{
	Thread t;
	String message;
	String name;
	PrintRequestThread pr;
	
	

	


	public PrintRequestThread(String message,PrintRequestThread pr, String name) {
		t =  new Thread(this);
		this.message = message;
		this.name = name;
		this.pr = pr;
		t.start();
	}






	@Override
	public void run() {
		synchronized (pr) {
			pr.print(message);
		}
		
	}

}
