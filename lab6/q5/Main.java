package com.R177219079.q5;

class Employee {
	int empid;
	String name;
	int salary;
	
	Employee() {
		System.out.println("Default values of name, employee id and salary: " + name + " " + salary);
		System.out.println("-------------------------------------------------");
	
	}
	
	Employee(String name,int empid,int salary){
		this.name=name;
		this.empid=empid;
		this.salary=salary;
		System.out.println("Para constructor in action!");
		System.out.println("Name, employee id and Salary after getting values is:"+name+" "+empid+" "+salary);
		System.out.println("-------------------------------------------------");
		
	}
	
	void getdetails(String name,int empid,int salary) {
		this.name=name;
		this.empid=empid;
		this.salary=salary;
		System.out.println("getDetatils function!");
		System.out.println("Name, employee id and Salary of Employee through:"+name+" "+empid+" "+salary);
		System.out.println("-------------------------------------------------");
		
	}

	void increaseSalary(int salary) {
		this.salary=salary;
		int inc,total;
		inc=(5*salary)/100;
		total=salary+inc;
		System.out.println("Increased salary by 5% is :"+total);
		System.out.println("-------------------------------------------------");
		
	}
}

class Manager extends Employee {
	String department;
	Manager(String name,int empid,int salary,String department) {
		super.name=name;
		this.empid=empid;
		super.salary=salary;
		this.department=department;
		System.out.println("Sub class Manager!");
		System.out.println("Name, employee id, Salary and Department of :" + name +" " + empid + " " + salary + " " + department);
		System.out.println("-------------------------------------------------");
		
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee obj1 = new Manager("Divyansh", 100, 750000000,"Day dreaming");
		obj1.getdetails("Devansh", 99, 60);
		obj1 = new Employee("Devyansh", 100, 5);
		obj1.increaseSalary(100000);


	}

}
