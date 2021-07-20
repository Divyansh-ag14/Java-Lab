package r177219079.q4;

public class Main implements Runnable{

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3 = new Thread();
		Thread t4 = new Thread();
		Thread t5 = new Thread();
		
		t1.setPriority(10);
		t2.setPriority(2);
		t3.setPriority(9);
		t4.setPriority(1);
		t5.setPriority(6);
		
		t1.sleep(1500);
		t3.sleep(1500);
		
		if(t1.isAlive())
			System.out.println("Thread t1 is alive");
		else
			System.out.println("Thread t1 is dead");
		if(t2.isAlive())
			System.out.println("Thread t2 is alive");
		else
			System.out.println("Thread t2 is dead");
		
		if(t3.isAlive())
			System.out.println("Thread t3 is alive");
		else
			System.out.println("Thread t3 is dead");
		if(t4.isAlive())
			System.out.println("Thread t4 is alive");
		else
			System.out.println("Thread t4 is dead");
		if(t5.isAlive())
			System.out.println("Thread t5 is alive");
		else
			System.out.println("Thread t5 is dead");

	}

}
