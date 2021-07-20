package com.R177219079.q5;

import java.util.*;

public class Grades {
	
	private int marks[] = new int[10];
	
	public Grades() {
		for(int i =0; i<10; i++) {
			marks[i] = 0;
		}
	}
	
	public void setMarks(int marks[]) {
		for (int i =0; i<10; i++) {
			this.marks[i] = marks[i];
		}
	}
		
	public void sortArray() {
		int i,j,temp;
		System.out.println("Arranging the marks in ascending order...");
		System.out.println("================================");
		for(i=0; i<10; i++) {
			for(j=0; j<10-i-1; j++) {
				if(marks[j] > marks[j+1]) {
					
					temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		}
		System.out.println("Marks have been arranged! Displaying results.");
		System.out.println("--------------------------------");
	}
	
	void printRes() {
		System.out.println("\nMarks  |  Category");
		System.out.println("___________________\n");
		for(int i=0; i<10; i++) {
			if(marks[i]>39 && marks[i]<=50) {
				System.out.println(marks[i] + "        PASS");
			}
			else if(marks[i]>=51 && marks[i]<=75) {
				System.out.println(marks[i] + "        MERIT");
			 }
			else if(marks[i]>=76) {
				System.out.println(marks[i] + "        DISTINCTION");
			}
			else {
				System.out.println(marks[i] + "        Fail");
			}
		}
		System.out.println("___________________\n");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i; 
		int marks[] = new int[10];
		
		System.out.println("Enter the marks: (10 students)");
		System.out.println("--------------------------------");
		Scanner sc = new Scanner(System.in);
		
		for(i =0; i<10; i++) {
			int n = sc.nextInt();
			marks[i] = n;
		}
		
		System.out.println("--------------------------------");

		Grades obj = new Grades();
		obj.setMarks(marks);
		obj.sortArray();
		obj.printRes();
		sc.close();	

	}

}
