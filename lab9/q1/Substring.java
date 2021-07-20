package r177219079.q1;

import java.util.Scanner;

public class Substring {

	static void getIndex(String str, String sub_str) {
		
		int len1 = str.length();
		int len2 = sub_str.length();
		int last =0;
		
		for(int i=0;i<=(len1-len2);i++) {
			if(str.substring(i,len2+i).equals(sub_str)) {
				if(last==0) 
					System.out.println(sub_str + " first occured at index: "+ i);
				last=i+1;
			}
		}
		
		if(last!=0) {
			last-=1;
			System.out.println(sub_str + " last occured at index: "+ last);
		}
		else {
			if(len2!=1)
				System.out.println(sub_str + " is not a sub string of " + str);
			else
				System.out.println("Character " + sub_str + " is not present in " + str);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		
		System.out.print("Enter the substring: ");
		String sub_str = sc.nextLine();
		
		getIndex(str, sub_str);
	}

	
}
