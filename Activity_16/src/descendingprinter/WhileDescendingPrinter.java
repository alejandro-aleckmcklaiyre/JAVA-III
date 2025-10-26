package descendingprinter;

import java.util.Scanner;

public class WhileDescendingPrinter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int firstInput = input.nextInt();

		int baseValue = 1;

		while (firstInput >= baseValue) {

			System.out.println(firstInput);

			firstInput--;
		}

		System.out.println("Loop Complete!");

		input.close();
	}

}
