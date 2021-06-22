package com.R177219079.q3;

public class Student implements College{
		
	String name, branch, roll;
	int sap;
	
	public Student() {
		// TODO Auto-generated constructor stub
		this("Divyansh Agarwal", "AIML", "R177219079", 500076414);
		System.out.println("Since the user did not enter any details, I am displaying mine :)");
		System.out.println("Invoking the param constructor!\n");
	}
	
	public Student(String name, String branch, String roll, int sap) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.branch=branch;
		this.roll=roll;
		this.sap=sap;
	}
	@Override
	public void displayDetatils() {
		// TODO Auto-generated method stub
		System.out.println("College: " + College.clg);
		System.out.println("-----------------------");
		System.out.println("   Name: " + name);
		System.out.println("-----------------------");
		System.out.println(" Branch: " + branch);
		System.out.println("-----------------------");
		System.out.println("Roll No: " + roll);
		System.out.println("-----------------------");
		System.out.println("    SAP: " + sap);
		System.out.println("=======================\n");
		
	}

}
