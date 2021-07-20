package r177219079.q1;

public class PrinterThread2 implements Runnable{
	
	Printer p; // connect to printer
	String doc; // what to print
	
	public PrinterThread2(Printer p, String doc) {
		this.p =p;
		this.doc = doc;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		p.print(doc);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer p = new Printer();
		
		PrinterThread2 p6 = new PrinterThread2(p, "doc 6");
		PrinterThread2 p7 = new PrinterThread2(p, "doc 7");
		PrinterThread2 p8 = new PrinterThread2(p, "doc 8");
		PrinterThread2 p9 = new PrinterThread2(p, "doc 9");
		PrinterThread2 p10 = new PrinterThread2(p, "doc 10");
		
		Thread t1 = new Thread(p6);
		Thread t2 = new Thread(p7);
		Thread t3 = new Thread(p8);
		Thread t4 = new Thread(p9);
		Thread t5 = new Thread(p10);
		
		t1.start(); t2.start(); t3.start(); t4.start(); t5.start();
		
	}

}
