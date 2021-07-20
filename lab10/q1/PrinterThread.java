package r177219079.q1;

public class PrinterThread extends Thread{

	Printer p; // connect to printer
	String doc; // what to print
	
	public PrinterThread(Printer p, String doc) {
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
		
		PrinterThread p1 = new PrinterThread(p, "doc 1");
		PrinterThread p2 = new PrinterThread(p, "doc 2");
		PrinterThread p3 = new PrinterThread(p, "doc 3");
		PrinterThread p4 = new PrinterThread(p, "doc 4");
		PrinterThread p5 = new PrinterThread(p, "doc 5");
		
		p1.start(); p2.start(); p3.start(); p4.start(); p5.start();

	}

}
