package r177219079.q3;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		System.out.println("set: " + set);
		System.out.println("-----------------------------");
		
		HashSet<String> subset = new HashSet<String>();
		subset.add("e");
		subset.add("f");
		System.out.println("subset: " + subset);
		System.out.println("Copying subset to set");
		set.addAll(subset);
		System.out.println("Set: " + set);
		System.out.println("-----------------------------");
		
		System.out.println("Deleting all entries from subset..");
		subset.clear();
		System.out.println("subset: " + subset);
		System.out.println("-----------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str = sc.next();
		
		if(set.contains(str))
			System.out.println(str + " is present in the set");
		else
			System.out.println(str + " is not present in the set!");		
	}
}
