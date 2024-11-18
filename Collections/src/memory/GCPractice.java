package memory;

public class GCPractice {
	public void finalize() {
		System.out.println("Finalize method is called");
	}

	public static void main(String[] args) {
		GCPractice gcp = new GCPractice();
		GCPractice gcp2 = new GCPractice();
		GCPractice gcp3 = new GCPractice();
		 new GCPractice();
		gcp= null;
		gcp2= gcp3;
		System.gc();

	}

}
