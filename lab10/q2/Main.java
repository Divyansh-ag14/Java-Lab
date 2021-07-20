package r177219079.q2;

import java.util.Scanner;
class Even extends Thread{
	int n;
	public Even(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
	}
	public void run() {
		for(int i=2; i<=n; i+=2) {
			System.out.println("t2: " + i);
			try { Thread.sleep(500); } catch (InterruptedException e) {}
		}
	}
}

class Odd extends Thread{
	int n;
	public Odd(int n) {
		// TODO Auto-generated constructor stub
		this.n = n;
	}
	public void run() {
		for(int i=1; i<=n; i+=2) {
			System.out.println("t1: " + i);
			try { Thread.sleep(500); } catch (InterruptedException e) {}
		}	
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter upper bound: ");
		int n = sc.nextInt();
		
		Odd t1 = new Odd(n);
		Even t2 = new Even(n);
		
		t1.start(); t2.start();
		
	}
}
