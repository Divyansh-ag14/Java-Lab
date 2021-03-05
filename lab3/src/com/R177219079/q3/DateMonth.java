package com.R177219079.q3;

import java.util.*;

import com.sun.jdi.Value;

public class DateMonth {
	
	private String date;
	private String monthno;
	private String month;	
	
	public void setVal(String input) {
		
		String arr[] = input.split("-", 2);
		
		date = arr[0];
		monthno = arr[1];
		
	}
	
	public void getMonth() {
		
		switch(monthno) {
		
		case "1":
			month = "Jan";
			break;
		
		case "2":
			month = "Feb";
			break;
		
		case "3":
			month = "March";
			break;
			
		case "4":
			month = "April";
			break;
			
		case "5":
			month = "May";
			break;
			
		case "6":
			month = "June";
			break;
			
		case "7":
			month = "July";
			break;
			
		case "8":
			month = "Aug";
			break;
			
		case "9":
			month = "Sep";
			break;
			
		case "10":
			month = "Oct";
			break;
			
		case "11":
			month = "Nov";
			break;
			
		case "12":
			month = "Dec";
		
		}
	
	}
	
	public void printRes() {
		
		System.out.println("===========================");
		System.out.println( date + " to " + month);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input;
		DateMonth obj = new DateMonth();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter date and month (d-m): ");
		
		input = sc.nextLine();
		

		obj.setVal(input);
		obj.getMonth();
		obj.printRes();
		
		sc.close();

	
	}

}
