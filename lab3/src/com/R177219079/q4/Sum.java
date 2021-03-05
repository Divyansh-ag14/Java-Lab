package com.R177219079.q4;

public class Sum {
	
	private int sum;
	
	public Sum() {
		
		System.out.print("The sum of numbers between 40 and 250 that are divisibe by 5: ");
		
	}
	
	public void calcSum() {
		
		for(int i=41; i<250; i++) {
			
			if(i%5 == 0) {
				
				sum +=i;
			}
		}	
	}
	
	public void printSum() {
		
		System.out.println(sum);
		
	}
	
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sum obj = new Sum();
		obj.calcSum();
		obj.printSum();
	}

}
