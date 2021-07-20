package r177219079.q2;

import java.util.Scanner;
public class Capitalize {

	static StringBuffer capitalize(String str) {
		
		char str_arr[] = str.toCharArray();
		
		for(int i=0; i<str_arr.length; i++) {
			if(str_arr[i]>='a' && str_arr[i]<='z')
				str_arr[i] = (char)(int)(str_arr[i] - 32);
		}
		StringBuffer sbuffer = new StringBuffer();
		for(int i=0; i<str_arr.length; i++) {
			sbuffer.append(str_arr[i]);
		}
		return sbuffer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		StringBuffer sbuffer = new StringBuffer();
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println(sbuffer.append(capitalize(str)));
		sc.close();
	}

}
