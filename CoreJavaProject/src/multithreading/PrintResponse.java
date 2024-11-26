package multithreading;

public class PrintResponse {


	public void print(String msg) {
		System.out.println("[");
		System.out.println(msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");

}
}