package r177219079.wrapper.q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float x = 3.14f;
		System.out.println("float x: " + x);
		Float a = new Float(x);
		System.out.println("float to Float a: " + a);
		String str = new String(a.toString());
		System.out.println("Float to String str: " + str);
		x = Float.parseFloat(str);
		System.out.println("String to float x: " + x);
		str = String.valueOf(x);
		System.out.println("float to String str: " + str);
		a = Float.parseFloat(str);
		System.out.println("String to Float a: " + a);
		x = a.floatValue();
		System.out.println("Float to float x: " + x);
		
		
	}

}
