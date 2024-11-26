package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HastSetDemo {

	public static void main(String[] args) {
		Set<String> allActors = new HashSet<>();
		// 1. Create
		allActors.add("Abitha Bachhan");
		allActors.add("Rajnikanth");
		allActors.add("NTR");
		allActors.add("NTR");
		allActors.add("Chiranjeevi");
		allActors.add(null);
		allActors.add(null);
		//2. Read
		for (String eachString : allActors) {
			System.out.println(eachString);
		}
			System.out.println("---------------");
		Iterator itr = allActors.iterator();
			while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
		}
		
		System.out.println("---------------");
		allActors.forEach((item) -> System.out.println(item));
		// 3. Update
		allActors.remove("NTR");
		allActors.add("N  T Rama Rao");
		System.out.println("---------------");
		allActors.forEach((item) -> System.out.println(item));
		// 4. Delete
		allActors.remove("Chiranjeevi");
		System.out.println("---------------");
		allActors.forEach((item) -> System.out.println(item));
		System.out.println("---------------");
		Set<Room> room = new HashSet<>();
		Room room1 = new Room(100,200,300);
		Room room2 = new Room(300, 600, 900);
		room.add(room1);
		room.add(room2);
		room.add(new Room(300, 600, 900));
		room.forEach((eachRoom) -> System.out.println(eachRoom));
		
	}

}
