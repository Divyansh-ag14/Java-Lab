public class Calc{
	
	private int ans;
	public void prefromOperation(int x, int y, String z) {
		
		if (z.equals("+")){
            ans = x+y;
        } 
		else if (z.equals("-")){
            ans = x-y;
        } 
		else if (z.equals("*")){
            ans = x*y;
        } 
		else if (z.equals("/")){
            ans = x/y;
        } 
		else{
			System.out.println("--------------");
            System.out.println("Enter a valid operator");
        }
		
		System.out.println("--------------");
        System.out.println("Result: " + ans);
    }
	public static void main(String [] args) {
		
		int x = Integer.parseInt(args[0]);
        String z = args[1];
        int y = Integer.parseInt(args[2]);
		
		Calc obj = new Calc();
		obj.prefromOperation(x, y, z);
	}
}
	