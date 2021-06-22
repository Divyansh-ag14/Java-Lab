package com.R177219079.q5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
        return true;
    }
	
	public static boolean isFine(String name, int age) {
		
		try {
			if(isNumber(name))
				throw new InputMismatchException();
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Name can not contain number!");
			return false;
		}
		
		try {
			
			if(age>50)
				throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Age can not be more then 50!");
			return false;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name and age: ");
		name = sc.next();
		age = sc.nextInt();
		
		if(isFine(name, age)) {
			Employee emp = new Employee(name, age);
			}
		else
			System.out.println("Sorry can't create an emp obj with these values!");
	}
}
