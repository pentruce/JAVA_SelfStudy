package WhiteBoard;
import java.util.Arrays;
import java.util.Scanner;
public class StandardDeviation {

	public static void main(String[] args) {
	
//				int n;
//				Scanner sc = new Scanner(System.in);
//				System.out.print("Enter the number : ");
//				n = sc.nextInt();
		//
//				int[] array = new int[10];
//				System.out.println("input numbers : ");
//				for (int i = 0; i < n; i++) {
//					array[i] = sc.nextInt();
//				}
//				System.out.println("Array elements are: ");
		//
//				for (int i = 0; i < n; i++) {
//					System.out.println(array[i]);
//				
//				}
				
				  Scanner input = new Scanner(System.in);

			      System.out.println("Give me a");
			      int a = input.nextInt();
			      int[] array = new int[a];

			      System.out.println("Give me b");
			      int b = input.nextInt();

			     for(int counter = 0; counter < array.length; counter++) {
			         System.out.println("Give me a number");
			         array[counter] = input.nextInt();
			     }

			     for(int counter = 0; counter < array.length; counter++) {
			         System.out.println(array[counter] + " * " + b + " = " + (array[counter] * b));
			     }
			  }
		}
