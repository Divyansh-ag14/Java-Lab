public class LargestNumber{
	
	private int x,y,z;
	
	public void findLargest() {
		if(x > y && x > z) {
			System.out.println(x+ " is the greatest number");
		}
		else if(y > x && y > z) {
			System.out.println(y + " is the greatest number");
		}
		else {
			System.out.println(z + " is the greatest numebr");
		}
	}
	
	public void setVal(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}
	
	public static void main(String[] args) {
		System.out.println("------------------");
		LargestNumber obj = new LargestNumber();
		obj.setVal(1, 2, 3);
		obj.findLargest();
	}
}

