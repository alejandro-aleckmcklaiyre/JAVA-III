package descendingprinter;

import java.util.Scanner;

public class DescendingPrinter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int firstInput = input.nextInt();
		
		for (int baseValue = 1; firstInput >= baseValue; firstInput--) {
			System.out.println(firstInput);
		}
			System.out.println("Loop Complete!");
		  
		input.close();
 }

}
