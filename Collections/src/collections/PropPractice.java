package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;
//import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public class PropPractice {

	public static void main(String[] args) throws IOException {
		File file = new File("laharika.properties");
		if(!file.exists())
		file.createNewFile();
		System.out.println(file.exists());
		file.delete();
		System.out.println(file.exists());
		Properties props = new Properties();
		props.setProperty("url", "localhost");
		props.setProperty("username", "laharika");
		props.setProperty("password", "laharika123");
		FileOutputStream fos = new FileOutputStream(file);
		props.store(fos, " something");
		FileInputStream fis = new FileInputStream(file);
		props.load(fis);
		Set<String> keys = props.stringPropertyNames();
		System.out.println(keys);
		Collection<Object> c = props.values();
		System.out.println(c);
		System.out.println(props.getProperty("username"));

	}

}
