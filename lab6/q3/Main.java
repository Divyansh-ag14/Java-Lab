package com.R177219079.q3;

class Worker {
	String name;
	
	Worker(String n){ 
		name = n; 
		
	}
	
	void show() {
		System.out.println("Name of employee : "+name);
	}

}
class DailyWorker extends Worker {
	int rate;
	DailyWorker(String n,int r) {
		super(n);
		rate=r;

	}
	
	void compay(int days) {
		show();
		System.out.println("Salary of "+name+" :"+rate*days);

	}

}

class SalariedWorker extends Worker {
	
	int rate;
	SalariedWorker(String n,int r) {
		super(n);
		rate=r;

	}
	int hours = 40;
	void compay() {
		show();
		System.out.println("Salary of "+name+" :"+rate*hours);
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DailyWorker d = new DailyWorker("Ram",700);
		SalariedWorker s = new SalariedWorker("Shyam",100);
		d.compay(5);
		s.compay();

	}

}
