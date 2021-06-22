package com.R177219079.q2;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter two numbers: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x + "/" + y + " = " + x/y);
			sc.close();
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Oops... (" + e.getMessage() + ") exception occured");
			System.out.println("Please enter non zero values");
		}
	}

}
