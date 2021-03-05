package com.R177219079.q2;

import java.util.*;

public class SquareArray {
	
	private int arr[] = new int[10];
	private int sum;
	int i;
	
	public void setVal(int arr[]) {
		
		for(i=0; i<arr.length; i++) {
			
			this.arr[i] = arr[i];
		}
		
	}
	
	void squareVal() {
		
		for(i=0; i<arr.length; i++) {
			
			arr[i] = arr[i] * arr[i];
			sum += arr[i];
		
		}	
		
	}
	
	void printRes() {
		System.out.println("-----------------------");
		System.out.print("Squared Array: ");
		
		for(i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println("\n-----------------------");
		System.out.println("Sum: " + sum);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int arr[] = new int[10];
		
		SquareArray obj = new SquareArray();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the elements: ");
		
		for(i=0; i<arr.length; i++) {
			
			int n = sc.nextInt();
			arr[i] = n; 
		}
		
		obj.setVal(arr);
		obj.squareVal();
		obj.printRes();
	}

}
