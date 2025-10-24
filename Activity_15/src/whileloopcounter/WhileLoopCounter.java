package whileloopcounter;

import java.util.Scanner;

public class WhileLoopCounter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int firstInput = input.nextInt();

		int counter = 1;

		while (counter <= firstInput) {
			System.out.println(counter);
			counter++;
		}

		input.close();
	}

}