package r177219079.q2;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Hi"); hm.put(2, "How"); hm.put(3, "Are"); hm.put(4, "You");
		System.out.println("HashMap: " + hm);
		System.out.println("---------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a key: ");
		Integer key = (Integer)sc.nextInt();
		if(hm.containsKey(key))
			System.out.println("Hashmap cointains the key (" + key + ")");
		else
			System.out.println("Hashmap does not contain the specified key!");
		System.out.println("---------------------------------");

		System.out.print("Enter a value: ");
		String val = sc.next();
		if(hm.containsValue(val))
			System.out.println("Hashmap cointains the value (" + val + ")");
		else
			System.out.println("Hashmap does not contain the specified value!");
		System.out.println("---------------------------------");
		
		System.out.print("KeySet: ");
		System.out.println(hm.keySet());
		System.out.println("---------------------------------");
		
		System.out.println("Key Value Pairs");
		System.out.println("Key    Value");
		for(Integer k: hm.keySet())
			System.out.println(k + "      " + hm.get(k));}
}
