package Mainproject;

import java.util.Scanner;

public class UserInterface {

		public int course() {
			System.out.println("*Menu");
			System.out.println("1. Course List");
			System.out.println("2. My Course");
			System.out.println("->");
			
			Scanner scanner = new Scanner(System.in);
			int item = scanner.nextInt();
			
			return item;
		}		
	
		public int list() {
			
			System.out.println("*Course List");
			System.out.println("1. Korean");
			System.out.println("2. Math");
			System.out.println("3. English");
			System.out.println("4. Social Studies");
			System.out.println("5. Science");
			System.out.println("0. Back to Main");
			System.out.println("->");
			
		
			
			Scanner scanner = new Scanner(System.in);
			int item = scanner.nextInt();			
			return item;
			
	}
	
}

