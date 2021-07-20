package r177219079.q3;

import java.util.Scanner;

public class ConsoleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		sc.close();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				arr[i] = (char)(int)(str.charAt(i) - 32);
			}	
		}
		
		System.out.println(arr);
		

	}

}
