package collections;

import java.util.Vector;

public class Vpractice {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(0,"Laharika");
		v.add(null);
		v.addAll(v);
		v.set(0, "pandu");
		
		//System.out.println(v);
		//v.clear();
		System.out.println(v);
		System.out.println(v.get(0));
		System.out.println(v.remove(0));
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i) +" ,"  );
		}
		System.out.println();
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
	

}
