package com.R177219079.q3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj1 = new Student();
		Student obj2 = new Student("Random Sharma", "Designing", "R12345678", 500012345);
		
		obj1.displayDetatils();
		
		System.out.println("Displaying student details.. (entered by the user)\n");
		obj2.displayDetatils();

	}

}
