package com.R177219079.q4;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dir1, dir2;
		Cars car1 = new Cars();
		Cars car2 = new Cars();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter direction of both the cars: ");
		dir1 = sc.next();
		dir2 = sc.next();
		car1.setDirection(dir1);
		car2.setDirection(dir2);
		
		try {
			
			if(!Cars.isSafe(dir1, dir2)) {
				System.out.println("\nFor safety reasons, cars are not allowed to move in opposite directions!");
				System.out.println("car1 is moving (" + dir1 + ") and car2 is moving (" + dir2 + ")");
				throw new Cars("Change the direction of either car");
			}
		
		}catch (Cars e) {
			// TODO: handle exception
			dir1 = car1.setDirection(dir2);
			if(Cars.isSafe(dir1, dir2)) {
				System.out.println("-------------------------");
				System.out.println("Handling the situaition by changing the direction of car1");
			}
		}
		System.out.println("Cars are now moving safely in (" + dir1 + ") direction");
	}
}
