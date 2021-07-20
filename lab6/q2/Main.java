package com.R177219079.q2;

class Player {
	
	 void msg() {
		 System.out.println("Hello from the super class Player!"); 
	 }
	 void play() {
		 System.out.println("Can't wait to play :)\n");
	 }
	
}

class Cricket_Player extends Player{
	 
	 void msg() {
		 System.out.println("Hello, from the class Cricket Player!"); 
	 
	 }
	 
	 void play() {
		 System.out.println("Lets play cricket\n");
		 
	 }

}
	
class Football_Player extends Player {
	 
	 void msg() {
		 System.out.println("Hello, from the class Football Player!"); 
	 
	 }
	 
	 void play() {
		 System.out.println("Lets footballlll xD\n");
	 }
}
class Hockey_Player extends Player{
	 
	 void msg() {
		 System.out.println("Hello from the class, Hockey Player!"); 
	 
	 }
	 void play() {
		 System.out.println("Grab your hockey stick, see you on the field");
	 }
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player obj= new Player();
		Cricket_Player obj1= new Cricket_Player();
		Football_Player obj2= new Football_Player();
		Hockey_Player obj3= new Hockey_Player();
		 
		obj.msg();
		obj.play();
		obj1.msg();
		obj1.play();
		obj2.msg();
		obj2.play();
		obj3.msg();
		obj3.play();

	}

}
