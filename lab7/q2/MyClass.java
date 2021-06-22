package com.R177219079.q2;

public class MyClass implements A{
	
	public MyClass() {
		System.out.println("Welcome to MyClass.");
		System.out.println("MyClass implements interface A!");
	}
	
	public void meth1(){
		System.out.println("meth1() of inteface A was over ridden by MyClass.");
	}

	public void meth2(){
		System.out.println("meth2()  of inteface A was over ridden by MyClass.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass obj = new MyClass();
		obj.meth1();
		obj.meth2();
		
	}
}
