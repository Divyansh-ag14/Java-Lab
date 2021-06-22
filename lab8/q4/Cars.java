package com.R177219079.q4;

public class Cars extends Exception{
	private String direction;
	
	public Cars(String s) {
		System.out.println(s);
	}
	public Cars() {
		// TODO Auto-generated constructor stub
	}
	public String setDirection(String direction) {
		this.direction = direction;
		return direction;
	}
	
	public static boolean isSafe(String d1, String d2) {
		
		if(d1.equals(d2)) 
			return true;
		return false;
	}
}
