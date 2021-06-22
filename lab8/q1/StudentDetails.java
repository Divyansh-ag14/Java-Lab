package com.R177219079.q1;

public class StudentDetails {
	
	String details[][] = new String[10][2];
	static int i=0;
	public StudentDetails() {
		// TODO Auto-generated constructor stub
		System.out.println("Please provide name and roll no");
	}
	
	public StudentDetails(String name, String roll){
			details[i][0] = name;
			details[i][1] = roll;
		i+=1;
	}
	public void displayDetails(int i) {
			System.out.println("Name: " + details[i][0] + " | Roll NO: " + details[i][1]);
	}
}
