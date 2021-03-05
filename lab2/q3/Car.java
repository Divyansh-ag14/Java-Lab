public class Car{
	
	private String cname; private String name; private float price; private float mil;
	
	public void setVal(String cname, String name, float price, float mil){
		System.out.println("\nValues Setted:");
		System.out.println("==================");
		this.cname = cname;
		this.name = name;
		this.price = price;
		this.mil = mil;
	}
	
	public void getVal() {
		System.out.println("Values Returned:\n");
		System.out.println("Company: " + cname);
		System.out.println("------------------");
		System.out.println("Car: " + name);
		System.out.println("------------------");
		System.out.println("Price: " + price);
		System.out.println("------------------");
		System.out.println("Mielage: " + mil);
		System.out.println("------------------");
	}
	
	public void startCar() {
		System.out.println("\nYour " + name + " is ready to roll!!");
	}
	
	public void startHonk() {
		System.out.println("\nYour " + name + " is honking!!");
	}
	
	public static void main(String [] args) {
		Car car1 = new Car();
		car1.setVal("Mercedes-Benz", "E-Class", 7500000, 17);
		car1.getVal();
		car1.startCar();
		car1.startHonk();
	}
}