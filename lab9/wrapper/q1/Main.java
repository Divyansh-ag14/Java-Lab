package r177219079.wrapper.q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		System.out.println("int x: " + x);
		Integer a = new Integer(x);
		System.out.println("int to Integer a: " + a);
		String str = new String(a.toString());
		System.out.println("Integer to String str: "+ str);
		x = Integer.parseInt(str);
		System.out.println("String to int x: " + x);
		str = String.valueOf(x);
		System.out.println("int to String str: " + str);
		a = Integer.parseInt(str);
		System.out.println("String to Integer a: " + a);
		x = a.intValue();
		System.out.println("Integer to int x: " + x);
	}

}
