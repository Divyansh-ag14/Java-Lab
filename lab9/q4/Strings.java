package r177219079.q4;

import java.util.Arrays;

public class Strings {

	static void getLength(String str) {
		System.out.println("Length of string " + str + " is: " + str.length());
	}
	
	static void checkA(String str) {
		Boolean idx[] = new Boolean[str.length()];
		Arrays. fill(idx, false);
		Boolean has_a = false;
		int count =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a') {
				has_a = true;
				idx[i] = true; 
				count +=1;
			}
				
		}
		if(has_a) {
			System.out.println("Total occurances of a: " + count);
			if(count ==1)
				System.out.print("Index: ");
			else
				System.out.print("Indices: ");
			
			for(int i=0; i<str.length(); i++) {
				if(idx[i])
					System.out.print(i + " ");
			}
			System.out.println();
		}
		else
			System.out.println("The string " + str + " does not contain a");
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str1 = new String("Divyansh");
		String str2 = new String("Sharan");
		String str3 = new String("Rohit");
		String str4 = new String("Ravi sir");
		String str5 = new String("Toppers are not cool");

		
		String arr[] = {str1, str2, str3, str4, str5}; 
		
		
		for(String str: arr) {
			getLength(str);
			checkA(str);
		}
		
	}

}
