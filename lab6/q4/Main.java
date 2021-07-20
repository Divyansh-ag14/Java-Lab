package com.R177219079.q4;

class TrunkCall {
	String name;
	TrunkCall(String name) { 
		this.name = name;
		
	}

	void show() {
		System.out.println("Call Type: "+ name +" call");
	
	}

}

class Ordinary extends TrunkCall {
	int rate;
	
	Ordinary(String name, int rate) {
		super(name);
		this.rate = rate;

	}
	
	void callpay(int minute) {
		show();
		System.out.println("Duration: "+ minute + " minutes");
		System.out.println("Rate/min: "+ rate);
		System.out.println("Call cost: "+rate*minute);
		System.out.println("-------------------------------");

	}

}
class Urgent extends TrunkCall {
	int rate;
	Urgent(String name,int rate) {
		super(name);
		this.rate = rate;

	}

	void callpay(int minute) {
		show();
		System.out.println("Duration: "+ minute + " minutes");
		System.out.println("Rate/min: "+ rate);
		System.out.println("Call cost: "+rate*minute);
		System.out.println("-------------------------------");

	}

}
class Lightening extends TrunkCall {
	int rate;
	Lightening(String name, int rate) {
		super(name);
		this.rate = rate;
 
	}
 
	void callpay(int minute){
		show();
		System.out.println("Duration: "+ minute + " minutes");
		System.out.println("Rate/min: "+ rate);
		System.out.println("Call cost: "+rate*minute);
		System.out.println("-------------------------------");
 
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ordinary ord=new Ordinary("Ordinary",1);
		Urgent urg=new Urgent("Urgent",3);
		Lightening light= new Lightening("Lightening",5);
		
		ord.callpay(20);
		urg.callpay(14);
		light.callpay(11);

	}

}
