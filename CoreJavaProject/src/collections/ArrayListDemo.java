package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> allFoods = new ArrayList<> () ;
		allFoods.add("Pani Puri");
		allFoods.add("Bel Puri");
		allFoods.add("Samosa Chat");
		allFoods.add("Dhadi Papad Chat");
		
		for(int i=0;i<allFoods.size();i++)
		System.out.println(allFoods.get(i));
		System.out.println("------------------");
		for (String eachString : allFoods) {
			System.out.println(eachString);
		}
		System.out.println("-----------------");
		allFoods.forEach((item) -> System.out.println(item));
		System.out.println("-----------------");
		Iterator itr = allFoods.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//Updating
		String updateStr = "Pani Puri";
		for(int i=0;i<allFoods.size();i++) {
			if(allFoods.get(i) == updateStr) {
				allFoods.set(i, "Pani Poori");
				break;
			}
		}
		System.out.println("-----------------");
			allFoods.forEach((item) -> System.out.println(item));
			// removing
			for(int i=0;i<allFoods.size();i++) {
				if(allFoods.get(i).endsWith("Chat")) {
					allFoods.remove(i);
				}
			}
			System.out.println("-----------------");
			allFoods.forEach((item) -> System.out.println(item));
	}
		
}
