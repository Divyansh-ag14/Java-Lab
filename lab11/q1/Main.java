package r177219079.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("How");
		list.add("Are");
		list.add("You");
		
		System.out.println("Reading elements from ArrayList using iterator");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("------------------------------------------");
		
		System.out.println("Creating duplicate object list2 of ArrayList instance..");
		Object list2 = list.clone();
		System.out.println("list2: " + list2.getClass());
		System.out.println("list2: "+list2);
		System.out.println("------------------------------------------");

		System.out.println("Reversing ArrayList content..");
		Collections.reverse((ArrayList)list2);
		System.out.println(list2);

	}

}
