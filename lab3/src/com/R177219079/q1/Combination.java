package com.R177219079.q1;

import java.util.*;

public class Combination {

	private int arr[] = new int[3];
	
	public void setVal(int arr[]) {
		
		for (int i=0; i<arr.length; i++) {
			this.arr[i] = arr[i];
		}	
	}
	
	public void printCombination() {
		System.out.println("\nDisplaying all combinations:");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		int count = 1;
		for(int num1=0; num1<arr.length; num1++) {
			for(int num2=0; num2<arr.length; num2++) {
				for(int num3=0; num3<arr.length; num3++) {
					
					if(num1 != num2 && num2 != num3 && num3 != num1) {
						
						System.out.println("Combination "+ count + ": " + arr[num1] + " " + arr[num2]+ " " + arr[num3]);
						count++;
						System.out.println("---------------------------");
					}
					
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
	
		int arr[] = new int[3];
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 3 numbers from 0-9");
		
		for(int i=0; i<arr.length; i++) {
			int n = sc.nextInt();
			arr[i] = n;
		}
		
		Combination obj = new Combination();
		obj.setVal(arr);
		obj.printCombination();
		sc.close();
		
		
		
	}

}
