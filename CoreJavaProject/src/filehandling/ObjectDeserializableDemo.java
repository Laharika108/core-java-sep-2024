package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectDeserializableDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("Serializable.txt");
			ois = new ObjectInputStream(fis);
			Account acc = (Account) ois.readObject();
			System.out.println(acc);
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
				e.printStackTrace();
			
	}

}
}