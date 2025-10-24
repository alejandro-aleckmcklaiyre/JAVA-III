package numberprinter;

import java.util.Scanner;

public class NumberPrinter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int firstInput = input.nextInt();

		for (int baseNum = 1 ; baseNum <= firstInput ; baseNum++ ) {
			System.out.println(baseNum);
		}
		input.close();
	}

}
