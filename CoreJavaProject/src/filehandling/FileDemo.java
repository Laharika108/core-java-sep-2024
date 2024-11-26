package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("String.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File Name:" +file.getName());
		System.out.println(file.exists());
		
	}

}
