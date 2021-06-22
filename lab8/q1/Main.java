package com.R177219079.q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails stu1 = new StudentDetails("Divyansh", "R177219079");
		StudentDetails stu2 = new StudentDetails("A", "R123456789");
		StudentDetails stu3 = new StudentDetails("B", "R132456789");
		StudentDetails stu4 = new StudentDetails("C", "R143256789");
		StudentDetails stu5 = new StudentDetails("D", "R152346789");
		StudentDetails stu6 = new StudentDetails("E", "R162345789");
		StudentDetails stu7 = new StudentDetails("F", "R173456789");
		StudentDetails stu8 = new StudentDetails("G", "R183456729");
		StudentDetails stu9 = new StudentDetails("H", "R193456782");
		StudentDetails stu10 = new StudentDetails("I", "R023456789");
		
		StudentDetails arr[] = new StudentDetails[] 
				{stu1, stu2, stu3, stu4, stu5, stu6, stu7, stu8, stu9, stu10};
	
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the student you want to know the details of: ");
			int index = sc.nextInt();
			
			arr[index-1].displayDetails(index-1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("Please enter an index value between (1-10)");
		}		
	}

}
