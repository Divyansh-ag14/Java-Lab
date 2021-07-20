package r177219079.q1;

public class Printer {
	
	synchronized void print(String doc) {
		System.out.println("Staretd printing " + doc);
		try { Thread.sleep(500); } catch (InterruptedException e) {}
		System.out.println("Finished printing " + doc);
	}
	
}
