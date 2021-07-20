package com.R177219079.q1;

class SuperClass {
	 
	private void msg() {
		System.out.println("I am a private method of the super class"); 
	 }
	
	 public void getMsg(){
		 System.out.println("I am a public method of super class, used to invoke the private methpd (msg)");
		 msg();
		 
	 }
	 
}

public class SubClass extends SuperClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubClass obj = new SubClass();
		obj.getMsg();
		//obj.msg();
		

	}

}
