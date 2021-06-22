package com.R177219079.q4;

import com.R177219079.q1.TestClass;

public class Test {

	public void division(int a, int b) {
		System.out.println("Perfroming division!");
		System.out.println(a + "/" + b + " = "+ a/b);
		
	}
	
	public void modules() {
		System.out.println("Modules function was called!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj = new Test();
		obj.division(4, 2);
		System.out.println("---------------------------");
		obj.modules();
		
	}

}
