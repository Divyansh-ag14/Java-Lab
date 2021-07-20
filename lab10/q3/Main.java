package r177219079.q3;

class Counter extends Thread{
	
	static int count;
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		count++;
		System.out.println(count);
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter t[] = new Counter[10];
		
		for(Counter obj: t) {
			obj = new Counter();
			obj.start();
		}
		
	}

}
