package collections;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Vector;

public class Mpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> l1 = new Vector<>();
		Map<Integer, String> m = new Hashtable<>();
		System.err.println("Addition of elements into the map");
		//System.out.println(m);
		m.put(10,"Pandu");
		m.put(101, "Laharika");
		System.out.println(m);
		System.err.println("retrival of key ");
		Set<Integer> keys = m.keySet();
		for ( Integer integer : keys) {
			System.out.println(integer);
		} 
		Set<Entry<Integer, String>> values  = m.entrySet();	
//		for (Entry<Integer, String> entry : values) {
//			System.out.println(entry);
//			
//		}
		System.out.println(values);
			
		
		
		System.err.println("Size of Map:" +m.size());
	}

}
